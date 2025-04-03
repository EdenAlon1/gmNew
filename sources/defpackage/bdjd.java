package defpackage;

import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdjd {
    public static final String[] c;
    public static final String[] d;
    private static final String[] f;
    private static final String[] g;
    private final ctfj i;
    public static final Uri a = MediaStore.Files.getContentUri("external");
    public static final Uri b = MediaStore.Files.getContentUri("external");
    public static final String e = e(bdjb.a, new Integer[]{1});
    private static final String h = e(bdjb.c, new Integer[]{1, 3});

    static {
        String[] strArr = {"_id", "_data", "width", "height", "orientation", "mime_type", "date_modified"};
        c = strArr;
        String[] strArr2 = {"_id", "width", "height", "orientation", "mime_type", "date_modified"};
        d = strArr2;
        f = (String[]) enoh.b(strArr, new String[]{"duration"}, String.class);
        g = (String[]) enoh.b(strArr2, new String[]{"duration"}, String.class);
    }

    public bdjd(ctfj ctfjVar) {
        this.i = ctfjVar;
    }

    public static Uri a() {
        return ((Boolean) bdjc.a.e()).booleanValue() ? b : a;
    }

    public static Uri b(Cursor cursor) {
        return ((Boolean) bdjc.a.e()).booleanValue() ? ContentUris.withAppendedId(b, cursor.getLong(cursor.getColumnIndexOrThrow("_id"))) : csuu.h(cursor.getString(cursor.getColumnIndexOrThrow("_data")));
    }

    private static String e(String[] strArr, Integer[] numArr) {
        return "mime_type IN ('" + new emww("','").f(strArr) + "') AND media_type IN (" + emww.d(',').f(numArr) + ")";
    }

    public final String c() {
        return this.i.a() ? h : e;
    }

    public final String[] d() {
        return ((Boolean) bdjc.a.e()).booleanValue() ? this.i.a() ? g : d : this.i.a() ? f : c;
    }
}
