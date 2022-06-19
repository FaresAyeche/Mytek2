package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.crationComptePage;

public class CcDemo {
	WebDriver driver=null;
	
	crationComptePage cc ;
	
	
	
	@SuppressWarnings("deprecation")
	@Given("Navigateur et page")
	public void navigateur_et_page() {
		System.out.println("Inside Step - browser is open");

		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/driver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		 
	}

	@And("Utilisateur dans la page de creation")
	public void utilisateur_dans_la_page_de_creation() {
		driver.navigate().to("https://www.mytek.tn/customer/account/create/");
	}
	@When("^je_tape (.*) and (.*) and (.*) and (.*) and (.*)$")
	
	
	public void je_tape_prenom_et_nom_et_Email_MDP_et_MDP(String prenom , String nom, String Email,String MDP,String Confirmation_MDP) throws InterruptedException {
		cc= new crationComptePage(driver);
		
		cc.enterPrenom(prenom);

		cc.enterNom(nom);
		cc.enterEmail(Email);
		cc.enterMDP(MDP);
		cc.enterMDPC(Confirmation_MDP);
		
		///validation des champs 
		nom=null;Email=null;MDP=null;Confirmation_MDP=null;
		String a =cc.recupererText();
		        String b =cc.recupererText1();
		                String c =cc.recupererText2();
		                         String d =cc.recupererText3();
	                                      String e =cc.recupererText4();
		prenom=null;
	  
		if(a!=prenom ) {driver.quit();System.out.println(" les champs NE sont PAS remplie correctement ");}
		else if (b!=nom )  {driver.quit();}
	    	else if (c!=Email )  {driver.quit();}
	        	else if (d!=MDP )  {driver.quit();}	
	               	else if (e!=Confirmation_MDP )  {driver.quit();}
	                 	else {System.out.println("les champs sont remplie correctement");}
	//	Thread.sleep(2000);
		//driver.quit();
driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button/span")).click();
	}
	  
	@And("je clique sur creer un compte")
	public void je_clique_sur_creer_un_compte() {

	}

	@Then("page d_acceuil ouverte")
	public void page_d_acceuil_ouverte() {
	

	
	
	}
}
