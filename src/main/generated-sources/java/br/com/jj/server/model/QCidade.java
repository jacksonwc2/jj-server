package br.com.jj.server.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QCidade is a Querydsl query type for Cidade
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCidade extends EntityPathBase<Cidade> {

    private static final long serialVersionUID = -1245006819L;

    public static final QCidade cidade = new QCidade("cidade");

    public final NumberPath<Long> codigoEstado = createNumber("codigoEstado", Long.class);

    public final StringPath descricao = createString("descricao");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QCidade(String variable) {
        super(Cidade.class, forVariable(variable));
    }

    public QCidade(Path<? extends Cidade> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCidade(PathMetadata<?> metadata) {
        super(Cidade.class, metadata);
    }

}

