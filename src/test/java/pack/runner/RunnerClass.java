package pack.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\DELL E5450\\eclipse-workspace\\Project-SS\\src\\test\\resources\\Feature\\search.feature"},glue= {"pack.sd"},dryRun=false)
public class RunnerClass {

}
