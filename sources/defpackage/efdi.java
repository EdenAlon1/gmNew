package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efdi {
    private final efbm a;
    private final Uri b;

    public efdi(efbm efbmVar, Uri uri) {
        this.a = efbmVar;
        this.b = uri;
    }

    public final long a() {
        return this.a.a(this.b);
    }

    public final void b(InputStream inputStream, long j) {
        long a = this.a.a(this.b);
        if (j > a) {
            throw new IOException(String.format("Invalid resumed download; offsetBytes exceeds the existing data size: %d, %d", Long.valueOf(j), Long.valueOf(a)));
        }
        OutputStream outputStream = (OutputStream) this.a.c(this.b, j > 0 ? new efdn() : new efed());
        try {
            eoej.a(inputStream, outputStream);
            if (outputStream != null) {
                outputStream.close();
            }
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
