package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kiw {
    public kiu a = null;
    int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    final /* synthetic */ kix h;
    private int i;
    private kit j;
    private kit k;
    private kit l;
    private kit m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;

    public kiw(kix kixVar, int i, kit kitVar, kit kitVar2, kit kitVar3, kit kitVar4, int i2) {
        this.h = kixVar;
        this.o = 0;
        this.q = 0;
        this.i = i;
        this.j = kitVar;
        this.k = kitVar2;
        this.l = kitVar3;
        this.m = kitVar4;
        this.n = kixVar.aR;
        this.o = kixVar.aN;
        this.p = kixVar.aS;
        this.q = kixVar.aO;
        this.r = i2;
    }

    public final int a() {
        return this.i == 1 ? this.d - this.h.aD : this.d;
    }

    public final int b() {
        return this.i == 0 ? this.c - this.h.aC : this.c;
    }

    public final void c(kiu kiuVar) {
        if (this.i == 0) {
            int ae = this.h.ae(kiuVar, this.r);
            if (kiuVar.X() == 3) {
                this.g++;
                ae = 0;
            }
            kix kixVar = this.h;
            this.c += ae + (kiuVar.ar != 8 ? kixVar.aC : 0);
            int c = kixVar.c(kiuVar, this.r);
            if (this.a == null || this.b < c) {
                this.a = kiuVar;
                this.b = c;
                this.d = c;
            }
        } else {
            int ae2 = this.h.ae(kiuVar, this.r);
            int c2 = this.h.c(kiuVar, this.r);
            if (kiuVar.Y() == 3) {
                this.g++;
                c2 = 0;
            }
            this.d += c2 + (kiuVar.ar != 8 ? this.h.aD : 0);
            if (this.a == null || this.b < ae2) {
                this.a = kiuVar;
                this.b = ae2;
                this.c = ae2;
            }
        }
        this.f++;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(boolean r20, int r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kiw.d(boolean, int, boolean):void");
    }

    public final void e(int i) {
        int i2 = this.g;
        if (i2 == 0) {
            return;
        }
        int i3 = this.f;
        int i4 = i / i2;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = this.e + i5;
            kix kixVar = this.h;
            if (i6 >= kixVar.aK) {
                break;
            }
            kiu kiuVar = kixVar.aJ[i6];
            if (this.i == 0) {
                if (kiuVar != null && kiuVar.X() == 3 && kiuVar.C == 0) {
                    this.h.ak(kiuVar, 1, i4, kiuVar.Y(), kiuVar.h());
                }
            } else if (kiuVar != null && kiuVar.Y() == 3 && kiuVar.D == 0) {
                int i7 = i4;
                this.h.ak(kiuVar, kiuVar.X(), kiuVar.j(), 1, i7);
                i4 = i7;
            }
        }
        this.c = 0;
        this.d = 0;
        this.a = null;
        this.b = 0;
        int i8 = this.f;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.e + i9;
            kix kixVar2 = this.h;
            if (i10 >= kixVar2.aK) {
                return;
            }
            kiu kiuVar2 = kixVar2.aJ[i10];
            if (this.i == 0) {
                int j = kiuVar2.j();
                kix kixVar3 = this.h;
                int i11 = kixVar3.aC;
                if (kiuVar2.ar == 8) {
                    i11 = 0;
                }
                this.c += j + i11;
                int c = kixVar3.c(kiuVar2, this.r);
                if (this.a == null || this.b < c) {
                    this.a = kiuVar2;
                    this.b = c;
                    this.d = c;
                }
            } else {
                int ae = kixVar2.ae(kiuVar2, this.r);
                int c2 = this.h.c(kiuVar2, this.r);
                int i12 = this.h.aD;
                if (kiuVar2.ar == 8) {
                    i12 = 0;
                }
                this.d += c2 + i12;
                if (this.a == null || this.b < ae) {
                    this.a = kiuVar2;
                    this.b = ae;
                    this.c = ae;
                }
            }
        }
    }

    public final void f(int i, kit kitVar, kit kitVar2, kit kitVar3, kit kitVar4, int i2, int i3, int i4, int i5, int i6) {
        this.i = i;
        this.j = kitVar;
        this.k = kitVar2;
        this.l = kitVar3;
        this.m = kitVar4;
        this.n = i2;
        this.o = i3;
        this.p = i4;
        this.q = i5;
        this.r = i6;
    }
}
