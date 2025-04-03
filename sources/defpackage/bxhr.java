package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxhr extends dtup {
    public static final String[] a = {"remote_user_id_info_table.remote_user_id", "remote_user_id_info_table.last_modified_timestamp", "remote_user_id_info_table.guaranteed_fresh_as_of_timestamp"};
    public static final bxha b;
    public static final int[] c;

    static {
        new enhd().c();
        new enhd().c();
        b = new bxha();
        c = new int[]{45000};
    }

    public static bxgq a(String str) {
        bxhm bxhmVar = new bxhm(a);
        bxhmVar.z("remote_user_id_info_table.queryOnRemoteUserId");
        bxhmVar.q();
        bxhq bxhqVar = new bxhq();
        bxhqVar.b(str);
        bxhmVar.k(new bxhp(bxhqVar));
        return (bxgq) dtub.c(bxhmVar.b());
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static void c(dtve dtveVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("remote_user_id TEXT PRIMARY KEY NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_modified_timestamp INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("guaranteed_fresh_as_of_timestamp INTEGER DEFAULT(0)");
        sb.insert(0, "CREATE TABLE remote_user_id_info_table (");
        sb.append(");");
        dtveVar.y(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
