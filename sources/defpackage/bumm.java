package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bumm extends dtup {
    public static final String[] a = {"message_star._id", "message_star.message_id"};
    public static final enhk b = new enhd().c();
    public static final bulv c;
    public static final int[] d;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("message_id", "index_message_star_message_id");
        enhdVar.c();
        c = new bulv();
        d = new int[]{58180};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static dtzf b() {
        return a().P();
    }

    public static void c(dtve dtveVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ");
        sb.insert(0, "CREATE TABLE message_star (");
        sb.append(");");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_message_star_message_id");
        arrayList.add("CREATE UNIQUE INDEX index_message_star_message_id ON message_star(message_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
