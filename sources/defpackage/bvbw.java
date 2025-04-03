package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvbw implements fbba {
    public static dtux a() {
        return new dtuf(bvbu.c, "smarts_personalization_features", new dtue() { // from class: bvbo
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bvbu.a;
                valueOf.getClass();
                if (i == 54000) {
                    bvbu.e(dtveVar, 54000);
                } else {
                    if (i != 54060) {
                        return;
                    }
                    dtveVar.y("ALTER TABLE smarts_personalization_features ADD COLUMN feature TEXT;");
                    dtveVar.y("CREATE UNIQUE INDEX index_smarts_personalization_features_feature ON smarts_personalization_features(feature);");
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
