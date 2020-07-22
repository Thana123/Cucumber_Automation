### Selenium Framework with Cucumber

BDD framework for automation using Selenium Cucumber and TestNg

The framework has following features 

1. Modular Design
2. Maven based framework
3. Log4j enabled for logging
4. Report Generation (cucumber-reporting) 
5. Helper class to handle web component such as (Button,Link etc)
6. Centralized Configuration (Using Properties file)
7. POM
8. Hooks for different browser support (using tag @chrome,@firefox...)

use the tag `@chrome` to launch the specific browser or no-tag to use the browser form the `config.properties` file

### Create the Runner

```java

package com.cucumber.framework.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "classpath:featurefile/Search.feature" }, glue = {
		"classpath:com.cucumber.framework.stepdefinition",
		"classpath:com.cucumber.framework.helper" }, plugin = { "pretty",
		"json:target/SearchFeatureRunner.json" })
public class SearchFeatureRunner extends AbstractTestNGCucumberTests {
}
``` 

### Use the testng.xml file to run the test cases

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Suite">
	<listeners>
		<listener
			class-name="com.cucumber.framework.listeners.reportlistener.CucumberReport" />
	</listeners>
	<test name="Test - 1">
		<classes>
			<class name="com.cucumber.framework.runner.QQQQQQQQQQWWWWWW" />

		</classes>
	</test>
</suite> 
```

### To see this whole thing running simply checkout this project and run this command:

`mvn test`

### Cucumber Report
