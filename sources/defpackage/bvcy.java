package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvcy extends dtup {
    public static final String[] a = {"smarts_personalization_normalized_feature_values.date", "smarts_personalization_normalized_feature_values.features"};
    public static final bvck b;
    public static final int[] c;

    static {
        new enhd().c();
        new enhd().c();
        b = new bvck();
        c = new int[]{54020};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static void b(dtve dtveVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("date INTEGER PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("features BLOB");
        sb.insert(0, "CREATE TABLE smarts_personalization_normalized_feature_values (");
        sb.append(");");
        dtveVar.y(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
