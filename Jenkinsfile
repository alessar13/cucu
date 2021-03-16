pipeline {
job('ci') {
    description 'Build and test the app.'
    scm {
        github 'https://github.com/alessar13/cucu/blob/master/Jenkinsfile'
    }
    steps {
        gradle 'test'
    }
    publishers {
        archiveJunit 'build/test-results/**/*.xml'
    }
}
}
