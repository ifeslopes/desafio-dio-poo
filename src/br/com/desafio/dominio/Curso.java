package br.com.desafio.dominio;


public class Curso{
private String titilo;
private String descricao;
private Integer cargaHoraria;




public String getTitilo()
{
    return titilo;
}

public void setTitilo(String titilo)
{
    this.titilo = titilo;

}


public String getDescricao()
{
    return descricao;
}

public void setDescricao(String descricao)
{
    this.descricao = descricao;
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

return " Curso{Titulo: "+titilo+ " Descrição "+descricao+" Carga Horaria " +cargaHoraria+ "}";
}
}
