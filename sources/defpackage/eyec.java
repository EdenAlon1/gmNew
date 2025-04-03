package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes5.dex */
class eyec extends eyeb {
    private static final long serialVersionUID = 1;
    protected final byte[] a;

    public eyec(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.eyee
    public byte a(int i) {
        return this.a[i];
    }

    @Override // defpackage.eyee
    public byte b(int i) {
        return this.a[i];
    }

    protected int c() {
        return 0;
    }

    @Override // defpackage.eyee
    public int d() {
        return this.a.length;
    }

    @Override // defpackage.eyee
    protected void e(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, i, bArr, i2, i3);
    }

    @Override // defpackage.eyee
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eyee) || d() != ((eyee) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (!(obj instanceof eyec)) {
            return obj.equals(this);
        }
        eyec eyecVar = (eyec) obj;
        int i = this.c;
        int i2 = eyecVar.c;
        if (i == 0 || i2 == 0 || i == i2) {
            return g(eyecVar, 0, d());
        }
        return false;
    }

    @Override // defpackage.eyeb
    public final boolean g(eyee eyeeVar, int i, int i2) {
        if (i2 > eyeeVar.d()) {
            throw new IllegalArgumentException("Length too large: " + i2 + d());
        }
        int i3 = i + i2;
        if (i3 > eyeeVar.d()) {
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + eyeeVar.d());
        }
        if (!(eyeeVar instanceof eyec)) {
            return eyeeVar.k(i, i3).equals(k(0, i2));
        }
        eyec eyecVar = (eyec) eyeeVar;
        byte[] bArr = this.a;
        byte[] bArr2 = eyecVar.a;
        int c = c() + i2;
        int c2 = c();
        int c3 = eyecVar.c() + i;
        while (c2 < c) {
            if (bArr[c2] != bArr2[c3]) {
                return false;
            }
            c2++;
            c3++;
        }
        return true;
    }

    @Override // defpackage.eyee
    protected final int i(int i, int i2, int i3) {
        return eygs.c(i, this.a, c() + i2, i3);
    }

    @Override // defpackage.eyee
    protected final int j(int i, int i2, int i3) {
        int c = c() + i2;
        return eyjo.a.a(i, this.a, c, i3 + c);
    }

    @Override // defpackage.eyee
    public final eyee k(int i, int i2) {
        int s = s(i, i2, d());
        return s == 0 ? eyee.b : new eydy(this.a, c() + i, s);
    }

    @Override // defpackage.eyee
    public final eyel l() {
        return eyel.R(this.a, c(), d());
    }

    @Override // defpackage.eyee
    public final InputStream m() {
        return new ByteArrayInputStream(this.a, c(), d());
    }

    @Override // defpackage.eyee
    protected final String n(Charset charset) {
        return new String(this.a, c(), d(), charset);
    }

    @Override // defpackage.eyee
    public final ByteBuffer o() {
        return ByteBuffer.wrap(this.a, c(), d()).asReadOnlyBuffer();
    }

    @Override // defpackage.eyee
    public final void p(eydv eydvVar) {
        eydvVar.a(this.a, c(), d());
    }

    @Override // defpackage.eyee
    public final void q(OutputStream outputStream) {
        outputStream.write(I());
    }

    @Override // defpackage.eyee
    public final boolean r() {
        int c = c();
        return eyjo.h(this.a, c, d() + c);
    }
}
