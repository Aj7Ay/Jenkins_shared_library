def call(String containerName, String ports, String imageName){
    sh "docker run -d --name ${containerName} -p ${ports} ${imageName}"
}