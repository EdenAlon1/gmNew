package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azuy extends dtup {
    public static final String[] a = {"subscriptions.sub_id", "subscriptions.sim_serial_number", "subscriptions.telephony_phone_number", "subscriptions.my_identity_token", "subscriptions.my_identity_token_with_foreign_key"};
    public static final enhk b;
    public static final azug c;
    public static final int[] d;
    public static final int[] e;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("subscriptions.my_identity_token", 59450);
        enhdVar.k("subscriptions.my_identity_token_with_foreign_key", 60160);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("my_identity_token", "index_subscriptions_my_identity_token");
        enhdVar2.k("my_identity_token_with_foreign_key", "index_subscriptions_my_identity_token_with_foreign_key");
        enhdVar2.c();
        c = new azug();
        d = new int[]{59230, 59450, 60160};
        e = new int[]{59250};
    }

    public static final azut a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("subscriptions.sub_id");
            engrVar.h("subscriptions.sim_serial_number");
            engrVar.h("subscriptions.telephony_phone_number");
            if (c2.intValue() >= 59450) {
                engrVar.h("subscriptions.my_identity_token");
            }
            if (c2.intValue() >= 60160) {
                engrVar.h("subscriptions.my_identity_token_with_foreign_key");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new azut(strArr);
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(g().a());
    }

    public static String d(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sub_id INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sim_serial_number TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("telephony_phone_number TEXT");
        if (i >= 59450) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("my_identity_token TEXT");
        }
        if (i >= 60160) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("my_identity_token_with_foreign_key TEXT REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE");
        }
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(", PRIMARY KEY (sub_id,sim_serial_number));");
        return sb.toString();
    }

    public static void e(dtve dtveVar, int i) {
        dtveVar.y(d(i, "subscriptions"));
        for (String str : f(i)) {
            dtveVar.y(str);
        }
    }

    static String[] f(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 59450) {
            arrayList.add("DROP INDEX IF EXISTS index_subscriptions_my_identity_token");
            arrayList.add("CREATE INDEX index_subscriptions_my_identity_token ON subscriptions(my_identity_token);");
        }
        if (i >= 60160) {
            arrayList.add("DROP INDEX IF EXISTS index_subscriptions_my_identity_token_with_foreign_key");
            arrayList.add("CREATE INDEX index_subscriptions_my_identity_token_with_foreign_key ON subscriptions(my_identity_token_with_foreign_key);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static dtzf g() {
        return b().P();
    }
}
