package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class muw {
    public final luv a = new luv(32);
    public muv b;
    public muv c;
    public muv d;
    public long e;
    public final mxt f;

    public muw(mxt mxtVar) {
        this.f = mxtVar;
        muv muvVar = new muv(0L);
        this.b = muvVar;
        this.c = muvVar;
        this.d = muvVar;
    }

    public static muv b(muv muvVar, lxz lxzVar, muy muyVar, luv luvVar) {
        if (lxzVar.j()) {
            long j = muyVar.b;
            int i = 1;
            luvVar.G(1);
            muv g = g(muvVar, j, luvVar.a, 1);
            long j2 = j + 1;
            byte b = luvVar.a[0];
            int i2 = b & 128;
            int i3 = b & Byte.MAX_VALUE;
            lxv lxvVar = lxzVar.c;
            byte[] bArr = lxvVar.a;
            if (bArr == null) {
                lxvVar.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z = i2 != 0;
            muvVar = g(g, j2, lxvVar.a, i3);
            long j3 = j2 + i3;
            if (z) {
                luvVar.G(2);
                muvVar = g(muvVar, j3, luvVar.a, 2);
                j3 += 2;
                i = luvVar.n();
            }
            int[] iArr = lxvVar.d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = lxvVar.e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z) {
                int i4 = i * 6;
                luvVar.G(i4);
                muvVar = g(muvVar, j3, luvVar.a, i4);
                j3 += i4;
                luvVar.K(0);
                for (int i5 = 0; i5 < i; i5++) {
                    iArr[i5] = luvVar.n();
                    iArr2[i5] = luvVar.m();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = muyVar.a - ((int) (j3 - muyVar.b));
            }
            ndt ndtVar = muyVar.c;
            int i6 = lvf.a;
            byte[] bArr2 = ndtVar.b;
            byte[] bArr3 = lxvVar.a;
            int i7 = ndtVar.a;
            int i8 = ndtVar.c;
            int i9 = ndtVar.d;
            lxvVar.f = i;
            lxvVar.d = iArr;
            lxvVar.e = iArr2;
            lxvVar.b = bArr2;
            lxvVar.c = i7;
            lxvVar.g = i8;
            lxvVar.h = i9;
            lxvVar.i.numSubSamples = i;
            lxvVar.i.numBytesOfClearData = iArr;
            lxvVar.i.numBytesOfEncryptedData = iArr2;
            lxvVar.i.key = bArr2;
            lxvVar.i.iv = bArr3;
            lxvVar.i.mode = i7;
            lxu lxuVar = lxvVar.j;
            lxuVar.b.set(i8, i9);
            lxuVar.a.setPattern(lxuVar.b);
            long j4 = muyVar.b;
            int i10 = (int) (j3 - j4);
            muyVar.b = j4 + i10;
            muyVar.a -= i10;
        }
        if (!lxzVar.d()) {
            lxzVar.h(muyVar.a);
            return f(muvVar, muyVar.b, lxzVar.d, muyVar.a);
        }
        luvVar.G(4);
        muv g2 = g(muvVar, muyVar.b, luvVar.a, 4);
        int m = luvVar.m();
        muyVar.b += 4;
        muyVar.a -= 4;
        lxzVar.h(m);
        muv f = f(g2, muyVar.b, lxzVar.d, m);
        muyVar.b += m;
        int i11 = muyVar.a - m;
        muyVar.a = i11;
        ByteBuffer byteBuffer = lxzVar.g;
        if (byteBuffer == null || byteBuffer.capacity() < i11) {
            lxzVar.g = ByteBuffer.allocate(i11);
        } else {
            lxzVar.g.clear();
        }
        return f(f, muyVar.b, lxzVar.g, muyVar.a);
    }

    private static muv e(muv muvVar, long j) {
        while (j >= muvVar.b) {
            muvVar = muvVar.d;
        }
        return muvVar;
    }

    private static muv f(muv muvVar, long j, ByteBuffer byteBuffer, int i) {
        muv e = e(muvVar, j);
        while (i > 0) {
            int min = Math.min(i, (int) (e.b - j));
            byteBuffer.put(e.c.a, e.a(j), min);
            i -= min;
            j += min;
            if (j == e.b) {
                e = e.d;
            }
        }
        return e;
    }

    private static muv g(muv muvVar, long j, byte[] bArr, int i) {
        muv e = e(muvVar, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (e.b - j));
            System.arraycopy(e.c.a, e.a(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == e.b) {
                e = e.d;
            }
        }
        return e;
    }

    public final int a(int i) {
        muv muvVar = this.d;
        if (muvVar.c == null) {
            mxn b = this.f.b();
            muv muvVar2 = new muv(this.d.b);
            muvVar.c = b;
            muvVar.d = muvVar2;
        }
        return Math.min(i, (int) (this.d.b - this.e));
    }

    public final void c(long j) {
        muv muvVar;
        if (j != -1) {
            while (true) {
                muvVar = this.b;
                if (j < muvVar.b) {
                    break;
                }
                this.f.c(muvVar.c);
                this.b = this.b.b();
            }
            if (this.c.a < muvVar.a) {
                this.c = muvVar;
            }
        }
    }

    public final void d(int i) {
        long j = this.e + i;
        this.e = j;
        muv muvVar = this.d;
        if (j == muvVar.b) {
            this.d = muvVar.d;
        }
    }
}
