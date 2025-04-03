package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bszm extends dtup {
    public static final String[] a = {"emergency_sessions.emergency_destination", "emergency_sessions.type", "emergency_sessions.start_timestamp", "emergency_sessions.end_timestamp", "emergency_sessions.refill_duration_ms"};
    public static final bsyv b;
    public static final int[] c;

    static {
        new enhd().c();
        new enhd().c();
        b = new bsyv();
        c = new int[]{60630};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static void b(dtve dtveVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("emergency_destination TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("type INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("start_timestamp INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("end_timestamp INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("refill_duration_ms INTEGER NOT NULL");
        sb.insert(0, "CREATE TABLE emergency_sessions (");
        sb.append(", PRIMARY KEY (emergency_destination,type));");
        dtveVar.y(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
