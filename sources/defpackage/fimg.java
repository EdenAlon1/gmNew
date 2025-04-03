package defpackage;

import android.os.Trace;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fimg extends fiml {
    public final fimn a;
    public final long b;
    public final ByteBuffer c;
    private final UploadDataProvider g = new fimf(this);
    private long h;

    public fimg(long j, fimn fimnVar) {
        if (j < 0) {
            throw new IllegalArgumentException("Content length must be larger than 0 for non-chunked upload.");
        }
        this.b = j;
        this.c = ByteBuffer.allocate((int) Math.min(j, 16384L));
        this.a = fimnVar;
        this.h = 0L;
    }

    private final void f(int i) {
        long j = this.h + i;
        long j2 = this.b;
        if (j <= j2) {
            return;
        }
        throw new ProtocolException("expected " + (j2 - this.h) + " bytes but received " + i);
    }

    private final void g() {
        if (this.c.hasRemaining()) {
            return;
        }
        h();
    }

    private final void h() {
        new fiev("CronetFixedModeOutputStream#uploadBufferInternal");
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

    private final void i() {
        if (this.h == this.b) {
            h();
        }
    }

    @Override // defpackage.fiml
    public final UploadDataProvider a() {
        return this.g;
    }

    @Override // defpackage.fiml
    public final void b() {
        if (this.h < this.b) {
            throw new ProtocolException("Content received is less than Content-Length.");
        }
    }

    @Override // defpackage.fiml
    public final boolean c() {
        return true;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        e();
        f(1);
        g();
        this.c.put((byte) i);
        this.h++;
        i();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        e();
        if (bArr.length - i >= i2 && i >= 0 && i2 >= 0) {
            f(i2);
            int i3 = i2;
            while (i3 > 0) {
                g();
                int min = Math.min(i3, this.c.remaining());
                this.c.put(bArr, (i + i2) - i3, min);
                i3 -= min;
            }
            this.h += i2;
            i();
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
