def call() {
    sh 'trivy fs . > trivyfs.txt'
}