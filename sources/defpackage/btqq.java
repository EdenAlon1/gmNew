package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btqq extends dtup {
    public static final String[] a = {"link_preview._id", "link_preview.message_id", "link_preview.trigger_url", "link_preview.expiration_time_millis", "link_preview.link_title", "link_preview.link_description", "link_preview.link_image_url", "link_preview.link_domain", "link_preview.link_canonical_url", "link_preview.link_preview_prevented", "link_preview.link_preview_failed"};
    public static final enhk b;
    public static final btpq c;
    public static final int[] d;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("link_preview.link_preview_prevented", 21010);
        enhdVar.k("link_preview.link_preview_failed", 22020);
        b = enhdVar.c();
        new enhd().c();
        c = new btpq();
        d = new int[]{21010, 22020};
    }

    public static btor a() {
        btos btosVar = new btos();
        btosVar.aF();
        return btosVar;
    }

    public static final btql b() {
        String[] strArr;
        Integer d2 = d();
        if (d2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("link_preview._id");
            engrVar.h("link_preview.message_id");
            engrVar.h("link_preview.trigger_url");
            engrVar.h("link_preview.expiration_time_millis");
            engrVar.h("link_preview.link_title");
            engrVar.h("link_preview.link_description");
            engrVar.h("link_preview.link_image_url");
            engrVar.h("link_preview.link_domain");
            engrVar.h("link_preview.link_canonical_url");
            if (d2.intValue() >= 21010) {
                engrVar.h("link_preview.link_preview_prevented");
            }
            if (d2.intValue() >= 22020) {
                engrVar.h("link_preview.link_preview_failed");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new btql(strArr);
    }

    public static dtve c() {
        return dtub.e("$primary");
    }

    public static Integer d() {
        return Integer.valueOf(g().a());
    }

    public static String e(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER NOT NULL UNIQUE ON CONFLICT FAIL REFERENCES messages(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("trigger_url TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("expiration_time_millis INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("link_title TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("link_description TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("link_image_url TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("link_domain TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("link_canonical_url TEXT");
        if (i >= 21010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("link_preview_prevented INTEGER DEFAULT(0)");
        }
        if (i >= 22020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("link_preview_failed INTEGER DEFAULT(0)");
        }
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void f(dtve dtveVar, int i) {
        dtub.J(dtveVar, "link_preview", e(i, "TEMP___link_preview"), a, h());
    }

    public static dtzf g() {
        return c().P();
    }

    static String[] h() {
        return (String[]) new ArrayList().toArray(new String[0]);
    }
}
