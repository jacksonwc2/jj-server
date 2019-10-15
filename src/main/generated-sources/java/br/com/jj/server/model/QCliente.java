package br.com.jj.server.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QCliente is a Querydsl query type for Cliente
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCliente extends EntityPathBase<Cliente> {

    private static final long serialVersionUID = 150128673L;

    public static final QCliente cliente = new QCliente("cliente");

    public final NumberPath<Long> codigoEndereco = createNumber("codigoEndereco", Long.class);

    public final NumberPath<Long> codigoTipoSexo = createNumber("codigoTipoSexo", Long.class);

    public final DateTimePath<java.util.Date> dataNascimento = createDateTime("dataNascimento", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath nome = createString("nome");

    public QCliente(String variable) {
        super(Cliente.class, forVariable(variable));
    }

    public QCliente(Path<? extends Cliente> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCliente(PathMetadata<?> metadata) {
        super(Cliente.class, metadata);
    }

}

