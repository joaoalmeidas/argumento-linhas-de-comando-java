
public class InitArray {

	public static void main(String[] args) {
		
		int tamanho;
		
		if(args.length == 0){
			tamanho = 10;
		}else{
			tamanho = Integer.parseInt(args[0]);
		}
		
		int[] array = new int[tamanho];
		
		System.out.printf("%s%8s%n", "Indice", "Valor");
		
		for(int c = 0; c < array.length;c++){
			System.out.printf("%5d%8d%n", c, array[c]);
		}
	}

}
