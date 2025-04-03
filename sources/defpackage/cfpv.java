package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfpv extends dtup {
    public static final String[] a = {"mls_key_packages._id", "mls_key_packages.key_package", "mls_key_packages.expiration_timestamp"};
    public static final cfpk b;
    public static final int[] c;

    static {
        new enhd().c();
        new enhd().c();
        b = new cfpk();
        c = new int[]{60520};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static void b(dtve dtveVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id BLOB PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("key_package BLOB NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("expiration_timestamp INTEGER NOT NULL");
        sb.insert(0, "CREATE TABLE mls_key_packages (");
        sb.append(");");
        dtveVar.y(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
