package co.com.google.www.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.google.www.userinterfases.ValorTotalPagar;
import net.serenitybdd.screenplay.actions.Click;

public class ValorTotalPagarTarea implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(ValorTotalPagar.VERIFICAR_VALOR_APAGAR));
		
	}
	
public static ValorTotalPagarTarea compararsalida() {
		
		return instrumented(ValorTotalPagarTarea.class);
	}

}
