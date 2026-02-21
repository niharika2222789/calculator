pipeline {
agent any
stages {
stage('clone') {
steps {
git branch:'main', url: 'https://github.com/niharika2222789/calculator.git';
}
}
stage('compile') {
steps {
sh 'javac calculator.java'
}
}
stage('build') {
steps {
sh 'java calculator 25 5'
}
}
stage('test') {
steps {
sh 'java calculator 30 -5'
}
}
stage('deploy') {
steps {
echo 'Development completed'
}
}
}
}
