package Single_Inheritance;

public class TestCase_2 extends CommonToAll {

    void runningTC2(){
        startBrowser();
        System.out.println("Running TC2");
        readExcelFile();
        readDataBaseFile();
        closeBrowser();
    }
}
