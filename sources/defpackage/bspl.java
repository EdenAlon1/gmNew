package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bspl extends dtup {
    public static final String[] a = {"custodian_rcs_group_ids.conversation_id", "custodian_rcs_group_ids.rcs_group_id"};
    public static final bspa b;
    public static final int[] c;
    public static final int[] d;

    static {
        new enhd().c();
        new enhd().c();
        b = new bspa();
        c = new int[]{57000};
        d = new int[]{57060};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static String b(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INTEGER PRIMARY KEY REFERENCES conversations(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_id TEXT NOT NULL");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    static String[] c() {
        return (String[]) new ArrayList().toArray(new String[0]);
    }

    public static void d(dtve dtveVar) {
        dtveVar.y(b("custodian_rcs_group_ids"));
        for (String str : c()) {
            dtveVar.y(str);
        }
    }
}
