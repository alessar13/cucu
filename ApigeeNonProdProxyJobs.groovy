pipelineJob('Development/APIGEE/NON-PROD/proxies/v1/ecom-branches-proxy/dev/ecom-branches') {
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
            scriptPath('jenkins/Jenkinsfile.dev')
            lightweight()
        }
    }

}

pipelineJob('Development/APIGEE/NON-PROD/proxies/v1/ecom-branches-proxy/qa/ecom-branches') {
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
            scriptPath('jenkins/Jenkinsfile.qa')
            lightweight()
        }
    }

}

pipelineJob('Development/APIGEE/NON-PROD/proxies/v1/ecom-branches-proxy/pre-prod/ecom-branches') {
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
            scriptPath('jenkins/Jenkinsfile.pre-prod')
            lightweight()
        }
    }
}
