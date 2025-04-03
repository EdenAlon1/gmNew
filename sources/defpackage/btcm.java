package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btcm implements fbba {
    public static dtux a() {
        return new dtuf(btck.c, "etouffee_rcs_metadata", new dtue() { // from class: btce
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = btck.a;
                valueOf.getClass();
                switch (i) {
                    case 35050:
                        btck.d(dtveVar, 35050);
                        break;
                    case 35060:
                        dtveVar.y("ALTER TABLE etouffee_rcs_metadata ADD COLUMN attachment_uri TEXT;");
                        break;
                    case 37020:
                        dtveVar.y("ALTER TABLE etouffee_rcs_metadata ADD COLUMN custom_delivery_receipt_mime_type TEXT;");
                        dtveVar.y("ALTER TABLE etouffee_rcs_metadata ADD COLUMN custom_delivery_receipt_content BLOB;");
                        break;
                    case 48010:
                        dtveVar.y("ALTER TABLE etouffee_rcs_metadata ADD COLUMN file_uploaded_xml_from_content_server BLOB;");
                        dtveVar.y("ALTER TABLE etouffee_rcs_metadata ADD COLUMN file_uploaded_fallback_uri TEXT;");
                        dtveVar.y("ALTER TABLE etouffee_rcs_metadata ADD COLUMN file_uploaded_expiry INT;");
                        break;
                    case 56020:
                        dtveVar.y("ALTER TABLE etouffee_rcs_metadata ADD COLUMN plaintext_attachment_name TEXT;");
                        dtveVar.y("ALTER TABLE etouffee_rcs_metadata ADD COLUMN plaintext_attachment_content_type TEXT;");
                        dtveVar.y("ALTER TABLE etouffee_rcs_metadata ADD COLUMN plaintext_thumbnail_content_type TEXT;");
                        break;
                    case 60700:
                        dtveVar.y("ALTER TABLE etouffee_rcs_metadata ADD COLUMN mls_file_info BLOB;");
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
