package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqpw extends dtup {
    public static final String[] a = {"cms_media_notifications._id", "cms_media_notifications.message_cms_id", "cms_media_notifications.blob_id", "cms_media_notifications.blob_type"};
    public static final bqpg b;
    public static final int[] c;

    static {
        new enhd().c();
        enhd enhdVar = new enhd();
        enhdVar.k("message_cms_id", "index_cms_media_notifications_message_cms_id");
        enhdVar.c();
        b = new bqpg();
        c = new int[]{45010};
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
        sb.append("message_cms_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("blob_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("blob_type INT");
        sb.insert(0, "CREATE TABLE cms_media_notifications (");
        sb.append(");");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_cms_media_notifications_message_cms_id");
        arrayList.add("CREATE INDEX index_cms_media_notifications_message_cms_id ON cms_media_notifications(message_cms_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
