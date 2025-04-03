package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buzh extends dtup {
    public static final String[] a = {"modified_by._id", "modified_by.am_version_code", "modified_by.stack_trace_hash", "modified_by.source", "modified_by.tiktok_trace", "modified_by.stack_trace"};
    public static final buys b;
    public static final int[] c;
    public static final int[] d;

    static {
        new enhd().c();
        new enhd().c();
        b = new buys();
        c = new int[0];
        d = new int[]{59440};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static String b(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("am_version_code INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("stack_trace_hash INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("source TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("tiktok_trace TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("stack_trace TEXT");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    static String[] c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS lookup_idx");
        arrayList.add("CREATE UNIQUE INDEX lookup_idx ON modified_by(am_version_code, stack_trace_hash);");
        return (String[]) arrayList.toArray(new String[0]);
    }
}
