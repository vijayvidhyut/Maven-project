package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="featurefiles/OpenGoogle.feature" ,glue="stepDefinitions",
monochrome=true,
tags="opengoogle")
public class RunnerClass {

}
