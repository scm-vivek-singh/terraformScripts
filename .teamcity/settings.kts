import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs


version = "2021.2"



project {
    buildType(APPLY)
}

fun com() {
    print("Enter text: ")
    val stringInput = readLine()
    println("You entered: $stringInput")
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
    name = "Accept Input"

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


