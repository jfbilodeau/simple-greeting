node {
	stage 'Checkout'
	git url: 'https://github.com/jfbilodeau/simple-greeting'

	stage 'Build'
	sh 'mvn cobertura:cobertura'

	stage 'UAT'
	def response = input 
		message: 'Proceed with deployment'
		parameters: [
			choice(
				choices: 'Yes\nNo',
				description: 'Choice:', 'Pass'
			)
		]

		if (response == 'Yes') {
			stage 'Deploy'
			sh 'mvn package'
		}

	stage 'Archive Test Results'
	step([
		$class: 'JUnitResultArchiver',
		testResults: 'target/surefire-reports/TEST-*.xml'
	])
}
