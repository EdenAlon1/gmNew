package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byxc extends dtup {
    public static final String[] a = {"verified_sms_senders.sender_id", "verified_sms_senders.brand_id"};
    public static final bywm b;
    public static final int[] c;

    static {
        new enhd().c();
        new enhd().c();
        b = new bywm();
        c = new int[]{29110};
    }

    public static bywg a() {
        bywh bywhVar = new bywh();
        bywhVar.aF();
        return bywhVar;
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static String c(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sender_id TEXT PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("brand_id TEXT");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static String[] d() {
        return (String[]) new ArrayList().toArray(new String[0]);
    }

    public static void e(dtve dtveVar) {
        dtveVar.y(c("verified_sms_senders"));
        for (String str : d()) {
            dtveVar.y(str);
        }
    }
}
