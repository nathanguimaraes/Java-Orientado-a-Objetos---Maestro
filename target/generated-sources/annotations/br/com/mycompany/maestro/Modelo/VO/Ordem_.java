package br.com.mycompany.maestro.Modelo.VO;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Ordem.class)
public abstract class Ordem_ {

	public static volatile SingularAttribute<Ordem, Long> codigo;
	public static volatile ListAttribute<Ordem, Acao> acao;
	public static volatile SingularAttribute<Ordem, String> descricao;

}

