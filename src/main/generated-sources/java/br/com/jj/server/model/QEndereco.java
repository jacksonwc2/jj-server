package br.com.jj.server.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QEndereco is a Querydsl query type for Endereco
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QEndereco extends EntityPathBase<Endereco> {

    private static final long serialVersionUID = 1181641346L;

    public static final QEndereco endereco = new QEndereco("endereco");

    public final NumberPath<Long> codigoCidade = createNumber("codigoCidade", Long.class);

    public final StringPath descricao = createString("descricao");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QEndereco(String variable) {
        super(Endereco.class, forVariable(variable));
    }

    public QEndereco(Path<? extends Endereco> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEndereco(PathMetadata<?> metadata) {
        super(Endereco.class, metadata);
    }

}

