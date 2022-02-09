public class Clerk extends Staff {

    Clerk(String _name, CashRegister _register) {
        super(_name, _register);
    }

    public void work(int day) {
        arriveAtStore(day);
        checkRegister();
    }

    private void arriveAtStore(int day) {
        System.out.println(String.format("%s has arrived at the store on day %d", getName(), day));
    }

    private void checkRegister() {
        double register_balance = getRegister().getBalance();
        System.out.println(String.format("%s has counted a total of $%f in the register", getName(), register_balance));

        if (register_balance < 75) { goToBank(); }
    }

    private void goToBank() {
        getRegister().alterBalance(1000);
        System.out.println(String.format("%s has added $1000 to the register", getName()));
    } 

    public static void main(String[] args) {
        CashRegister r1 = new CashRegister();
        Clerk velma = new Clerk("Velma", r1);
        velma.work(1);
        System.out.println(r1.getBalance());
    }
}