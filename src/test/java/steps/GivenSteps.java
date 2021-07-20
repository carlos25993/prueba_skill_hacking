package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import tasks.GivenTask;

public class GivenSteps{

    private GivenTask giventask = new GivenTask();

    @Given("Se ejecuta el explorador")
    public void seejecutaelexplorador()
    {
        giventask.Abrirpaginaweb();
    }

    @And("Se selecciona la opcion acerca de nosotros")
    public void Seseleccionalaopcionacercadenosotros()
    {
        giventask.entraracercanosotros();
    }

    @And("Se selecciona proveedores en la informacion coorporativa")
    public void Seseleccionaproveedoresenlainformacioncoorporativa()
    {
        giventask.entrarproveedores();
    }

    @And("Se seleciona la opcion negocios")
    public void Seselecionalaopcionnegocios()
    {
        giventask.entrarnegocios();
    }
}
