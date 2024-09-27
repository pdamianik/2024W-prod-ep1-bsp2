plugins {
    id("java")
    id("application")
}

group = "at.ac.tuwien.sem2024w.prop.ep1"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass = "at.ac.tuwien.sem2024w.prop.ep1.Main"
}