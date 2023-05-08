public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {

        // Define your visit
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

}
