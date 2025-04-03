package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btgy extends dtup {
    public static final String[] a = {"gemini_conversation_id_mappings.conversation_id", "gemini_conversation_id_mappings.my_identity_token", "gemini_conversation_id_mappings.gemini_conversation_id"};
    public static final btgi b;
    public static final int[] c;
    public static final int[] d;

    static {
        new enhd().c();
        enhd enhdVar = new enhd();
        enhdVar.k("gemini_conversation_id", "index_gemini_conversation_id_mappings_gemini_conversation_id");
        enhdVar.c();
        b = new btgi();
        c = new int[]{60010, 60090};
        d = new int[]{60140};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static void b(dtve dtveVar, int i) {
        dtveVar.y(d("gemini_conversation_id_mappings"));
        for (String str : c(i)) {
            dtveVar.y(str);
        }
    }

    static String[] c(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 60090) {
            arrayList.add("DROP INDEX IF EXISTS index_gemini_conversation_id_mappings_gemini_conversation_id");
            arrayList.add("CREATE UNIQUE INDEX index_gemini_conversation_id_mappings_gemini_conversation_id ON gemini_conversation_id_mappings(gemini_conversation_id);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static String d(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INTEGER NOT NULL REFERENCES conversations(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("my_identity_token TEXT NOT NULL REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("gemini_conversation_id TEXT NOT NULL");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(", PRIMARY KEY (conversation_id,my_identity_token));");
        return sb.toString();
    }
}
