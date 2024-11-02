package main.lashukolga231;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ChessGameUI extends Application {
    private static final int TILE_SIZE = 60;
    private static final int BOARD_SIZE = 8;

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();

        MenuBar menuBar = createMenuBar();
        root.setTop(menuBar);

        GridPane chessBoard = createChessBoard();
        root.setCenter(chessBoard);

        VBox sidePanel = createSidePanel();
        root.setRight(sidePanel);

        Scene scene = new Scene(root, 900, 650);
        primaryStage.setTitle("Chess Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private MenuBar createMenuBar() {
        MenuBar menuBar = new MenuBar();

        Menu fileMenu = new Menu("File");
        Menu gameMenu = new Menu("Game");
        Menu optionsMenu = new Menu("Options");
        Menu helpMenu = new Menu("Help");

        menuBar.getMenus().addAll(fileMenu, gameMenu, optionsMenu, helpMenu);
        return menuBar;
    }

    private GridPane createChessBoard() {
        GridPane chessBoard = new GridPane();
        chessBoard.setAlignment(Pos.CENTER);

        boolean isWhite = true;

        for(int row = 0; row < BOARD_SIZE; row++) {
            for(int col = 0; col < BOARD_SIZE; col++) {
                Rectangle rectangle = new Rectangle(TILE_SIZE, TILE_SIZE);
                rectangle.setFill(isWhite ? Color.BEIGE : Color.BROWN);
                chessBoard.add(rectangle, col + 1, row + 1);

                ImageView piece = getPieceArt(row, col);
                if (piece != null) {
                    chessBoard.add(piece, col + 1, row + 1);
                }
                isWhite = !isWhite;
            }
            isWhite = !isWhite;
        }

        for (int i = 0; i < BOARD_SIZE; i++) {
            Label rowLabel = new Label (Integer.toString(BOARD_SIZE - i));
            chessBoard.add(rowLabel, 0, i + 1);
            GridPane.setMargin(rowLabel, new Insets(0, 5, 0, 5));

            Label colLabel = new Label(String.valueOf((char) ('a' + i)));
            chessBoard.add(colLabel, i + 1, 0);
            GridPane.setMargin(colLabel, new Insets(5, 0, 5, 0));
        }

        return chessBoard;
    }

    private ImageView getPieceArt(int row, int col) {
        String imagePath = null;

        if(row == 0 || row == BOARD_SIZE - 1) {
            String color = (row == 0) ? "black" : "white";

            switch (col) {
                case 0:
                case 7:
                    imagePath = color + "_rook.png";
                    break;
                case 1:
                case 6:
                    imagePath = color + "_knight.png";
                    break;
                case 2:
                case 5:
                    imagePath = color + "_bishop.png";
                    break;
                case 3:
                    imagePath = color + "_queen.png";
                    break;
                case 4:
                    imagePath = color + "_king.png";
                    break;
            }
        } else if (row == 1 || row == BOARD_SIZE - 2) {
            String color = (row == 1) ? "black" : "white";
            imagePath = color + "_pawn.png";
        }

        if (imagePath != null) {
            String fullPath = getClass().getResource("/images/" + imagePath).toExternalForm();
            System.out.println("Loading image: " + fullPath);

            Image image = new Image(fullPath);
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(TILE_SIZE - 10);
            imageView.setFitHeight(TILE_SIZE - 10);
            return imageView;
        }
        return null;
    }

    private VBox createSidePanel() {
        VBox sidePanel = new VBox();
        sidePanel.setPadding(new Insets(10));
        sidePanel.setSpacing(10);
        sidePanel.setStyle("-fx-border-color: gray; -fx-padding: 5;");

        GridPane playerPanel = new GridPane();
        playerPanel.setPadding(new Insets(5));
        playerPanel.setHgap(10);
        playerPanel.setVgap(5);
        playerPanel.setStyle("-fx-border-color: black; -fx-border-width: 1;");

        Label playerWhite = new Label("White");
        playerWhite.setStyle("-fx-background-color: white; -fx-border-color: black; -fx-padding: 5;");
        Label playerBlack = new Label("Black");
        playerBlack.setStyle("-fx-background-color: black; -fx-border-color: white; -fx-padding: 5; -fx-border-color: black;");

        Label timerWhite = new Label("00:00");
        Label timerBlack = new Label("00:00");

        playerPanel.add(playerWhite, 0, 0);
        playerPanel.add(playerBlack, 1, 0);
        playerPanel.add(timerWhite, 0, 1);
        playerPanel.add(timerBlack, 1, 1);

        TabPane tabPane = new TabPane();
        Tab chatTab = new Tab("Chat");
        Tab settingsTab = new Tab("Settings");

        VBox settingsContent = new VBox();
        settingsContent.setSpacing(5);
        settingsContent.setPadding(new Insets(10));
        settingsContent.setStyle("-fx-border-color: gray; -fx-border-width: 1; -fx-background-color: #E0E0E0;");

        CheckBox whiteOnTop = new CheckBox("White On Top");
        CheckBox displayMoves = new CheckBox("Display Moves");
        CheckBox displayLabels = new CheckBox("Display Labels");

        settingsContent.getChildren().addAll(whiteOnTop, displayMoves, displayLabels);
        settingsTab.setContent(settingsContent);

        tabPane.getTabs().addAll(chatTab, settingsTab);
        tabPane.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);

        sidePanel.getChildren().addAll(
                new Label("Players:"),
                playerPanel,
                tabPane);

        return sidePanel;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
