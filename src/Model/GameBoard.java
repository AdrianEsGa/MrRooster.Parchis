package Model;

import java.util.ArrayList;
public class GameBoard {

    private ArrayList<GameBoardBox> _boxes;

    public ArrayList<GameBoardBox> get_boxes() {
        return _boxes;
    }

    public void set_boxes(ArrayList<GameBoardBox> _boxes) {
        this._boxes = _boxes;
    }
}

