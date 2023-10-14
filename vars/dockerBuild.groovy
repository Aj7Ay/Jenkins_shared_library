def call(String Imagename,String hubuser) {
    sh '''
    docker build --build-arg TMDB_V3_API_KEY=ca86fe14eca3e76864bc17f59d319b92 -t ${Imagename} .
    docker tag ${Imagename} ${hubuser}/${Imagename}:latest
    '''
}