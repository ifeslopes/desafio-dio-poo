package br.com.desafio.dominio;


public class Curso extends Conteudo{
private Integer cargaHoraria;




public double calculaxp(){
return XP_PADRAO * cargaHoraria;
}



public Integer getCargaHoraria()
{
    return cargaHoraria;
}

public void setCargaHoraria(Integer cargaHoraria)
{
    this.cargaHoraria = cargaHoraria;
}

public String toString(){

return " Curso{Titulo: "+getTitulo()+ " Descrição "+getDescricao()+" Carga Horaria " +cargaHoraria+ "}";
}
}
