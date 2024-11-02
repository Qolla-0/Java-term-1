package main.lashukolga231;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.geometry.Insets;
import javafx.scene.layout.Priority;

public class MyCalc extends Application {

   @Override
   public void start(Stage primaryStage) {
      BorderPane main = new BorderPane();

      VBox calculatorBox = createProgrammerCalculator();

      VBox leasingBox = createLeasingForm();

      main.setLeft(calculatorBox);
      main.setRight(leasingBox);

      Scene scene = new Scene(main, 900, 500);
      primaryStage.setTitle("Калькулятор Программист и Автолизинг");
      primaryStage.setScene(scene);
      primaryStage.setResizable(true);
      primaryStage.show();
   }

   private MenuBar configureMenu() {
      MenuBar bar = new MenuBar();

      Menu view = new Menu("Вид");
      Menu edit = new Menu("Правка");
      Menu help = new Menu("Справка");

      bar.getMenus().addAll(view, edit, help);
      return bar;
   }

   private VBox createProgrammerCalculator() {
      VBox box = new VBox(10);
      box.setPadding(new Insets(10));
      box.setStyle("-fx-background-color: #EDF0F2");

      box.getChildren().add(configureMenu());

      VBox resultContainer = new VBox(5);
      resultContainer.setPadding(new Insets(10));
      resultContainer.setStyle("-fx-background-color: gray; -fx-border-width: 1; -fx-background-color: #FFFFFF;");
      HBox resultView = configureResultView();
      resultContainer.getChildren().add(resultView);

      Text historyText = new Text("0000   0000   0000   0000");
      historyText.setFont(new Font(14));
      historyText.setStyle("-fx-border-color: gray; -fx-padding: 5;");
      resultContainer.getChildren().add(historyText);
      box.getChildren().add(resultContainer);

      HBox switchesAndButtons = new HBox(10);
      VBox switches = configureSwitches();
      GridPane buttons = configureButtons();
      buttons.setMaxWidth(400);
      switchesAndButtons.getChildren().addAll(switches, buttons);
      switchesAndButtons.setAlignment(Pos.CENTER_LEFT);

      box.getChildren().add(switchesAndButtons);

      VBox.setVgrow(resultContainer, Priority.ALWAYS);
      VBox.setVgrow(switchesAndButtons, Priority.ALWAYS);

      return box;
   }

   private HBox configureResultView() {
      HBox resultBox = new HBox();
      resultBox.setPadding(new Insets(10));
      resultBox.setStyle("-fx-border-color: gray; -fx-border-width: 1; -fx-background-color: #FFFFFF;");
      Text resultText = new Text("0");
      resultText.setFont(new Font(24));
      resultBox.getChildren().add(resultText);
      resultBox.setAlignment(Pos.BASELINE_CENTER);
      HBox.setHgrow(resultText, Priority.ALWAYS);
      return resultBox;
   }

   private VBox configureSwitches() {
      VBox switchBox = new VBox(5);
      switchBox.setPadding(new Insets(10));

      VBox modeBox = new VBox(5);
      modeBox.setPadding(new Insets(10));
      modeBox.setStyle("-fx-border-color: gray; -fx-border-width: 1; -fx-background-color: #FFFFFF;");

      Label modeLabel = new Label("Система счисления");
      ToggleGroup modeGroup = new ToggleGroup();
      RadioButton hexButton = new RadioButton("Hex");
      RadioButton decButton = new RadioButton("Dec");
      RadioButton octButton = new RadioButton("Oct");
      RadioButton binButton = new RadioButton("Bin");
      hexButton.setToggleGroup(modeGroup);
      decButton.setToggleGroup(modeGroup);
      octButton.setToggleGroup(modeGroup);
      binButton.setToggleGroup(modeGroup);
      decButton.setSelected(true);
      modeBox.getChildren().addAll(modeLabel, hexButton, decButton, octButton, binButton);

      VBox byteBox = new VBox(5);
      byteBox.setPadding(new Insets(10));
      byteBox.setStyle("-fx-border-color: gray; -fx-border-width: 1; -fx-background-color: #FFFFFF;");

      Label byteLabel = new Label("Размер байта");
      ToggleGroup byteGroup = new ToggleGroup();
      RadioButton eightByte = new RadioButton("8 byte");
      RadioButton fourByte = new RadioButton("4 byte");
      RadioButton twoByte = new RadioButton("2 byte");
      RadioButton oneByte = new RadioButton("1 byte");
      eightByte.setToggleGroup(byteGroup);
      fourByte.setToggleGroup(byteGroup);
      twoByte.setToggleGroup(byteGroup);
      oneByte.setToggleGroup(byteGroup);
      oneByte.setSelected(true);
      byteBox.getChildren().addAll(eightByte, fourByte, twoByte, oneByte);

      switchBox.getChildren().addAll(modeBox, byteBox);

      return switchBox;
   }

