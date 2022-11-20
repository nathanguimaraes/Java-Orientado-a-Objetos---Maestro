package br.com.mycompany.maestro.Modelo.VO;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ServicoPrestado.class)
public abstract class ServicoPrestado_ {

	public static volatile SingularAttribute<ServicoPrestado, Long> codigo;
	public static volatile ListAttribute<ServicoPrestado, Acao> acao;
	public static volatile SingularAttribute<ServicoPrestado, String> descricao;

}

