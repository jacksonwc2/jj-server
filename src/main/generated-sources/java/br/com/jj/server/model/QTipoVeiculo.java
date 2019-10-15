package br.com.jj.server.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QTipoVeiculo is a Querydsl query type for TipoVeiculo
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QTipoVeiculo extends EntityPathBase<TipoVeiculo> {

    private static final long serialVersionUID = 1482098914L;

    public static final QTipoVeiculo tipoVeiculo = new QTipoVeiculo("tipoVeiculo");

    public final StringPath descricao = createString("descricao");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QTipoVeiculo(String variable) {
        super(TipoVeiculo.class, forVariable(variable));
    }

    public QTipoVeiculo(Path<? extends TipoVeiculo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTipoVeiculo(PathMetadata<?> metadata) {
        super(TipoVeiculo.class, metadata);
    }

}

