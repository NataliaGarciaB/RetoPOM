package co.com.sofka.stepdefinition;

import co.com.sofka.model.PracticeFormModel;
import co.com.sofka.page.PracticeFormPage;
import co.com.sofka.setup.WebUI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class PracticeFormStepdefinition extends WebUI {
    private PracticeFormPage practiceFormPage;
    private PracticeFormModel nata;
    private static final String ASSETION_EXCEPTION_MESSAGE ="Los valores suministrados no son los esperados: %s";

    @Given("el cliente desea buscar y reservar un vuelo")
    public void elClienteDeseaBuscarYReservarUnVuelo() {
        try{
            generateCliente();
            generalSetup();
        } catch (Exception exception){
            quiteDriver();
            Assertions.fail(exception.getMessage(),exception);
        }
    }

    @When("el cliente realiza la seleccion de los datos del vuelo")
    public void elClienteRealizaLaSeleccionDeLosDatosDelVuelo() throws InterruptedException {
        practiceFormPage = new PracticeFormPage(nata, driver); //INSTANCIA
        practiceFormPage.inicio();
        practiceFormPage.fillMandatoryFields();
    }

    @Then("despegar realiza la respectiva reserva del vuelo para una persona")
    public void despegarRealizaLaRespectivaReservaDelVueloParaUnaPersona() {
        Assertions.assertEquals(validar(),practiceFormPage.validar());
    }

    //Otras funciones
    private void generateCliente(){
        nata = new PracticeFormModel();
        nata.setOrigen(" Bogotá, Bogotá D.C., Colombia");
        nata.setDestino(" Medellín, Antioquia, Colombia");
        nata.setNombre("NNNN");
        nata.setApellido("fgublin");
        nata.setCedula("1234543");
    }
    private List <String> validar(){
        List <String>vali=new ArrayList<>();
        vali.add("NNNN");
        vali.add("fgublin");
        vali.add("1234543");
        return vali;
    }
}
