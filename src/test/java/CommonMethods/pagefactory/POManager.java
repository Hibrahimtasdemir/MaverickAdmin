package CommonMethods.pagefactory;

import CommonMethods.pages.BenutzerPage;
import CommonMethods.pages.FunctionPage;
import CommonMethods.pages.GruppenPage;

public class POManager extends Annotations{

    private FunctionPage functionPage;
    private BenutzerPage benutzerPage;
    private GruppenPage gruppenPage;


    public FunctionPage getFunctionPage() {

        return functionPage == null ? new FunctionPage() : functionPage;
    }

    public BenutzerPage getBenutzerPage() {

        return benutzerPage == null ? new BenutzerPage() : benutzerPage;
    }

    public GruppenPage getGruppenPage() {
        return gruppenPage == null ? new GruppenPage() : gruppenPage;
    }
}

