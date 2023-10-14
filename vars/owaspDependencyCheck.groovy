// vars/owaspDependencyCheck.groovy

def performOWASPDependencyCheck() {
    def odcInstallation = tool 'DP-Check'
    sh "${odcInstallation}/bin/dependency-check.sh --scan ./ --disableYarnAudit --disableNodeAudit"
    publishDependencyCheck pattern: '**/dependency-check-report.xml'
}
