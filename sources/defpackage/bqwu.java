package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqwu implements fbba {
    public static dtux a() {
        return new dtuf(bqws.d, "cms", new dtue() { // from class: bqwi
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bqws.a;
                valueOf.getClass();
                if (i == 32030) {
                    bqws.d(dtveVar, 32030);
                    return;
                }
                if (i == 35020) {
                    dtveVar.y("ALTER TABLE cms ADD COLUMN cms_id TEXT;");
                    dtveVar.y("CREATE UNIQUE INDEX index_cms_cms_id ON cms(cms_id);");
                } else {
                    if (i != 42060) {
                        return;
                    }
                    dtveVar.y("ALTER TABLE cms ADD COLUMN cms_correlation_id TEXT;");
                    dtveVar.y("CREATE UNIQUE INDEX index_cms_cms_correlation_id ON cms(cms_correlation_id);");
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
