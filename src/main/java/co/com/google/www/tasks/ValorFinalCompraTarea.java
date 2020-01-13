package co.com.google.www.tasks;

import co.com.google.www.userinterfases.ValorFinalCompra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValorFinalCompraTarea implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(ValorFinalCompra.ULTIMA_COMPRA));
		
	}
	
		public static ValorFinalCompraTarea resultadofinal() {
			return instrumented(ValorFinalCompraTarea.class);
	}

}
