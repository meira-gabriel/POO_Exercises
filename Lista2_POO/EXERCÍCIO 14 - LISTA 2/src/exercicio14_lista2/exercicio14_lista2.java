package exercicio14_lista2;

public class exercicio14_lista2 {

	    
	    public static void preencheVetorAleatorio(int[] vetor){
	        for(int i = 0; i < 50; i++){
	            vetor[i] = (int) (1000 * Math.random());
	        }
	    }


	    public static void insertionSort(int[] vetor){
	        for (int i = 1; i < vetor.length; i++){
				int elementoAtual = vetor[i];
				int j = i;
				
				while (j > 0 && vetor[j-1] > elementoAtual){
					vetor[j] = vetor[j-1];
					j -= 1;
				}
				vetor[j] = elementoAtual;
			}
	    }


	    public static void combinaVetorOrdenado(int[] vet1, int[] vet2, int[] vet3){
	        int i = 0, j = 0, z;
	        
	        for(z = 0; z < vet3.length; z++){
	            if(vet1[i] <= vet2[j]){
	                vet3[z] = vet1[i];
	                i++;


	                if(i == vet1.length) i--;
	            }
	            else{
	                vet3[z] = vet2[j];
	                j++;


	                if(j == vet2.length) j--;
	            }
	        }
	    
	    }

	    public static void imprimirVetor(int[] vetor){
	        for(int i = 0; i < vetor.length; i++){
	            System.out.print(vetor[i] + " ");
	        }
	        System.out.println("");
	    }

	    public static void main(String[] args){    
	        int[] vetor1 = new int[50];
	        int[] vetor2 = new int[50];
	        int[] vetorOrdenado = new int[100];


	        preencheVetorAleatorio(vetor1);
	        System.out.println("Vetor 1 antes de ser ordenado: ");
	        imprimirVetor(vetor1);
	        insertionSort(vetor1);
	        System.out.println("Vetor 1 após ser ordenado: ");
	        imprimirVetor(vetor1);

	        System.out.println("");
	        

	        preencheVetorAleatorio(vetor2);
	        System.out.println("Vetor 2 antes de ser ordenado: ");
	        imprimirVetor(vetor2);
	        insertionSort(vetor2);
	        System.out.println("Vetor 2 após ser ordenado: ");
	        imprimirVetor(vetor2);

	        System.out.println("");

	        combinaVetorOrdenado(vetor1, vetor2, vetorOrdenado);
	        System.out.println("Combinação do vetor 1 e vetor 2 ordenado: ");
	        imprimirVetor(vetorOrdenado);

	        
	    }
}
	
