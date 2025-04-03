package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class cbgi extends cbgg {
    public static final cpn a = new cpn();

    public static Uri d(String str, Context context) {
        return c(context).b(str);
    }

    public static Uri e(Context context, Uri uri) {
        return !TextUtils.equals(uri.getAuthority(), cbgj.a(context)) ? uri : uri.buildUpon().authority(cbgj.b(context)).build();
    }

    public static Uri f(Uri uri, Context context) {
        return h(uri, null, context);
    }

    public static Uri g(InputStream inputStream, Context context) {
        return csuu.e(context, inputStream, c(context).b(null));
    }

    public static Uri h(Uri uri, String str, Context context) {
        return c(context).d(uri, str);
    }

    public static File i(Uri uri, Context context) {
        return c(context).g(uri);
    }

    public static void j(Context context, Uri uri) {
        c(context).j(context, uri);
    }

    public static boolean k(Uri uri, Context context) {
        return c(context).l(uri);
    }

    @Override // defpackage.cbgg
    protected File a(String str, String str2) {
        return b().h(str, str2);
    }

    @Override // defpackage.cbgg, android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String str3;
        if (strArr == null || strArr.length <= 0 || !TextUtils.equals(strArr[0], "_display_name") || !b().l(uri)) {
            return null;
        }
        cpn cpnVar = a;
        synchronized (cpnVar) {
            str3 = (String) cpnVar.get(uri);
        }
        if (TextUtils.isEmpty(str3)) {
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_display_name"});
        matrixCursor.newRow().add(str3);
        return matrixCursor;
    }
}
