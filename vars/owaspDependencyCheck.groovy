def call() {
  // Get OWASP Dependency Check tool
  def odc = tool 'DP-Check'
  // Run scan
  sh "${odc}/bin/dependency-check.sh --scan ."
  // Publish results
  dependencyCheck additionalArguments: '', aggregatingResults: true, archive: true, healthy: '', pattern: '**/dependency-check-report.xml', unHealthy: ''
}