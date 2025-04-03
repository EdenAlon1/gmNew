package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbgq extends cbgg {
    public static final cskc a = cskc.g("Bugle", "VerifiedSmsBrandLogoFileProvider");

    /* compiled from: PG */
    public interface a {
        cqoh v();
    }

    public static final File d(Context context) {
        File file = new File(context.getFilesDir(), "verified-sms");
        if (!file.exists()) {
            cskc cskcVar = a;
            cskcVar.m("Verified SMS directory does not exist. Creating...");
            if (!file.mkdirs()) {
                cskcVar.n("Could not make Verified SMS file directory");
            }
        }
        return file;
    }

    @Override // defpackage.cbgg
    protected final File a(String str, String str2) {
        Context context = getContext();
        if (context == null) {
            a.r("context was null");
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
            csjb b2 = a.b();
            b2.I("File#getCanonicalPath failed");
            b2.s(e);
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
