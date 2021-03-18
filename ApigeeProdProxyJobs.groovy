pipelineJob('Development/APIGEE/PROD/proxies/v1/ecom-branches-prod') {
    logRotator {
        daysToKeep(5)
    }

    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials('jenkins')
                        url('git@bitbucket.org:toolstation/ecom-branches-v1.git')
                        branch('master')
                    }
                }
            }
            scriptPath('jenkins/Jenkinsfile.prod')
            lightweight()
        }
    }
}
