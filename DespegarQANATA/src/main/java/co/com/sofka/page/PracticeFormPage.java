package co.com.sofka.page;

import co.com.sofka.model.PracticeFormModel;
import co.com.sofka.page.common.CommonActionOnpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;


public class PracticeFormPage extends CommonActionOnpage {

    private final PracticeFormModel practiceFormModel;


    //For input test cases
    private final By origen = By.xpath("//input[@placeholder='Ingresa desde dónde viajas']");
    private final By destino = By.xpath("//input[@placeholder='Ingresa hacia dónde viajas']");
    private final By day_ida = By.xpath("//*[@id=\"component-modals\"]/div[1]/div[1]/div[2]/div[1]/div[3]/div[8]/div");
    private final By day_vuelta = By.xpath("//*[@id=\"component-modals\"]/div[1]/div[1]/div[2]/div[1]/div[3]/div[9]/div");
    private final By buscar = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[3]/button");
    private final By selec_origen = By.xpath("/html/body/div[4]/div/div[1]/ul/li/span");
    private final By selec_destino = By.xpath("/html/body/div[4]/div/div[1]/ul/li");
    private final By right_fecha = By.xpath("//*[@id=\"component-modals\"]/div[1]/div[1]/div[2]/a[2]");
    private final By aplicar =By.xpath("//*[@id=\"component-modals\"]/div[1]/div[2]/div[1]/button/em");
    private final By comprar = By.xpath("//*[@id=\"clusters\"]/span[1]/div/span/cluster/div/div/div[2]/fare/span/span/div[2]/buy-button/a");
    private final By continuar = By.xpath("//*[@id=\"upselling-popup-position\"]/upselling-popup/div/div[3]/div/div/button/em");

    private final By ida_vuelta = By.id("rt-sbox5");
    private final By mutidestino = By.id("ms-sbox5");

    private final By ida = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[1]/div/span[2]/label");

    private final By fecha_ida = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[1]/div[1]/div[2]/div/div[1]/div/div/div");

    private final By pse = By.xpath("//*[@id=\"checkout-content\"]/div[1]/payment-component/payment-method-selector/div/ul/div/payment-method-selector-radio-button-option[3]/li/p");
    private final By nombre = By.id("8jf0x4zh8xr0tohu9m878e");
    private final By apellido = By.id("nwx9jvr6nyrv15vogrb7rr");
    private final By cedula = By.id("traveler-identification-number-0");


    //For validations
    private final By nameValid = By.xpath("//*[@id=\"checkout-content\"]/div[1]/buy-component/div/form-data-revision-container/form-data-revision/div/ul/li/div[1]/span");
    private final By apellidoValid = By.xpath("//*[@id=\"checkout-content\"]/div[1]/buy-component/div/form-data-revision-container/form-data-revision/div/ul/li/div[2]/span");
    private final By cedulaValid = By.xpath("//*[@id=\"checkout-content\"]/div[1]/buy-component/div/form-data-revision-container/form-data-revision/div/ul/li/div[3]/span");


    public PracticeFormPage(PracticeFormModel practiceFormModel, WebDriver webDriver) {
        super(webDriver);
        this.practiceFormModel = practiceFormModel;
    }

    //Funciones
    public void fillMandatoryFields() throws InterruptedException {
        click(pse);
        scrollDownlarg();
        click(nombre);
        typeInto(nombre, practiceFormModel.getNombre());
        click(apellido);
        typeInto(apellido, practiceFormModel.getApellido());
        click(cedula);
        typeInto(cedula,practiceFormModel.getCedula());

    }
    public void inicio (){
        click(origen);
        clearText(origen);
        typeInto(origen, practiceFormModel.getOrigen());
        click(selec_origen);

        click(destino);
        clearText(destino);
        typeInto(destino, practiceFormModel.getDestino());
        click(selec_destino);

        click(fecha_ida);
        click(right_fecha);
        click(day_ida);
        click(day_vuelta);
        scrollDown();
        click(aplicar);
        scrollUp();
        click(ida);
        click(buscar);
        click(comprar);
        click(continuar);
    }
    public List <String> validar(){
        List <String>vali=new ArrayList<>();
        vali.add( getText(nameValid).trim());
        vali.add(getText(apellidoValid).trim());
        vali.add(getText(cedulaValid).trim());
        return vali;
    }


}