package telas;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class BaseTela {
    protected AndroidDriver app;
    public BaseTela(AndroidDriver app){
        this.app = app;
    }

    public String capturarToast(){
        return app.findElement(By.xpath("//android.widget.Toast")).getText();
    }
}
