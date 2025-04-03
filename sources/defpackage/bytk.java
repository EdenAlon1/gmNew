package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bytk extends dtup {
    public static final String[] a = {"user_references._id", "user_references.message_id", "user_references.user_ref_id", "user_references.user_ref_datetime"};
    public static final enhk b = new enhd().c();
    public static final bysq c;
    public static final int[] d;
    public static final int[] e;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("message_id", "index_user_references_message_id");
        enhdVar.c();
        c = new bysq();
        d = new int[]{10014};
        e = new int[]{57030};
    }

    public static byse a() {
        bysf bysfVar = new bysf();
        bysfVar.aF();
        return bysfVar;
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static dtzf c() {
        return b().P();
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
        sb.append("message_id INTEGER NOT NULL REFERENCES messages(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("user_ref_id INTEGER NOT NULL REFERENCES participants(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("user_ref_datetime INTEGER");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(", UNIQUE(message_id,user_ref_id) ON CONFLICT FAIL);");
        return sb.toString();
    }

    static String[] e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_user_references_message_id");
        arrayList.add("CREATE INDEX index_user_references_message_id ON user_references(message_id);");
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static void f(dtve dtveVar) {
        dtveVar.y(d("user_references"));
        for (String str : e()) {
            dtveVar.y(str);
        }
    }
}
