package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcdv implements fbba {
    public static dtux a() {
        return new dtuf(bcds.d, "parts_backup", new dtue() { // from class: bcdk
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bcds.a;
                valueOf.getClass();
                if (i != 0) {
                    if (i == 10) {
                        dtveVar.y("ALTER TABLE parts_backup ADD COLUMN source INT DEFAULT(13);");
                        return;
                    } else if (i == 100) {
                        dtveVar.y("ALTER TABLE parts_backup ADD COLUMN file_name TEXT;");
                        return;
                    } else {
                        if (i != 130) {
                            return;
                        }
                        dtveVar.y("ALTER TABLE parts_backup ADD COLUMN duration INT;");
                        return;
                    }
                }
                dtveVar.y("ALTER TABLE parts_backup ADD COLUMN message_id INT REFERENCES messages_backup(_id) ON DELETE CASCADE ;");
                dtveVar.y("CREATE INDEX index_parts_backup_message_id ON parts_backup(message_id);");
                dtveVar.y("ALTER TABLE parts_backup ADD COLUMN content_type TEXT;");
                dtveVar.y("ALTER TABLE parts_backup ADD COLUMN text TEXT;");
                dtveVar.y("ALTER TABLE parts_backup ADD COLUMN width INT DEFAULT(-1);");
                dtveVar.y("ALTER TABLE parts_backup ADD COLUMN height INT DEFAULT(-1);");
                dtveVar.y("ALTER TABLE parts_backup ADD COLUMN longitude REAL;");
                dtveVar.y("ALTER TABLE parts_backup ADD COLUMN latitude REAL;");
                dtveVar.y("ALTER TABLE parts_backup ADD COLUMN cms_full_size_blob_id TEXT;");
                dtveVar.y("ALTER TABLE parts_backup ADD COLUMN cms_media_encryption_key BLOB;");
                dtveVar.y("ALTER TABLE parts_backup ADD COLUMN cms_compressed_media_encryption_key BLOB;");
                dtveVar.y("ALTER TABLE parts_backup ADD COLUMN cms_compressed_blob_id TEXT;");
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
