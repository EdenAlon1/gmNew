package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbar {
    private static final cskc a = cskc.g("Bugle", "ScratchUtil");
    private static final Object b = new Object();
    private final Context c;
    private final cbap d;

    public cbar(Context context, cbap cbapVar) {
        this.c = context;
        this.d = cbapVar;
    }

    public final Uri a(String str, String str2) {
        long abs = Math.abs(this.d.a.nextLong());
        Uri.Builder scheme = new Uri.Builder().authority(str).scheme("content");
        scheme.appendPath(String.valueOf(abs));
        if (!TextUtils.isEmpty(str2)) {
            scheme.appendQueryParameter("ext", str2);
        }
        return scheme.build();
    }

    public final Uri b(String str) {
        Uri a2 = a(cbgj.a(this.c), str);
        String path = a2.getPath();
        if (path != null && k(h(path, str))) {
            return a2;
        }
        csjb b2 = a.b();
        b2.I("Failed to create temp file");
        b2.I(path);
        b2.r();
        return null;
    }

    public final Uri c(Uri uri) {
        return d(uri, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Uri d(android.net.Uri r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "error trying to close the inputStream."
            r1 = 0
            boolean r2 = defpackage.csuu.w(r5)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            if (r2 == 0) goto L14
            android.content.Context r2 = r4.c     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            java.io.InputStream r5 = r2.openInputStream(r5)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            goto L30
        L14:
            r2 = 8962(0x2302, float:1.2558E-41)
            android.net.TrafficStats.setThreadStatsTag(r2)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            java.net.URLConnection r5 = r2.openConnection()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            java.io.InputStream r5 = r5.getInputStream()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            r5 = r2
        L30:
            if (r5 == 0) goto L59
            android.net.Uri r1 = r4.e(r5, r6)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L5d
            r5.close()     // Catch: java.io.IOException -> L3a
            goto L59
        L3a:
            r5 = move-exception
            cskc r6 = defpackage.cbar.a
            goto L56
        L3e:
            r6 = move-exception
            goto L46
        L40:
            r5 = move-exception
            r6 = r5
            goto L5f
        L43:
            r5 = move-exception
            r6 = r5
            r5 = r1
        L46:
            cskc r2 = defpackage.cbar.a     // Catch: java.lang.Throwable -> L5d
            java.lang.String r3 = "Error while retrieving media."
            r2.s(r3, r6)     // Catch: java.lang.Throwable -> L5d
            if (r5 == 0) goto L59
            r5.close()     // Catch: java.io.IOException -> L53
            goto L59
        L53:
            r5 = move-exception
            cskc r6 = defpackage.cbar.a
        L56:
            r6.o(r0, r5)
        L59:
            android.net.TrafficStats.clearThreadStatsTag()
            return r1
        L5d:
            r6 = move-exception
            r1 = r5
        L5f:
            if (r1 == 0) goto L6b
            r1.close()     // Catch: java.io.IOException -> L65
            goto L6b
        L65:
            r5 = move-exception
            cskc r1 = defpackage.cbar.a
            r1.o(r0, r5)
        L6b:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbar.d(android.net.Uri, java.lang.String):android.net.Uri");
    }

    public final Uri e(InputStream inputStream, String str) {
        Uri b2 = b(str);
        if (b2 == null) {
            return null;
        }
        return csuu.e(this.c, inputStream, b2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cbaq f(android.net.Uri r5, java.lang.String r6, defpackage.eepm r7) {
        /*
            r4 = this;
            java.lang.String r0 = "error trying to close the inputStream."
            r1 = 0
            boolean r2 = defpackage.csuu.w(r5)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            if (r2 == 0) goto L10
            android.content.Context r2 = r4.c     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            java.io.InputStream r5 = defpackage.eepn.b(r2, r5, r7)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            goto L18
        L10:
            cskc r5 = defpackage.cbar.a     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            java.lang.String r7 = "Cannot retrieve non-local resource."
            r5.r(r7)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            r5 = r1
        L18:
            if (r5 == 0) goto L4e
            int r7 = r5.available()     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L52
            long r2 = (long) r7     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L52
            android.net.Uri r6 = r4.e(r5, r6)     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L52
            if (r6 == 0) goto L2b
            cbaq r7 = new cbaq     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L52
            r7.<init>(r6, r2)     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L52
            r1 = r7
        L2b:
            r5.close()     // Catch: java.io.IOException -> L2f
            goto L4e
        L2f:
            r5 = move-exception
            cskc r6 = defpackage.cbar.a
            goto L4b
        L33:
            r6 = move-exception
            goto L3b
        L35:
            r5 = move-exception
            r6 = r5
            goto L54
        L38:
            r5 = move-exception
            r6 = r5
            r5 = r1
        L3b:
            cskc r7 = defpackage.cbar.a     // Catch: java.lang.Throwable -> L52
            java.lang.String r2 = "Error while retrieving media."
            r7.s(r2, r6)     // Catch: java.lang.Throwable -> L52
            if (r5 == 0) goto L4e
            r5.close()     // Catch: java.io.IOException -> L48
            goto L4e
        L48:
            r5 = move-exception
            cskc r6 = defpackage.cbar.a
        L4b:
            r6.o(r0, r5)
        L4e:
            android.net.TrafficStats.clearThreadStatsTag()
            return r1
        L52:
            r6 = move-exception
            r1 = r5
        L54:
            if (r1 == 0) goto L60
            r1.close()     // Catch: java.io.IOException -> L5a
            goto L60
        L5a:
            r5 = move-exception
            cskc r7 = defpackage.cbar.a
            r7.o(r0, r5)
        L60:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbar.f(android.net.Uri, java.lang.String, eepm):cbaq");
    }

    public final File g(Uri uri) {
        if (uri != null) {
            String path = !l(uri) ? null : uri.getPath();
            if (path != null) {
                return h(path, i(uri));
            }
        }
        return null;
    }

    public final File h(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            str = a.w(str2, str, ".");
        }
        File file = new File(this.c.getCacheDir(), "mediascratchspace");
        File file2 = new File(file, str);
        try {
            if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
                return file2;
            }
            csjb b2 = a.b();
            b2.I("getFileWithExtension: path");
            b2.I(file2.getCanonicalPath());
            b2.I("does not start with");
            b2.I(file.getCanonicalPath());
            b2.r();
            return null;
        } catch (IOException e) {
            a.o("getCanonicalPath failed.", e);
            return null;
        }
    }

    public final String i(Uri uri) {
        return uri.getQueryParameter("ext");
    }

    public final void j(Context context, Uri uri) {
        enrr i = a.i();
        i.aa(ensy.LARGE);
        ((enrr) i.h("com/google/android/apps/messaging/shared/datamodel/media/cache/ScratchUtil", "deleteContent", 396, "ScratchUtil.java")).t("Deleting content from scratch directory: %s", uri);
        if (uri == null || !l(uri)) {
            return;
        }
        context.getContentResolver().delete(uri, null, null);
    }

    public final boolean k(File file) {
        File parentFile;
        if (file == null) {
            return false;
        }
        boolean z = true;
        if (file.exists()) {
            return true;
        }
        try {
            parentFile = file.getParentFile();
        } catch (IOException unused) {
        }
        if (parentFile != null && !parentFile.exists()) {
            synchronized (b) {
                if (!parentFile.exists() && !parentFile.mkdirs()) {
                    z = false;
                }
            }
            if (z) {
                return file.createNewFile();
            }
            return false;
        }
        return file.createNewFile();
    }

    public final boolean l(Uri uri) {
        if (uri == null) {
            return false;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (TextUtils.equals(uri.getScheme(), "content")) {
            Context context = this.c;
            if ((TextUtils.equals(uri.getAuthority(), cbgj.b(context)) || TextUtils.equals(uri.getAuthority(), cbgj.a(context))) && pathSegments.size() == 1 && csum.g(pathSegments.get(0))) {
                return true;
            }
        }
        return false;
    }
}
