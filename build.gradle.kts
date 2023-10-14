plugins {
    alias(libs.plugins.kotlin.multiplatform).apply(false)
    alias(libs.plugins.jetbrains.compose).apply(false)
    alias(libs.plugins.kobweb.library).apply(false)

}
subprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven("https://us-central1-maven.pkg.dev/varabyte-repos/public")
    }
}
