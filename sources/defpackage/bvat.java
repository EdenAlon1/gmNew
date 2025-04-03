package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvat implements fbba {
    public static dtux a() {
        return new dtuf(bvar.d, "smarts_personalization_decayed_feature_values", new dtue() { // from class: bvaj
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bvar.a;
                valueOf.getClass();
                if (i == 54010) {
                    bvar.b(dtveVar, 54010);
                    return;
                }
                if (i == 58490) {
                    dtveVar.y("DROP INDEX IF EXISTS index_smarts_personalization_decayed_feature_values_date");
                    dtveVar.y("CREATE INDEX index_smarts_personalization_decayed_feature_values_date ON smarts_personalization_decayed_feature_values(date);");
                } else {
                    if (i != 58950) {
                        return;
                    }
                    dtveVar.y("DROP INDEX IF EXISTS index_smarts_personalization_decayed_feature_values_feature_id");
                    dtveVar.y("CREATE INDEX index_smarts_personalization_decayed_feature_values_feature_id ON smarts_personalization_decayed_feature_values(feature_id);");
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
