package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwvy extends dtup {
    public static final String[] a = {"read_reports._id", "read_reports.message_id", "read_reports.participant_id", "read_reports.receive_time", "read_reports.read_time", "read_reports.ftd_time"};
    public static final enhk b;
    public static final bwvg c;
    public static final int[] d;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("read_reports.ftd_time", 58880);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("message_id", "index_read_reports_message_id");
        enhdVar2.c();
        c = new bwvg();
        d = new int[]{10008, 58880};
    }

    public static bwuq a() {
        bwur bwurVar = new bwur();
        bwurVar.aF();
        return bwurVar;
    }

    public static final bwvt b() {
        String[] strArr;
        Integer d2 = d();
        if (d2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("read_reports._id");
            engrVar.h("read_reports.message_id");
            engrVar.h("read_reports.participant_id");
            engrVar.h("read_reports.receive_time");
            engrVar.h("read_reports.read_time");
            if (d2.intValue() >= 58880) {
                engrVar.h("read_reports.ftd_time");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bwvt(strArr);
    }

    public static dtve c() {
        return dtub.e("$primary");
    }

    public static Integer d() {
        return Integer.valueOf(f().a());
    }

    public static void e(dtve dtveVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_id INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("receive_time INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("read_time INT DEFAULT(0)");
        if (i >= 58880) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("ftd_time INTEGER DEFAULT(-1)");
        }
        sb.insert(0, "CREATE TABLE read_reports (");
        sb.append(", UNIQUE(message_id,participant_id) ON CONFLICT FAIL FOREIGN KEY (message_id) REFERENCES messages (_id) ON DELETE CASCADE FOREIGN KEY (participant_id) REFERENCES participants (_id) ON DELETE SET NULL);");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_read_reports_message_id");
        arrayList.add("CREATE INDEX index_read_reports_message_id ON read_reports(message_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }

    public static dtzf f() {
        return c().P();
    }
}
