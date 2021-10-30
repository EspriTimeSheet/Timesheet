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
            
        stage("Build") {
            steps {
                bat "mvn -version"
                bat "mvn clean install -DskipTests"
            }
        }
        
        stage("Sonar") {
            steps {
                bat "mvn sonar:sonar"
            }
        }
       
        stage("Nexus") {
            steps {           
                    bat "mvn deploy"
                }         
        }
   
}