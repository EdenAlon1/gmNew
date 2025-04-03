package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxct extends dtup {
    public static final String[] a = {"reminders._id", "reminders.message_id", "reminders.conversation_id", "reminders.trigger_time", "reminders.status"};
    public static final enhk b;
    public static final bxby c;
    public static final int[] d;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("reminders.conversation_id", 35070);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("conversation_id", "index_reminders_conversation_id");
        enhdVar2.k("trigger_time", "index_reminders_trigger_time");
        enhdVar2.c();
        c = new bxby();
        d = new int[]{33070, 35070, 58470};
    }

    public static bxbi a(String str) {
        bxco c2 = c();
        c2.z("reminders.queryOnId");
        c2.q();
        bxcs bxcsVar = new bxcs();
        bxcsVar.c(str);
        c2.d(bxcsVar);
        return (bxbi) dtub.c(c2.b());
    }

    public static bxbi b(MessageIdType messageIdType) {
        bxco c2 = c();
        c2.z("reminders.queryOnMessageId");
        c2.q();
        bxcs bxcsVar = new bxcs();
        bxcsVar.aq(new dtrt("reminders.message_id", 1, Long.valueOf(bdhb.a(messageIdType))));
        c2.d(bxcsVar);
        return (bxbi) dtub.c(c2.b());
    }

    public static final bxco c() {
        String[] strArr;
        Integer e = e();
        if (e.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("reminders._id");
            engrVar.h("reminders.message_id");
            if (e.intValue() >= 35070) {
                engrVar.h("reminders.conversation_id");
            }
            engrVar.h("reminders.trigger_time");
            engrVar.h("reminders.status");
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bxco(strArr);
    }

    public static dtve d() {
        return dtub.e("$primary");
    }

    public static Integer e() {
        return Integer.valueOf(g().a());
    }

    public static void f(dtve dtveVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER UNIQUE REFERENCES messages(_id) ON DELETE CASCADE ");
        if (i >= 35070) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("conversation_id INTEGER REFERENCES conversations(_id) ON DELETE CASCADE ");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("trigger_time INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("status INTEGER DEFAULT(0)");
        sb.insert(0, "CREATE TABLE reminders (");
        sb.append(");");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        if (i >= 58470) {
            arrayList.add("DROP INDEX IF EXISTS index_reminders_conversation_id");
            arrayList.add("CREATE INDEX index_reminders_conversation_id ON reminders(conversation_id);");
        }
        if (i >= 58470) {
            arrayList.add("DROP INDEX IF EXISTS index_reminders_trigger_time");
            arrayList.add("CREATE INDEX index_reminders_trigger_time ON reminders(trigger_time);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }

    public static dtzf g() {
        return d().P();
    }
}
