package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwty extends dtup {
    public static final String[] a = {"rbm_business_verifier_info.verifier_id", "rbm_business_verifier_info.verifier_name", "rbm_business_verifier_info.verifier_logo_image_remote_url", "rbm_business_verifier_info.verifier_logo_image_local_uri"};
    public static final bwtg b;
    public static final int[] c;

    static {
        new enhd().c();
        new enhd().c();
        b = new bwtg();
        c = new int[]{49050};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static String b(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("verifier_id TEXT PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("verifier_name TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("verifier_logo_image_remote_url TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("verifier_logo_image_local_uri TEXT NOT NULL");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static String[] c() {
        return (String[]) new ArrayList().toArray(new String[0]);
    }

    public static void d(dtve dtveVar) {
        dtveVar.y(b("rbm_business_verifier_info"));
        for (String str : c()) {
            dtveVar.y(str);
        }
    }
}
