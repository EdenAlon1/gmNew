package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsyb extends dtup {
    public static final String[] a = {"drafts.conversation_id", "drafts.text", "drafts.attachments", "drafts.subject", "drafts.is_urgent", "drafts.replied_to_message_id", "drafts.is_encrypted"};
    public static final bsxg b;
    public static final int[] c;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("drafts.attachments", 59420);
        enhdVar.k("drafts.subject", 59170);
        enhdVar.k("drafts.is_urgent", 59170);
        enhdVar.k("drafts.replied_to_message_id", 59540);
        enhdVar.k("drafts.is_encrypted", 59720);
        enhdVar.c();
        new enhd().c();
        b = new bsxg();
        c = new int[]{59150, 59170, 59420, 59540, 59720};
    }

    public static final bsxw a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("drafts.conversation_id");
            engrVar.h("drafts.text");
            if (c2.intValue() >= 59420) {
                engrVar.h("drafts.attachments");
            }
            if (c2.intValue() >= 59170) {
                engrVar.h("drafts.subject");
            }
            if (c2.intValue() >= 59170) {
                engrVar.h("drafts.is_urgent");
            }
            if (c2.intValue() >= 59540) {
                engrVar.h("drafts.replied_to_message_id");
            }
            if (c2.intValue() >= 59720) {
                engrVar.h("drafts.is_encrypted");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bsxw(strArr);
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
        sb.append("conversation_id INTEGER PRIMARY KEY NOT NULL REFERENCES conversations(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("text TEXT");
        if (i >= 59420) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("attachments BLOB");
        }
        if (i >= 59170) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("subject TEXT");
        }
        if (i >= 59170) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_urgent INT DEFAULT(0) NOT NULL");
        }
        if (i >= 59540) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("replied_to_message_id TEXT");
        }
        if (i >= 59720) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_encrypted INT DEFAULT(0) NOT NULL");
        }
        sb.insert(0, "CREATE TABLE drafts (");
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
