package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxre extends dtup {
    public static final String[] a = {"satellite_emergency_details.message_id", "satellite_emergency_details.help_state"};
    public static final bxqt b;
    public static final int[] c;
    public static final int[] d;

    static {
        new enhd().c();
        enhd enhdVar = new enhd();
        enhdVar.k("message_id", "index_satellite_emergency_details_message_id");
        enhdVar.c();
        b = new bxqt();
        c = new int[]{59950};
        d = new int[]{59960};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static void b(dtve dtveVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER NOT NULL REFERENCES messages(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("help_state INT DEFAULT(1) NOT NULL");
        sb.insert(0, "CREATE TABLE satellite_emergency_details (");
        sb.append(");");
        String sb2 = i >= 59960 ? null : sb.toString();
        if (sb2 == null) {
            return;
        }
        dtveVar.y(sb2);
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_satellite_emergency_details_message_id");
        arrayList.add("CREATE UNIQUE INDEX index_satellite_emergency_details_message_id ON satellite_emergency_details(message_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
