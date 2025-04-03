package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfsd extends dtup {
    public static final String[] a = {"mls_zinnia_states.identity_id", "mls_zinnia_states.group_id", "mls_zinnia_states.era", "mls_zinnia_states.zinnia_state"};
    public static final cfrr b;
    public static final int[] c;

    static {
        new enhd().c();
        new enhd().c();
        b = new cfrr();
        c = new int[]{60670};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static void b(dtve dtveVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("identity_id TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("group_id TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("era INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("zinnia_state BLOB NOT NULL");
        sb.insert(0, "CREATE TABLE mls_zinnia_states (");
        sb.append(", PRIMARY KEY (identity_id,group_id,era));");
        dtveVar.y(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
