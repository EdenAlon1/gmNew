package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwqi implements fbba {
    public static dtux a() {
        return new dtuf(bwqg.c, "rbm_business_info_properties", new dtue() { // from class: bwqa
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bwqg.a;
                valueOf.getClass();
                if (i == 51020) {
                    dtveVar.y("ALTER TABLE rbm_business_info_properties ADD COLUMN rbm_bot_id TEXT REFERENCES rbm_business_info(rbm_bot_id) ON DELETE CASCADE ON UPDATE CASCADE;");
                    bwqg.d(dtveVar, 51020);
                } else if (i == 58410) {
                    dtveVar.y("DROP INDEX IF EXISTS index_rbm_business_info_properties_rbm_bot_id");
                    dtveVar.y("CREATE INDEX index_rbm_business_info_properties_rbm_bot_id ON rbm_business_info_properties(rbm_bot_id);");
                } else {
                    if (i != 59830) {
                        return;
                    }
                    dtveVar.y("DROP INDEX IF EXISTS index_rbm_business_info_properties_rbm_short_codes");
                    dtveVar.y("CREATE INDEX index_rbm_business_info_properties_rbm_short_codes ON rbm_business_info_properties(type, property_value) WHERE type = 10;");
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
