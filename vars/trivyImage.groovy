def call() {
    sh 'trivy image sevenajay/youtube:latest > trivyimage.txt'
}