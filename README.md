## Compile and Run Kotlin / Java Using Github Action 
[![Main CI](https://github.com/amirisback/compile-run-kotlin-java-using-github-action/actions/workflows/ci.yml/badge.svg)](https://github.com/amirisback/compile-run-kotlin-java-using-github-action/actions/workflows/ci.yml)

### Tools
- Intellij IDEA
- Kotlin v 1.8.0

## Screen Shot
![ss](docs/image/ss-1.png?raw=true)

## How To Use
### Step 1 : Create task on build.gradle.kts
- Create Task and Register to build.gradle.kts like below
- Sample Task Name : runMainKotlin
- Detail [Click Here](https://github.com/amirisback/compile-run-kotlin-java-using-github-action/blob/master/build.gradle.kts)
```kts
tasks.register ("runMainKotlin", JavaExec::class.java) {
    description = "Compile and Run Main Kotlin"
    classpath = sourceSets["main"].runtimeClasspath
    // note the addition of "Kt" on the end of the class name.

    // package name
    mainClass.set("io.github.amirisback.MainKt")
}
```

### Step 2 : Add to CI.yml
- Call the function that has been created in the build.gradle.kts file
- Sample Function : runMainKotlin
- Detail [Click Here](https://github.com/amirisback/compile-run-kotlin-java-using-github-action/blob/master/.github/workflows/ci.yml)
```yml
# Run main using gradle
- name: Run Main
  run: ./gradlew runMainKotlin
```

### Step 3 : Run On Github Action
- Open Github Action On Github

![ss](docs/image/ss-2.png?raw=true)

## Colaborator
Very open to anyone, I'll write your name under this, please contribute by sending an email to me

- Mail To faisalamircs@gmail.com
- Subject : Github _ [Github-Username-Account] _ [Language] _ [Repository-Name]
- Example : Github_amirisback_kotlin_admob-helper-implementation

Name Of Contribute
- Muhammad Faisal Amir
- Waiting List
- Waiting List

Waiting for your contribute

## Attention !!!
- Please enjoy and don't forget fork and give a star
- Don't Forget Follow My Github Account
