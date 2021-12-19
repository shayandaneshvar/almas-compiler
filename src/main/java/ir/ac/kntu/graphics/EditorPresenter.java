package ir.ac.kntu.graphics;

import ir.ac.kntu.compiler.Compiler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.atomic.AtomicReference;

public class EditorPresenter implements Initializable {


    @FXML
    private TextArea codeTextArea;

    @FXML
    private TextArea terminalTextArea;

    @FXML
    private Button compileButton;

    @FXML
    void compile(MouseEvent event) {
        terminalTextArea.setText("");
        Compiler.INSTANCE.runLexer(codeTextArea.getText());
        if (!Compiler.INSTANCE.getInvalidTokens().isEmpty()) {
            terminalTextArea.setText("Code has Lexical Errors...");
            List<String> errors = new ArrayList<>();
            Compiler.INSTANCE.getInvalidTokens().forEach(list -> {
                AtomicReference<String> error = new AtomicReference<>(
                        "Invalid Token " + list.get(0).getToken() +
                                " found " + list.size() + " times at locations(row,column): [");
                list.forEach(invalidToken -> {
                    error.set(error.get() + " (" + invalidToken.getRow() + ", " + invalidToken.getColumn() + ")");
                });
                error.set(error.get() + " ]");
                errors.add(error.get());
            });
            terminalTextArea.setText(errors.stream()
                    .reduce((x, y) -> x + "\n" + y)
                    .orElse(""));
            return;
        }
        terminalTextArea.setText("Code has No Lexical Errors...");
        // TODO: 12/19/2021  parser
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
