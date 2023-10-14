def call(){
    sh 'docker stop youtube1'
    sh 'docker rm youtube1'
}