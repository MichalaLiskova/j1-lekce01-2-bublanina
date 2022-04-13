package cz.czechitas.recept;

import cz.czechitas.recept.naradi.*;
import cz.czechitas.recept.suroviny.*;

public class SpousteciTrida {

    public static void main(String[] args) {
        Miska cervenaMiska;
        Miska zlutaMiska;
        Mixer mixer;
        Vaha kuchynskaVaha;
        PlechNaPeceni plech;
        ElektrickaTrouba trouba;
        Vajicka vajicka;

        Ovoce ovoce;
        Maslo maslo125g;
        Mouka pytlikMouky;
        Cukr pytlikCukru;
        PrasekDoPeciva prasekDoPeciva;

        cervenaMiska = new Miska("cervenaMiska");
        zlutaMiska = new Miska("zlutaMiska");
        mixer = new Mixer("mixer");
        kuchynskaVaha = new Vaha("vaha");
        plech = new PlechNaPeceni("plech");
        trouba = new ElektrickaTrouba("trouba");

        vajicka = new Vajicka("vajicka");
        ovoce = new Ovoce("ovoce");
        maslo125g = new Maslo("maslo125g");
        pytlikMouky = new Mouka("pytlikMouky");
        pytlikCukru = new Cukr("pytlikCukru");
        prasekDoPeciva = new PrasekDoPeciva("prasekDoPeciva");

        //---------------------------------------------------------------------

        // TODO: Sem napiste recept na bublaninu
        // Pouzivejte napovidani v editoru.
        // Vyskakuje samo nebo pomoci Ctrl+Mezernik

        //cervenaMiska.nalozSiJedenKus(vajicka);    - takhle to jde opakovat 4x nebo jak je viz níže jeden fori příklad
        for (int i = 0; i < 4; i++) {
            cervenaMiska.nalozSiJedenKus(vajicka);

        }
        cervenaMiska.nalozSiCelyObsah(pytlikCukru);
        mixer.zamichej(cervenaMiska);
        cervenaMiska.nalozSiCelyObsah(maslo125g);
        // System.out.println("Je dobře zamíchané: " + cervenaMiska.isDobreZamichane());  tohle způsobí informaci, že není dobře zamíchané, protože se tam přidalo máslo
        mixer.zamichej(cervenaMiska);
        System.out.println("Je dobře zamíchané: " + cervenaMiska.isDobreZamichane());
        while (pytlikMouky.getHmotnost() > 750) {
            cervenaMiska.nalozSiTrochu(pytlikMouky);
        }
        System.out.println("Má gr mouky: " + cervenaMiska.getHmotnostMouky());
        cervenaMiska.nalozSiCelyObsah(prasekDoPeciva);
        mixer.zamichej(cervenaMiska);
        plech.preberSiObsah(cervenaMiska);
        for (int i = 0; i < 50; i++) {
            plech.posypSeKusem(ovoce);
            System.out.println("Počet ovoce celkem : " + plech.getPocetOvoce());
        }

        trouba.zapniSe(180); ;
        while (!trouba.isPredehrata()) {
            trouba.nechejPect(1);
        };
        trouba.vlozSiDovnitr(plech);
        trouba.nechejPect(25);
        trouba.vypniSe();
        trouba.vyndejObsahVen();

        System.out.println("A teď přeji dobrou chuť.");
    }

}
