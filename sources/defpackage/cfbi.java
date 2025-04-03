package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfbi implements fbba {
    public static dtux a() {
        return new dtuf(cfbf.d, "work_queue", new dtue() { // from class: cfav
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = cfbf.a;
                valueOf.getClass();
                switch (i) {
                    case 39060:
                        cfbf.d(dtveVar, 39060);
                        break;
                    case 41030:
                        dtveVar.y("ALTER TABLE work_queue ADD COLUMN queue TEXT;");
                        dtveVar.y("CREATE INDEX index_work_queue_queue ON work_queue(queue);");
                        break;
                    case 42050:
                        dtveVar.y("ALTER TABLE work_queue ADD COLUMN deduplication_tag TEXT;");
                        dtveVar.y("CREATE INDEX index_work_queue_deduplication_tag ON work_queue(deduplication_tag);");
                        break;
                    case 45030:
                        dtveVar.y("ALTER TABLE work_queue ADD COLUMN scheduled_in_workmanager INT;");
                        break;
                    case 46060:
                        dtveVar.y("ALTER TABLE work_queue ADD COLUMN workmanager_id TEXT;");
                        break;
                    case 46070:
                        dtveVar.y("ALTER TABLE work_queue ADD COLUMN minimum_start_time INT;");
                        break;
                    case 48020:
                        dtveVar.y("ALTER TABLE work_queue ADD COLUMN cancellation_tag TEXT;");
                        break;
                    case 58270:
                        dtveVar.y("DROP INDEX IF EXISTS index_work_queue_type");
                        dtveVar.y("CREATE INDEX index_work_queue_type ON work_queue(type);");
                        dtveVar.y("DROP INDEX IF EXISTS index_work_queue_scheduled_in_workmanager");
                        dtveVar.y("CREATE INDEX index_work_queue_scheduled_in_workmanager ON work_queue(scheduled_in_workmanager);");
                        dtveVar.y("DROP INDEX IF EXISTS queue_time");
                        dtveVar.y("CREATE INDEX queue_time ON work_queue(queue, minimum_start_time);");
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
