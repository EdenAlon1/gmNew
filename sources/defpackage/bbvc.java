package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbvc extends dtup {
    public static final String[] a = {"message_replies_backup.message_id", "message_replies_backup.replied_to_message_id", "message_replies_backup.replied_to_message_id_null_reason", "message_replies_backup.replied_to_rcs_message_id"};
    public static final enhk b = new enhd().c();
    public static final bbuk c;
    public static final int[] d;
    public static final int[] e;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("replied_to_message_id", "index_message_replies_backup_replied_to_message_id");
        enhdVar.k("replied_to_message_id_null_reason", "index_message_replies_backup_replied_to_message_id_null_reason");
        enhdVar.k("replied_to_rcs_message_id", "index_message_replies_backup_replied_to_rcs_message_id");
        enhdVar.c();
        c = new bbuk();
        d = new int[]{60};
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
        sb.append("message_id INTEGER PRIMARY KEY REFERENCES messages_backup(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("replied_to_message_id INTEGER REFERENCES messages_backup(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("replied_to_message_id_null_reason INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("replied_to_rcs_message_id TEXT");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    static String[] d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_message_replies_backup_replied_to_message_id");
        arrayList.add("CREATE INDEX index_message_replies_backup_replied_to_message_id ON message_replies_backup(replied_to_message_id);");
        arrayList.add("DROP INDEX IF EXISTS index_message_replies_backup_replied_to_message_id_null_reason");
        arrayList.add("CREATE INDEX index_message_replies_backup_replied_to_message_id_null_reason ON message_replies_backup(replied_to_message_id_null_reason);");
        arrayList.add("DROP INDEX IF EXISTS index_message_replies_backup_replied_to_rcs_message_id");
        arrayList.add("CREATE INDEX index_message_replies_backup_replied_to_rcs_message_id ON message_replies_backup(replied_to_rcs_message_id);");
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static void e(dtve dtveVar) {
        dtveVar.y(c("message_replies_backup"));
        for (String str : d()) {
            dtveVar.y(str);
        }
    }
}
