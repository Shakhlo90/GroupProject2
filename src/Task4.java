interface WebDriver {
    void open();

    void close();

    void getTitle();
}


interface TakesScreenshot extends WebDriver {
    void getScreenshot();
}

interface RemoteWebDriver extends WebDriver, TakesScreenshot {


    void navigate();
}

public class Task4 {
/*Provide Implementation for the diagram below. Then
create a test class in which you need to create Objects of
ChromeDriver, FirefoxDrive and SafariDriver classes and
see which methods available to them.*/

    public static void main(String[] args) {


        RemoteWebDriver[] arr = {new FireFoxDriver(), new SafariDriver(), new ChromeDriver()};
        for (RemoteWebDriver arr1 : arr) {
            System.out.println("-------------------------------------------------");
            arr1.open();
            arr1.navigate();
            arr1.getTitle();
            arr1.close();
            arr1.getScreenshot();
        }

    }
}

class FireFoxDriver implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("FireFoxDriver is opened");

    }

    @Override
    public void close() {
        System.out.println("FireFoxDriver is closed");


    }

    @Override
    public void getTitle() {
        System.out.println("FaceBookWebSite is  displayed");


    }

    @Override
    public void navigate() {
        System.out.println("WebPage is navigated to FaceBookWebSite");

    }

    @Override
    public void getScreenshot() {
        System.out.println("WebPageScreenshot  is taken ");

    }
}

class ChromeDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("ChromeDriver is opened");

    }

    @Override
    public void close() {
        System.out.println("ChromeDriver is closed");


    }

    @Override
    public void getTitle() {
        System.out.println("Title is displayed");


    }

    @Override
    public void navigate() {
        System.out.println("WebPage is navigated to FeceBookWebSite");

    }

    @Override
    public void getScreenshot() {
        System.out.println("WebPageScreenshot  is taken ");

    }
}


class SafariDriver implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("SafariWebPage is opened");

    }

    @Override
    public void close() {
        System.out.println("SafariWebPage is closed");


    }

    @Override
    public void getTitle() {
        System.out.println("Title is displayed");


    }

    @Override
    public void navigate() {
        System.out.println("WebPage is navigated to FeceBookWebSite");

    }

    @Override
    public void getScreenshot() {
        System.out.println("WebPageScreenshot  is taken ");

    }
}


