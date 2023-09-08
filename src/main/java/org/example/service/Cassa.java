package org.example;

public class Cassa {

    public static String calcolaResto(double importoPagato, double costoRichiesto) {

        double restoDovuto = importoPagato - costoRichiesto;

        if (restoDovuto < 0) {
            return "L'importo non e' valido!";
        }

        double banconotaDa20 = restoDovuto / 20;
        double banconotaDa5 = (restoDovuto % 20) / 5;
        double restoMonete = restoDovuto % 5;
        double restoCentesimi = (restoDovuto - Math.floor(restoDovuto) * 100);

        String result = "Resto: ";
        if (banconotaDa20 > 0) {
            result += banconotaDa20 + "banconote da 20 euro";
            if (banconotaDa5 > 0 || restoMonete > 0) {
                result += banconotaDa5 + ", ";
            }
        }

        if (banconotaDa5 > 0) {
            result += banconotaDa5 + "banconote da 5 euro";
            if (restoMonete > 0) {
                result += ", ";
            }
        }

        if (restoMonete > 0) {
            result += restoMonete + "monete da 1 euro ";
            if (restoCentesimi > 0) {
                result += ", ";
            }
        }

        if (restoCentesimi > 0) {
            result += restoCentesimi + " centesimi";
        }
        
        return result;
    }
}
