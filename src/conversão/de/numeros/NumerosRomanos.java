package conversão.de.numeros;

import javax.swing.JOptionPane;

public class NumerosRomanos {

    public String localizaNumero(String numero) {
        int n = Integer.parseInt(numero);
        return numero;
    }

    public String seperaNumero(String numero) {
        String result = "";
        String n = localizaNumero(numero);
        int contNumero = n.length();
        if (contNumero == 1) {
            int num = Integer.parseInt(n.substring(0, 1));
            result = retornaUni(num); // separa os numeros com um digito
        } else if (contNumero == 2) {
            int num = Integer.parseInt(n.substring(0, 1));
            int num2 = Integer.parseInt(n.substring(1, 2));
            result = retornaDez(num) + retornaUni(num2); //separa numeros de dois digitos
        } else if (contNumero == 3) {
            int num = Integer.parseInt(n.substring(0, 1));
            int num2 = Integer.parseInt(n.substring(1, 2));
            int num3 = Integer.parseInt(n.substring(2, 3));
            result = retornaCent(num) + retornaDez(num2) + retornaUni(num3); //separa numeros com 3 digitos
        } else {
            int num = Integer.parseInt(n.substring(0, 1));
            int num2 = Integer.parseInt(n.substring(1, 2));
            int num3 = Integer.parseInt(n.substring(2, 3));
            int num4 = Integer.parseInt(n.substring(3, 4));
            result = retornaMilhar(num) + retornaCent(num2) + retornaDez(num3) + retornaUni(num4); //separa numeros de 4 digitos
        }
        return result;
    }

    public String retornaUni(int num) { // realiza a transformação das unidades 
        String numSt = new String();
        if (num <= 3) {
            for (int i = 0; i < num; i++) {
                if (num > i) {
                    numSt += "I";
                }
            }
        } else if (num >= 5 && num < 9) {
            if (num == 5) {
                numSt = "V";
            } else {
                numSt = "V";
                for (int i = 5; i < num; i++) {
                    if (num > i) {
                        numSt += "I";
                    }
                }
            }
        } else if (num == 4) {
            numSt = "IV";
        } else {
            numSt = "IX";
        }
        return numSt;
    }

    public String retornaDez(int num) { // realiza a transformação das Dezenas 
        String numSt = new String();
        if (num <= 3) {
            for (int i = 0; i < num; i++) {
                if (num > i) {
                    numSt += "X";
                }
            }
        } else if (num >= 5 && num < 9) {
            if (num == 5) {
                numSt = "L";
            } else {
                numSt = "L";
                for (int i = 5; i < num; i++) {
                    if (num > i) {
                        numSt += "X";
                    }
                }
            }
        } else if (num == 4) {
            numSt = "XD";
        } else {
            numSt = "XC";
        }
        return numSt;
    }

    public String retornaCent(int num) { // realiza a transformação das Centenas 
        String numSt = new String();
        if (num <= 3) {
            for (int i = 0; i < num; i++) {
                if (num > i) {
                    numSt += "C";
                }
            }
        } else if (num >= 5 && num < 9) {
            if (num == 5) {
                numSt = "D";
            } else {
                numSt = "D";
                for (int i = 5; i < num; i++) {
                    if (num > i) {
                        numSt += "M";
                    }
                }
            }
        } else if (num == 4) {
            numSt = "CD";
        } else {
            numSt = "CM";
        }
        return numSt;
    }

    public String retornaMilhar(int num) { // realiza a transformação das Milhares 
        String numSt = new String();
        if (num <= 3) {
            for (int i = 0; i < num; i++) {
                if (num > i) {
                    numSt += "M";
                }
            }
        }
        return numSt;
    }

}
