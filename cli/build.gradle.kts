// https://guides.gradle.org/building-kotlin-jvm-libraries

group   = "org.example"
version = "0.1"

plugins {
  application
  kotlin("jvm") version "1.2.31"
  id("org.jetbrains.dokka") version "0.9.16"
}

repositories {
  jcenter()
}

dependencies {
  implementation(kotlin("stdlib"))
  compile("org.example:lib:$version")
  compile("com.xenomachina:kotlin-argparser:+")
}

application {
  mainClassName = "org.example.cli.MainKt"
}

val dokka by tasks.getting(org.jetbrains.dokka.gradle.DokkaTask::class) {
  outputFormat = "html"
  outputDirectory = "$buildDir/javadoc"
}
