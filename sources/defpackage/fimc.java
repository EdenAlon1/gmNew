package defpackage;

import java.net.ProtocolException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fimc extends fiml {
    public final int a;
    public ByteBuffer b;
    public boolean c;
    private final fimi g;
    private final UploadDataProvider h;
    private boolean i;

    public fimc(fimi fimiVar) {
        this.h = new fimb(this);
        this.g = fimiVar;
        this.a = -1;
        this.b = ByteBuffer.allocate(16384);
    }

    private final void f(int i) {
        if (this.a != -1) {
            int position = this.b.position() + i;
            int i2 = this.a;
            if (position > i2) {
                throw new ProtocolException(a.f(i2, "exceeded content-length limit of ", " bytes"));
            }
        }
        if (this.a == -1 && this.b.limit() - this.b.position() <= i) {
            int capacity = this.b.capacity();
            ByteBuffer allocate = ByteBuffer.allocate(Math.max(capacity + capacity, this.b.capacity() + i));
            allocate.put(this.b);
            this.b = allocate;
        }
    }

    @Override // defpackage.fiml
    public final UploadDataProvider a() {
        return this.h;
    }

    @Override // defpackage.fiml
    public final boolean c() {
        if (!this.e) {
            this.i = true;
            return false;
        }
        this.c = true;
        if (this.b.position() < this.a) {
            throw new ProtocolException("Content received is less than Content-Length");
        }
        return true;
    }

    @Override // defpackage.fiml, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        if (this.i) {
            this.g.connect();
            this.i = false;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        e();
        f(1);
        this.b.put((byte) i);
    }

    public fimc(fimi fimiVar, long j) {
        this.h = new fimb(this);
        if (j > 2147483647L) {
            throw new IllegalArgumentException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2GB.");
        }
        if (j >= 0) {
            this.g = fimiVar;
            int i = (int) j;
            this.a = i;
            this.b = ByteBuffer.allocate(i);
            return;
        }
        throw new IllegalArgumentException("Content length < 0.");
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        e();
        f(i2);
        this.b.put(bArr, i, i2);
    }

    @Override // defpackage.fiml
    public final void b() {
    }
}
