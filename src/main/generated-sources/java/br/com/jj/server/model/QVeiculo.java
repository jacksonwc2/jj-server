package br.com.jj.server.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QVeiculo is a Querydsl query type for Veiculo
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QVeiculo extends EntityPathBase<Veiculo> {

    private static final long serialVersionUID = -367627722L;

    public static final QVeiculo veiculo = new QVeiculo("veiculo");

    public final StringPath codigoCliente = createString("codigoCliente");

    public final StringPath codigoMarca = createString("codigoMarca");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.util.Date> motorista = createDateTime("motorista", java.util.Date.class);

    public final StringPath placa = createString("placa");

    public QVeiculo(String variable) {
        super(Veiculo.class, forVariable(variable));
    }

    public QVeiculo(Path<? extends Veiculo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QVeiculo(PathMetadata<?> metadata) {
        super(Veiculo.class, metadata);
    }

}

