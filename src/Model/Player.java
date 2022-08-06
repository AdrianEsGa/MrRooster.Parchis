package Model;

public class Player {
    private String _name;

    private final GameColor _color;

    public Player(String name, GameColor color) {
        _name = name;
        _color = color;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

}



