package telas;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LoginTela extends BaseTela{
    public LoginTela(AndroidDriver app){
        super(app);
    }
    public LoginTela informarUsuario(String usuario){
        app.findElement(By.id("com.lojinha:id/user")).click();
        app.findElement(By.id("com.lojinha:id/user")).findElement(By.id("com.lojinha:id/editText")).sendKeys(usuario);
        return this;
    }
    public LoginTela informarSenha(String senha){
        app.findElement(By.id("com.lojinha:id/password")).click();
        app.findElement(By.id("com.lojinha:id/password")).findElement(By.id("com.lojinha:id/editText")).sendKeys(senha);
        return this;
    }
    public ListaProdutosTela submeterFormularioLogin(){
        app.findElement(By.id("com.lojinha:id/button")).click();
        return new ListaProdutosTela(app);
    }
}
