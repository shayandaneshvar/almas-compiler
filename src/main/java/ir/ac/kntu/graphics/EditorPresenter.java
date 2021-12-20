package ir.ac.kntu.graphics;

import ir.ac.kntu.compiler.Compiler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.awt.*;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class EditorPresenter implements Initializable {


    @FXML
    private TextArea codeTextArea;

    @FXML
    private TextArea terminalTextArea;

    @FXML
    private Button compileButton;

    @FXML
    private CheckBox verboseCheckbox;

    @FXML
    private Button runButton;

    @FXML
    private TextField sourceTextField;

    @FXML
    private TextField targetTextField;

    @FXML
    private Button importButton;
    private File sourceFile;


    @FXML
    void compile(MouseEvent event) {
        if(sourceFile != null){
            try(FileWriter fileWriter = new FileWriter(sourceFile);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                PrintWriter printWriter = new PrintWriter(bufferedWriter)) {
                printWriter.write(codeTextArea.getText());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        terminalTextArea.setText("");
        Compiler.INSTANCE.runLexer(codeTextArea.getText());
        if (verboseCheckbox.isSelected()) {
            StringBuilder stringBuilder = new StringBuilder("<------- \n << Verbose Mode - Extracted Tokens >>");
            Compiler.INSTANCE.getExtractedTokens()
                    .forEach(z -> {
                        stringBuilder.append("\n --> { ")
                                .append(Compiler.INSTANCE.getTokenName(z.getType()))
                                .append("(").append(z.getText()).append(") at row ")
                                .append(z.getLine()).append(" at column ")
                                .append(z.getCharPositionInLine())
                                .append(" from ").append(z.getStartIndex())
                                .append(" to ").append(z.getStopIndex()).append(" }");
                    });
            stringBuilder.append("\n <<End OF Extracted Tokens>> \n -------> \n");
            terminalTextArea.setText(terminalTextArea.getText() + stringBuilder);
        }
        if (!Compiler.INSTANCE.getInvalidTokens().isEmpty()) {
            terminalTextArea.setText(terminalTextArea.getText() + "Code has Lexical Errors... \n");
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
            terminalTextArea.setText(terminalTextArea.getText() + errors.stream()
                    .reduce((x, y) -> x + "\n" + y)
                    .orElse(""));
            return;
        }
        terminalTextArea.setText(terminalTextArea.getText() + "Code has No Lexical Errors...");
        // TODO: 12/19/2021  parser
    }


    @FXML
    void importFromSource(MouseEvent event) {
        if(sourceFile == null){
            Toolkit.getDefaultToolkit().beep();
            return;
        }
        try(Scanner scanner = new Scanner(sourceFile)) {
            StringBuilder str = new StringBuilder();
            while (scanner.hasNextLine()){
                str.append(scanner.nextLine()).append("\n");
            }
            codeTextArea.setText(str.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void run(MouseEvent event) {
        // run code todo
    }

    @FXML
    void selectSource(MouseEvent event) {
        Stage stage = new Stage();
        stage.initOwner(Editor.getInstance().getStage());
        stage.setAlwaysOnTop(true);
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open source File");
        fileChooser.setInitialFileName("test.almas");
        fileChooser.setSelectedExtensionFilter(new FileChooser.ExtensionFilter("ALMAS file","*.almas"));
        File file = fileChooser.showOpenDialog(stage);
        if(file == null) return;
        if(!file.getName().endsWith(".almas")){
            file = new File(file.getPath() + ".almas");
        }
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        this.sourceFile = file;
        sourceTextField.setText(file.getName());
    }

    @FXML
    void selectTarget(MouseEvent event) {
        // open folder todo
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
