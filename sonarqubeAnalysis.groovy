// vars/sonarqubeAnalysis.groovy

def call() {
    stage('SonarQube Analysis') {
        steps {
            withSonarQubeEnv('sonar-server') {
                sh ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=Netflix -Dsonar.projectKey=Netflix '''
            }
        }
    }
}
