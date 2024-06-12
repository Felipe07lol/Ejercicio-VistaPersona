import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Btn_Guardar;

    @FXML
    private Button Btn_Limpiar;

    @FXML
    private TextField txt_codigo;

    @FXML
    private TextField txt_email;

    @FXML
    private TextField txt_nombre;
    
    private PersonaM persona;

    @FXML
    void codigo_IN(ActionEvent event) {

    }

    @FXML
    void email_IN(ActionEvent event) {

    }

    @FXML
    void guardarDatos(ActionEvent event) {

    }

    @FXML
    void limpiarDatos(ActionEvent event) {

    }

    @FXML
    void nombre_IN(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert Btn_Guardar != null : "fx:id=\"Btn_Guardar\" was not injected: check your FXML file 'Persona.fxml'.";
        assert Btn_Limpiar != null : "fx:id=\"Btn_Limpiar\" was not injected: check your FXML file 'Persona.fxml'.";
        assert txt_codigo != null : "fx:id=\"txt_codigo\" was not injected: check your FXML file 'Persona.fxml'.";
        assert txt_email != null : "fx:id=\"txt_email\" was not injected: check your FXML file 'Persona.fxml'.";
        assert txt_nombre != null : "fx:id=\"txt_nombre\" was not injected: check your FXML file 'Persona.fxml'.";

    }

}
