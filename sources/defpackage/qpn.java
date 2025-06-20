package defpackage;

import java.io.ByteArrayOutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qpn extends ByteArrayOutputStream {
    private final qpc a;

    public qpn(qpc qpcVar, int i) {
        this.a = qpcVar;
        this.buf = qpcVar.b(Math.max(i, 256));
    }

    private final void a(int i) {
        if (this.count + i <= this.buf.length) {
            return;
        }
        qpc qpcVar = this.a;
        int i2 = this.count + i;
        byte[] b = qpcVar.b(i2 + i2);
        System.arraycopy(this.buf, 0, b, 0, this.count);
        this.a.a(this.buf);
        this.buf = b;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.a(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.a.a(this.buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        a(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        a(i2);
        super.write(bArr, i, i2);
    }
}
