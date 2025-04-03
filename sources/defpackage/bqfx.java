package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqfx extends dtup {
    public static final String[] a = {"business_conversations_metadata._id", "business_conversations_metadata.conversation_id", "business_conversations_metadata.chatbot_directory_conversation_state", "business_conversations_metadata.conversation_stop_state", "business_conversations_metadata.conversation_toolstone_state", "business_conversations_metadata.conversation_toolstone_timestamp_ms"};
    public static final enhk b;
    public static final bqff c;
    public static final int[] d;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("business_conversations_metadata.conversation_stop_state", 59010);
        enhdVar.k("business_conversations_metadata.conversation_toolstone_state", 59050);
        enhdVar.k("business_conversations_metadata.conversation_toolstone_timestamp_ms", 59050);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("conversation_id", "index_business_conversations_metadata_conversation_id");
        enhdVar2.c();
        c = new bqff();
        d = new int[]{58070, 59010, 59050};
    }

    public static final bqfs a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("business_conversations_metadata._id");
            engrVar.h("business_conversations_metadata.conversation_id");
            engrVar.h("business_conversations_metadata.chatbot_directory_conversation_state");
            if (c2.intValue() >= 59010) {
                engrVar.h("business_conversations_metadata.conversation_stop_state");
            }
            if (c2.intValue() >= 59050) {
                engrVar.h("business_conversations_metadata.conversation_toolstone_state");
            }
            if (c2.intValue() >= 59050) {
                engrVar.h("business_conversations_metadata.conversation_toolstone_timestamp_ms");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bqfs(strArr);
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
        sb.append("conversation_id INTEGER REFERENCES conversations(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("chatbot_directory_conversation_state INT");
        if (i >= 59010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("conversation_stop_state INTEGER");
        }
        if (i >= 59050) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("conversation_toolstone_state INTEGER");
        }
        if (i >= 59050) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("conversation_toolstone_timestamp_ms INTEGER");
        }
        sb.insert(0, "CREATE TABLE business_conversations_metadata (");
        sb.append(");");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_business_conversations_metadata_conversation_id");
        arrayList.add("CREATE UNIQUE INDEX index_business_conversations_metadata_conversation_id ON business_conversations_metadata(conversation_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }

    public static dtzf e() {
        return b().P();
    }
}
