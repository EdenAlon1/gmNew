package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbrx extends dtup {
    public static final String[] a = {"message_captions_backup.message_id", "message_captions_backup.caption"};
    public static final enhk b = new enhd().c();
    public static final bbri c;
    public static final int[] d;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("message_id", "index_message_captions_backup_message_id");
        enhdVar.c();
        c = new bbri();
        d = new int[]{140};
    }

    public static dtve a() {
        return dtub.e("backup");
    }

    public static dtzf b() {
        return a().P();
    }

    public static void c(dtve dtveVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER REFERENCES messages_backup(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("caption TEXT");
        sb.insert(0, "CREATE TABLE message_captions_backup (");
        sb.append(");");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_message_captions_backup_message_id");
        arrayList.add("CREATE UNIQUE INDEX index_message_captions_backup_message_id ON message_captions_backup(message_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
