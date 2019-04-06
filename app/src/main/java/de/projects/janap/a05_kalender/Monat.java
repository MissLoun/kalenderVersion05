package de.projects.janap.a05_kalender;

import java.util.Calendar;

public class Monat {

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //Attribute
    private int laenge;
    private String bezeichnung;
    private int anfang;

    private int farbe;

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //Methoden
    /*-------------------------Set Methoden-------------------------------------------------------*/
    public void setMonat(Calendar derKalender) {
        anfang = derKalender.getFirstDayOfWeek();     //legt den ersten Tag der Woche fest (Montag = 1,.. )
        laenge = derKalender.get(Calendar.DAY_OF_WEEK_IN_MONTH);    //legt die laenge des Monats fest
        setMonatsBezeichnung(derKalender.get(Calendar.MONTH));      //legt Bezeichnung des Monats fest
        setMonatsFarbe(derKalender.get(Calendar.MONTH));    //legt Farbe des Monats fest
    }
    private void setMonatsBezeichnung(int pMonat) {
        switch (pMonat +1){
            case 1:
                bezeichnung = "Januar";
                break;
            case 2:
                bezeichnung = "Februar";
                break;
            case 3:
                bezeichnung = "März";
                break;
            case 4:
                bezeichnung = "April";
                break;
            case 5:
                bezeichnung = "Mai";
                break;
            case 6:
                bezeichnung = "Juni";
                break;
            case 7:
                bezeichnung = "Juli";
                break;
            case 8:
                bezeichnung = "August";
                break;
            case 9:
                bezeichnung = "September";
                break;
            case 10:
                bezeichnung = "Oktober";
                break;
            case 11:
                bezeichnung = "November";
                break;
            case 12:
                bezeichnung = "Dezember";
                break;
        }
    }
    private void setMonatsFarbe(int pMonat) {
        switch (pMonat +1){
            case 1:
                farbe = R.color.januar;
                break;
            case 2:
                farbe = R.color.februar;
                break;
            case 3:
                farbe = R.color.maerz;
                break;
            case 4:
                farbe = R.color.april;
                break;
            case 5:
                farbe = R.color.mai;
                break;
            case 6:
                farbe = R.color.juni;
                break;
            case 7:
                farbe = R.color.juli;
                break;
            case 8:
                farbe = R.color.august;
                break;
            case 9:
                farbe = R.color.september;
                break;
            case 10:
                farbe = R.color.oktober;
                break;
            case 11:
                farbe = R.color.november;
                break;
            case 12:
                farbe = R.color.dezember;
                break;
        }
    }

    /*-------------------------Get Methoden-------------------------------------------------------*/
    public int getMonatslaenge() {
        return laenge;
    }
    public String getMonatsBezeichnung(){
        return bezeichnung;
    }
    public int getAnfang() {
        return anfang;
    }
    public int getFarbe() {
        return farbe;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

}
