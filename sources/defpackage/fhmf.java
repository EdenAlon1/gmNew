package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhmf extends OutputStream {
    final /* synthetic */ long a;
    final /* synthetic */ fhmu b;
    final /* synthetic */ fhmg c;
    private long d;

    public fhmf(fhmg fhmgVar, long j, fhmu fhmuVar) {
        this.a = j;
        this.b = fhmuVar;
        this.c = fhmgVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.f = true;
        long j = this.a;
        if (j == -1 || this.d >= j) {
            this.b.close();
            return;
        }
        throw new ProtocolException("expected " + j + " bytes but received " + this.d);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        if (this.c.f) {
            return;
        }
        this.b.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (this.c.f) {
            throw new IOException("closed");
        }
        long j = i2;
        long j2 = this.a;
        if (j2 == -1 || this.d + j <= j2) {
            this.d += j;
            try {
                this.b.M(bArr, i, i2);
                return;
            } catch (InterruptedIOException e) {
                throw new SocketTimeoutException(e.getMessage());
            }
        }
        throw new ProtocolException("expected " + j2 + " bytes but received " + this.d + i2);
    }
}
