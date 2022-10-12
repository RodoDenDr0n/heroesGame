package characters;

public class King extends Noble {
    public King() {
        super();
        setPower(getPower() + 5);
        setHp(getHp() + 5);
    }

    @Override
    public void kick(Character defender) {
        kick(this, defender);
    }

    @Override
    public String toString() {
        return String.format("King(hp=%s, power=%s)", getHp(), getPower());
    }
}
