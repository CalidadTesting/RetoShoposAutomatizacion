package co.com.google.www.questions;

import co.com.google.www.userinterfases.ValorTotalPagar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ResultadoValorTotalApagar implements Question<String>  {

	@Override
	public String answeredBy(Actor actor) {
		String Texto = Text.of(ValorTotalPagar.VERIFICAR_VALOR_APAGAR).viewedBy(actor).asString();
		return Texto;
	}

	public static ResultadoValorTotalApagar comparacion() {
		return new ResultadoValorTotalApagar();
			
	}
	
}
