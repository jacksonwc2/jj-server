package br.com.jj.server.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QContato is a Querydsl query type for Contato
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QContato extends EntityPathBase<Contato> {

    private static final long serialVersionUID = 241068113L;

    public static final QContato contato = new QContato("contato");

    public final NumberPath<Long> codigoCliente = createNumber("codigoCliente", Long.class);

    public final NumberPath<Long> codigoTipoContato = createNumber("codigoTipoContato", Long.class);

    public final StringPath descricao = createString("descricao");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QContato(String variable) {
        super(Contato.class, forVariable(variable));
    }

    public QContato(Path<? extends Contato> path) {
        super(path.getType(), path.getMetadata());
    }

    public QContato(PathMetadata<?> metadata) {
        super(Contato.class, metadata);
    }

}

