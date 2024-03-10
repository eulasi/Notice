plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
    id("maven-publish")

}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}


afterEvaluate{
    publishing {
        publications {
            create<MavenPublication>("maven") {
                from(components["java"])

                groupId = "com.github.eulasi"
                artifactId = "notice"
                version = "1.0.0"
            }
        }
    }
}