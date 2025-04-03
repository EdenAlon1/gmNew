package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqrp extends dtup {
    public static final String[] a = {"cms_notifications.cms_id", "cms_notifications.cms_last_mod_seq", "cms_notifications.cms_correlation_id", "cms_notifications.from_address", "cms_notifications.to_address", "cms_notifications.correlation_text", "cms_notifications.modified_at_timestamp", "cms_notifications.message_received_timestamp"};
    public static final bqqv b;
    public static final int[] c;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("cms_notifications.message_received_timestamp", 46040);
        enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("correlation_text", "index_cms_notifications_correlation_text");
        enhdVar2.c();
        b = new bqqv();
        c = new int[]{38000, 46040};
    }

    public static final bqrm a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("cms_notifications.cms_id");
            engrVar.h("cms_notifications.cms_last_mod_seq");
            engrVar.h("cms_notifications.cms_correlation_id");
            engrVar.h("cms_notifications.from_address");
            engrVar.h("cms_notifications.to_address");
            engrVar.h("cms_notifications.correlation_text");
            engrVar.h("cms_notifications.modified_at_timestamp");
            if (c2.intValue() >= 46040) {
                engrVar.h("cms_notifications.message_received_timestamp");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bqrm(strArr);
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(e().a());
    }

    public static void d(dtve dtveVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_id TEXT PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_last_mod_seq INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_correlation_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("from_address TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("to_address TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("correlation_text TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("modified_at_timestamp INTEGER DEFAULT(0)");
        if (i >= 46040) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("message_received_timestamp INTEGER DEFAULT(0)");
        }
        sb.insert(0, "CREATE TABLE cms_notifications (");
        sb.append(");");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_cms_notifications_correlation_text");
        arrayList.add("CREATE INDEX index_cms_notifications_correlation_text ON cms_notifications(correlation_text);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }

    public static dtzf e() {
        return b().P();
    }
}
