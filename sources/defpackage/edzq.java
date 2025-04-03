package defpackage;

import j$.util.Objects;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
class edzq extends OutputStream {
    private final OutputStream a;

    public edzq(OutputStream outputStream) {
        outputStream.getClass();
        this.a = outputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof edzq) {
            return this == obj || this.a.equals(((edzq) obj).a);
        }
        return false;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.a.flush();
    }

    public final int hashCode() {
        return Objects.hash(edzq.class, this.a);
    }

    public final String toString() {
        return String.format("ForwardingOutputStream { delegate=%s }", this.a);
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.a.write(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.a.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        this.a.write(bArr, i, i2);
    }
}
