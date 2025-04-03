package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhmr extends InputStream implements InputStreamRetargetInterface {
    final /* synthetic */ fhmt a;

    public fhmr(fhmt fhmtVar) {
        this.a = fhmtVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        return (int) Math.min(this.a.b, 2147483647L);
    }

    @Override // java.io.InputStream
    public final int read() {
        fhmt fhmtVar = this.a;
        if (fhmtVar.b > 0) {
            return fhmtVar.d() & 255;
        }
        return -1;
    }

    public final String toString() {
        fhmt fhmtVar = this.a;
        Objects.toString(fhmtVar);
        return fhmtVar.toString().concat(".inputStream()");
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        return this.a.e(bArr, i, i2);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
