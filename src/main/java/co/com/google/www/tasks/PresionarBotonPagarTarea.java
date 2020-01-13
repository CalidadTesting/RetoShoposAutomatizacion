package co.com.google.www.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

//import co.com.google.www.userinterfases.IniciarSesion;
import co.com.google.www.userinterfases.PresionarBotonPagar;
import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class PresionarBotonPagarTarea implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(PresionarBotonPagar.BOTON_PAGAR_ORDEN));
		
	}

	public static PresionarBotonPagarTarea pagar() {
		return instrumented(PresionarBotonPagarTarea.class);
	}

}
