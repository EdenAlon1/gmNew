package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btfo extends dtup {
    public static final String[] a = {"flagged_messages._id", "flagged_messages.flagged_message_id", "flagged_messages.flagging_reason", "flagged_messages.flagged_message_timestamp", "flagged_messages.flagged_message_notified", "flagged_messages.flagged_message_delay"};
    public static final bteu b;
    public static final int[] c;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("flagged_messages.flagged_message_timestamp", 39030);
        enhdVar.k("flagged_messages.flagged_message_notified", 46030);
        enhdVar.k("flagged_messages.flagged_message_delay", 60710);
        enhdVar.c();
        new enhd().c();
        b = new bteu();
        c = new int[]{39010, 39030, 46030, 60710};
    }

    public static final btfj a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("flagged_messages._id");
            engrVar.h("flagged_messages.flagged_message_id");
            engrVar.h("flagged_messages.flagging_reason");
            if (c2.intValue() >= 39030) {
                engrVar.h("flagged_messages.flagged_message_timestamp");
            }
            if (c2.intValue() >= 46030) {
                engrVar.h("flagged_messages.flagged_message_notified");
            }
            if (c2.intValue() >= 60710) {
                engrVar.h("flagged_messages.flagged_message_delay");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new btfj(strArr);
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
        sb.append("flagged_message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("flagging_reason INTEGER");
        if (i >= 39030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("flagged_message_timestamp INT");
        }
        if (i >= 46030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("flagged_message_notified INT DEFAULT(0)");
        }
        if (i >= 60710) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("flagged_message_delay INT DEFAULT(0)");
        }
        sb.insert(0, "CREATE TABLE flagged_messages (");
        sb.append(", UNIQUE(flagged_message_id,flagging_reason) ON CONFLICT IGNORE);");
        dtveVar.y(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dtveVar.y(str);
        }
    }

    public static dtzf e() {
        return b().P();
    }
}
