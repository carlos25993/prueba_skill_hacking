package steps;

import io.cucumber.java.en.Then;
import tasks.ThenTask;

public class ThenSteps {

    private ThenTask thenTask = new ThenTask();

    @Then("Se valida que el documento abierto sea el correcto")
    public void Sevalidaqueeldocumentoabiertoseaelcorrecto()
    {
        thenTask.valirdardocumento();
    }


    @Then("^Aparece la opcion \"([^\"]+)\"$")
    public void apareceLaOpcion(String etiquetas)
    {
        thenTask.validaropciones(etiquetas);
    }
}
