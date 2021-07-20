package steps;

import io.cucumber.java.en.When;
import tasks.WhenTask;

public class WhenSteps{

    private WhenTask whenTask = new WhenTask();

    @When("Se descarga el documento de Politicas de tratamiento y de proteccion de datos personales de proveedores")
    public void SedescargaeldocumentodePoliticasdetratamientoydeprotecciondedatospersonalesdeproveedores()
    {
        whenTask.descargarPoliticaTratamiento();
    }

    @When("^Yo necesito \"([^\"]+)\" para \"([^\"]+)\"$")
    public void yo_necesito_necesito_para_para(String necesito, String para) {
        whenTask.seEligeNecesito(necesito);
        whenTask.seEligePara(para);
        whenTask.presionarMuestrame();
    }
}
