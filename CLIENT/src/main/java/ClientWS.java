import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {

        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        System.out.println(proxy.conversionEuroToDH(800));
        Compte cp  = proxy.getCompte(2);
        System.out.println("code :" +cp.getCode());
        System.out.println("montant :"+cp.getMt());
        System.out.println("dateCréation :"+cp.getDateCreation());

        List<Compte> compteList = proxy.listComptes();
        for ( Compte c : compteList) {

            System.out.println("------------------------------------------");
            System.out.println("code :"+c.getCode());
            System.out.println("montant :" + c.getMt());
            System.out.println("date de création :"+ c.getDateCreation());

        }




    }
}
