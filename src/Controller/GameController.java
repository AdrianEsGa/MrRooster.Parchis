package Controller;

import Model.GameBoard;
import Model.GameBoardBox;
import Model.GameColor;
import Model.Player;

import java.util.ArrayList;

public class GameController {

    private ArrayList<Byte> _homeBoxes = new ArrayList<Byte>(12);
    private GameBoard _board;
    private Player _player1, _player2, _player3, _player4;
    private GameColor _color1, _color2, _color3, _color4;

    public void InitializeGame(String player1, String player2, String player3, String player4) {

        InitializeGameBoard();
        InitializePlayers(player1, player2, player3, player4);

    }

    private void InitializeGameBoard() {

        _homeBoxes.add((byte)5); _homeBoxes.add((byte)12); _homeBoxes.add((byte)17); _homeBoxes.add((byte)22);
        _homeBoxes.add((byte)29); _homeBoxes.add((byte)34); _homeBoxes.add((byte)39); _homeBoxes.add((byte)46);
        _homeBoxes.add((byte)51); _homeBoxes.add((byte)56); _homeBoxes.add((byte)63); _homeBoxes.add((byte)68);

        _board = new GameBoard();
        _board.set_boxes(BuildGameBoardBoxes());
    }

    private ArrayList<GameBoardBox> BuildGameBoardBoxes() {

        ArrayList<GameBoardBox> boxes = new ArrayList<>();

        for (byte i = 1; i < 69; i++) {
            boxes.add(new GameBoardBox(i, _homeBoxes.contains(i)));
        }

        return boxes;
    }
    private void InitializePlayers(String player1, String player2, String player3, String player4) {

        InitializeColors();

        _player1 = new Player(player1, _color1);
        _player2 = new Player(player1, _color2);
        _player3 = new Player(player1, _color3);
        _player4 = new Player(player1, _color4);
    }

    private void InitializeColors() {
        _color1 = new GameColor(GameColor.Color.Blue, (byte) 22, (byte) 17);
        _color2 = new GameColor(GameColor.Color.Red, (byte) 39, (byte) 34);
        _color3 = new GameColor(GameColor.Color.Green, (byte) 56, (byte) 51);
        _color4 = new GameColor(GameColor.Color.Yellow, (byte) 5, (byte) 68);
    }
}
