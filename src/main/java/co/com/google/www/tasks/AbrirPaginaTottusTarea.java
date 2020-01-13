package co.com.google.www.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;


import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.google.www.userinterfases.AbrirPaginaTottus;


public class AbrirPaginaTottusTarea implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(new AbrirPaginaTottus()));
		
	}

	public static AbrirPaginaTottusTarea abrirpagina() {
		return instrumented(AbrirPaginaTottusTarea.class);
	}

}
