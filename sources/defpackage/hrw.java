package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hrw {
    public hsd h;
    public long i;
    public boolean j;
    public int k;

    public hrw(long j, hsd hsdVar) {
        int i;
        long j2;
        int numberOfTrailingZeros;
        this.h = hsdVar;
        this.i = j;
        ffji ffjiVar = hsj.a;
        if (j != 0) {
            hsd x = x();
            long[] jArr = x.e;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = x.c;
                if (j3 != 0) {
                    j2 = x.d;
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = x.b;
                    if (j4 != 0) {
                        j2 = x.d + 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = j2 + numberOfTrailingZeros;
            }
            synchronized (hsj.c) {
                hsa hsaVar = hsj.f;
                int i2 = hsaVar.a + 1;
                long[] jArr2 = hsaVar.b;
                int length = jArr2.length;
                if (i2 > length) {
                    int i3 = length + length;
                    long[] jArr3 = new long[i3];
                    int[] iArr = new int[i3];
                    ffdo.m(jArr2, jArr3, 0, 0, jArr2.length);
                    ffdo.p(hsaVar.c, iArr, 0, 0, 14);
                    hsaVar.b = jArr3;
                    hsaVar.c = iArr;
                }
                int i4 = hsaVar.a;
                hsaVar.a = i4 + 1;
                int length2 = hsaVar.d.length;
                if (hsaVar.e >= length2) {
                    int i5 = length2 + length2;
                    int[] iArr2 = new int[i5];
                    int i6 = 0;
                    while (i6 < i5) {
                        int i7 = i6 + 1;
                        iArr2[i6] = i7;
                        i6 = i7;
                    }
                    ffdo.p(hsaVar.d, iArr2, 0, 0, 14);
                    hsaVar.d = iArr2;
                }
                i = hsaVar.e;
                int[] iArr3 = hsaVar.d;
                hsaVar.e = iArr3[i];
                hsaVar.b[i4] = j;
                hsaVar.c[i4] = i;
                iArr3[i] = i4;
                hsaVar.b(i4);
            }
        } else {
            i = -1;
        }
        this.k = i;
    }

    public static final void E(hrw hrwVar) {
        hsj.b.b(hrwVar);
    }

    public void A(hsd hsdVar) {
        this.h = hsdVar;
    }

    public void B(long j) {
        this.i = j;
    }

    public final void C() {
        if (this.j) {
            hih.a("Cannot use a disposed snapshot");
        }
    }

    public final void D() {
        this.j = true;
    }

    public abstract hrw b(ffji ffjiVar);

    public void d() {
        this.j = true;
        synchronized (hsj.c) {
            z();
        }
    }

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public int h() {
        return 0;
    }

    public abstract ffji k();

    public abstract ffji m();

    public void o() {
        hsj.d = hsj.d.b(v());
    }

    public abstract void p(htm htmVar);

    public void r() {
        z();
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract boolean u();

    public long v() {
        return this.i;
    }

    public final hrw w() {
        hrw hrwVar = (hrw) hsj.b.a();
        hsj.b.b(this);
        return hrwVar;
    }

    public hsd x() {
        return this.h;
    }

    public final void y() {
        synchronized (hsj.c) {
            o();
            r();
        }
    }

    public final void z() {
        int i = this.k;
        if (i >= 0) {
            hsj.v(i);
            this.k = -1;
        }
    }
}
