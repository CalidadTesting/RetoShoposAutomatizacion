package co.com.google.www.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.google.www.userinterfases.IniciarSesion;
//import co.com.google.www.userinterfases.SeleccionarTuCuenta;
import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class IniciarSesionTarea implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(IniciarSesion.INICIA_SESION));
		
	}

	public static IniciarSesionTarea iniciar() {
		return instrumented(IniciarSesionTarea.class);
	}

}
