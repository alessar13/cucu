pipeline {
    agent {
        docker {
            image 'ochalyi13/node:latest'
        }
    }

    environment {
        BUNDLE = 'ecom-branches-v1'
        PROFILE = 'dev'
        BITBUCKET_AUTH = credentials('bitbucket_token')
        AUTH = credentials('auth')
        CREDENTIALS = credentials('apigee')
        USERNAME = "${CREDENTIALS_USR}"
        PASSWORD = "${CREDENTIALS_PSW}"
        ORG = 'toolstation'
        VERSION = 'v1'
        ENV = 'dev'
        HOST = 'https://api.enterprise.apigee.com'
        PROXY = 'ecom-branches'
        // CURRENT_STABLE_PROXY_REVISION = sh(script: "curl -H \"Authorization: Basic \$(echo -n ${USERNAME}:${PASSWORD} | base64)\" \"${HOST}/${VERSION}/organizations/${ORG}/environments/${ENV}/apis/${PROXY}-${VERSION}/deployments\" | jq \" .revision[0].name\" ", returnStdout: true).trim()
    }

    options {
        timeout(time: 15, unit: 'MINUTES')
    }

    stages {
        stage('Checkout') {
            steps {
                script {
                    git branch: 'master',
                    credentialsId: 'jenkins',
                    url: 'git@bitbucket.org:toolstation/ecom-branches-v1.git'
                }
            }
        }

        stage('Create .env File') {
            steps {
                sh "echo \" AUTH=${AUTH}\" > .env"
                sh "echo \" ENV=${ENV}\" >> .env"
                sh "echo \" BITBUCKET_TOKEN=${BITBUCKET_AUTH}\" >> .env"
            }
        }

        stage('Launch Static Code Analysis With ApigeeLint') {
            steps {
                sh "npm install"
                sh "apigeelint -s ${BUNDLE}/apiproxy -f codeframe.js"
            }
        }

        stage('Launch Static Code Analysis With JSHint') {
            steps {
                sh "jshint ${BUNDLE}"
            }
        }

        // stage('Launch Unit Tests For JavaScript Files') {
        //     steps {
        //         sh "echo 'Launching Unit Tests'"
        //         sh "npm run test:unit"
        //     }
        // }

        // stage('Launch Code Coverage') {
        //     steps {
        //         sh "echo 'Create Jest Test Coverage Report' "
        //         sh "npm run test:unit-coverage"
        //     }
        // }

        stage('Deploy Apigee Proxy') {
            steps {
                dir(BUNDLE) {
                    sh "mvn -ntp clean install -P${PROFILE} -Dusername='${USERNAME}' -Dpassword='${PASSWORD}' -Dorg=${ORG}"
                }
            }
        }

        stage('Launch Integration Tests With Jest') {
            steps {
                script {
                    sh "echo 'Launch Integration Tests'"
                    // try {
                        // sh "npm run test:integration"
                    // } catch (error) {
                    //     sh " echo \" STARTING UNDEPLOYMENT PROCESS\" "
                    //     sh "cd scripts && bash undeployment.sh"
                    //     throw error
                    // }
                }
            }
        }
        //Notifications
    }
}