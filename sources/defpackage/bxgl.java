package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxgl extends dtup {
    public static final String[] a = {"remote_registrations_table.tachyon_registration_id", "remote_registrations_table.etouffee", "remote_registrations_table.better_etouffee", "remote_registrations_table.messages_feature_hash", "remote_registrations_table.last_modified_timestamp", "remote_registrations_table.identity_key", "remote_registrations_table.updated_at_hash", "remote_registrations_table.guaranteed_fresh_as_of_timestamp", "remote_registrations_table.is_updated_at_hash_valid"};
    public static final bxfq b;
    public static final int[] c;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("remote_registrations_table.better_etouffee", 46000);
        enhdVar.k("remote_registrations_table.messages_feature_hash", 58800);
        enhdVar.c();
        new enhd().c();
        b = new bxfq();
        c = new int[]{45000, 46000, 58800};
    }

    public static final bxgg a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("remote_registrations_table.tachyon_registration_id");
            engrVar.h("remote_registrations_table.etouffee");
            if (c2.intValue() >= 46000) {
                engrVar.h("remote_registrations_table.better_etouffee");
            }
            if (c2.intValue() >= 58800) {
                engrVar.h("remote_registrations_table.messages_feature_hash");
            }
            engrVar.h("remote_registrations_table.last_modified_timestamp");
            engrVar.h("remote_registrations_table.identity_key");
            engrVar.h("remote_registrations_table.updated_at_hash");
            engrVar.h("remote_registrations_table.guaranteed_fresh_as_of_timestamp");
            engrVar.h("remote_registrations_table.is_updated_at_hash_valid");
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bxgg(strArr);
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
        sb.append("tachyon_registration_id TEXT PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("etouffee INT DEFAULT(0)");
        if (i >= 46000) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("better_etouffee INT DEFAULT(0)");
        }
        if (i >= 58800) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("messages_feature_hash INTEGER DEFAULT(0)");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_modified_timestamp INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("identity_key BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("updated_at_hash INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("guaranteed_fresh_as_of_timestamp INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_updated_at_hash_valid INTEGER DEFAULT(0)");
        sb.insert(0, "CREATE TABLE remote_registrations_table (");
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
