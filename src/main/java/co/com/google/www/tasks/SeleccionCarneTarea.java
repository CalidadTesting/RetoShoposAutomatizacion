package co.com.google.www.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.google.www.userinterfases.SeleccionCarne;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionCarneTarea implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SeleccionCarne.CARNE));
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	public static SeleccionCarneTarea agregar() {
		return instrumented(SeleccionCarneTarea.class);
	}

}
