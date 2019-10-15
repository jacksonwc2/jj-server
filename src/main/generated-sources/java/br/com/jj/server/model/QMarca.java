package br.com.jj.server.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QMarca is a Querydsl query type for Marca
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMarca extends EntityPathBase<Marca> {

    private static final long serialVersionUID = 1631416867L;

    public static final QMarca marca = new QMarca("marca");

    public final StringPath descricao = createString("descricao");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QMarca(String variable) {
        super(Marca.class, forVariable(variable));
    }

    public QMarca(Path<? extends Marca> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMarca(PathMetadata<?> metadata) {
        super(Marca.class, metadata);
    }

}

