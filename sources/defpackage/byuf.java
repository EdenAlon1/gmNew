package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byuf extends dtup {
    public static final String[] a = {"verified_sms_blacklisted_senders.sender_id"};
    public static final bytw b;
    public static final int[] c;

    static {
        new enhd().c();
        new enhd().c();
        b = new bytw();
        c = new int[]{33080};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static void b(dtve dtveVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sender_id TEXT PRIMARY KEY");
        sb.insert(0, "CREATE TABLE verified_sms_blacklisted_senders (");
        sb.append(");");
        dtveVar.y(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
