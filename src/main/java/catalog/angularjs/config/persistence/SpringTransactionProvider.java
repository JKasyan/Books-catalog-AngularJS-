package catalog.angularjs.config.persistence;


import org.jooq.TransactionContext;
import org.jooq.TransactionProvider;
import org.jooq.exception.DataAccessException;
import org.jooq.tools.JooqLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import static org.springframework.transaction.TransactionDefinition.PROPAGATION_NESTED;

public class SpringTransactionProvider implements TransactionProvider{

    private static final JooqLogger log = JooqLogger.getLogger(SpringTransactionProvider.class);

    @Autowired
    private DataSourceTransactionManager txMgr;

    @Override
    public void begin(TransactionContext ctx) throws DataAccessException {
        log.info("Begin transaction");
        TransactionStatus tx = txMgr.getTransaction(new DefaultTransactionDefinition(PROPAGATION_NESTED));
        ctx.transaction(new SpringTransaction(tx));
    }

    @Override
    public void commit(TransactionContext ctx) throws DataAccessException {
        log.info("commit transaction");
        txMgr.commit(((SpringTransaction) ctx.transaction()).tx);
    }

    @Override
    public void rollback(TransactionContext ctx) throws DataAccessException {
        log.info("rollback transaction");
        txMgr.rollback(((SpringTransaction) ctx.transaction()).tx);
    }
}
