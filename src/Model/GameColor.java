package Model;

public class GameColor {

    private Color _color;
    private byte _firstBoxNumber;
    private byte _lastBoxNumber;

    public GameColor(Color color, byte firstBoxNumber, byte lastBoxNumber){
        _color = color;
        _firstBoxNumber = firstBoxNumber;
        _lastBoxNumber = lastBoxNumber;
    }

    public Color get_color() {
        return _color;
    }

    public void set_color(Color _color) {
        this._color = _color;
    }

    public byte get_firstBoxNumber() {
        return _firstBoxNumber;
    }

    public void set_firstBoxNumber(byte _firstBoxNumber) {
        this._firstBoxNumber = _firstBoxNumber;
    }

    public byte get_lastBoxNumber() {
        return _lastBoxNumber;
    }

    public void set_lastBoxNumber(byte _lastBoxNumber) {
        this._lastBoxNumber = _lastBoxNumber;
    }

    public enum Color {
        Red, Blue, Green, Yellow
    }
}
