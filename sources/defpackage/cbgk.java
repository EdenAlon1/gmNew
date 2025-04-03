package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbgk extends cbgg {
    private static final cskc a = cskc.g("Bugle", "MmsFileProvider");

    public static Uri d(Context context) {
        Uri a2 = c(context).a(String.valueOf(context.getApplicationContext().getPackageName()).concat(".shared.datamodel.provider.MmsFileProvider"), null);
        a2.getClass();
        String path = a2.getPath();
        path.getClass();
        File g = g(context, path);
        if (!c(context).k(g)) {
            String absolutePath = g != null ? g.getAbsolutePath() : "null file";
            csjb b = a.b();
            b.I("Failed to create temp file");
            b.I(absolutePath);
            b.r();
        }
        return a2;
    }

    public static File e(Context context, Uri uri) {
        String path;
        if (uri == null || (path = uri.getPath()) == null) {
            return null;
        }
        return g(context, path);
    }

    private static File f(Context context) {
        return new File(context.getCacheDir(), "rawmms");
    }

    private static File g(Context context, String str) {
        File file = new File(f(context), String.valueOf(str).concat(".dat"));
        try {
            if (file.getCanonicalPath().startsWith(f(context).getCanonicalPath())) {
                return file;
            }
            csjb b = a.b();
            b.I("getFile: path");
            b.I(file.getCanonicalPath());
            b.I("does not start with");
            b.I(f(context).getCanonicalPath());
            b.r();
            return null;
        } catch (IOException e) {
            a.o("getCanonicalPath failed.", e);
            return null;
        }
    }

    @Override // defpackage.cbgg
    protected final File a(String str, String str2) {
        Context context = getContext();
        if (context != null) {
            return g(context, str);
        }
        a.n("getFile null context");
        return null;
    }
}
