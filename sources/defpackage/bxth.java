package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxth extends dtup {
    public static final String[] a = {"self_participants._id", "self_participants.phone_number", "self_participants.sim_serial_number", "self_participants.sim_slot_index", "self_participants.sub_id", "self_participants.subscription_name", "self_participants.subscription_color", "self_participants.participant_id", "self_participants.smsc"};
    public static final enhk b;
    public static final bxsm c;
    public static final int[] d;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("self_participants.smsc", 29080);
        b = enhdVar.c();
        new enhd().c();
        c = new bxsm();
        d = new int[]{29050, 29080};
    }

    public static final bxtc a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("self_participants._id");
            engrVar.h("self_participants.phone_number");
            engrVar.h("self_participants.sim_serial_number");
            engrVar.h("self_participants.sim_slot_index");
            engrVar.h("self_participants.sub_id");
            engrVar.h("self_participants.subscription_name");
            engrVar.h("self_participants.subscription_color");
            engrVar.h("self_participants.participant_id");
            if (c2.intValue() >= 29080) {
                engrVar.h("self_participants.smsc");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bxtc(strArr);
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
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("phone_number TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sim_serial_number TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sim_slot_index INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sub_id INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("subscription_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("subscription_color INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_id INTEGER");
        if (i >= 29080) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("smsc TEXT");
        }
        sb.insert(0, "CREATE TABLE self_participants (");
        sb.append(");");
        dtveVar.y(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dtveVar.y(str);
        }
    }

    public static dtzf e() {
        return b().P();
    }
}
