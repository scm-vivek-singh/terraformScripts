import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs


version = "2021.2"

fun com() {
    print("Enter text: ")
    val stringInput = readLine()
    println("You entered: $stringInput")
}

project {

//    buildType(INIT)
//    buildType(PLAN)
    buildType(APPLY)

    sequential {
//        buildType(INIT)
//        buildType(PLAN)
        buildType(APPLY)
    }
}

//object INIT : BuildType({
//    name = "terraform init"
//
//    vcs {
//        root(DslContext.settingsRoot)
//    }
//
//    steps {
//        script {
//            scriptContent ="terraform init" }
//    }
//
//})
//
//object PLAN : BuildType({
//    name = "plan"
//
//    vcs {
//        root(DslContext.settingsRoot)
//    }
//    steps {
//        script {
//            scriptContent ="terraform plan" }
//    }
//})

object APPLY : BuildType({
    name = "terraform apply"

    vcs {
        root(DslContext.settingsRoot)
    }
    com()
    steps {
        script {
            scriptContent="dir" }
    }
    triggers {
        vcs {
        }
    }
})


