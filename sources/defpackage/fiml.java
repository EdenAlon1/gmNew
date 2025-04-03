package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import org.chromium.net.UploadDataProvider;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fiml extends OutputStream {
    public IOException d;
    public boolean e;
    public boolean f;

    public abstract UploadDataProvider a();

    public abstract void b();

    public abstract boolean c();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.e = true;
    }

    protected final void d() {
        IOException iOException = this.d;
        if (iOException != null) {
            throw iOException;
        }
    }

    protected final void e() {
        if (this.f) {
            d();
            throw new IOException("Writing after request completed.");
        }
        if (this.e) {
            throw new IOException("Stream has been closed.");
        }
    }
}