   private GridPane configureButtons() {
      GridPane button = new GridPane();
      button.setHgap(5);
      button.setVgap(5);
      button.setPadding(new Insets(10));
      button.setStyle("-fx-border-color: gray; -fx-border-width: 1; -fx-background-color: #E0E4E8;");

      button.add(new Button("Mod"), 0, 0);
      button.add(new Button("A"), 1, 0);
      button.add(new Button("MC"), 2, 0);
      button.add(new Button("MR"), 3, 0);
      button.add(new Button("MS"), 4, 0);
      button.add(new Button("M+"), 5, 0);
      button.add(new Button("M-"), 6, 0);

      button.add(new Button("("), 0, 1);
      button.add(new Button(")"), 1, 1);
      button.add(new Button("B"), 2, 1);
      button.add(new Button("←"), 3, 1);
      button.add(new Button("CE"), 4, 1);
      button.add(new Button("C"), 5, 1);
      button.add(new Button("±"), 6, 1);
      button.add(new Button("√"), 7, 1);

      button.add(new Button("RoL"), 0, 2);
      button.add(new Button("RoR"), 1, 2);
      button.add(new Button("C"), 2, 2);
      button.add(new Button("7"), 3, 2);
      button.add(new Button("8"), 4, 2);
      button.add(new Button("9"), 5, 2);
      button.add(new Button("/"), 6, 2);
      button.add(new Button("%"), 7, 2);

      button.add(new Button("Or"), 0, 3);
      button.add(new Button("Xor"), 1, 3);
      button.add(new Button("D"), 2, 3);
      button.add(new Button("4"), 3, 3);
      button.add(new Button("5"), 4, 3);
      button.add(new Button("6"), 5, 3);
      button.add(new Button("*"), 6, 3);
      button.add(new Button("1/x"), 7, 3);

      button.add(new Button("Lsh"), 0, 4);
      button.add(new Button("Rsh"), 1, 4);
      button.add(new Button("E"), 2, 4);
      button.add(new Button("1"), 3, 4);
      button.add(new Button("2"), 4, 4);
      button.add(new Button("3"), 5, 4);
      button.add(new Button("-"), 6, 4);

      button.add(new Button("Not"), 0, 5);
      button.add(new Button("And"), 1, 5);
      button.add(new Button("F"), 2, 5);
      button.add(new Button("0"), 3, 5, 2, 1);
      button.add(new Button("."), 5, 5);
      button.add(new Button("+"), 6, 5);
      button.add(new Button("="), 7, 4, 1, 2);

      for (int i = 0; i < 8; i++) {
         ColumnConstraints column = new ColumnConstraints();
         column.setHgrow(Priority.ALWAYS);
         column.setFillWidth(true);
         button.getColumnConstraints().add(column);
      }

      for (int i = 0; i < 6; i++) {
         RowConstraints row = new RowConstraints();
         row.setVgrow(Priority.ALWAYS);
         row.setFillHeight(true);
         button.getRowConstraints().add(row);
      }

      for (Node child : button.getChildren()) {
         if (child instanceof Button) {
            ((Button) child).setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
         }
      }
      return button;
   }

   private VBox createLeasingForm() {
      VBox leasing = new VBox(10);
      leasing.setPadding(new Insets(10));
      leasing.setStyle("-fx-border-color: gray; -fx-border-width: 1; -fx-background-color: #F0F0F0;");

      ComboBox<String> calcType = new ComboBox<>();
      calcType.getItems().addAll("Регулярный платеж", "Срок аренды", "Годовые выплаты", "Процентная ставка");
      calcType.setPromptText("Выберите значение для вычисления");

      VBox fields = new VBox(5);
      fields.getChildren().addAll(
              createLabeledField("Стоимость аренды:"),
              createLabeledField("Срок аренды:"),
              createLabeledField("Годовые выплаты:"),
              createLabeledField("Остаточная стоимость:"),
              createLabeledField("Процентная ставка (%):")
      );

      Button calculateButton = new Button("Вычислить");

      leasing.getChildren().addAll(calcType, fields, calculateButton);
      return leasing;
   }

   private HBox createLabeledField(String labelText) {
      Label label = new Label(labelText);
      TextField field = new TextField();
      field.setPrefWidth(150);
      HBox hBox = new HBox(10, label, field);
      hBox.setAlignment(Pos.CENTER_LEFT);
      return hBox;
   }

   public static void main(String[] args) {
      launch(args);
   }
}