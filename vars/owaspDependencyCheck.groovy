// vars/owaspDependencyCheck.groovy

def performOWASPDependencyCheck() {
    def odcInstallation = tool 'DP-Check'
    sh script: "${odcInstallation}/bin/dependency-check.sh --scan ./ --disableYarnAudit --disableNodeAudit"
    publishDependencyCheck pattern: '**/dependency-check-report.xml'
}
