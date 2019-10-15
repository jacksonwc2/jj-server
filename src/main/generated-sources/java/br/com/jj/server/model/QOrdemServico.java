package br.com.jj.server.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QOrdemServico is a Querydsl query type for OrdemServico
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QOrdemServico extends EntityPathBase<OrdemServico> {

    private static final long serialVersionUID = 554287471L;

    public static final QOrdemServico ordemServico = new QOrdemServico("ordemServico");

    public final NumberPath<Long> codigoVeiculo = createNumber("codigoVeiculo", Long.class);

    public final NumberPath<Long> descricao = createNumber("descricao", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> quantidade = createNumber("quantidade", Long.class);

    public final NumberPath<java.math.BigDecimal> valorUnitario = createNumber("valorUnitario", java.math.BigDecimal.class);

    public QOrdemServico(String variable) {
        super(OrdemServico.class, forVariable(variable));
    }

    public QOrdemServico(Path<? extends OrdemServico> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOrdemServico(PathMetadata<?> metadata) {
        super(OrdemServico.class, metadata);
    }

}

