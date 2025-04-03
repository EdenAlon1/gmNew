package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqec implements fbba {
    public static dtux a() {
        return new dtuf(bqea.d, "backup_id_map", new dtue() { // from class: bqds
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bqea.a;
                valueOf.getClass();
                if (i == 60020) {
                    bqea.b(dtveVar, 60020);
                } else {
                    if (i != 60040) {
                        return;
                    }
                    dtveVar.y("DROP INDEX IF EXISTS index_backup_id_map_bugle_id");
                    dtveVar.y("CREATE INDEX index_backup_id_map_bugle_id ON backup_id_map(bugle_id);");
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
