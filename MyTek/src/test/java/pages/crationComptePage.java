package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class crationComptePage {
	WebDriver driver=null;
	
	public crationComptePage(WebDriver driver) {
		this.driver=driver;
	}
	
//entrer prenom
	public void enterPrenom(String prenom) {
		
driver.findElement(By.id("firstname")).sendKeys(prenom);


	}
	//entrer nom  
	public void enterNom(String nom) {
		
		driver.findElement(By.id("lastname")).sendKeys(nom);}
	//entrer Email
	public void enterEmail(String Email) {
		driver.findElement(By.id("email_address")).sendKeys(Email);
		}
	//entrer Mot de pase
	public void enterMDP(String MDP) {
		driver.findElement(By.id("password")).sendKeys(MDP);
		}
	//confirmation de mot de passe  
	public void enterMDPC(String Confirmation_MDP) {
		
		driver.findElement(By.id("password-confirmation")).sendKeys(Confirmation_MDP);
	}
	
	
	///validation methode
	public String recupererText() {
	
			driver.findElement(By.id("firstname")).getText();
			
		return null;
	}
	public String recupererText1() {
		
		driver.findElement(By.id("lastname")).getText();
		
	return null;
}
	public String recupererText2() {
		
		driver.findElement(By.id("email_address")).getText();
		
	return null;
}
	public String recupererText3() {
		
		driver.findElement(By.id("password")).getText();
		
	return null;
}
	public String recupererText4() {
		
		driver.findElement(By.id("password-confirmation")).getText();
		
	return null;
}

	
	
}
