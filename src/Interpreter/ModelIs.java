class ModeIs implements  Expression {
    private int value;

    public ModeIs(int value) {
        this.value = value;
    }

    public int interpret() {
        return value;
    }
}