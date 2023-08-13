package com.alkomprar.runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = "C:\\Users\\yeiso\\OneDrive\\Desktop\\QA\\RetoAlkomprar\\src\\test\\resources\\features",
        glue = "com.alkomprar.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class Runner {
}
