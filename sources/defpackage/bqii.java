package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqii extends dtup {
    public static final String[] a = {"cms_blobs_pending_delete._id", "cms_blobs_pending_delete.message_id", "cms_blobs_pending_delete.blob_id"};
    public static final bqht b;
    public static final int[] c;

    static {
        new enhd().c();
        enhd enhdVar = new enhd();
        enhdVar.k("message_id", "index_cms_blobs_pending_delete_message_id");
        enhdVar.c();
        b = new bqht();
        c = new int[]{44030};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static void b(dtve dtveVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("blob_id TEXT");
        sb.insert(0, "CREATE TABLE cms_blobs_pending_delete (");
        sb.append(");");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_cms_blobs_pending_delete_message_id");
        arrayList.add("CREATE INDEX index_cms_blobs_pending_delete_message_id ON cms_blobs_pending_delete(message_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
