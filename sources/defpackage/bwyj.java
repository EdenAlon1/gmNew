package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwyj extends dtup {
    public static final String[] a = {"recent_expressive_stickers.name", "recent_expressive_stickers.content_uri", "recent_expressive_stickers.content_type", "recent_expressive_stickers.width", "recent_expressive_stickers.height", "recent_expressive_stickers.last_used_timestamp"};
    public static final bwxp b;
    public static final int[] c;

    static {
        new enhd().c();
        enhd enhdVar = new enhd();
        enhdVar.k("last_used_timestamp", "index_recent_expressive_stickers_last_used_timestamp");
        enhdVar.c();
        b = new bwxp();
        c = new int[]{22050, 58440};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static void b(dtve dtveVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("name TEXT PRIMARY KEY NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("content_uri TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("content_type TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("width INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("height INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_used_timestamp INT NOT NULL");
        sb.insert(0, "CREATE TABLE recent_expressive_stickers (");
        sb.append(");");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        if (i >= 58440) {
            arrayList.add("DROP INDEX IF EXISTS index_recent_expressive_stickers_last_used_timestamp");
            arrayList.add("CREATE INDEX index_recent_expressive_stickers_last_used_timestamp ON recent_expressive_stickers(last_used_timestamp);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
