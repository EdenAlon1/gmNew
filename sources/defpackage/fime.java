package defpackage;

import android.os.Trace;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fime extends fiml {
    public final fimn a;
    public final ByteBuffer b;
    public boolean c;
    private final UploadDataProvider g = new fimd(this);

    public fime(int i, fimn fimnVar) {
        if (i <= 0) {
            throw new IllegalArgumentException("chunkLength should be greater than 0");
        }
        this.b = ByteBuffer.allocate(i);
        this.a = fimnVar;
    }

    private final void f() {
        if (this.b.hasRemaining()) {
            return;
        }
        new fiev("CronetChunkedOutputStream#uploadBufferInternal");
        try {
            e();
            this.a.a();
            d();
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fiml
    public final UploadDataProvider a() {
        return this.g;
    }

    @Override // defpackage.fiml
    public final boolean c() {
        return true;
    }

    @Override // defpackage.fiml, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        if (this.c) {
            return;
        }
        this.c = true;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        f();
        this.b.put((byte) i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        e();
        if (bArr.length - i < i2 || i < 0 || i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i2;
        while (i3 > 0) {
            int min = Math.min(i3, this.b.remaining());
            this.b.put(bArr, (i + i2) - i3, min);
            i3 -= min;
            f();
        }
    }

    @Override // defpackage.fiml
    public final void b() {
    }
}
