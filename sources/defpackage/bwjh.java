package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwjh extends dtup {
    public static final String[] a = {"pii_hash._id", "pii_hash.timestamp", "pii_hash.hash_value", "pii_hash.hash_key"};
    public static final enhk b = new enhd().c();
    public static final bwir c;
    public static final int[] d;

    static {
        new enhd().c();
        c = new bwir();
        d = new int[]{57080};
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
        sb.append("timestamp INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("hash_value TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("hash_key TEXT");
        sb.insert(0, "CREATE TABLE pii_hash (");
        sb.append(");");
        dtveVar.y(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
