package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bswf extends dtup {
    public static final String[] a = {"disambiguations.lookup_key", "disambiguations.normalized_destination"};
    public static final bsvr b;
    public static final int[] c;

    static {
        new enhd().c();
        new enhd().c();
        b = new bsvr();
        c = new int[]{10015};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static String b(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("lookup_key TEXT UNIQUE ON CONFLICT REPLACE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("normalized_destination TEXT NOT NULL");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static String[] c() {
        return (String[]) new ArrayList().toArray(new String[0]);
    }

    public static void d(dtve dtveVar) {
        dtveVar.y(b("disambiguations"));
        for (String str : c()) {
            dtveVar.y(str);
        }
    }
}
