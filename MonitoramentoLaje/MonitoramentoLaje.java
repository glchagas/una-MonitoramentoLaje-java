import java.util.Scanner;

public class MonitoramentoLaje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Definição de limites técnicos:
        double cargaProjeto = 15.0;
        double limiteSeguranca = cargaProjeto * 0.8; //80% da carga máxima

        System.out.println("--- Sistema SafeBuild: Monitoramento de Carga ---");
        System.out.println("Digite a leitura atual do sensor (k/m²): ");
        double cargaAtual = sc.nextDouble();

        // Algoritmo de Tomada de Decisão 
        if (cargaAtual < limiteSeguranca) {
            System.out.println("Status: VERDE");
            System.out.println("Decisão: Operação normal. Carga dentro dos parâmetros de segurança.");
        } else if (cargaAtual >= limiteSeguranca && cargaAtual <= cargaProjeto) {
            System.out.println("Status: AMARELO (ALERTA)");
            System.out.println("Decisão: Reduzir velocidade de conctetagem e evacuar pessoal não essencial.");
        } else{ 
            //Caso a carga ultrapsse o limite de projeto:
         System.out.println("Status: VERMELHO (CRÍTICO)");
         System.out.println("Decisão: INTERROMPER IMEDIATAMENTE: Risco de colapso das escoras.");

         //Verificação adicional de segurança extrema
         if (cargaAtual >(cargaProjeto * 1.2)) {
        System.out.println("ALERTA ADICIONAL: Possível falha catastrófica iminente. Evacuar área total.");
    }
    }
    }
}
