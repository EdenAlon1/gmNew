package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsvg implements fbba {
    public static dtux a() {
        return new dtuf(bsve.d, "desktop", new dtue() { // from class: bsuu
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bsve.a;
                valueOf.getClass();
                switch (i) {
                    case 15020:
                        bsve.d(dtveVar, 15020);
                        break;
                    case 18020:
                        dtveVar.y("ALTER TABLE desktop ADD COLUMN browser_type INT DEFAULT(0);");
                        break;
                    case 20020:
                        dtveVar.y("ALTER TABLE desktop ADD COLUMN needs_unpairing INT DEFAULT(0);");
                        break;
                    case 21030:
                        dtveVar.y("ALTER TABLE desktop ADD COLUMN encryption_key BLOB;");
                        dtveVar.y("ALTER TABLE desktop ADD COLUMN hmac_key BLOB;");
                        break;
                    case 22040:
                        dtveVar.y("ALTER TABLE desktop ADD COLUMN operating_system TEXT DEFAULT('') NOT NULL;");
                        dtveVar.y("ALTER TABLE desktop ADD COLUMN operating_system_version TEXT DEFAULT('') NOT NULL;");
                        break;
                    case 41010:
                        dtveVar.y("ALTER TABLE desktop ADD COLUMN backend_type INT;");
                        break;
                    case 58010:
                        dtveVar.y("ALTER TABLE desktop ADD COLUMN is_active INT DEFAULT(0);");
                        dtveVar.y("ALTER TABLE desktop ADD COLUMN request_id TEXT DEFAULT('');");
                        dtveVar.y("ALTER TABLE desktop ADD COLUMN is_persistent INT DEFAULT(0);");
                        dtveVar.y("ALTER TABLE desktop ADD COLUMN desktop_type INT DEFAULT(0);");
                        break;
                    case 58960:
                        dtveVar.y("ALTER TABLE desktop ADD COLUMN pairing_type INT DEFAULT(0);");
                        break;
                    case 59290:
                        dtveVar.y("ALTER TABLE desktop ADD COLUMN destination_registration_id BLOB;");
                        break;
                    case 59560:
                        dtveVar.y("ALTER TABLE desktop ADD COLUMN gaia_email TEXT;");
                        break;
                    case 59870:
                        dtveVar.y("ALTER TABLE desktop ADD COLUMN creation_time INT DEFAULT(0);");
                        break;
                    case 60540:
                        dtveVar.y("ALTER TABLE desktop ADD COLUMN get_updates_request_time_millis INT DEFAULT(0);");
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
