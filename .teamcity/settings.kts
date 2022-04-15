import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs


version = "2021.2"

project {

    buildType(INIT)
    buildType(PLAN)
    buildType(APPLY)

    sequential {
        buildType(INIT)
        buildType(PLAN)
        buildType(APPLY)
    }
}

object INIT : BuildType({
    name = "terraform init"

    vcs {
        root(DslContext.settingsRoot)
    }

    steps {
        script { """terraform init""" }
    }

})

object PLAN : BuildType({
    name = "plan"

    vcs {
        root(DslContext.settingsRoot)
    }
    steps {
        script { """terraform plan""" }
    }
})

object APPLY : BuildType({
    name = "terraform apply"

    vcs {
        root(DslContext.settingsRoot)
    }
    steps {
        script { """terraform apply""" }
    }
    triggers {
        vcs {
        }
    }
})
