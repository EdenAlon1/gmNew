package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvar extends dtup {
    public static final String[] a = {"smarts_personalization_decayed_feature_values.feature_id", "smarts_personalization_decayed_feature_values.date", "smarts_personalization_decayed_feature_values.feature_value"};
    public static final enhk b = new enhd().c();
    public static final bvac c;
    public static final int[] d;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("feature_id", "index_smarts_personalization_decayed_feature_values_feature_id");
        enhdVar.k("date", "index_smarts_personalization_decayed_feature_values_date");
        enhdVar.c();
        c = new bvac();
        d = new int[]{54010, 58490, 58950};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static void b(dtve dtveVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("feature_id INTEGER REFERENCES smarts_personalization_features(feature_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("date INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("feature_value REAL");
        sb.insert(0, "CREATE TABLE smarts_personalization_decayed_feature_values (");
        sb.append(", PRIMARY KEY (feature_id,date));");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        if (i >= 58490) {
            arrayList.add("DROP INDEX IF EXISTS index_smarts_personalization_decayed_feature_values_date");
            arrayList.add("CREATE INDEX index_smarts_personalization_decayed_feature_values_date ON smarts_personalization_decayed_feature_values(date);");
        }
        if (i >= 58950) {
            arrayList.add("DROP INDEX IF EXISTS index_smarts_personalization_decayed_feature_values_feature_id");
            arrayList.add("CREATE INDEX index_smarts_personalization_decayed_feature_values_feature_id ON smarts_personalization_decayed_feature_values(feature_id);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }

    public static dtzf c() {
        return a().P();
    }
}
