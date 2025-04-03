package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhno extends InputStream implements InputStreamRetargetInterface {
    final /* synthetic */ fhnp a;

    public fhno(fhnp fhnpVar) {
        this.a = fhnpVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        fhnp fhnpVar = this.a;
        if (fhnpVar.c) {
            throw new IOException("closed");
        }
        return (int) Math.min(fhnpVar.b.b, 2147483647L);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        fhnp fhnpVar = this.a;
        if (fhnpVar.c) {
            throw new IOException("closed");
        }
        fhmt fhmtVar = fhnpVar.b;
        if (fhmtVar.b == 0 && fhnpVar.a.b(fhmtVar, 8192L) == -1) {
            return -1;
        }
        return this.a.b.d() & 255;
    }

    public final String toString() {
        fhnp fhnpVar = this.a;
        Objects.toString(fhnpVar);
        return fhnpVar.toString().concat(".inputStream()");
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (!this.a.c) {
            fhmm.b(bArr.length, i, i2);
            fhnp fhnpVar = this.a;
            fhmt fhmtVar = fhnpVar.b;
            if (fhmtVar.b == 0 && fhnpVar.a.b(fhmtVar, 8192L) == -1) {
                return -1;
            }
            return this.a.b.e(bArr, i, i2);
        }
        throw new IOException("closed");
    }
}
