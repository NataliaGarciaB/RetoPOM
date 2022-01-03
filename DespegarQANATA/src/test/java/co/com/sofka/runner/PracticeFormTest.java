package co.com.sofka.runner;

import co.com.sofka.model.PracticeFormModel;
import co.com.sofka.page.PracticeFormPage;
import co.com.sofka.setup.WebUI;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PracticeFormTest extends WebUI {

    private PracticeFormPage practiceFormPage;
    private PracticeFormModel nata;
    private static final String ASSETION_EXCEPTION_MESSAGE ="Los valores suministrados no son los esperados: %s";

    @BeforeEach
    public void setUp() {
        try{
            generateCliente();
            generalSetup();
        } catch (Exception exception){
            quiteDriver();
            Assertions.fail(exception.getMessage(),exception);
        }
    }

    @Test
    public void practiceFormTestMandatoryFields() throws InterruptedException {
            practiceFormPage = new PracticeFormPage(nata, driver); //INSTANCIA
            practiceFormPage.fillMandatoryFields();
    }

    @AfterEach
    public void tearDown(){
       // quiteDriver();
    }

    //Otras funciones
    private void generateCliente(){
       nata = new PracticeFormModel();
       nata.setOrigen(" Bogotá, Bogotá D.C., Colombia");
       nata.setDestino(" Medellín, Antioquia, Colombia");
    }

}
