package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bucb extends dtup {
    public static final String[] a = {"message_photos_sharing.message_id", "message_photos_sharing.sharing_state"};
    public static final bubn b;
    public static final int[] c;

    static {
        new enhd().c();
        enhd enhdVar = new enhd();
        enhdVar.k("message_id", "index_message_photos_sharing_message_id");
        enhdVar.c();
        b = new bubn();
        c = new int[]{58320, 58610};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static void b(dtve dtveVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sharing_state BLOB NOT NULL");
        sb.insert(0, "CREATE TABLE message_photos_sharing (");
        sb.append(");");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        if (i >= 58610) {
            arrayList.add("DROP INDEX IF EXISTS index_message_photos_sharing_message_id");
            arrayList.add("CREATE UNIQUE INDEX index_message_photos_sharing_message_id ON message_photos_sharing(message_id);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
