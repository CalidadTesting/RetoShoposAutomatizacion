package co.com.google.www.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import co.com.google.www.userinterfases.BotonCompra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


public class BotonCompraTarea implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(BotonCompra.BOTON_PAGAR));
		
	}

	public static BotonCompraTarea boton() {
		return instrumented(BotonCompraTarea.class);
	}

}
