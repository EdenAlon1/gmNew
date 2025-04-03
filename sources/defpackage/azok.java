package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azok implements fbba {
    public static dtux a() {
        return new dtuf(azoi.d, "my_identities", new dtue() { // from class: aznz
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = azoi.a;
                valueOf.getClass();
                switch (i) {
                    case 59450:
                        azoi.d(dtveVar, 59450);
                        break;
                    case 59980:
                        dtveVar.y("ALTER TABLE my_identities ADD COLUMN address_type INT;");
                        break;
                    case 59990:
                        dtveVar.y("ALTER TABLE my_identities ADD COLUMN provisioning_id TEXT;");
                        break;
                    case 60120:
                        dtveVar.y("ALTER TABLE my_identities ADD COLUMN display_name TEXT;");
                        break;
                    case 60320:
                        dtveVar.y("ALTER TABLE my_identities ADD COLUMN is_verified INT DEFAULT(0) NOT NULL;");
                        break;
                    case 60530:
                        dtveVar.y("ALTER TABLE my_identities ADD COLUMN canonical_token TEXT REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE;");
                        dtveVar.y("CREATE INDEX index_my_identities_canonical_token ON my_identities(canonical_token);");
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
