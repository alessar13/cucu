pipelineJob('APIGEE/PROD/shared-flows/v1/sf-default-fault-prod') {
    logRotator {
        daysToKeep(5)
    }

    properties {
        disableConcurrentBuilds()
        preserveStashes {
            buildCount(30)
        }
    }

    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials('jenkins')
                        url('git@bitbucket.org:toolstation/shared-flow-faults.git')
                        branch('master')
                    }
                }
            }
            scriptPath('sf-default-fault-v1/jenkins/Jenkinsfile.prod')
            lightweight()
        }
    }
}

pipelineJob('APIGEE/PROD/shared-flows/v1/sf-proxy-fault-prod') {
    logRotator {
        daysToKeep(5)
    }

    properties {
        disableConcurrentBuilds()
        preserveStashes {
            buildCount(30)
        }
    }

    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials('jenkins')
                        url('git@bitbucket.org:toolstation/shared-flow-faults.git')
                        branch('master')
                    }
                }
            }
            scriptPath('sf-proxy-fault-v1/jenkins/Jenkinsfile.prod')
            lightweight()
        }
    }
}

pipelineJob('APIGEE/PROD/shared-flows/v1/sf-target-fault-prod') {
    logRotator {
        daysToKeep(5)
    }

    properties {
        disableConcurrentBuilds()
        preserveStashes {
            buildCount(30)
        }
    }

    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials('jenkins')
                        url('git@bitbucket.org:toolstation/shared-flow-faults.git')
                        branch('master')
                    }
                }
            }
            scriptPath('sf-target-fault-v1/jenkins/Jenkinsfile.prod')
            lightweight()
        }
    }
}

