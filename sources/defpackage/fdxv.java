package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdxv implements fdxx {
    @Override // defpackage.fdyt
    public final InputStream a(InputStream inputStream) {
        return new GZIPInputStream(inputStream);
    }

    @Override // defpackage.fdxy
    public final OutputStream b(OutputStream outputStream) {
        return new GZIPOutputStream(outputStream);
    }

    @Override // defpackage.fdxy, defpackage.fdyt
    public final String c() {
        return "gzip";
    }
}
