package CommonMethods.pagefactory;

import CommonMethods.pages.BenutzerPage;
import CommonMethods.pages.FunctionPage;

public class POManager extends Annotations{

    private FunctionPage functionPage;
    private BenutzerPage benutzerPage;


    public FunctionPage getFunctionPage() {

        return functionPage == null ? new FunctionPage() : functionPage;
    }

    public BenutzerPage getBenutzerPage() {
        return benutzerPage == null ? new BenutzerPage() : benutzerPage;
    }
}
