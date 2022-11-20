package br.com.mycompany.maestro.Modelo.VO;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Processo.class)
public abstract class Processo_ {

	public static volatile SingularAttribute<Processo, Estagiario> estagiario;
	public static volatile SingularAttribute<Processo, Cliente> cliente;
	public static volatile SingularAttribute<Processo, Long> codigo;
	public static volatile SingularAttribute<Processo, Double> valort;
	public static volatile SingularAttribute<Processo, String> causa;
	public static volatile SingularAttribute<Processo, EstadoProcesso> estadoProcesso;
	public static volatile SingularAttribute<Processo, String> servicosExtras;
	public static volatile SingularAttribute<Processo, LocalDate> dtsaida;
	public static volatile SingularAttribute<Processo, LocalDate> dtent;
	public static volatile SingularAttribute<Processo, String> servico;
	public static volatile SingularAttribute<Processo, Acao> acao;
	public static volatile SingularAttribute<Processo, String> indiciado;

}

