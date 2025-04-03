package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxad extends dtup {
    public static final String[] a = {"recent_gifs.original_image_url", "recent_gifs.content_uri", "recent_gifs.domain", "recent_gifs.image_search_url", "recent_gifs.width", "recent_gifs.height", "recent_gifs.last_used_timestamp"};
    public static final bwzg b;
    public static final int[] c;

    static {
        new enhd().c();
        enhd enhdVar = new enhd();
        enhdVar.k("last_used_timestamp", "index_recent_gifs_last_used_timestamp");
        enhdVar.c();
        b = new bwzg();
        c = new int[]{22010, 58520};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static void b(dtve dtveVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("original_image_url TEXT PRIMARY KEY NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("content_uri TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("domain TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("image_search_url TEXT NOT NULL");
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
        sb.insert(0, "CREATE TABLE recent_gifs (");
        sb.append(");");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        if (i >= 58520) {
            arrayList.add("DROP INDEX IF EXISTS index_recent_gifs_last_used_timestamp");
            arrayList.add("CREATE INDEX index_recent_gifs_last_used_timestamp ON recent_gifs(last_used_timestamp);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
