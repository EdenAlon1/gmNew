package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvbu extends dtup {
    public static final String[] a = {"smarts_personalization_features.feature_id", "smarts_personalization_features.feature", "smarts_personalization_features.start_date"};
    public static final bvbh b;
    public static final int[] c;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("smarts_personalization_features.feature", 54060);
        enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("feature", "index_smarts_personalization_features_feature");
        enhdVar2.c();
        b = new bvbh();
        c = new int[]{54000, 54060};
    }

    public static final bvbr a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("smarts_personalization_features.feature_id");
            if (c2.intValue() >= 54060) {
                engrVar.h("smarts_personalization_features.feature");
            }
            engrVar.h("smarts_personalization_features.start_date");
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bvbr(strArr);
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
        sb.append("feature_id INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE ON CONFLICT FAIL");
        if (i >= 54060) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("feature TEXT");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("start_date INTEGER");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void e(dtve dtveVar, int i) {
        dtveVar.y(d(i, "smarts_personalization_features"));
        for (String str : f(i)) {
            dtveVar.y(str);
        }
    }

    public static String[] f(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 54060) {
            arrayList.add("DROP INDEX IF EXISTS index_smarts_personalization_features_feature");
            arrayList.add("CREATE UNIQUE INDEX index_smarts_personalization_features_feature ON smarts_personalization_features(feature);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static dtzf g() {
        return b().P();
    }
}
