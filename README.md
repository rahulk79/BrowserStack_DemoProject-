This is a dummy project for Browser stack integration with browserstack. 

We need to have a valid browser stack user license for running this test.

Before running add browser stack userName and accessket in "C:\Users\rahul\Desktop\BrowserStack_DemoProject\src\test\java\SauceLabDemoAutomation\testSauseLabDemoLogin.java"

For Running test Git clone project,Navigate to project directory and execute "mvn clean test" 

For installing maven refer - https://maven.apache.org/install.html


      -----------------Detail aboout local Run branch ----------

Now project have capabilty to select test from maven command build. 

We are passing TestNG test group name in maven variable.Based on variable passed it will run assigned test case.

command for running test -

mvn clean install -DuserName=User1 (It will run on sauselab protal)
mvn clean install -DuserName=User2 (It will run on DoingEPR portal)
	 
	 


