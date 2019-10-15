package br.com.jj.server.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QNfeItem is a Querydsl query type for NfeItem
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QNfeItem extends EntityPathBase<NfeItem> {

    private static final long serialVersionUID = 1146436743L;

    public static final QNfeItem nfeItem = new QNfeItem("nfeItem");

    public final NumberPath<Long> codigoNfe = createNumber("codigoNfe", Long.class);

    public final StringPath descricao = createString("descricao");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath quantidade = createString("quantidade");

    public final NumberPath<java.math.BigDecimal> valorUnitario = createNumber("valorUnitario", java.math.BigDecimal.class);

    public QNfeItem(String variable) {
        super(NfeItem.class, forVariable(variable));
    }

    public QNfeItem(Path<? extends NfeItem> path) {
        super(path.getType(), path.getMetadata());
    }

    public QNfeItem(PathMetadata<?> metadata) {
        super(NfeItem.class, metadata);
    }

}

