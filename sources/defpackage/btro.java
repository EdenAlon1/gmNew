package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btro extends dtup {
    public static final String[] a = {"linked_account.account_id"};
    public static final enhk b = new enhd().c();
    public static final btrb c;
    public static final int[] d;

    static {
        new enhd().c();
        c = new btrb();
        d = new int[]{35080};
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
        sb.append("account_id INT PRIMARY KEY");
        sb.insert(0, "CREATE TABLE linked_account (");
        sb.append(");");
        dtveVar.y(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
