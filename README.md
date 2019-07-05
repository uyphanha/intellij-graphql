# intellij-graphql
GraphQL language support for IntelliJ

This project requires an older version of Gradle (version 4 and around).
You either need to have that installed globally or need to setup gradle wrapper.

1. Check your gradle version by calling gradle --version
    - If this does not work at all or version is >= 5.0, move to step 2
    - If the version is around 4.2, run "gradle assemble"
    - If build is successful, move to step 3
    - If it fails, try with step 2.

2. You need gradle wrapper setup. Find another Gradle project and copy gradlew and/or gradlew.bat files.
    - Make sure those are executable
    - Run "./gradlew assemble"

3. Once you have successful build, find the plugin at build/distributions/GraphQL.zip
4. Go to Android Studio -> Plugins -> Install plugin from disk..