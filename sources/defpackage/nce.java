package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nce implements ncp {
    public final long a;
    public long b;
    public int d;
    public int e;
    private final lpp g;
    public byte[] c = new byte[65536];
    private final byte[] f = new byte[4096];

    static {
        lqx.b("media3.extractor");
    }

    public nce(lpp lppVar, long j, long j2) {
        this.g = lppVar;
        this.b = j;
        this.a = j2;
    }

    private final int p(byte[] bArr, int i, int i2) {
        int i3 = this.e;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.c, 0, bArr, i, min);
        s(min);
        return min;
    }

    private final int q(int i) {
        int min = Math.min(this.e, i);
        s(min);
        return min;
    }

    private final void r(int i) {
        if (i != -1) {
            this.b += i;
        }
    }

    private final void s(int i) {
        int i2 = this.e - i;
        this.e = i2;
        this.d = 0;
        byte[] bArr = this.c;
        byte[] bArr2 = i2 < bArr.length + (-524288) ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.c = bArr2;
    }

    @Override // defpackage.ncp, defpackage.lpp
    public final int a(byte[] bArr, int i, int i2) {
        int p = p(bArr, i, i2);
        if (p == 0) {
            p = b(bArr, i, i2, 0, true);
        }
        r(p);
        return p;
    }

    public final int b(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int a = this.g.a(bArr, i + i3, i2 - i3);
        if (a != -1) {
            return i3 + a;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.ncp
    public final int c(int i) {
        int q = q(i);
        if (q == 0) {
            q = b(this.f, 0, Math.min(i, 4096), 0, true);
        }
        r(q);
        return q;
    }

    @Override // defpackage.ncp
    public final long d() {
        return this.a;
    }

    @Override // defpackage.ncp
    public final long e() {
        return this.b + this.d;
    }

    @Override // defpackage.ncp
    public final long f() {
        return this.b;
    }

    @Override // defpackage.ncp
    public final void g(int i) {
        m(i, false);
    }

    public final void h(int i) {
        int i2 = this.d + i;
        int length = this.c.length;
        if (i2 > length) {
            this.c = Arrays.copyOf(this.c, lvf.d(length + length, 65536 + i2, i2 + 524288));
        }
    }

    @Override // defpackage.ncp
    public final void i(byte[] bArr, int i, int i2) {
        n(bArr, i, i2, false);
    }

    @Override // defpackage.ncp
    public final void j(byte[] bArr, int i, int i2) {
        o(bArr, i, i2, false);
    }

    @Override // defpackage.ncp
    public final void k() {
        this.d = 0;
    }

    @Override // defpackage.ncp
    public final void l(int i) {
        int q = q(i);
        while (q < i && q != -1) {
            q = b(this.f, -q, Math.min(i, q + 4096), q, false);
        }
        r(q);
    }

    public final boolean m(int i, boolean z) {
        h(i);
        int i2 = this.e - this.d;
        while (i2 < i) {
            int i3 = i;
            boolean z2 = z;
            i2 = b(this.c, this.d, i3, i2, z2);
            if (i2 == -1) {
                return false;
            }
            this.e = this.d + i2;
            i = i3;
            z = z2;
        }
        this.d += i;
        return true;
    }

    @Override // defpackage.ncp
    public final boolean n(byte[] bArr, int i, int i2, boolean z) {
        if (!m(i2, z)) {
            return false;
        }
        System.arraycopy(this.c, this.d - i2, bArr, i, i2);
        return true;
    }

    @Override // defpackage.ncp
    public final boolean o(byte[] bArr, int i, int i2, boolean z) {
        int p = p(bArr, i, i2);
        while (p < i2 && p != -1) {
            p = b(bArr, i, i2, p, z);
        }
        r(p);
        return p != -1;
    }
}
