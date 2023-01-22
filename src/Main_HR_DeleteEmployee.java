public class Main_HR_DeleteEmployee {
    public static void main(String[] args) throws Exception {
        try {
            String employeeNumber = "1703";

            HRComponent comp = new HRComponent();

            boolean success = comp.deleteEmployee(employeeNumber);
            System.out.println("Employee " + employeeNumber + " has " + (success ? "been deleted" : "not been deleted!"));

        } catch (Exception exception) {
            util.ExceptionHandler.handleException(exception);
        }
    }
}
