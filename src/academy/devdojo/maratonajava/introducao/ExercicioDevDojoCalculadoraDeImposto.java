package academy.devdojo.maratonajava.introducao;

public class ExercicioDevDojoCalculadoraDeImposto {
    public static void main(String[] args) {

        double salarioAnual = 68508;
        double impostoUm = 0.097;
        double impostoDois = 0.3735;
        double impostoTres = 0.4950;
        double impostoFinal;

        if(salarioAnual <= 34712){
            impostoFinal = salarioAnual * impostoUm;
            System.out.println("Seu salário anual foi de "+salarioAnual+" e será taxado em 9,70% no ano, totalizando o valor de R$"+impostoFinal);
        }else if(salarioAnual >= 34713 && salarioAnual <= 68507){
            impostoFinal = salarioAnual * impostoDois;
            System.out.println("Seu salário anual foi de "+salarioAnual+" e será taxado em 37,35% no ano, totalizando o valor de R$"+impostoFinal);
        }else{
            impostoFinal = salarioAnual * impostoTres;
            System.out.println("Seu salário anual foi de "+salarioAnual+" e será taxado em 49,50% no ano, totalizando o valor de R$"+impostoFinal);
        }

    }
}
