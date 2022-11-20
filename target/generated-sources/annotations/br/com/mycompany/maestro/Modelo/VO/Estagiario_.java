package br.com.mycompany.maestro.Modelo.VO;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Estagiario.class)
public abstract class Estagiario_ extends br.com.mycompany.maestro.Modelo.VO.Pessoa_ {

	public static volatile SingularAttribute<Estagiario, Double> salario;
	public static volatile ListAttribute<Estagiario, Processo> processos;

}

