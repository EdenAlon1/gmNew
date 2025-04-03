package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bcqd {
    public static final cfva a = cfvl.q(183258758);
    private static final cskc h = cskc.g("Bugle", "CursorQueryData");
    protected final Uri b;
    protected final String[] c;
    protected final String d;
    protected final String[] e;
    protected final String f;
    protected ContentResolver g;
    private final CancellationSignal i;

    public bcqd(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        this(context, uri, strArr, str, strArr2, str2, null);
    }

    private static void c(ffbr ffbrVar, Exception exc) {
        if (ffbrVar != null) {
            ((cfyt) ffbrVar.b()).b(exc);
        }
    }

    public final Cursor a() {
        return b(null);
    }

    public final Cursor b(ffbr ffbrVar) {
        csix.h();
        if (Uri.EMPTY.equals(this.b)) {
            return null;
        }
        try {
            return this.g.query(this.b, this.c, this.d, this.e, this.f, this.i);
        } catch (SQLiteException e) {
            h.s("ContentResolver query is failed", e);
            c(ffbrVar, e);
            return null;
        } catch (IllegalArgumentException e2) {
            h.s("ContentResolver query is failed", e2);
            c(ffbrVar, e2);
            return null;
        } catch (SecurityException e3) {
            h.s("ContentResolver query is failed", e3);
            if (!((Boolean) a.e()).booleanValue() || (!TextUtils.equals(Build.MODEL, "meizu note9") && !TextUtils.equals(Build.DEVICE, "meizunote9") && !TextUtils.equals(Build.PRODUCT, "meizu_note9"))) {
                throw e3;
            }
            c(ffbrVar, e3);
            return null;
        }
    }

    public bcqd(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        this.b = uri;
        this.c = strArr;
        this.d = str;
        this.e = strArr2;
        this.f = str2;
        this.g = context.getContentResolver();
        this.i = cancellationSignal;
    }
}
