pipeline {
    agent any

    environment {
        // Ensure Maven and JDK paths are correctly set
        MAVEN_HOME = "/opt/homebrew/Cellar/maven/3.9.11/libexec"  // update to your Maven installation
        JAVA_HOME = "/Library/Java/JavaVirtualMachines/jdk-19.jdk/Contents/Home" // update to your JDK path
        PATH = "${MAVEN_HOME}/bin:${JAVA_HOME}/bin:${env.PATH}"
    }

    tools {
        // Optional: If you've configured tools in Jenkins Global Tool Configuration
        maven 'Maven3'
        jdk 'JDK17'
    }

    stages {
        stage('Checkout') {
            steps {
                echo "Checking out code..."
                git branch: 'Base_branch', url: 'https://github.com/Nishan3291/UIAutomationFramework.git'
            }
        }

        stage('Build') {
            steps {
                echo "Running Maven Build..."
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                echo "Running Tests..."
                sh 'mvn test'
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}
