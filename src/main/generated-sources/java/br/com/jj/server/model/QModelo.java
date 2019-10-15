package br.com.jj.server.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QModelo is a Querydsl query type for Modelo
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QModelo extends EntityPathBase<Modelo> {

    private static final long serialVersionUID = -953170081L;

    public static final QModelo modelo = new QModelo("modelo");

    public final NumberPath<Long> codigoMarca = createNumber("codigoMarca", Long.class);

    public final NumberPath<Long> codigoTipoVeiculo = createNumber("codigoTipoVeiculo", Long.class);

    public final StringPath descricao = createString("descricao");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QModelo(String variable) {
        super(Modelo.class, forVariable(variable));
    }

    public QModelo(Path<? extends Modelo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QModelo(PathMetadata<?> metadata) {
        super(Modelo.class, metadata);
    }

}

