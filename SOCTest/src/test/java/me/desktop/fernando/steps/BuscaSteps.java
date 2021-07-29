package me.desktop.fernando.steps;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class BuscaSteps {
	
	private WebDriver driver;

	@Dado("^que estou acessando o blog$")
	public void queEstouAcessandoOBlog() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fernando\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ww2.soc.com.br/blog/");
		driver.manage().window().maximize();
	}

	@Quando("^informo a procura \"([^\"]*)\"$")
	public void informoAProcura(String arg1) throws Throwable {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/section[1]/div/div/div/div/div/section[2]/div/div/div[2]/div/div/div/div/form/div/input")).sendKeys(arg1);
	}

	@Quando("^seleciono pesquisar$")
	public void selecionoPesquisar() throws Throwable {
		driver.findElement(By.className("elementor-search-form__submit")).click();
	}

	@Então("^visualizo a categoria pesquisada$")
	public void visualizoACategoriaPesquisada() throws Throwable {
		String texto = driver.findElement(By.tagName("h2")).getText();
		   Assert.assertEquals("Search Results for: Destaque", texto);
		   driver.findElement(By.partialLinkText("Aceitar cookies")).click();
		   File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(file, new File("target/busca_blog/screenshot/name3.jpg"));
		   driver.quit();
		   
		   
//ERRO		   
//			@After
//			public void screenshot(Scenario cenario) {
//				File arquivo = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				try {
//					FileUtils.copyFile(arquivo, new File("target/busca_blog/screenshot/"+cenario.getId()+".jpg"));
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}	
		   
		 
	}	
	
}
