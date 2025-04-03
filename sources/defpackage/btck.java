package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btck extends dtup {
    public static final String[] a = {"etouffee_rcs_metadata.rcs_message_id", "etouffee_rcs_metadata.preview_etouffee", "etouffee_rcs_metadata.preview_summary", "etouffee_rcs_metadata.preview_version", "etouffee_rcs_metadata.attachment_etouffee", "etouffee_rcs_metadata.attachment_summary", "etouffee_rcs_metadata.attachment_version", "etouffee_rcs_metadata.creation_timestamp", "etouffee_rcs_metadata.attachment_uri", "etouffee_rcs_metadata.custom_delivery_receipt_mime_type", "etouffee_rcs_metadata.custom_delivery_receipt_content", "etouffee_rcs_metadata.file_uploaded_xml_from_content_server", "etouffee_rcs_metadata.file_uploaded_fallback_uri", "etouffee_rcs_metadata.file_uploaded_expiry", "etouffee_rcs_metadata.plaintext_attachment_name", "etouffee_rcs_metadata.plaintext_attachment_content_type", "etouffee_rcs_metadata.plaintext_thumbnail_content_type", "etouffee_rcs_metadata.mls_file_info"};
    public static final btbi b;
    public static final int[] c;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("etouffee_rcs_metadata.attachment_uri", 35060);
        enhdVar.k("etouffee_rcs_metadata.custom_delivery_receipt_mime_type", 37020);
        enhdVar.k("etouffee_rcs_metadata.custom_delivery_receipt_content", 37020);
        enhdVar.k("etouffee_rcs_metadata.file_uploaded_xml_from_content_server", 48010);
        enhdVar.k("etouffee_rcs_metadata.file_uploaded_fallback_uri", 48010);
        enhdVar.k("etouffee_rcs_metadata.file_uploaded_expiry", 48010);
        enhdVar.k("etouffee_rcs_metadata.plaintext_attachment_name", 56020);
        enhdVar.k("etouffee_rcs_metadata.plaintext_attachment_content_type", 56020);
        enhdVar.k("etouffee_rcs_metadata.plaintext_thumbnail_content_type", 56020);
        enhdVar.k("etouffee_rcs_metadata.mls_file_info", 60700);
        enhdVar.c();
        new enhd().c();
        b = new btbi();
        c = new int[]{35050, 35060, 37020, 48010, 56020, 60700};
    }

    public static final btch a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("etouffee_rcs_metadata.rcs_message_id");
            engrVar.h("etouffee_rcs_metadata.preview_etouffee");
            engrVar.h("etouffee_rcs_metadata.preview_summary");
            engrVar.h("etouffee_rcs_metadata.preview_version");
            engrVar.h("etouffee_rcs_metadata.attachment_etouffee");
            engrVar.h("etouffee_rcs_metadata.attachment_summary");
            engrVar.h("etouffee_rcs_metadata.attachment_version");
            engrVar.h("etouffee_rcs_metadata.creation_timestamp");
            if (c2.intValue() >= 35060) {
                engrVar.h("etouffee_rcs_metadata.attachment_uri");
            }
            if (c2.intValue() >= 37020) {
                engrVar.h("etouffee_rcs_metadata.custom_delivery_receipt_mime_type");
            }
            if (c2.intValue() >= 37020) {
                engrVar.h("etouffee_rcs_metadata.custom_delivery_receipt_content");
            }
            if (c2.intValue() >= 48010) {
                engrVar.h("etouffee_rcs_metadata.file_uploaded_xml_from_content_server");
            }
            if (c2.intValue() >= 48010) {
                engrVar.h("etouffee_rcs_metadata.file_uploaded_fallback_uri");
            }
            if (c2.intValue() >= 48010) {
                engrVar.h("etouffee_rcs_metadata.file_uploaded_expiry");
            }
            if (c2.intValue() >= 56020) {
                engrVar.h("etouffee_rcs_metadata.plaintext_attachment_name");
            }
            if (c2.intValue() >= 56020) {
                engrVar.h("etouffee_rcs_metadata.plaintext_attachment_content_type");
            }
            if (c2.intValue() >= 56020) {
                engrVar.h("etouffee_rcs_metadata.plaintext_thumbnail_content_type");
            }
            if (c2.intValue() >= 60700) {
                engrVar.h("etouffee_rcs_metadata.mls_file_info");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new btch(strArr);
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
        sb.append("rcs_message_id TEXT PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("preview_etouffee BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("preview_summary BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("preview_version INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("attachment_etouffee BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("attachment_summary BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("attachment_version INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("creation_timestamp INT DEFAULT(0)");
        if (i >= 35060) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("attachment_uri TEXT");
        }
        if (i >= 37020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("custom_delivery_receipt_mime_type TEXT");
        }
        if (i >= 37020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("custom_delivery_receipt_content BLOB");
        }
        if (i >= 48010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("file_uploaded_xml_from_content_server BLOB");
        }
        if (i >= 48010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("file_uploaded_fallback_uri TEXT");
        }
        if (i >= 48010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("file_uploaded_expiry INT");
        }
        if (i >= 56020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("plaintext_attachment_name TEXT");
        }
        if (i >= 56020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("plaintext_attachment_content_type TEXT");
        }
        if (i >= 56020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("plaintext_thumbnail_content_type TEXT");
        }
        if (i >= 60700) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("mls_file_info BLOB");
        }
        sb.insert(0, "CREATE TABLE etouffee_rcs_metadata (");
        sb.append(");");
        dtveVar.y(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dtveVar.y(str);
        }
    }

    public static dtzf e() {
        return b().P();
    }
}
