package br.com.desafio.dominio;
import java.time.LocalDate;

public class Mentoria extends Conteudo{
private LocalDate data;



public double calculaxp(){
	return XP_PADRAO + 200;
}
public LocalDate getData()
{
    return data;
}

public void setData(LocalDate data)
{
    this.data = data;
}

public String toString(){return " Mentoria{Titulo: "+getTitulo()+ " Descrição "+getDescricao()+" Data " +data+ "}";

}
}
