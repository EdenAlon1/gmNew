package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azkv extends dtup {
    public static final String[] a = {"active_sims.sim_serial_number", "active_sims.active_sub_id", "active_sims.sim_slot_index"};
    public static final azkj b;
    public static final int[] c;
    public static final int[] d;

    static {
        new enhd().c();
        new enhd().c();
        b = new azkj();
        c = new int[]{59230};
        d = new int[]{59250};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static String b(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sim_serial_number TEXT PRIMARY KEY NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("active_sub_id INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sim_slot_index INT DEFAULT(-1)");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(", FOREIGN KEY (sim_serial_number,active_sub_id) REFERENCES subscriptions (sim_serial_number,sub_id) ON DELETE RESTRICT ON UPDATE RESTRICT");
        sb.append(", CHECK (" + new dtzq("$R >= 0", new Object[]{"sim_slot_index"}).ag(dtzu.b()) + ")");
        sb.append(");");
        return sb.toString();
    }

    static String[] c() {
        return (String[]) new ArrayList().toArray(new String[0]);
    }

    public static void d(dtve dtveVar) {
        dtveVar.y(b("active_sims"));
        for (String str : c()) {
            dtveVar.y(str);
        }
    }
}
