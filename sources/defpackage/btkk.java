package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btkk implements fbba {
    public static dtux a() {
        return new dtuf(btki.d, "generic_worker_queue", new dtue() { // from class: btjy
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = btki.a;
                valueOf.getClass();
                switch (i) {
                    case 24000:
                        btki.d(dtveVar, 24000);
                        break;
                    case 32000:
                        dtveVar.y("ALTER TABLE generic_worker_queue ADD COLUMN flags INTEGER DEFAULT(0);");
                        break;
                    case 34000:
                        dtveVar.y("ALTER TABLE generic_worker_queue ADD COLUMN next_execute_timestamp INTEGER DEFAULT(0);");
                        break;
                    case 39020:
                        dtveVar.y("ALTER TABLE generic_worker_queue ADD COLUMN account_id INTEGER DEFAULT(-1);");
                        break;
                    case 58340:
                        dtveVar.y("DROP INDEX IF EXISTS index_generic_worker_queue_next_execute_timestamp");
                        dtveVar.y("CREATE INDEX index_generic_worker_queue_next_execute_timestamp ON generic_worker_queue(next_execute_timestamp);");
                        dtveVar.y("DROP INDEX IF EXISTS index_multi_column_index");
                        dtveVar.y("CREATE INDEX index_multi_column_index ON generic_worker_queue(in_flight, retry_count, item_id, item_table_type, next_execute_timestamp);");
                        break;
                    case 59700:
                        dtveVar.y("ALTER TABLE generic_worker_queue ADD COLUMN trigger_name TEXT;");
                        break;
                    case 59970:
                        dtveVar.y("ALTER TABLE generic_worker_queue ADD COLUMN enqueued_timestamp INTEGER DEFAULT(0);");
                        break;
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
