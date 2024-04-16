package CommonMethods.pagefactory;

import CommonMethods.pages.*;

public class POManager extends Annotations{

    private FunctionPage functionPage;
    private BenutzerPage benutzerPage;
    private GruppenPage gruppenPage;
    private RollenPage rollenPage;
    private Organizationseinheiten organizationseinheiten;
    private Synchronization synchronization;
    private Miscellaneous miscellaneous;


    public FunctionPage getFunctionPage() {

        return functionPage == null ? new FunctionPage() : functionPage;
    }

    public BenutzerPage getBenutzerPage() {

        return benutzerPage == null ? new BenutzerPage() : benutzerPage;
    }

    public GruppenPage getGruppenPage() {

        return gruppenPage == null ? new GruppenPage() : gruppenPage;
    }
    public RollenPage getRollenPage(){

        return rollenPage == null ? new RollenPage() : rollenPage;
    }
    public Organizationseinheiten getOrganizationseinheiten(){

        return organizationseinheiten == null ? new Organizationseinheiten() : organizationseinheiten;
    }
    public Synchronization getSynchrozation(){

        return synchronization == null ? new Synchronization() : synchronization;
    }
    public Miscellaneous getMiscellaneous(){
        return miscellaneous == null ? new Miscellaneous() : miscellaneous;
    }
}

