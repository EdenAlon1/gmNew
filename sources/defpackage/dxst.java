package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxst implements efbi {
    private final Uri a;

    public dxst(Uri uri) {
        this.a = uri;
    }

    @Override // defpackage.efbi
    public final /* bridge */ /* synthetic */ Object a(efbh efbhVar) {
        efbm efbmVar = efbhVar.a;
        try {
            efdy efdyVar = new efdy();
            efdyVar.a = true;
            ZipInputStream zipInputStream = new ZipInputStream(efdyVar.a(efbhVar));
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry == null) {
                        zipInputStream.close();
                        return null;
                    }
                    Uri build = this.a.buildUpon().appendPath(eeps.a(nextEntry)).build();
                    if (nextEntry.isDirectory()) {
                        efbmVar.d(build);
                    } else {
                        OutputStream outputStream = (OutputStream) efbmVar.c(build, new efed());
                        try {
                            eoej.a(zipInputStream, outputStream);
                            if (outputStream != null) {
                                outputStream.close();
                            }
                        } finally {
                        }
                    }
                } finally {
                }
            }
        } catch (IOException e) {
            efbmVar.j(this.a);
            throw e;
        }
    }
}
