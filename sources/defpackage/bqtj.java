package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqtj implements fbba {
    public static dtux a() {
        return new dtuf(bqth.c, "cms_restore_dependency_cache_table", new dtue() { // from class: bqtb
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bqth.a;
                valueOf.getClass();
                if (i == 59650) {
                    bqth.d(dtveVar, 59650);
                } else {
                    if (i != 59660) {
                        return;
                    }
                    dtveVar.y("ALTER TABLE cms_restore_dependency_cache_table ADD COLUMN cms_data_provider_type INT DEFAULT(0) NOT NULL;");
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
