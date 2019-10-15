package br.com.jj.server.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QNfe is a Querydsl query type for Nfe
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QNfe extends EntityPathBase<Nfe> {

    private static final long serialVersionUID = 645273428L;

    public static final QNfe nfe = new QNfe("nfe");

    public final NumberPath<Long> codigoVeiculo = createNumber("codigoVeiculo", Long.class);

    public final DateTimePath<java.util.Date> emissao = createDateTime("emissao", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> nota = createNumber("nota", Long.class);

    public final StringPath verificacao = createString("verificacao");

    public QNfe(String variable) {
        super(Nfe.class, forVariable(variable));
    }

    public QNfe(Path<? extends Nfe> path) {
        super(path.getType(), path.getMetadata());
    }

    public QNfe(PathMetadata<?> metadata) {
        super(Nfe.class, metadata);
    }

}

