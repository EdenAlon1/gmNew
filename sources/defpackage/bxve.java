package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxve extends dtup {
    public static final String[] a = {"self_profiles._id", "self_profiles.my_identity_token", "self_profiles.limited_profile_display_name", "self_profiles.photo_uri", "self_profiles.is_self_profile_shareable", "self_profiles.belongs_to_self_gaia", "self_profiles.update_timestamp"};
    public static final bxui b;
    public static final int[] c;
    public static final int[] d;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("self_profiles.is_self_profile_shareable", 60400);
        enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("my_identity_token", "index_self_profiles_my_identity_token");
        enhdVar2.c();
        b = new bxui();
        c = new int[]{59920, 60400};
        d = new int[]{60140};
    }

    public static final bxuz a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("self_profiles._id");
            engrVar.h("self_profiles.my_identity_token");
            engrVar.h("self_profiles.limited_profile_display_name");
            engrVar.h("self_profiles.photo_uri");
            if (c2.intValue() >= 60400) {
                engrVar.h("self_profiles.is_self_profile_shareable");
            }
            engrVar.h("self_profiles.belongs_to_self_gaia");
            engrVar.h("self_profiles.update_timestamp");
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bxuz(strArr);
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(f().a());
    }

    public static String d(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("my_identity_token TEXT REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("limited_profile_display_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("photo_uri TEXT");
        if (i >= 60400) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_self_profile_shareable INT DEFAULT(1)");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("belongs_to_self_gaia INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("update_timestamp INT DEFAULT(0)");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void e(dtve dtveVar, int i) {
        dtveVar.y(d(i, "self_profiles"));
        for (String str : g()) {
            dtveVar.y(str);
        }
    }

    public static dtzf f() {
        return b().P();
    }

    static String[] g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_self_profiles_my_identity_token");
        arrayList.add("CREATE INDEX index_self_profiles_my_identity_token ON self_profiles(my_identity_token);");
        return (String[]) arrayList.toArray(new String[0]);
    }
}
