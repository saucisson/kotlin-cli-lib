# Kotlin project template for a library shipped with a command-line interface.

This project template is intended for those that would like to use
[Kotlin](https://kotlinlang.org) to create both a library and a
command-line interface,
and build their project with [Gradle](https://gradle.org).

## How to use it?

Simply clone or copy the files in this project,
and replace all occurences of "org.example" by your own organization
and project name in the following files:

* `settings.gradle.kts`
* `cli/build.gradle.kts`
* `lib/build.gradle.kts`

Also, rename or create the following directories according to
your project name:

* `cli/src/main/kotlin/org/example/`
* `cli/test/main/kotlin/org/example/`
* `lib/src/main/kotlin/org/example/`
* `lib/test/main/kotlin/org/example/`

You have also to change the package name in all source files:

* `cli/src/main/kotlin/org/example/Main.kt`
* `lib/src/main/kotlin/org/example/Empty.kt`

Everything is done now! You should be able to test the build using:

```console
$ ./gradlew run

> Task :cli:run
Hello, world!


BUILD SUCCESSFUL in 0s
```
