pipeline {
    agent any

    stages {
        stage ('Compile Stage') {
            steps {

                    bat './gradlew clean'
            }
         }

        stage ('Testing Stage') {
            steps {

                    bat './gradlew clean test'

            }
        }

        stage ('Deployment Stage') {
            steps {

                    bat './gradlew clean build'

            }
        }
    }
}