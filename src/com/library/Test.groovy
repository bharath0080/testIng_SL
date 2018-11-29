package com.library

class Test implements Serializable {
  def jenkins
  
  Test() throws Exception {
    throw new Exception("'this' must be passed.")
  }

  Test(jenkins) {
    this.jenkins = jenkins
  }

  def mapExample(Map<String, Object> params) {
    def defaults = [
      name                : null, //required
      language            : "java", // optional
      mapWithInMap        : null 
      
    ]
    jenkins.echo "${params}"
    def config = defaults + params

    jenkins.echo "arguments: $config"
    if (!config.name) {
      jenkins.echo "The name parameter is required."
    }else {
	    
	  for(Map<String, Object> build : config.mapWithInMap){
		  jenkins.echo "In for Loop"
		  //jenkins.echo build
		  //jenkins.echo build.test1
		  jenkins.echo "${build.test}"
		  jenkins.echo "${build.test1}"
		  
	  }
      jenkins.echo "OKkkkkkkkkkkkk"
      //jenkins.echo config.mapWithInMap.test
      //jenkins.echo config.mapWithInMap.test1
    }
  }
}
