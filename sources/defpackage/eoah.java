package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eoah {
    public boolean a = false;
    public enyr b = enxw.e;
    public enxz c;
    public int[] d;
    public int e;
    private final enyb f;

    public eoah() {
        long i = enxz.i(0);
        this.c = new enxz((i - Long.lowestOneBit(i)) + enxz.m(30));
        this.f = new enyb();
        this.d = new int[8];
        a(enyr.m(enzn.i(0, -1.0d, -1.0d)));
    }

    public final void a(enyr enyrVar) {
        this.f.b(this.b, enyrVar);
        this.b = enyrVar;
    }

    public final void b(int i, enyr enyrVar, enyr enyrVar2) {
        enyb enybVar = this.f;
        if (enybVar.a != enyrVar) {
            enybVar.c(enyrVar);
        }
        if (enybVar.d(enyrVar2)) {
            c(i);
        }
    }

    public final void c(int i) {
        int i2 = this.e;
        int i3 = 0;
        if (i2 == 0) {
            this.d[0] = i;
            this.e = 1;
            return;
        }
        int[] iArr = this.d;
        if (iArr[0] == i) {
            int i4 = i2 - 1;
            this.e = i4;
            if (i2 > 1) {
                System.arraycopy(iArr, 1, iArr, 0, i4);
                return;
            }
            return;
        }
        while (true) {
            int i5 = i3 + 1;
            int[] iArr2 = this.d;
            int i6 = iArr2[i3];
            if (i6 >= i) {
                if (i6 == i) {
                    int i7 = this.e - 1;
                    this.e = i7;
                    System.arraycopy(iArr2, i5, iArr2, i3, i7 - i3);
                    return;
                } else {
                    System.arraycopy(iArr2, i3, iArr2, i5, this.e - i3);
                    this.d[i3] = i;
                    this.e++;
                    return;
                }
            }
            int i8 = this.e;
            if (i5 == i8) {
                this.e = i8 + 1;
                iArr2[i8] = i;
                return;
            }
            i3 = i5;
        }
    }
}
