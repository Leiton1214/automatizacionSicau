package Page;

import Utilities.BasePage;
import Utilities.Logs;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class LoginPage extends BasePage {

    private final By usernameType = By.xpath("//*[@id=\"user-name\"]");
    private final By passwordType = By.xpath("//*[@id=\"password\"]");
    private final By loginType = By.xpath("//*[@id=\"login-button\"]");
    
    @Override
    public void verificarPagina() {
        Logs.info("Verificar la página de Login Facebook");

        final var softAssert = new SoftAssert();
        softAssert.assertTrue(find(usernameType).isDisplayed());
        softAssert.assertTrue(find(passwordType).isDisplayed());
        softAssert.assertTrue(find(loginType).isDisplayed());
        softAssert.assertAll();
    }

    public void iniciarSesion(String username, String password) {
        Logs.info("Digitar Usuario");
        find(usernameType).sendKeys(username);

        Logs.info("Digitar Contraseña ");
        find(passwordType).sendKeys(password);

        Logs.info("Dar clic en el botón para ingresar");
        find(loginType).click();
    }


    /*public void verificarMensajeError(String texto) {
        Logs.info("Validar mensaje de error");

        final var softAssert = new SoftAssert();
        softAssert.assertTrue(find(errorMessage).isDisplayed());
        softAssert.assertEquals(find(errorMessage).getText(), texto);
        softAssert.assertAll();
    }*/
}
