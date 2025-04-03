package defpackage;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.android.vcard.VCardConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efce implements efef {
    public final efcu a;

    public efce(efcu efcuVar) {
        this.a = efcuVar;
    }

    @Override // defpackage.efef
    public final long a(Uri uri) {
        File a = efcc.a(uri);
        if (a.isDirectory()) {
            return 0L;
        }
        return a.length();
    }

    @Override // defpackage.efef
    public final Pair b(Uri uri) {
        return efca.a(ParcelFileDescriptor.open(efcc.a(uri), VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES));
    }

    @Override // defpackage.efef
    public final efcu c() {
        return this.a;
    }

    @Override // defpackage.efef
    public final File d(Uri uri) {
        return efcc.a(uri);
    }

    @Override // defpackage.efef
    public final InputStream e(Uri uri) {
        File a = efcc.a(uri);
        return new efcz(new FileInputStream(a), a);
    }

    @Override // defpackage.efef
    public final OutputStream f(Uri uri) {
        File a = efcc.a(uri);
        eoeo.a(a);
        return new efda(new FileOutputStream(a, true), a);
    }

    @Override // defpackage.efef
    public final OutputStream g(Uri uri) {
        File a = efcc.a(uri);
        eoeo.a(a);
        return new efda(new FileOutputStream(a), a);
    }

    @Override // defpackage.efef
    public final Iterable h(Uri uri) {
        File a = efcc.a(uri);
        if (!a.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is not a directory", uri));
        }
        File[] listFiles = a.listFiles();
        if (listFiles == null) {
            throw new IOException(String.format("Not a directory or I/O error (unexpected): %s", uri));
        }
        ArrayList arrayList = new ArrayList();
        for (File file : listFiles) {
            String absolutePath = file.getAbsolutePath();
            if (file.isDirectory() && !absolutePath.endsWith("/")) {
                absolutePath = String.valueOf(absolutePath).concat("/");
            }
            Uri.Builder path = new Uri.Builder().scheme("file").authority("").path("/");
            int i = engw.d;
            engr engrVar = new engr();
            path.path(absolutePath);
            arrayList.add(efcb.a(path, engrVar));
        }
        return arrayList;
    }

    @Override // defpackage.efef
    public final String i() {
        return "file";
    }

    @Override // defpackage.efef
    public final void j(Uri uri) {
        if (!efcc.a(uri).mkdirs()) {
            throw new IOException(String.format("%s could not be created", uri));
        }
    }

    @Override // defpackage.efef
    public final void k(Uri uri) {
        File a = efcc.a(uri);
        if (!a.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is not a directory", uri));
        }
        if (!a.delete()) {
            throw new IOException(String.format("%s could not be deleted", uri));
        }
    }

    @Override // defpackage.efef
    public final void l(Uri uri) {
        File a = efcc.a(uri);
        if (a.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (a.delete()) {
            return;
        }
        if (!a.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    @Override // defpackage.efef
    public final void m(Uri uri, Uri uri2) {
        File a = efcc.a(uri);
        File a2 = efcc.a(uri2);
        eoeo.a(a2);
        if (!a.renameTo(a2)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }

    @Override // defpackage.efef
    public final boolean n(Uri uri) {
        return efcc.a(uri).exists();
    }

    @Override // defpackage.efef
    public final boolean o(Uri uri) {
        return efcc.a(uri).isDirectory();
    }

    public efce() {
        this(new efcu());
    }
}
