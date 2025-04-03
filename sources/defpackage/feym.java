package defpackage;

import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feym extends feil {
    private final fhmt a;

    public feym(fhmt fhmtVar) {
        this.a = fhmtVar;
    }

    @Override // defpackage.feil, defpackage.fesc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.A();
    }

    @Override // defpackage.fesc
    public final int e() {
        try {
            return this.a.d() & 255;
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }

    @Override // defpackage.fesc
    public final int f() {
        return (int) this.a.b;
    }

    @Override // defpackage.fesc
    public final fesc g(int i) {
        fhmt fhmtVar = new fhmt();
        fhmtVar.id(this.a, i);
        return new feym(fhmtVar);
    }

    @Override // defpackage.fesc
    public final void i(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.fesc
    public final void j(OutputStream outputStream, int i) {
        outputStream.getClass();
        fhmt fhmtVar = this.a;
        long j = i;
        fhmm.b(fhmtVar.b, 0L, j);
        fhnq fhnqVar = fhmtVar.a;
        while (j > 0) {
            fhnqVar.getClass();
            int min = (int) Math.min(j, fhnqVar.c - fhnqVar.b);
            outputStream.write(fhnqVar.a, fhnqVar.b, min);
            int i2 = fhnqVar.b + min;
            fhnqVar.b = i2;
            long j2 = min;
            fhmtVar.b -= j2;
            j -= j2;
            if (i2 == fhnqVar.c) {
                fhnq a = fhnqVar.a();
                fhmtVar.a = a;
                fhnr.b(fhnqVar);
                fhnqVar = a;
            }
        }
    }

    @Override // defpackage.fesc
    public final void k(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int e = this.a.e(bArr, i, i2);
            if (e == -1) {
                throw new IndexOutOfBoundsException(a.f(i2, "EOF trying to read ", " bytes"));
            }
            i2 -= e;
            i += e;
        }
    }

    @Override // defpackage.fesc
    public final void l(int i) {
        try {
            this.a.C(i);
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }
}
