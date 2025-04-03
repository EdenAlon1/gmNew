package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqkz implements fbba {
    public static dtux a() {
        return new dtuf(bqkv.d, "cms_dead_letter_queue", new dtue() { // from class: bqkk
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bqkv.a;
                valueOf.getClass();
                switch (i) {
                    case 51040:
                        bqkv.d(dtveVar, 51040);
                        break;
                    case 57090:
                        dtveVar.y("ALTER TABLE cms_dead_letter_queue ADD COLUMN bugle_table_type INTEGER DEFAULT(-1);");
                        dtveVar.y("ALTER TABLE cms_dead_letter_queue ADD COLUMN bugle_id INTEGER DEFAULT('-1');");
                        dtveVar.y("ALTER TABLE cms_dead_letter_queue ADD COLUMN cms_backup_parameters BLOB;");
                        dtveVar.y("ALTER TABLE cms_dead_letter_queue ADD COLUMN backup_flags INTEGER;");
                        dtveVar.y("ALTER TABLE cms_dead_letter_queue ADD COLUMN backup_dependency_table_type INTEGER DEFAULT(-1);");
                        dtveVar.y("ALTER TABLE cms_dead_letter_queue ADD COLUMN backup_dependency_bugle_id INTEGER DEFAULT('-1');");
                        break;
                    case 58050:
                        dtveVar.y("DROP INDEX IF EXISTS index_cms_dead_letter_queue_cms_id");
                        dtveVar.y("CREATE INDEX index_cms_dead_letter_queue_cms_id ON cms_dead_letter_queue(cms_id);");
                        dtveVar.y("DROP INDEX IF EXISTS index_cms_dead_letter_queue_bugle_id");
                        dtveVar.y("CREATE INDEX index_cms_dead_letter_queue_bugle_id ON cms_dead_letter_queue(bugle_id);");
                        break;
                    case 58300:
                        dtveVar.y("DROP INDEX IF EXISTS index_cms_dead_letter_queue_abandoned_action");
                        dtveVar.y("CREATE INDEX index_cms_dead_letter_queue_abandoned_action ON cms_dead_letter_queue(abandoned_action);");
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
