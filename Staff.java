class Staff {
    private String name;
    private int consecutiveDays;
    private CashRegister register;

    Staff(String _name, CashRegister _register) {
        name = _name;
        consecutiveDays = 0;
        register = _register;
    }

    public String getName() { return name; }
    public int getConsecutiveDays() { return consecutiveDays; }
    public CashRegister getRegister() { return register; }
}
