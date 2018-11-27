@Library("testing") _

pipeline{
    agent {
        label "Node_1"
	}
    stages{
		stage("testING"){
			steps{
				glTest( name : "BHARATH", mapWithInMap : [ test : "InSideMap" , test1 : "antherValue"])
			}
		}
	}
}
