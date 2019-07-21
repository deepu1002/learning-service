pipeline {
    agent any

    stages {
        stage ('Compile Stage') {
            steps {

                    sh 'gradle clean'

            }
         }

        stage ('Testing Stage') {
            steps {

                    sh 'gradle clean test'

            }
        }

        stage ('Deployment Stage') {
            steps {

                    sh 'gradle clean build'

            }
        }
    }
}