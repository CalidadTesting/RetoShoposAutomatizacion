package co.com.google.www.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import co.com.google.www.userinterfases.Supermercado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SupermercadoTarea implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(Supermercado.SELECCIONAR_SUPERMERCADO));
		
	}

	public static SupermercadoTarea mercar() {
		return instrumented(SupermercadoTarea.class);
	}

}
