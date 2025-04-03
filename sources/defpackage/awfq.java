package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awfq extends dtup {
    public static final String[] a = {"file_processing.processing_id", "file_processing.file_type", "file_processing.file_uri", "file_processing.content_type", "file_processing.encryption_metadata", "file_processing.transfer_handle", "file_processing.upload_result", "file_processing.mls_file_metadata"};
    public static final aweu b;
    public static final int[] c;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("file_processing.mls_file_metadata", 60700);
        enhdVar.c();
        new enhd().c();
        b = new aweu();
        c = new int[]{60260, 60700};
    }

    public static final awfl a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("file_processing.processing_id");
            engrVar.h("file_processing.file_type");
            engrVar.h("file_processing.file_uri");
            engrVar.h("file_processing.content_type");
            engrVar.h("file_processing.encryption_metadata");
            engrVar.h("file_processing.transfer_handle");
            engrVar.h("file_processing.upload_result");
            if (c2.intValue() >= 60700) {
                engrVar.h("file_processing.mls_file_metadata");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new awfl(strArr);
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(e().a());
    }

    public static void d(dtve dtveVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("processing_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("file_type TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("file_uri TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("content_type BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("encryption_metadata BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("transfer_handle TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("upload_result BLOB");
        if (i >= 60700) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("mls_file_metadata BLOB");
        }
        sb.insert(0, "CREATE TABLE file_processing (");
        sb.append(", PRIMARY KEY (processing_id,file_type));");
        dtveVar.y(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dtveVar.y(str);
        }
    }

    public static dtzf e() {
        return b().P();
    }
}
