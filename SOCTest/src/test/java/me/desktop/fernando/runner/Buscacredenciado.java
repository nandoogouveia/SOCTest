package me.desktop.fernando.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

public @interface Buscacredenciado {
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/resources/features/busca_credenciado.feature",
			glue = "me.desktop.fernando.steps",
			tags = {},
			plugin = {"pretty", "html:target/busca_credenciado/report-html", "json:target/busca_credenciado/report.json"},
			monochrome = true,
			snippets = SnippetType.CAMELCASE,
			dryRun = false,
			strict = false
			)

	public class RunnerBusca {

	}
	
}
