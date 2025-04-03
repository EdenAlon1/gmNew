package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxep implements fbba {
    public static dtux a() {
        return new dtuf(bxen.c, "remote_instances", new dtue() { // from class: bxeh
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bxen.a;
                valueOf.getClass();
                switch (i) {
                    case 34010:
                        bxen.d(dtveVar, 34010);
                        break;
                    case 35040:
                        dtveVar.y("ALTER TABLE remote_instances ADD COLUMN last_modified_timestamp INTEGER DEFAULT(0);");
                        break;
                    case 38010:
                        dtveVar.y("ALTER TABLE remote_instances ADD COLUMN identity_key BLOB;");
                        break;
                    case 39040:
                        dtveVar.y("ALTER TABLE remote_instances ADD COLUMN updated_at_hash INTEGER DEFAULT(0);");
                        break;
                    case 40010:
                        dtveVar.y("ALTER TABLE remote_instances ADD COLUMN guaranteed_fresh_as_of_timestamp INTEGER DEFAULT(0);");
                        break;
                    case 40030:
                        dtveVar.y("ALTER TABLE remote_instances ADD COLUMN is_updated_at_hash_valid INTEGER DEFAULT(0);");
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
