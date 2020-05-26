package test.PIM;

import org.testng.annotations.DataProvider;
import utils.ExcelDataConfig;

public class AddEmployeeData extends ExcelDataConfig {
    //  private static final Logger LOGGER = Logger.getLogger(LoginData.class);
    public AddEmployeeData () {
        super("src/test/resources/ExcelSheet/AddEmp.xlsx");
    }



    @DataProvider(name = "AddEmpTest")
    public Object[][] AddEmpTest() {

        int rows = getRowCount("AddEmp");
        int col = getColumnCount("AddEmp");

        //  LOGGER.info("row = "+ rows + " columns = "+ col);
        System.out.println("row = "+ rows + " columns = "+ col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("AddEmp", i, j);
            }
        }
        return data;
    }
}
