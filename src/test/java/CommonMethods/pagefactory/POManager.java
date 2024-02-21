package CommonMethods.pagefactory;

import CommonMethods.pages.FunctionPage;

public class POManager extends Annotations{

    private FunctionPage homePage;


    public FunctionPage getHomePage() {

        return homePage == null ? new FunctionPage() : homePage;
    }
}
