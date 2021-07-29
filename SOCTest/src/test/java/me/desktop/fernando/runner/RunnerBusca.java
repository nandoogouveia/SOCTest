package me.desktop.fernando.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "me.desktop.fernando.steps",
		tags = {"@Buscablog, @Buscacredenciado"},
		plugin = {"pretty", "html:target/busca_credenciado/report-html", "json:target/busca_credenciado/report.json", 
				"html:target/busca_blog/report-html", "json:target/busca_blog/report.json"},
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = false
		)

public class RunnerBusca {

}
