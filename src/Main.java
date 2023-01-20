public class Main {
    public static void main(String[] args) throws Exception {

        try {
            printClassicCars comp = new printClassicCars();
            comp.printProductList("Classic Cars");
        } catch (Exception exception) {
            util.ExceptionHandler.handleException(exception);
        }
    }
}