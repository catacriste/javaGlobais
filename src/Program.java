import java.awt.RenderingHints.Key;

import org.omg.CORBA.portable.ValueBase;
//Em java as classes nao podem ser static apenas os membros exceto estiverem de outras classes
/* Contudo os membros os membros podem ser static.Se a classe não tiver um construtor por defeito privado
 * Podemos criar objectos. Neste Caso Todos os membros static são partilhados
 * pelos objetos ou seja se um atributo inteiro tiver o valor 10 todos os objetos dessa classe
 * acedem ao mesmo valor se a classe tiver um varios objetos.
 */

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Globais.Lista.put(1, "Domingo");
         Globais.Lista.put(2, "Segunda");
         Globais.Lista.put(3, "Terça");
         Globais.Lista.put(4, "Quarta");
         Globais.Lista.put(5, "Quinta");
         Globais.Lista.put(6, "Sexta");
         Globais.Lista.put(7, "Sabado");
         
         for(String s : Globais.Lista.values())
         {
        	 System.out.println(s);
         }
	}

}
