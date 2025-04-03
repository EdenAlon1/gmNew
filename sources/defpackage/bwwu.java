package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwwu extends dtup {
    public static final String[] a = {"received_message_phone_numbers.rcs_message_id", "received_message_phone_numbers.self_msisdn"};
    public static final bwwk b;
    public static final int[] c;

    static {
        new enhd().c();
        new enhd().c();
        b = new bwwk();
        c = new int[]{40020};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static void b(dtve dtveVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_message_id TEXT PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("self_msisdn TEXT NOT NULL");
        sb.insert(0, "CREATE TABLE received_message_phone_numbers (");
        sb.append(");");
        dtveVar.y(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
