pipeline {
    agent {
        docker {
            image 'maven:3.6.3-amazoncorretto-11'
            args '-v /root/.m2:/root/.m2'
        }
    }
    // using the Timestamper plugin we can add timestamps to the console log
    options {
        timestamps()
    }

    stages {
        stage("git") {
            steps {
                checkout scm
            }
            post {
                failure{
                    failureMessage()
                }
            }
        }
        stage('build') {
            steps {
                sh 'java -version'
                sh 'mvn -B -DskipTests clean package'
            }
            post {
                failure{
                    failureMessage()
                }
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                success {
                    junit 'target/surefire-reports/*.xml'
                }
                failure{
                    failureMessage()
                }
            }
        }

        stage('Deliver') {
            steps {
                sh './jenkins/scripts/deliver.sh'
            }
            post {
                failure{
                    failureMessage()
                }
            }
        }
    }
}

def failureMessage(){
    // notify users when the Pipeline fails
    echo  "Failed Pipeline: ${currentBuild.fullDisplayName} Something is wrong with ${env.BUILD_URL}"
}
