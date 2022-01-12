plugins {
    kotlin("jvm") version "1.6.10"
    java
    application /*追記*/
    id("com.github.johnrengelman.shadow") version "7.0.0" /*追記*/
}

group = "com.github.TomXV"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://m2.dv8tion.net/releases")
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    implementation("net.dv8tion:JDA:4.4.0_350")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

application {/*applicationブロックごと追記*/
    mainClass.set("${group}.${rootProject.name}.MainKt")
    /*pluginブロック内のapplicationと同時に書いた場合ブロックに警告が出ますが続行してください。*/
}