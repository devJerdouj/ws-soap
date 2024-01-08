package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.List;


@WebService(serviceName = "BanqueWS")
public class BanqueService {
@WebMethod(operationName = "conversionEuroToDH")
    public double conversion(@WebParam(name="montant") double mt){
        return mt*11;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name="code") int code){
         return new Compte(code,Math.random()*40000);
    }

    @WebMethod
    public List<Compte> listComptes (){
        return List.of(
                new Compte(1,Math.random()*10000),
                new Compte(2,Math.random()*80000),
                new Compte(3,Math.random()*70000)
        );
    }





}
