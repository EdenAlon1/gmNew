package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btmu extends dtup {
    public static final String[] a = {"lighter_conversations_table._id", "lighter_conversations_table.conversation_id", "lighter_conversations_table.business_id", "lighter_conversations_table.lighter_conversation_id_json", "lighter_conversations_table.read", "lighter_conversations_table.is_last_message_outgoing", "lighter_conversations_table.conversation_status", "lighter_conversations_table.last_action_timestamp", "lighter_conversations_table.sync_timestamp_ms"};
    public static final enhk b;
    public static final btly c;
    public static final int[] d;
    public static final int[] e;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("lighter_conversations_table.read", 58700);
        enhdVar.k("lighter_conversations_table.is_last_message_outgoing", 58810);
        enhdVar.k("lighter_conversations_table.conversation_status", 59030);
        enhdVar.k("lighter_conversations_table.last_action_timestamp", 59040);
        enhdVar.k("lighter_conversations_table.sync_timestamp_ms", 59100);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("conversation_id", "index_lighter_conversations_table_conversation_id");
        enhdVar2.k("business_id", "index_lighter_conversations_table_business_id");
        enhdVar2.k("read", "index_lighter_conversation_read_0");
        enhdVar2.c();
        c = new btly();
        d = new int[]{58660, 58700, 58760, 58810, 58930, 59030, 59040, 59100};
        e = new int[]{59110};
    }

    public static final btmp a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("lighter_conversations_table._id");
            engrVar.h("lighter_conversations_table.conversation_id");
            engrVar.h("lighter_conversations_table.business_id");
            engrVar.h("lighter_conversations_table.lighter_conversation_id_json");
            if (c2.intValue() >= 58700) {
                engrVar.h("lighter_conversations_table.read");
            }
            if (c2.intValue() >= 58810) {
                engrVar.h("lighter_conversations_table.is_last_message_outgoing");
            }
            if (c2.intValue() >= 59030) {
                engrVar.h("lighter_conversations_table.conversation_status");
            }
            if (c2.intValue() >= 59040) {
                engrVar.h("lighter_conversations_table.last_action_timestamp");
            }
            if (c2.intValue() >= 59100) {
                engrVar.h("lighter_conversations_table.sync_timestamp_ms");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new btmp(strArr);
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(g().a());
    }

    public static String d(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INTEGER REFERENCES conversations(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("business_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("lighter_conversation_id_json TEXT");
        if (i >= 58700) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("read INTEGER DEFAULT(1)");
        }
        if (i >= 58810) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_last_message_outgoing INTEGER");
        }
        if (i >= 59030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("conversation_status INTEGER");
        }
        if (i >= 59040) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("last_action_timestamp INT DEFAULT(0)");
        }
        if (i >= 59100) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("sync_timestamp_ms INT DEFAULT(0)");
        }
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void e(dtve dtveVar, int i) {
        dtveVar.y(d(i, "lighter_conversations_table"));
        for (String str : f(i)) {
            dtveVar.y(str);
        }
    }

    static String[] f(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_lighter_conversations_table_business_id");
        arrayList.add("CREATE UNIQUE INDEX index_lighter_conversations_table_business_id ON lighter_conversations_table(business_id);");
        if (i >= 58760) {
            arrayList.add("DROP INDEX IF EXISTS index_lighter_conversation_read_0");
            arrayList.add("CREATE INDEX index_lighter_conversation_read_0 ON lighter_conversations_table(read) WHERE read == 0;");
        }
        if (i >= 58930) {
            arrayList.add("DROP INDEX IF EXISTS index_lighter_conversations_table_conversation_id");
            arrayList.add("CREATE INDEX index_lighter_conversations_table_conversation_id ON lighter_conversations_table(conversation_id);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static dtzf g() {
        return b().P();
    }
}
