package co.com.google.www.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import co.com.google.www.userinterfases.SeleccionEnvio;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionEnvioTarea implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SeleccionEnvio.BOTON_ENVIO));
		
	}

	public static SeleccionEnvioTarea punto() {
		return instrumented(SeleccionEnvioTarea.class);
	}
	

}
