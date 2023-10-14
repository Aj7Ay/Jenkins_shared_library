def call(credentialsId) {
    script {
     waitForQualityGate abortPipeline: false, credentialsId: credentialsId   
    }
}