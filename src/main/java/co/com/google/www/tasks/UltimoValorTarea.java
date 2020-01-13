package co.com.google.www.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import co.com.google.www.userinterfases.UltimoValor;

public class UltimoValorTarea implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(UltimoValor.VALOR_APAGAR));
		
	}
	
public static UltimoValorTarea compararsalida() {
		
		return instrumented(UltimoValorTarea.class);
	}

}
