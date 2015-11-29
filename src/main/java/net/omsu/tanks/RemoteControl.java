package net.omsu.tanks;

/**
 *
 */
public class RemoteControl {

    private double enginePower;
    private double turn;
    private boolean isStop;
    private boolean isFire;

    public RemoteControl(double enginePower, double turn) {
        this.enginePower = enginePower;
        this.turn = turn;
        this.isStop = false;
        this.isFire = false;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public double getTurn() {
        return turn;
    }

    public boolean isStop() {
        return isStop;
    }

    public boolean isFire() {
        return isFire;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public void setTurn(double turn) {
        this.turn = turn;
    }

    public void setIsStop(boolean isStop) {
        this.isStop = isStop;
    }

    public void setIsFire(boolean isFire) {
        this.isFire = isFire;
    }
}
