import com.varabyte.kobweb.gradle.library.util.configAsKobwebLibrary


plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.jetbrains.compose)
    alias(libs.plugins.kobweb.library)
    alias(libs.plugins.kotlin.serialization)
}

group = "ru.kirshov.kmp"
version = "1.0-SNAPSHOT"


kotlin {
    configAsKobwebLibrary(includeServer = true)

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
                implementation(libs.kotlinx.serialization)
            }
        }

        val jsMain by getting {
            dependencies {
                implementation(compose.html.core)
                implementation(libs.kobweb.core)
                implementation(libs.kobweb.silk)
                implementation(libs.silk.icons.fa)

            }
        }
        val jvmMain by getting {
            dependencies {
                implementation(libs.kobweb.api)
                implementation(libs.kotlinx.serialization)
            }
        }
    }
}
