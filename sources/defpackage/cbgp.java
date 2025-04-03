package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import j$.util.Optional;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbgp extends cbgg {
    private static final cskc a = cskc.g("Bugle", "RbmBusinessInfoFileProvider");

    /* compiled from: PG */
    public interface a {
        cqoh v();
    }

    static final File d(Context context) {
        File file = new File(context.getFilesDir(), "rbm");
        if (file.exists()) {
            return file;
        }
        cskc cskcVar = a;
        csjb a2 = cskcVar.a();
        a2.I("RBM Business file directory does not exist. Creating...");
        a2.r();
        synchronized (cbgp.class) {
            if (!file.exists() && !file.mkdirs()) {
                cskcVar.n("Could not make RBM Business file directory");
            }
        }
        return file;
    }

    public static final Optional e(Context context, String str, cbgo cbgoVar, Uri uri) {
        File file = new File(d(context), f(str, cbgoVar));
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    FileInputStream fileInputStream = new FileInputStream(cbgi.i(uri, context));
                    try {
                        cskc cskcVar = a;
                        csjb c = cskcVar.c();
                        c.I("Copying RBM file");
                        c.A("file", file);
                        c.A("file name", str);
                        c.A("media type", cbgoVar);
                        c.r();
                        eoej.a(fileInputStream, fileOutputStream);
                        Uri build = new Uri.Builder().authority("com.google.android.apps.messaging.shared.datamodel.provider.RbmBusinessInfoFileProvider").scheme("content").appendPath(f(str, cbgoVar)).appendQueryParameter("t", String.valueOf(((a) ekhw.a(context, a.class)).v().f().toEpochMilli())).build();
                        csjb a2 = cskcVar.a();
                        a2.M("built file uri for RBM Business", build.toString());
                        a2.r();
                        Optional of = Optional.of(build);
                        fileInputStream.close();
                        fileOutputStream.close();
                        csjb c2 = cskcVar.c();
                        c2.I("Deleting provided temporary file");
                        c2.A("media type", cbgoVar);
                        c2.r();
                        cbgi.j(context, uri);
                        return of;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Exception e) {
                cskc cskcVar2 = a;
                csjb e2 = cskcVar2.e();
                e2.I("Unable to copy RBM file");
                e2.A("name", str);
                e2.A("file type", cbgoVar);
                e2.s(e);
                csjb c3 = cskcVar2.c();
                c3.I("Deleting provided temporary file");
                c3.A("media type", cbgoVar);
                c3.r();
                cbgi.j(context, uri);
                return Optional.empty();
            }
        } catch (Throwable th3) {
            csjb c4 = a.c();
            c4.I("Deleting provided temporary file");
            c4.A("media type", cbgoVar);
            c4.r();
            cbgi.j(context, uri);
            throw th3;
        }
    }

    private static String f(String str, cbgo cbgoVar) {
        return String.valueOf(cbgoVar) + "_" + str;
    }

    @Override // defpackage.cbgg
    protected final File a(String str, String str2) {
        Context context = getContext();
        if (context == null) {
            a.n("Context was null when retrieving file");
            return null;
        }
        File d = d(context);
        if (!TextUtils.isEmpty(str2)) {
            str = defpackage.a.w(str2, str, ".");
        }
        cskc cskcVar = a;
        csjb a2 = cskcVar.a();
        a2.A("file name", str);
        a2.r();
        File file = new File(d, str);
        try {
            if (file.getCanonicalPath().startsWith(d.getCanonicalPath())) {
                return file;
            }
            csjb b = cskcVar.b();
            b.I("getFile: path");
            b.I(file.getCanonicalPath());
            b.I("does not start with");
            b.I(d.getCanonicalPath());
            b.r();
            return null;
        } catch (IOException e) {
            a.o("File#getCanonicalPath failed", e);
            return null;
        }
    }

    @Override // defpackage.cbgg, android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        String path = uri.getPath();
        path.getClass();
        File a2 = a(path, "");
        if (a2 != null) {
            return ParcelFileDescriptor.open(a2, csum.a(str));
        }
        throw new FileNotFoundException();
    }
}
