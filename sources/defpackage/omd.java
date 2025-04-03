package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class omd {
    public final int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    final /* synthetic */ ome j;

    public omd(ome omeVar, int i, int i2) {
        this.j = omeVar;
        this.a = i;
        this.b = i2;
        b();
    }

    final int a() {
        return ((this.e - this.d) + 1) * ((this.g - this.f) + 1) * ((this.i - this.h) + 1);
    }

    final void b() {
        int i = 0;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MAX_VALUE;
        int i7 = Integer.MIN_VALUE;
        for (int i8 = this.a; i8 <= this.b; i8++) {
            ome omeVar = this.j;
            int[] iArr = omeVar.a;
            int[] iArr2 = omeVar.b;
            int i9 = iArr[i8];
            i += iArr2[i9];
            int d = ome.d(i9);
            int c = ome.c(i9);
            int b = ome.b(i9);
            if (d > i2) {
                i2 = d;
            }
            if (d < i4) {
                i4 = d;
            }
            if (c > i7) {
                i7 = c;
            }
            if (c < i5) {
                i5 = c;
            }
            if (b > i3) {
                i3 = b;
            }
            if (b < i6) {
                i6 = b;
            }
        }
        this.d = i4;
        this.e = i2;
        this.f = i5;
        this.g = i7;
        this.h = i6;
        this.i = i3;
        this.c = i;
    }

    final boolean c() {
        return (this.b + 1) - this.a > 1;
    }
}
