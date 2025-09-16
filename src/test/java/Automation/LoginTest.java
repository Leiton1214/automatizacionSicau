package Automation;

import Page.LoginPage;
import Utilities.BaseTest;
import Utilities.Logs;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    private final LoginPage loginPage = new LoginPage();

    @BeforeMethod
    public void setUp() {
        Logs.info("Navegar a la página de Saucedemo");
        driver.get("https://www.saucedemo.com/v1/");
    }

    @Test
    @Description("Verficar la pagina principal")
    @Severity(SeverityLevel.NORMAL)
    public void verificarLoginPaginaTest() {
        Logs.info("Verificar elementos principales en la página de Login");
        loginPage.verificarPagina();
    }

    @Test
    @Description("Iniciar session exitosamente")
    @Severity(SeverityLevel.NORMAL)
    public void loginExitosoTest() {
        Logs.info("Iniciar sesión con credenciales válidas");
        loginPage.iniciarSesion("standard_user", "secret_sauce");
    }

    @Test
    @Description("Validar mensaje de error usuario")
    @Severity(SeverityLevel.CRITICAL)
    public void verificarMensajeErrorUsuarioTest() {
        Logs.info("Verificar mensaje de error para usuario incorrecto");
        loginPage.iniciarSesion("", "Juanse1214!!");
        
    }

    @Test
    @Description("Validar mensaje de error contraseña")
    @Severity(SeverityLevel.CRITICAL)
    public void verificarMensajeErrorContraseñaTest() {
        Logs.info("Verificar mensaje de error para contraseña incorrecta");
        loginPage.iniciarSesion("fabyusuga12@gmail.com", "guarneijijoi");

    }

    @Test
    @Description("Validar mensaje de error campo usuario vacio")
    @Severity(SeverityLevel.CRITICAL)
    public void verificarMensajeErrorCampoUsuarioVacioTest() {
        Logs.info("Verificar mensaje de error para campo usuario vacío");
        loginPage.iniciarSesion("", "");

    }

    @Test
    @Description("Validar mensaje de error campo contraseña vacia")
    @Severity(SeverityLevel.CRITICAL)
    public void verificarMensajeErrorCampoContraseñaVacioTest() {
        Logs.info("Verificar mensaje de error para campo contraseña vacío");
        loginPage.iniciarSesion("fabyusuga12@gmail.com", "");

    }
}
