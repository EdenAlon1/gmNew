package defpackage;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fese extends feil {
    int a;
    final int b;
    final byte[] c;
    int d = -1;

    public fese(byte[] bArr, int i, int i2) {
        emxf.b(i >= 0, "offset must be >= 0");
        emxf.b(i2 >= 0, "length must be >= 0");
        int i3 = i2 + i;
        emxf.b(i3 <= 0, "offset + length exceeds array boundary");
        this.c = bArr;
        this.a = i;
        this.b = i3;
    }

    @Override // defpackage.feil, defpackage.fesc
    public final void b() {
        this.d = this.a;
    }

    @Override // defpackage.feil, defpackage.fesc
    public final void c() {
        int i = this.d;
        if (i == -1) {
            throw new InvalidMarkException();
        }
        this.a = i;
    }

    @Override // defpackage.feil, defpackage.fesc
    public final boolean d() {
        return true;
    }

    @Override // defpackage.fesc
    public final int e() {
        a(1);
        int i = this.a;
        this.a = i + 1;
        return this.c[i] & 255;
    }

    @Override // defpackage.fesc
    public final int f() {
        return this.b - this.a;
    }

    @Override // defpackage.fesc
    public final /* bridge */ /* synthetic */ fesc g(int i) {
        a(i);
        int i2 = this.a;
        this.a = i2 + i;
        return new fese(this.c, i2, i);
    }

    @Override // defpackage.fesc
    public final void i(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int remaining = byteBuffer.remaining();
        a(remaining);
        byteBuffer.put(this.c, this.a, remaining);
        this.a += remaining;
    }

    @Override // defpackage.fesc
    public final void j(OutputStream outputStream, int i) {
        a(i);
        outputStream.write(this.c, this.a, i);
        this.a += i;
    }

    @Override // defpackage.fesc
    public final void k(byte[] bArr, int i, int i2) {
        System.arraycopy(this.c, this.a, bArr, i, i2);
        this.a += i2;
    }

    @Override // defpackage.fesc
    public final void l(int i) {
        a(i);
        this.a += i;
    }
}
