package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsrn extends dtup {
    public static final String[] a = {"data_usage._id", "data_usage.phone_number", "data_usage.data_size"};
    public static final bsrc b;
    public static final int[] c;

    static {
        new enhd().c();
        new enhd().c();
        b = new bsrc();
        c = new int[]{51010};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static void b(dtve dtveVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("phone_number TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("data_size INTEGER DEFAULT(0)");
        sb.insert(0, "CREATE TABLE data_usage (");
        sb.append(");");
        dtveVar.y(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
