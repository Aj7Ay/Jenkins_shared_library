def call() {
    sh '''
    docker build --build-arg REACT_APP_RAPID_API_KEY=f0ead79813mshb0aa7ddf114a7dap1adb3djsn483b017de1a9 -t youtube .
    docker tag youtube sevenajay/youtube:latest
    '''
}