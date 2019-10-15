package br.com.jj.server.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QDocumento is a Querydsl query type for Documento
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QDocumento extends EntityPathBase<Documento> {

    private static final long serialVersionUID = 1092396827L;

    public static final QDocumento documento1 = new QDocumento("documento1");

    public final NumberPath<Long> codigoCliente = createNumber("codigoCliente", Long.class);

    public final NumberPath<Long> codigoTipoDocumento = createNumber("codigoTipoDocumento", Long.class);

    public final StringPath documento = createString("documento");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QDocumento(String variable) {
        super(Documento.class, forVariable(variable));
    }

    public QDocumento(Path<? extends Documento> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDocumento(PathMetadata<?> metadata) {
        super(Documento.class, metadata);
    }

}

