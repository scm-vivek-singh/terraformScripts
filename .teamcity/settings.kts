import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs
import .teamcity.another
version = "2021.2"



project {
    buildType(APPLY)
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
//fun com() {
//    print("Enter text: ")
//    val stringInput = readLine()
//    println("You entered: $stringInput")
//}

object APPLY : BuildType({
    name = "Apply"

    vcs {
        root(DslContext.settingsRoot)
    }
    steps {
        script {
            scriptContent="python pythonX.py" }
    }
    triggers {
        vcs {
        }
    }
})


