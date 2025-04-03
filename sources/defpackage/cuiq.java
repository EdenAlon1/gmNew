package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuiq extends dtup {
    public static final String[] a = {"spam_logging_ids_table.message_id", "spam_logging_ids_table.message_logging_id", "spam_logging_ids_table.conversation_id", "spam_logging_ids_table.conversation_logging_id", "spam_logging_ids_table.generation_timestamp"};
    public static final cuhz b;
    public static final int[] c;

    static {
        new enhd().c();
        enhd enhdVar = new enhd();
        enhdVar.k("message_id", "index_spam_logging_ids_table_message_id");
        enhdVar.k("conversation_id", "index_spam_logging_ids_table_conversation_id");
        enhdVar.k("generation_timestamp", "index_spam_logging_ids_table_generation_timestamp");
        enhdVar.c();
        b = new cuhz();
        c = new int[]{59460};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static void b(dtve dtveVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_logging_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INTEGER REFERENCES conversations(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_logging_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("generation_timestamp INTEGER");
        sb.insert(0, "CREATE TABLE spam_logging_ids_table (");
        sb.append(");");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_spam_logging_ids_table_message_id");
        arrayList.add("CREATE INDEX index_spam_logging_ids_table_message_id ON spam_logging_ids_table(message_id);");
        arrayList.add("DROP INDEX IF EXISTS index_spam_logging_ids_table_conversation_id");
        arrayList.add("CREATE INDEX index_spam_logging_ids_table_conversation_id ON spam_logging_ids_table(conversation_id);");
        arrayList.add("DROP INDEX IF EXISTS index_spam_logging_ids_table_generation_timestamp");
        arrayList.add("CREATE INDEX index_spam_logging_ids_table_generation_timestamp ON spam_logging_ids_table(generation_timestamp);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
