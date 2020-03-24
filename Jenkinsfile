node {
	stage 'Checkout'
	git url: 'https://github.com/jfbilodeau/simple-greeting'

	stage 'Build'
	mvn cobertura:cobertura package

	stage 'Archive Test Results'
	step([
		$class: 'JUnitResultArchiver',
		testResults: 'target/surefire-reports/TEST-*.xml'
	])
}
