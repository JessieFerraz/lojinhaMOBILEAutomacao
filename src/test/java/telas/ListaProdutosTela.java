package telas;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ListaProdutosTela extends BaseTela{
        public ListaProdutosTela(AndroidDriver app){
            super(app);
    }

    public FormularioDeAdicaoDeProdutoTela acessarFormularioAdicaoDeProduto(){
        app.findElement(By.id("com.lojinha:id/floatingActionButton")).click();
        return new FormularioDeAdicaoDeProdutoTela(app);
    }
}
