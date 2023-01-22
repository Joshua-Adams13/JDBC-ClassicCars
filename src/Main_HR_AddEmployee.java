public class Main_HR_AddEmployee {

    public static void main(String[] args) throws Exception {
        try {
            HRComponent comp = new HRComponent();

            int key = comp.addEmployee(
                    "Williams", "Roger", "x104", "rwilliams@classicmodelcars.com", "3",
                    "Sales Manager (NA)");

            System.out.println("The auto-generated primary key = " + key);
        } catch (Exception exception) {
            util.ExceptionHandler.handleException(exception);
        }
    }
}
