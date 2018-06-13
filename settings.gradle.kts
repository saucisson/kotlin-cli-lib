// https://github.com/gradle/kotlin-dsl/tree/master/samples/composite-builds
includeBuild("lib") {
    dependencySubstitution {
        substitute(module("org.example:lib")).with(project(":"))
    }
}
includeBuild("cli")
