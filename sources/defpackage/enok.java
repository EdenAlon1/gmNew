package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enok extends enoj {
    transient long[] g;
    private transient int h;
    private transient int i;

    public enok() {
        super(3, null);
    }

    private final int q(int i) {
        return (int) (this.g[i] >>> 32);
    }

    private final int r(int i) {
        return (int) this.g[i];
    }

    private final void s(int i, int i2) {
        if (i == -2) {
            this.h = i2;
            i = -2;
        } else {
            long[] jArr = this.g;
            jArr[i] = (jArr[i] & (-4294967296L)) | (i2 & 4294967295L);
        }
        if (i2 == -2) {
            this.i = i;
        } else {
            long[] jArr2 = this.g;
            jArr2[i2] = (4294967295L & jArr2[i2]) | (i << 32);
        }
    }

    @Override // defpackage.enoj
    public final int a() {
        int i = this.h;
        if (i == -2) {
            return -1;
        }
        return i;
    }

    @Override // defpackage.enoj
    public final int e(int i) {
        int r = r(i);
        if (r == -2) {
            return -1;
        }
        return r;
    }

    @Override // defpackage.enoj
    public final void k(int i, Object obj, int i2, int i3) {
        super.k(i, obj, i2, i3);
        s(this.i, i);
        s(i, -2);
    }

    @Override // defpackage.enoj
    public final void l(int i) {
        int i2 = this.c - 1;
        s(q(i), r(i));
        if (i < i2) {
            s(q(i2), i);
            s(i, r(i2));
        }
        super.l(i);
    }

    @Override // defpackage.enoj
    public final void m(int i) {
        super.m(i);
        long[] jArr = this.g;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        this.g = copyOf;
        Arrays.fill(copyOf, length, i, -1L);
    }

    @Override // defpackage.enoj
    public final void o(int i) {
        super.o(i);
        this.h = -2;
        this.i = -2;
        long[] jArr = new long[i];
        this.g = jArr;
        Arrays.fill(jArr, -1L);
    }

    public enok(enoj enojVar) {
        o(enojVar.c);
        int a = enojVar.a();
        while (a != -1) {
            p(enojVar.i(a), enojVar.c(a));
            a = enojVar.e(a);
        }
    }
}
