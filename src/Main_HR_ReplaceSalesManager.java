public class Main_HR_ReplaceSalesManager {


    public static void main(String[] args) throws Exception {
        try {
            String fromManager = "1143";
            String toManager = "1621";

            HRComponent comp = new HRComponent();

            int count = comp.replaceSalesManager(fromManager, toManager);
            System.out.println(count + " Employees have been reassigned tp " + toManager);

        } catch (Exception exception) {
            util.ExceptionHandler.handleException(exception);
        }
    }
}
