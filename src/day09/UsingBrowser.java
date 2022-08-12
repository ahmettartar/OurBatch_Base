package day09;

public class UsingBrowser {

    public static void main(String[] args) {

        //Browser br = new Browser();
        //Browser browser = Browser.CHROME;
        Browser browser = Browser.SAFARI;
        switch (browser){

            case EDGE:
            case CHROME:
                System.out.println("Opening chrome browser");
                break;
            case SAFARI:
                System.out.println("Opening safari browser");
                break;
            case FIREFOX:

        }

    }

}

