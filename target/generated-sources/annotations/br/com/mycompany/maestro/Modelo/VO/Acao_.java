package br.com.mycompany.maestro.Modelo.VO;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Acao.class)
public abstract class Acao_ {

	public static volatile SingularAttribute<Acao, Long> codigo;
	public static volatile SingularAttribute<Acao, ServicoPrestado> servicoPrestado;
	public static volatile SingularAttribute<Acao, Ordem> ordem;
	public static volatile ListAttribute<Acao, Processo> processos;
	public static volatile SingularAttribute<Acao, String> descricao;

}

