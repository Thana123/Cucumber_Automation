pipeline {

	stages {
	
		stage ('Testing Stage'){
		
			steps{
			   withMaven(maven :'maven_3_5_0')
			   sh 'mvn test'
			   }
		
		}
	}
}