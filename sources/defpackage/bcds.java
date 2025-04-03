package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcds extends dtup {
    public static final String[] a = {"parts_backup._id", "parts_backup.message_id", "parts_backup.content_type", "parts_backup.source", "parts_backup.text", "parts_backup.width", "parts_backup.height", "parts_backup.longitude", "parts_backup.latitude", "parts_backup.cms_full_size_blob_id", "parts_backup.cms_media_encryption_key", "parts_backup.cms_compressed_media_encryption_key", "parts_backup.cms_compressed_blob_id", "parts_backup.file_name", "parts_backup.duration"};
    public static final enhk b;
    public static final bccp c;
    public static final int[] d;
    public static final int[] e;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("parts_backup.message_id", 0);
        enhdVar.k("parts_backup.content_type", 0);
        enhdVar.k("parts_backup.source", 10);
        enhdVar.k("parts_backup.text", 0);
        enhdVar.k("parts_backup.width", 0);
        enhdVar.k("parts_backup.height", 0);
        enhdVar.k("parts_backup.longitude", 0);
        enhdVar.k("parts_backup.latitude", 0);
        enhdVar.k("parts_backup.cms_full_size_blob_id", 0);
        enhdVar.k("parts_backup.cms_media_encryption_key", 0);
        enhdVar.k("parts_backup.cms_compressed_media_encryption_key", 0);
        enhdVar.k("parts_backup.cms_compressed_blob_id", 0);
        enhdVar.k("parts_backup.file_name", 100);
        enhdVar.k("parts_backup.duration", 130);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("message_id", "index_parts_backup_message_id");
        enhdVar2.c();
        c = new bccp();
        d = new int[]{0, 10, 100, 130};
        e = new int[]{90};
    }

    public static final bcdp a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("parts_backup._id");
            if (c2.intValue() >= 0) {
                engrVar.h("parts_backup.message_id");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("parts_backup.content_type");
            }
            if (c2.intValue() >= 10) {
                engrVar.h("parts_backup.source");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("parts_backup.text");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("parts_backup.width");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("parts_backup.height");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("parts_backup.longitude");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("parts_backup.latitude");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("parts_backup.cms_full_size_blob_id");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("parts_backup.cms_media_encryption_key");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("parts_backup.cms_compressed_media_encryption_key");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("parts_backup.cms_compressed_blob_id");
            }
            if (c2.intValue() >= 100) {
                engrVar.h("parts_backup.file_name");
            }
            if (c2.intValue() >= 130) {
                engrVar.h("parts_backup.duration");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bcdp(strArr);
    }

    public static dtve b() {
        return dtub.e("backup");
    }

    public static Integer c() {
        return Integer.valueOf(e().a());
    }

    public static String d(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INT REFERENCES messages_backup(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("content_type TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("source INT DEFAULT(13)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("text TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("width INT DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("height INT DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("longitude REAL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("latitude REAL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_full_size_blob_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_media_encryption_key BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_compressed_media_encryption_key BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_compressed_blob_id TEXT");
        if (i >= 100) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("file_name TEXT");
        }
        if (i >= 130) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("duration INT");
        }
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static dtzf e() {
        return b().P();
    }

    static String[] f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_parts_backup_message_id");
        arrayList.add("CREATE INDEX index_parts_backup_message_id ON parts_backup(message_id);");
        return (String[]) arrayList.toArray(new String[0]);
    }
}
