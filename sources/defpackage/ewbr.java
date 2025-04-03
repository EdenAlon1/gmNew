package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewbr {
    public static final eaee a = new eaed("FedSqlQueryHandler");
    public final Executor b;

    public ewbr(Executor executor) {
        this.b = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(ewdz ewdzVar) {
        emxf.b(ewdzVar.b.size() == 1, "client_query.database_schema.table must contain exactly one table.");
        eweg ewegVar = (eweg) ewdzVar.b.get(0);
        emxf.b(!ewegVar.b.isEmpty(), "client_query_database_schema_table[0].name must be set.");
        emxf.b(!ewegVar.e.isEmpty(), "client_query.database_schema.table[0].create_table_sql must be set");
    }
}
