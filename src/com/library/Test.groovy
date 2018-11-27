#!/usr/bin/env groovy

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
      language            : "java" // optional
      
    ]
    def config = defaults + params

    println "buildAndDeployDockerImageToDTR arguments: $config"
    if (!config.name) {
      println "The name parameter is required."
    }else {
      println "OKkkkkkkkkkkkk"
    }
  }
}
