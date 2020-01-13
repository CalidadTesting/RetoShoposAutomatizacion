package co.com.google.www.questions;

import co.com.google.www.userinterfases.UltimoValor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class UltimoValorTotalApagar implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		String Texto = Text.of(UltimoValor.VALOR_APAGAR).viewedBy(actor).asString();
		return Texto;
	}

	public static UltimoValorTotalApagar valor() {
		return new UltimoValorTotalApagar();
	}
	
	
	

}
