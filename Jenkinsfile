pipeline {
    agent any

    stages {
        stage ('Compile Stage') {
            steps {
                withGradle(gradle : 'gradle') {
                    sh 'gradle clean'
                 }
            }
         }

        stage ('Testing Stage') {
            steps {
                withGradle(gradle : 'gradle') {
                    sh 'gradle test'
                 }
            }
        }

        stage ('Deployment Stage') {
            steps {
                withGradle(gradle : 'gradle') {
                    sh 'gradle clean build'
                 }
            }
        }
    }
}