package modulos.produto;

import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import telas.LoginTela;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

@DisplayName("Testes Mobile do Módulo de Produto")
public class ProdutoTest {

    private AndroidDriver app;

    @BeforeEach
    public void beforeEach() throws MalformedURLException {
        //abrir o app
        DesiredCapabilities capacidades = new DesiredCapabilities();
        capacidades.setCapability("deviceName", "Google Pixel 3");
        capacidades.setCapability("platformName","Android");
        capacidades.setCapability("udid", "192.168.56.103:5555");
        capacidades.setCapability("appPackage","com.lojinha");
        capacidades.setCapability("appActivity","com.lojinha.ui.MainActivity");
        capacidades.setCapability("app", "G:\\Meu Drive\\Documentos Pessoais\\QA\\Módulo Testes MOBILE com Android\\Lojinha+Android+Nativa\\lojinha-nativa.apk");

       this.app = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capacidades);
       app.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }

    @Test
    @DisplayName("Validação do Valor de Produto Não Permitido")
    public void testValidacaoDoValorDeProdutoNaoPermitido(){

       String mensagemApresentada = new LoginTela(app)
                .informarUsuario("jessieferraz")
                .informarSenha("123456")
                .submeterFormularioLogin()
                .acessarFormularioAdicaoDeProduto()
                .informarNomeDoProduto("Notebook")
                .informarValorDoProduto("700001")
                .informarCoresDoProduto("Prata")
                .submeterFormularioDeAdicaoDeProdutoComErro()
                .capturarMensagemApresentadaComErro();

       Assertions.assertEquals("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00", mensagemApresentada);
    }

    @AfterEach
    public void afterEach(){
        app.quit();
    }
}
