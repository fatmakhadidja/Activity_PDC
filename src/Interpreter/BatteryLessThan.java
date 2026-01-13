class BatteryLessThan implements  Expression {
    private int value;

    public BatteryLessThan(int value) {
        this.value = value;
    }

    public int interpret() {
        return value;
    }
}