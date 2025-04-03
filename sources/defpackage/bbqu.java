package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbqu extends dtup {
    public static final String[] a = {"link_preview_backup._id", "link_preview_backup.message_id", "link_preview_backup.trigger_url", "link_preview_backup.expiration_time_millis", "link_preview_backup.link_title", "link_preview_backup.link_description", "link_preview_backup.link_image_url", "link_preview_backup.link_domain", "link_preview_backup.link_canonical_url"};
    public static final bbpy b;
    public static final int[] c;

    static {
        new enhd().c();
        new enhd().c();
        b = new bbpy();
        c = new int[]{120};
    }

    public static dtve a() {
        return dtub.e("backup");
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
        sb.append("message_id INTEGER NOT NULL UNIQUE ON CONFLICT FAIL REFERENCES messages_backup(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("trigger_url TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("expiration_time_millis INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("link_title TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("link_description TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("link_image_url TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("link_domain TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("link_canonical_url TEXT");
        sb.insert(0, "CREATE TABLE link_preview_backup (");
        sb.append(");");
        dtveVar.y(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
