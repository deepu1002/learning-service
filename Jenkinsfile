pipeline {
    agent any

    stages {
        stage ('Compile Stage') {
            steps {

                    sh './gradlew clean'

            }
         }

        stage ('Testing Stage') {
            steps {

                    sh './gradlew clean test'

            }
        }

        stage ('Deployment Stage') {
            steps {

                    sh './gradlew clean build'

            }
        }
    }
}