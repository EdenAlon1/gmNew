package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rov extends InputStream implements InputStreamRetargetInterface {
    final /* synthetic */ rox a;
    private final rou b = new rou();

    public rov(rox roxVar) {
        this.a = roxVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.a();
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr) == 0) {
            return -1;
        }
        return bArr[0];
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        long j2;
        byte[] bArr = new byte[(int) Math.min(j, 2048L)];
        synchronized (this.a) {
            j2 = 0;
            while (j2 < j) {
                int read = read(bArr);
                if (read < 0) {
                    break;
                }
                j2 += read;
            }
        }
        return j2;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int b;
        this.b.b();
        synchronized (this.a) {
            this.a.d((byte) 95, i2);
            byte a = this.a.a();
            if (a == 45) {
                b = this.a.b();
                if (b > 0) {
                    if (b <= i2) {
                        this.a.a.readFully(bArr, i, b);
                    } else {
                        throw new rom(a.r(b, i2, "Expected at most ", " bytes, got: "));
                    }
                }
            } else {
                throw new roz(a);
            }
        }
        return b;
    }
}
