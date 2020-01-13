package co.com.google.www.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.google.www.userinterfases.Abarrotes;
//import co.com.google.www.userinterfases.IngresarDatos;
import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AbarrotesTarea implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(Abarrotes.ABARROTES));
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	public static AbarrotesTarea abarrotes() {
		return instrumented(AbarrotesTarea.class);
	}

}
