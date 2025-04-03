package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqhi implements fbba {
    public static dtux a() {
        return new dtuf(bqhg.c, "cms_backup_dependency_cache_table", new dtue() { // from class: bqha
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bqhg.a;
                valueOf.getClass();
                if (i == 59580) {
                    bqhg.b(dtveVar, 59580);
                } else {
                    if (i != 59620) {
                        return;
                    }
                    dtveVar.y("DROP INDEX IF EXISTS index_cms_backup_dependency_cache_table_dependent_id");
                    dtveVar.y("CREATE INDEX index_cms_backup_dependency_cache_table_dependent_id ON cms_backup_dependency_cache_table(dependent_id);");
                    dtveVar.y("DROP INDEX IF EXISTS index_cms_backup_dependency_cache_table_inserted_at_timestamp");
                    dtveVar.y("CREATE INDEX index_cms_backup_dependency_cache_table_inserted_at_timestamp ON cms_backup_dependency_cache_table(inserted_at_timestamp);");
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
