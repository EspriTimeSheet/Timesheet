pipeline {

    agent any

    stages {
       stage ('GIT') {
            steps {
               echo "Getting Project from Git"; 
                git branch: "master", 
                    url: "https://github.com/326-163/timesheet-ci.git";
        
            }
        }
            stage("Maven version") {
            steps {
                  bat "mvn -version"
                  }
        }
        
        stage("delete target ") {
            steps {      
                bat "mvn clean"
                  }
        }

        stage("Test") {
            steps {
                script {
                    bat "mvn test"
                }
            }
        }
        
        stage("Build") {
            steps {
                bat "mvn package -DskipTests=true"
            }
        }
        
          stage("tests unitaires ") {
            steps {
                bat "mvn test"
                  }
        }
        
        
        
        stage("Sonar") {
            steps {
                bat "mvn sonar:sonar"
            }
        }
       
       
        


 