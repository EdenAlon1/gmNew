package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fesd extends InputStream implements InputStreamRetargetInterface, feac {
    private final fesc a;

    public fesd(fesc fescVar) {
        fescVar.getClass();
        this.a = fescVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        return ((fekf) this.a).a;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.a.b();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.a.d();
    }

    @Override // java.io.InputStream
    public final int read() {
        fesc fescVar = this.a;
        if (((fekf) fescVar).a == 0) {
            return -1;
        }
        return fescVar.e();
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.a.c();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        int min = (int) Math.min(((fekf) this.a).a, j);
        this.a.l(min);
        return min;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = ((fekf) this.a).a;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i3, i2);
        this.a.k(bArr, i, min);
        return min;
    }
}
