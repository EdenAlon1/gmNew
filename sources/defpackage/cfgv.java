package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfgv implements fbba {
    public static dtux a() {
        return new dtuf(cfft.d, "work_queue_work_manager_ids", new dtue() { // from class: cffl
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = cfft.a;
                valueOf.getClass();
                if (i == 59330) {
                    cfft.b(dtveVar, 59330);
                } else {
                    if (i != 59400) {
                        return;
                    }
                    dtveVar.y("DROP INDEX IF EXISTS index_work_queue_work_manager_ids_workmanager_id");
                    dtveVar.y("CREATE INDEX index_work_queue_work_manager_ids_workmanager_id ON work_queue_work_manager_ids(workmanager_id) WHERE workmanager_id IS NULL;");
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
