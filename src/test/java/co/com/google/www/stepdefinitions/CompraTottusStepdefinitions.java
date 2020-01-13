package co.com.google.www.stepdefinitions;


import static org.hamcrest.CoreMatchers.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import org.openqa.selenium.WebDriver;
import co.com.google.www.questions.ResultadoValorTotalApagar;
import co.com.google.www.questions.UltimoValorTotalApagar;
import co.com.google.www.tasks.AbarrotesTarea;
import co.com.google.www.tasks.AbrirPaginaTottusTarea;
import co.com.google.www.tasks.BotonCompraTarea;
import co.com.google.www.tasks.IngresarDatosTarea;
import co.com.google.www.tasks.IniciarSesionTarea;
import co.com.google.www.tasks.PresionarBotonPagarTarea;
import co.com.google.www.tasks.SeleccionCarneTarea;
import co.com.google.www.tasks.SeleccionEnvioTarea;
import co.com.google.www.tasks.SeleccionarTuCuentaTarea;
import co.com.google.www.tasks.SupermercadoTarea;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class CompraTottusStepdefinitions {
	
	
	@Managed(driver = "chrome") // esta es una instancia de chrome
	private WebDriver hisBrowser;
	
	
	private Actor automatizador = Actor.named("Automatizador");
	
	private final String VALOR_APAGAR = "S/ 14.99";
	private final String ULTIMO_VALOR_APAGAR = "S/ 14.99";
	
	
	@Before
	public void setUp(){
		automatizador.can(BrowseTheWeb.with(hisBrowser));
	}
	
	
	@Given("^que ingreso al sitio web y compro un producto$")
	public void queIngresoAlSitioWebYComproUnProducto() {
		automatizador.wasAbleTo(AbrirPaginaTottusTarea.abrirpagina());
	   
	}


	@Given("^selecciono el boton de tu cuenta$")
	public void seleccionoElBotonDeTuCuenta() {
	   automatizador.wasAbleTo(SeleccionarTuCuentaTarea.cuenta());
	   automatizador.wasAbleTo(IniciarSesionTarea.iniciar());
	}

	@Given("^ingreso los datos$")
	public void ingresoLosDatos() {
		automatizador.wasAbleTo(IngresarDatosTarea.datos());
	 
	}

	@When("^selecciono supermercado$")
	public void seleccionoSupermercado() {
		automatizador.wasAbleTo(SupermercadoTarea.mercar());
	   
	}

	@When("^presiono abarrotes$")
	public void presionoAbarrotes() {
		automatizador.wasAbleTo(AbarrotesTarea.abarrotes());
	   
	}

	
	@When("^selecciono carne agregar$")
	public void presionoAgregar() {
		automatizador.wasAbleTo(SeleccionCarneTarea.agregar());
	   
	}

	@Then("^selecciono boton pagar$")
	public void seleccionoBotonPagar() {
		automatizador.wasAbleTo(BotonCompraTarea.boton());
		
	}

	@Then("^verifico precio$")
	public void verificoPrecio() {
		automatizador.should(seeThat(ResultadoValorTotalApagar.comparacion(),equalTo(VALOR_APAGAR)));
		
	    
	}

	@Then("^presiono boton pagar$")
	public void presionoBotonPagar() {
		automatizador.wasAbleTo(PresionarBotonPagarTarea.pagar());
	   
	}

	@Then("^seleciono envio$")
	public void selecionoEnvio() {
		automatizador.wasAbleTo(SeleccionEnvioTarea.punto());
	    
	}

	@Then("^valido precio detalle pago$")
	public void validoPrecioDetallePago() {
		automatizador.should(seeThat(UltimoValorTotalApagar.valor(),equalTo(ULTIMO_VALOR_APAGAR)));
	    
	}



}
