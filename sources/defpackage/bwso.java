package defpackage;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwso extends dtup {
    public static final String[] a = {"rbm_business_info.rbm_bot_id", "rbm_business_info.display_name", "rbm_business_info.logo_image_remote_url", "rbm_business_info.logo_image_local_uri", "rbm_business_info.description", "rbm_business_info.color", "rbm_business_info.hero_image_remote_url", "rbm_business_info.hero_image_local_uri", "rbm_business_info.verifier_id", "rbm_business_info.version", "rbm_business_info.expiry_milliseconds", "rbm_business_info.agent_use_case_category"};
    public static final bwro b;
    public static final int[] c;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("rbm_business_info.agent_use_case_category", 59140);
        enhdVar.c();
        new enhd().c();
        b = new bwro();
        c = new int[]{49030, 59140};
    }

    public static bwqm a(String str) {
        bwsj b2 = b();
        b2.z("rbm_business_info.queryOnRbmBotId");
        b2.q();
        bwsn bwsnVar = new bwsn();
        bwsnVar.b(str);
        b2.k(new bwsm(bwsnVar));
        return (bwqm) dtub.c(b2.b());
    }

    public static final bwsj b() {
        String[] strArr;
        Integer d = d();
        if (d.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("rbm_business_info.rbm_bot_id");
            engrVar.h("rbm_business_info.display_name");
            engrVar.h("rbm_business_info.logo_image_remote_url");
            engrVar.h("rbm_business_info.logo_image_local_uri");
            engrVar.h("rbm_business_info.description");
            engrVar.h("rbm_business_info.color");
            engrVar.h("rbm_business_info.hero_image_remote_url");
            engrVar.h("rbm_business_info.hero_image_local_uri");
            engrVar.h("rbm_business_info.verifier_id");
            engrVar.h("rbm_business_info.version");
            engrVar.h("rbm_business_info.expiry_milliseconds");
            if (d.intValue() >= 59140) {
                engrVar.h("rbm_business_info.agent_use_case_category");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bwsj(strArr);
    }

    public static dtve c() {
        return dtub.e("$primary");
    }

    public static Integer d() {
        return Integer.valueOf(h().a());
    }

    public static Object e(String str, Function function, Supplier supplier) {
        Object obj;
        Object apply;
        bwqm a2 = a(str);
        if (a2 != null) {
            apply = function.apply(a2);
            return apply;
        }
        obj = supplier.get();
        return obj;
    }

    public static String f(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rbm_bot_id TEXT PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("display_name TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("logo_image_remote_url TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("logo_image_local_uri TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("description TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("color TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("hero_image_remote_url TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("hero_image_local_uri TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("verifier_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("version TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("expiry_milliseconds INTEGER NOT NULL");
        if (i >= 59140) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("agent_use_case_category INT DEFAULT(0)");
        }
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void g(dtve dtveVar, int i) {
        dtveVar.y(f(i, "rbm_business_info"));
        for (String str : i()) {
            dtveVar.y(str);
        }
    }

    public static dtzf h() {
        return c().P();
    }

    public static String[] i() {
        return (String[]) new ArrayList().toArray(new String[0]);
    }
}
