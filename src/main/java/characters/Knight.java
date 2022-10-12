package characters;

public class Knight extends Noble {
    public Knight() {
        super();
        setPower(getPower() + 2);
        setHp(getHp() + 2);
    }

    @Override
    public void kick(Character defender) {
        kick(this, defender);
    }

    @Override
    public String toString() {
        return String.format("Knight(hp=%s, power=%s)", getHp(), getPower());
    }
}
