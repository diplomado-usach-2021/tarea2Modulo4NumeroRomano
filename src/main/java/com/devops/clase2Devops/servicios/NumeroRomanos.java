package com.devops.clase2Devops.servicios;


public class NumeroRomanos {

    
    public static Object numToRomano(int numero) {

        String miles = "", decenas = "", centenas = "", unidades = "";
        int unidadNum, decenasNum, centenasNum, milesNum;

        milesNum = numero / 1000;
        centenasNum = (numero % 1000) / 100;
        decenasNum = ((numero % 1000) % 100) / 10;
        unidadNum = (((numero % 1000) % 100) % 10);

        switch (unidadNum) {
            case 1:
                unidades += "I";
                break;
            case 2:
                unidades += "II";
                break;
            case 3:
                 unidades += "III";
                break;
            case 4:
                unidades += "IV";
                break;
            case 5:
                unidades += "V";
                break;
            case 6:
                unidades += "VI";
                break;
            case 7:
                unidades += "VII";
                break;
            case 8:
                unidades += "VIII";
                break;
            case 9:
                unidades += "IX";
                break;
        }

        switch (decenasNum) {
            case 1:
                decenas += "X";
                break;
            case 2:
                decenas += "XX";
                break;
            case 3:
                decenas += "XXX";
                break;
            case 4:
                decenas += "XL";
                break;
            case 5:
                decenas += "L";
                break;
            case 6:
                decenas += "LX";
                break;
            case 7:
                decenas += "LXX";
                break;
            case 8:
                decenas += "LXXX";
                break;
            case 9:
                decenas += "XC";
                break;
        }

        switch (centenasNum) {
            case 1:
                centenas += "C";
                break;
            case 2:
                centenas += "CC";
                break;
            case 3:
                centenas += "CCC";
                break;
            case 4:
                centenas += "CD";
                break;
            case 5:
                centenas += "D";
                break;
            case 6:
                centenas += "DC";
                break;
            case 7:
                centenas += "DCC";
                break;
            case 8:
                centenas += "DCCC";
                break;
            case 9:
                centenas += "CM";
                break;
        }

        switch (milesNum) {
            case 1:
                miles += "M";
                break;
            case 2:
                miles += "MM";
                break;
            case 3:
                miles += "MMM";
                break;
        }

     
        System.out.println("Su numero " + numero + " en romano es: " +miles + centenas + decenas + unidades);
        return miles + centenas + decenas + unidades;

    }

   

}
