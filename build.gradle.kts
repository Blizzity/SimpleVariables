plugins {
    id("java")
}

group = "wildepizza.com.github.variables"
version = "1.0"

repositories {
    mavenCentral()
}

tasks.jar {
    archiveFileName.set("Variables.jar") // Set the name of the JAR file here
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}