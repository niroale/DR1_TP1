package infnet;

import java.util.Arrays;
import java.util.Scanner;

public class nicole_roale_DR1_TP1 {
    
    private static String alunos[];
    private static float av01[];
    private static float av02[];
    
    private static int QTDE = 100;
    private static String situacao;
    
    private static String Situacao(float valor){
         if (valor < 4) {
            situacao = "Reprovado";
        } else if( valor >= 7) {
            situacao = "Aprovado";                        
        } else {
            situacao = "Prova final";
        } 
         return situacao;
    }
    
    private static void Imprimir(int id){
    
        float media = ( av01[id] + av02[id] ) / 2;                
                            
        Situacao(media);
        
        System.out.printf("{%d} %s - %.2f - %.2f :: Media = %.2f :: Situacao = (%s)\n", 
                            id, alunos[id], av01[id], av02[id], media, situacao);
   }
 
    private static void imprimir() {
		for (int i = 0; i < QTDE; i++) {
			if(alunos[i] != null) {
				Imprimir(i);
			}
		}
	}    
    
    public static void main(String[] args){
        alunos = new String[QTDE];
        av01   = new float[QTDE];
        av02   = new float[QTDE];
        Integer[] menu = {1,2,3,4};
        int opcao;
        int i = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        do {
            System.out.println("----------------- MENU -----------------");
            System.out.println("[1] Registrar as notas de um novo aluno");
            System.out.println("[2] Consultar boletim de um aluno");
            System.out.println("[3] Consultar notas da turma");
            System.out.println("[4] Sair");
            System.out.println("-> Selecione a opcao desejada:");

            opcao = entrada.nextInt();
            
            if (Arrays.asList(menu).contains(opcao)) {
                if (opcao == 1) {

                    if (i < QTDE) {
                        System.out.println("Informe o nome do aluno:");
                        alunos[i] = entrada.next();

                        System.out.println("Informe a nota da AV01:");
                        av01[i] = entrada.nextFloat();

                        System.out.println("Informe a nota da AV02:");
                        av02[i] = entrada.nextFloat();

                        i++;

                    } else {
                        System.out.println("Impossível cadastrar novo aluno!");
                        System.out.println("Limite do banco atingido.");
                    }
                } else if(opcao == 2){
                    System.out.println("Informe o ID do aluno:");
                    int id = entrada.nextInt();

                    if (id >= 0 && id < i ) {
//                        System.out.println("Aluno:");
                        //for (int cont = 0; cont < i; cont++) { 
//                            String situacao;
//                            float media = ( av01[id] + av01[id] ) / 2;                
//                            
//                            Situacao(media);
                           
//                            if (media < 4) {
//                                situacao = "Reprovado";
//                            } else if( media >= 7) {
//                                situacao = "Aprovado";                        
//                            } else {
//                                situacao = "Prova final";
//                            }
                            Imprimir(id);
//                            System.out.println("Aluno: " + alunos[id] );
//                            System.out.println("AV01: "  + av01[id] );                    
//                            System.out.println("AV02: "  + av02[id] );
//                            System.out.println("Media: " + media );
//                            System.out.println("Aluno: " + situacao );

//                        }
                    } else {
                        System.out.println("ID inválido!");
                    }

                } else if(opcao == 3) {
//                    for (int cont = 0; cont < i; cont++) {
                        imprimir();
//                        System.out.println("Aluno: " + alunos[cont] );
//                        System.out.println("AV01: "  + av01[cont] );                    
//                        System.out.println("AV02: "  + av02[cont] ); 
                        
//                    }
                }                
            }
                       
        } while (opcao != 4);
            System.out.println("Sistema finalizado com sucesso!");
            entrada.close();      
    }
}
