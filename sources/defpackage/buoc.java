package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buoc extends dtup {
    public static final String[] a = {"message_status._id", "message_status.message_id", "message_status.timestamp", "message_status.status", "message_status.custom_status", "message_status.data"};
    public static final enhk b = new enhd().c();
    public static final bunk c;
    public static final int[] d;

    static {
        new enhd().c();
        c = new bunk();
        d = new int[]{33010};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static dtzf b() {
        return a().P();
    }

    public static void c(dtve dtveVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("timestamp INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("status INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("custom_status INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("data TEXT");
        sb.insert(0, "CREATE TABLE message_status (");
        sb.append(");");
        dtveVar.y(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
