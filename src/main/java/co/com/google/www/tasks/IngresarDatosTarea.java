package co.com.google.www.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import co.com.google.www.userinterfases.IngresarDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarDatosTarea implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue("pruebastestingcalidad@gmail.com").into(IngresarDatos.CORREO));
		actor.attemptsTo(Enter.theValue("fPwrOeSu").into(IngresarDatos.PASSWORD));
		actor.attemptsTo(Click.on(IngresarDatos.BOTON_INGRESAR));
		
	}

	public static IngresarDatosTarea datos() {
		return instrumented(IngresarDatosTarea.class);
	}

}
