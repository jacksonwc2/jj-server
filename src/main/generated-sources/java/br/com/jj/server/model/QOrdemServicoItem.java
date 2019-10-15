package br.com.jj.server.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QOrdemServicoItem is a Querydsl query type for OrdemServicoItem
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QOrdemServicoItem extends EntityPathBase<OrdemServicoItem> {

    private static final long serialVersionUID = 444621090L;

    public static final QOrdemServicoItem ordemServicoItem = new QOrdemServicoItem("ordemServicoItem");

    public final DateTimePath<java.util.Date> cadastro = createDateTime("cadastro", java.util.Date.class);

    public final NumberPath<Long> codigo = createNumber("codigo", Long.class);

    public final NumberPath<Long> codigoVeiculo = createNumber("codigoVeiculo", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QOrdemServicoItem(String variable) {
        super(OrdemServicoItem.class, forVariable(variable));
    }

    public QOrdemServicoItem(Path<? extends OrdemServicoItem> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOrdemServicoItem(PathMetadata<?> metadata) {
        super(OrdemServicoItem.class, metadata);
    }

}

