plugins {
    id("java")
    id("io.qameta.allure") version "3.0.1"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation("org.json:json:20250517")
    implementation("org.jetbrains:annotations:23.0.0")

    // Update these to match the plugin or a recent stable release
    implementation("io.qameta.allure:allure-junit5:2.29.1")
    implementation("io.qameta.allure:allure-java-commons:2.29.1")
    testRuntimeOnly("org.slf4j:slf4j-simple:2.0.17")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<Test>().configureEach {
    // Allows Unsafe access and suppresses the terminal deprecation warning in 2026
    jvmArgs("--sun-misc-unsafe-memory-access=allow")
}