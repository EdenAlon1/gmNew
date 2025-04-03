package defpackage;

import java.io.OutputStream;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhms extends OutputStream {
    final /* synthetic */ fhmt a;

    public fhms(fhmt fhmtVar) {
        this.a = fhmtVar;
    }

    public final String toString() {
        fhmt fhmtVar = this.a;
        Objects.toString(fhmtVar);
        return fhmtVar.toString().concat(".outputStream()");
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.a.O(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        this.a.M(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }
}
