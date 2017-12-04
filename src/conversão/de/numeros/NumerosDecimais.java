package conversão.de.numeros;

   import java.util.Scanner;

public class NumerosDecimais {

    public String trocaNum(String ler){
        String romano = ler;
        
        char rom[] = {' ','I','V','X','L','C','D','M'};
        char rom2[] = {' ','i','v','x','l','c','d','m'};
        int valor[] = {0,1,5,10,50,100,500,1000};
        int ant = 0; //pega o valor anterior 
        int soma = 0; // faz a soma dos numeros decimais 
        char letra = ' ';
        for(int i = 0; i < romano.length(); i++ ){ //localiza a posição da letra
            letra = romano.charAt(i);
            for(int j = 0; j < rom.length; j++){
                if(letra == rom[j] || letra == rom2[j]){ //localiza a posição do numero e faz a soma dos valores
                    soma = soma + valor[j];
                 if(ant < valor[j]){
                     soma = soma - ant * 2; 
                     ant = valor[j];
                 }
                }
            }
        }
        //Retorna o Valor.
       return String.valueOf(soma);
    }
}

