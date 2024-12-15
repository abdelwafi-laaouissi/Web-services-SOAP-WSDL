package org.example;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        System.out.println("*************************** Concersion Euro To DH *********************************");
        System.out.println(proxy.convsuionEuroToDH(11));
        Compte cp = proxy.getCompte(4);
        System.out.println("*************************** Info Compte *********************************");
        System.out.println("CODE  : "+cp.getCode());
        System.out.println("Solde : "+cp.getSolde());
        System.out.println("Date  : " + cp.getDateCreation());
        List<Compte> listecomptes = proxy.getComptes();
        System.out.println("*************************** Liste Comptes  *********************************");
        for (Compte compte :listecomptes){
            System.out.println("CODE  : "+compte.getCode());
            System.out.println("Solde : "+compte.getSolde());
            System.out.println("Date  : " + compte.getDateCreation());
            System.out.println("----------------------------------------");

        }
    }

}
