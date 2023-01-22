public class Main {
    public static void main(String[] args) throws Exception {

        try {
            PrintClassicCars comp = new PrintClassicCars();
            comp.printProductList("Classic Cars");
        } catch (Exception exception) {
            util.ExceptionHandler.handleException(exception);
        }
    }
}