package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aykg extends dtup {
    public static final String[] a = {"conversation_matcher_cache._id", "conversation_matcher_cache.matcher_version", "conversation_matcher_cache.destination_key", "conversation_matcher_cache.conversation_id"};
    public static final ayjp b;
    public static final int[] c;
    public static final int[] d;

    static {
        new enhd().c();
        new enhd().c();
        b = new ayjp();
        c = new int[]{58580, 59180};
        d = new int[]{58640};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static void b(dtve dtveVar, int i) {
        dtveVar.y(d("conversation_matcher_cache"));
        for (String str : c(i)) {
            dtveVar.y(str);
        }
    }

    static String[] c(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS cache_idx");
        arrayList.add("CREATE UNIQUE INDEX cache_idx ON conversation_matcher_cache(matcher_version, destination_key, conversation_id);");
        if (i >= 59180) {
            arrayList.add("DROP INDEX IF EXISTS index_conversation_matcher_cache_conversation_id");
            arrayList.add("CREATE INDEX index_conversation_matcher_cache_conversation_id ON conversation_matcher_cache(conversation_id) WHERE conversation_id NOT NULL;");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static String d(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("matcher_version INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("destination_key TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INT NOT NULL REFERENCES conversations(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }
}
