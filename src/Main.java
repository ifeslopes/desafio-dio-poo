import java.time.LocalDate;

import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

public class Main{

public static void main(String[] args){

Curso curso = new Curso();
curso.setTitulo("Curso Java");
curso.setDescricao("Descricão curso Java");
curso.setCargaHoraria(8);



Curso curso2 = new Curso();
   curso2.setTitulo("Curso JavaScript");
   curso2.setDescricao("Descricão curso JavaScript");
  curso2.setCargaHoraria(4);

Mentoria mentoria = new Mentoria();

mentoria.setTitulo("Curso Java");
mentoria.setDescricao("Descricao Curso java");
mentoria.setData(LocalDate.now());

//System.out.println(curso);
//System.out.println(curso2);
//System.out.println(mentoria);
Bootcamp bootcamp = new Bootcamp();
bootcamp.setNome("Bootcamp Java Developer");
bootcamp.setDescricao("Descrição Bootcamp java developer");
bootcamp.getConteudos().add(curso);
bootcamp.getConteudos().add(curso2);
bootcamp.getConteudos().add(mentoria);

Dev dev = new Dev();
dev.setNome("Leonardo");
dev.inscreverBootcamp(bootcamp);
System.out.println("Conteudos Inscritos Leonardo: "+
dev.getConteudosInscritos());
dev.progredir();
System.out.println("*");


System.out.println("Conteudos Concluidos Leonardo: "+dev.getConteudosConcluidos());
System.out.println("Conteudos Inscritos Leonardo: "+ dev.getConteudosInscritos());
System.out.println("XP "+dev.calculaxp());


System.out.println("----####----");
Dev dev2 = new Dev();
dev2.setNome("Csmila");
dev2.inscreverBootcamp(bootcamp);

System.out.println("Conteudos Inscritos Camila: "+dev2.getConteudosInscritos());

dev2.progredir();

System.out.println("*");                             
 
System.out.println("Conteudos Concluidos Camila: "+dev2.getConteudosConcluidos());
System.out.println("Conteudos Inscritos Camila: "+dev2.getConteudosInscritos());

System.out.println("XP "+dev.calculaxp());
}
}

