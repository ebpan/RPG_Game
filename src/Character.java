public class Character {
    // TODO: make separate classes for different character types
    private double hp;
    private double atk;
    private double mp;

    public Character () {
        //TODO: Add stamina to be used for heavy attacks, which regenerates slowly per turn
        hp = 100;
        atk = 30;
        mp = 55;
    }

    public double getAtk() {
        return atk;
    }

    public double getHp() {
        return hp;
    }

    public double getMp() {
        return mp;
    }

    public void setAtk(double atk) {
        this.atk = atk;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public void setMp(double mp) {
        this.mp = mp;
    }

    public void healHP() {
        this.hp = this.hp + 30;
    }

    public void restoreMP() {
        this.mp = this.mp + 30;
    }

    public void addObject() {
        this.hp = this.hp + (this.hp * .10);
    }
}
