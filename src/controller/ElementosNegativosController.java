package controller;

public class ElementosNegativosController {

	public ElementosNegativosController() {
		super();
	}
	
	public int elementosNegativos(int[] vet, int posicoes) {
		// Condição de parada: Quando tamanho for menor ou igual a 0, todo vetor já terá sido percorrido, o atual valor de negativos é o valor de negativos do vetor
		if (posicoes <= 0) {
			return 0;
		}
		// Função para o termo n em função do termo anterior: elementosNegativos(vet, (posicoes - 1)) => elementosNegativos(vet, (posicoes - 2)) => elementosNegativos(vet, (posicoes - 3)) => ... => elementosNegativos(vet, 0)
		return (vet[posicoes - 1] < 0 ? 1 : 0) + elementosNegativos(vet, (posicoes - 1));
	}

}
