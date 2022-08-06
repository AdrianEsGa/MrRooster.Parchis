package Model;

public class GameBoardBox {
    private byte _number;
    private boolean _home;

    public GameBoardBox(byte number, boolean isHome){
        _number = number;
        _home = isHome;
    }

    public byte get_number() {
        return _number;
    }

    public void set_number(byte _number) {
        this._number = _number;
    }

    public boolean is_home() {
        return _home;
    }

    public void set_home(boolean _home) {
        this._home = _home;
    }
}
