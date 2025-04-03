package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbwh extends dtup {
    public static final String[] a = {"message_star_backup._id", "message_star_backup.message_id"};
    public static final enhk b = new enhd().c();
    public static final bbvr c;
    public static final int[] d;
    public static final int[] e;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("message_id", "index_message_star_backup_message_id");
        enhdVar.c();
        c = new bbvr();
        d = new int[]{20};
        e = new int[]{90};
    }

    public static dtve a() {
        return dtub.e("backup");
    }

    public static dtzf b() {
        return a().P();
    }

    public static String c(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER REFERENCES messages_backup(_id) ON DELETE CASCADE ");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    static String[] d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_message_star_backup_message_id");
        arrayList.add("CREATE INDEX index_message_star_backup_message_id ON message_star_backup(message_id);");
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static void e(dtve dtveVar) {
        dtveVar.y(c("message_star_backup"));
        for (String str : d()) {
            dtveVar.y(str);
        }
    }
}
