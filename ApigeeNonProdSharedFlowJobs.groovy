pipelineJob('Development/APIGEE/NON-PROD/shared-flows/v1/default-fault/dev/default-fault') {
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
            scriptPath('sf-default-fault-v1/jenkins/Jenkinsfile.dev')
            lightweight()
        }
    }
}
pipelineJob('Development/APIGEE/NON-PROD/shared-flows/v1/default-fault/qa/default-fault') {
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
            scriptPath('sf-default-fault-v1/jenkins/Jenkinsfile.qa')
            lightweight()
        }
    }
}
pipelineJob('Development/APIGEE/NON-PROD/shared-flows/v1/default-fault/pre-prod/default-fault') {
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
            scriptPath('sf-default-fault-v1/jenkins/Jenkinsfile.pre-prod')
            lightweight()
        }
    }
}


pipelineJob('Development/APIGEE/NON-PROD/shared-flows/v1/proxy-fault/dev/proxy-fault') {
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
            scriptPath('sf-proxy-fault-v1/jenkins/Jenkinsfile.dev')
            lightweight()
        }
    }
}
pipelineJob('Development/APIGEE/NON-PROD/shared-flows/v1/proxy-fault/qa/proxy-fault') {
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
            scriptPath('sf-proxy-fault-v1/jenkins/Jenkinsfile.qa')
            lightweight()
        }
    }
}
pipelineJob('Development/APIGEE/NON-PROD/shared-flows/v1/proxy-fault/pre-prod/proxy-fault') {
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
            scriptPath('sf-proxy-fault-v1/jenkins/Jenkinsfile.pre-prod')
            lightweight()
        }
    }
}


pipelineJob('Development/APIGEE/NON-PROD/shared-flows/v1/target-fault/dev/target-fault') {
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
            scriptPath('sf-target-fault-v1/jenkins/Jenkinsfile.pre-prod')
            lightweight()
        }
    }
}
pipelineJob('Development/APIGEE/NON-PROD/shared-flows/v1/target-fault/qa/target-fault') {
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
            scriptPath('sf-target-fault-v1/jenkins/Jenkinsfile.qa')
            lightweight()
        }
    }
}
pipelineJob('Development/APIGEE/NON-PROD/shared-flows/v1/target-fault/pre-prod/target-fault') {
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
            scriptPath('sf-target-fault-v1/jenkins/Jenkinsfile.pre-prod')
            lightweight()
        }
    }
}