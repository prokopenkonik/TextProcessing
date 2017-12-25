package model.entities;

public class Symbol {
    private Character value;

    public Symbol() {
    }

    public Symbol(Character value) {
        setChar(value);
    }

    public Character getChar() {
        return value;
    }

    public void setChar(Character value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
