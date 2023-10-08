package br.ce.kvferreira.steps;

import static configure.DriverFactory.closeDriver;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class RealizarLoginsSteps {
	
	private LoginPage page = new LoginPage();
	private WebDriver driver;
	
	@After
	public void close() {
		closeDriver();
	}
	
	@Given("que estou acessando a aplicação")
	public void que_estou_acessando_a_aplicação() {
		page.openSite();}

	
	
	@When("informo um Username existente")
	public void informo_o_username_correto() {
	  page.writeUsername("standard_user");
	}
    @When("a senha correta")
	public void a_senha_correta() {
	   page.writePassword("secret_sauce");
	}
    @When("clico no botão de login")
	public void clico_no_botão_de_login() {
	   page.clickLogIn();
	}
    @Then("verifico que o login é realizado com sucesso")
	public void verifico_que_o_login_é_realizado_com_sucesso() {
	   Assert.assertEquals("Products", page.assertText());
	}

	
	
	
    @When("informo um Usarname incorreto")
    public void informo_um_usarname_incorreto() {
    	 page.writeUsername("problem_user_invalid");
        }
    @Then("verifico que é apresentado uma mensagem de erro informando que um dos dados está incorreto")
    public void verifico_que_é_apresentado_uma_mensagem_na_tela_informando_que_um_dos_dados_está_incorreto() {
    	Assert.assertEquals("Epic sadface: Username and password do not match any user in this service", page.assertTextError());       
    }

    
    @When("informo um Usarname existente")
    public void informo_o_usarname_correto() {
    	 page.writeUsername("standard_user");
    }

    @When("deixo o campo de senha em branco")
    public void deixo_o_campo_de_senha_em_branco() {
    	page.writePassword("");
    }

    @Then("verifico que é apresentado uma mensagem de erro informando que o campo de senha é obrigatório")
    public void verifico_que_é_apresentado_uma_mensagem_de_erro_informando_que_o_campo_de_senha_é_obrigatório() {
    	Assert.assertEquals("Epic sadface: Password is required", page.assertTextError());       
    }
    
    @When("informo uma senha")
    public void informo_uma_senha() {
    	 page.writePassword("secret_sauce");
    }

    @When("deixo o campo de nome de usuário em branco")
    public void deixo_o_campo_de_nome_de_usuário_em_branco() {
    	 page.writeUsername("");
    }

    @Then("verifico que é apresentado uma mensagem de erro informando que o campo de nome de usuário é obrigatório")
    public void verifico_que_é_apresentado_uma_mensagem_de_erro_informando_que_o_campo_de_nome_de_usuário_é_obrigatório() {
    	Assert.assertEquals("Epic sadface: Username is required", page.assertTextError()); 
    }

}
