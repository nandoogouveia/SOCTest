package me.desktop.fernando.steps;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class BuscaCredenciadoSteps {
	
	private WebDriver driver;
	

	@Dado("^que eu estou acessando o site em Soluções$")
	public void queEuEstouAcessandoOSiteEmSoluções() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fernando\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ww2.soc.com.br");
		driver.manage().window().maximize();
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("target/busca_credenciado/screenshot/tela1.jpg"));
	}

	@Dado("^acesso SOCNET$")
	public void acessoSOCNET() throws Throwable {
		driver.get("https://ww2.soc.com.br/socnet/");
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("target/busca_credenciado/screenshot/tela2.jpg"));
		
	}

	@Dado("^acesso Buscar credenciados$")
	public void acessoBuscarCredenciados() throws Throwable {
		driver.findElement(By.partialLinkText("Buscar credenciados")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Quando("^selecionar filtros de Busca \"([^\"]*)\"$")
	public void selecionarFiltrosDeBusca(String arg1) throws Throwable {
		Thread.sleep(25000);
		driver.findElement(By.id("ipt-busca-credenciado-2")).sendKeys(arg1);
		driver.findElement(By.xpath("//*[@id=\"div-filtro-conveniencias\"]/section/div[1]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"div-filtro-conveniencias\"]/section/div[3]/label")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"div-filtro-servicos\"]/section/div[1]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"div-filtro-servicos\"]/section/div[3]/label")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("autocomplete-maps-container")).click();
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("target/busca_credenciado/screenshot/tela3.jpg"));
	}
	
	@Então("^exibir o perfil do credenciado$")
	public void exibirOPerfilDoCredenciado() throws Throwable {
		Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[3]/div[1]/div/div[1]/div/section/div[2]")).click();
	    driver.findElement(By.xpath("*//div[2]/a/button")).click();
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("target/busca_credenciado/screenshot/tela4.jpg"));
		Thread.sleep(5000);
		driver.quit();
		
	}

}
	
//-------------------------------     ERRO    ----------------------------------------------
//@After(order = 1)
//public void screenshot(Scenario cenario) {
//	File arquivo = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	try {
//		FileUtils.copyFile(arquivo, new File("target/busca_credenciado/screenshot/"+cenario.getId()+".jpg"));
//	} catch (IOException e) {
//		e.printStackTrace();
//	}
//}

//@After(order = 0)
//public void fecharBrowser() {
//	driver.quit();
//	System.out.println("Terminando");
//}
//}	
	


	
	
