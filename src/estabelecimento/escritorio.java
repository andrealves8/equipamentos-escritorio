package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.copiadora.Xerox;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scanner;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laserjet;
import equipamentos.multifuncional.Multifuncional;

public class escritorio {

	public static void main(String[] args) {
		
		Multifuncional mult = new Multifuncional();
		Deskjet desk = new Deskjet();
		Laserjet laser = new Laserjet();
		Scanner sc = new Scanner();
		Xerox xr = new Xerox();
		
		Impressora imp = mult;
		Copiadora cop = mult;
		Digitalizadora dig = mult;
		
		imp.imprimir();
		cop.copiar();
		dig.digitalizar();
		
		
		
		

	}

}
