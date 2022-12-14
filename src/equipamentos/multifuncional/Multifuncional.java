package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class Multifuncional implements Impressora, Copiadora, Digitalizadora{

	@Override
	public void digitalizar() {
		System.out.println("Multifuncional Digitalizando...");
	}

	@Override
	public void copiar() {
		System.out.println("Multifuncional Copiando...");
	}

	@Override
	public void imprimir() {
		System.out.println("Multifuncional Imprimindo...");
	}

}
