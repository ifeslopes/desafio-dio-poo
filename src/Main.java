import java.time.LocalDate;

import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Mentoria;

public class Main{

public static void main(String[] args){

Curso curso = new Curso();
curso.setTitilo("Curso Java");
curso.setDescricao("Descricão curso Java");
curso.setCargaHoraria(8);



Curso curso2 = new Curso();
   curso2.setTitilo("Curso JavaScript");
   curso2.setDescricao("Descricão curso JavaScript");
  curso2.setCargaHoraria(4);

Mentoria mentoria = new Mentoria();

mentoria.setTitulo("Curso Java");
mentoria.setDescricao("Descricao Curso java");
mentoria.setData(LocalDate.now());

System.out.println(curso);
System.out.println(curso2);
System.out.println(mentoria);

}
}

