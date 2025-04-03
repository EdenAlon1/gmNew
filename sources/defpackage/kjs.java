package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kjs extends kjv {
    public final kjk a;
    kjl b;

    public kjs(kiu kiuVar) {
        super(kiuVar);
        kjk kjkVar = new kjk(this);
        this.a = kjkVar;
        this.b = null;
        this.i.l = 6;
        this.j.l = 7;
        kjkVar.l = 8;
        this.g = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0411  */
    @Override // defpackage.kjv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kjs.b():void");
    }

    @Override // defpackage.kjv
    public final void c() {
        kjk kjkVar = this.i;
        if (kjkVar.i) {
            this.d.ak = kjkVar.f;
        }
    }

    @Override // defpackage.kjv
    public final void d() {
        this.e = null;
        this.i.b();
        this.j.b();
        this.a.b();
        this.f.b();
        this.h = false;
    }

    @Override // defpackage.kjv
    public final boolean e() {
        return this.k != 3 || this.d.D == 0;
    }

    @Override // defpackage.kjv, defpackage.kji
    public final void f() {
        float f;
        float f2;
        float f3;
        int i = this.l;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 3) {
            kiu kiuVar = this.d;
            m(kiuVar.U, kiuVar.W, 1);
            return;
        }
        kjl kjlVar = this.f;
        if (kjlVar.c && !kjlVar.i && this.k == 3) {
            kiu kiuVar2 = this.d;
            int i3 = kiuVar2.D;
            if (i3 == 2) {
                kiu kiuVar3 = kiuVar2.ae;
                if (kiuVar3 != null) {
                    if (kiuVar3.p.f.i) {
                        kjlVar.c((int) ((r5.f * kiuVar2.K) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                kjl kjlVar2 = kiuVar2.o.f;
                if (kjlVar2.i) {
                    int i4 = kiuVar2.ai;
                    if (i4 == -1) {
                        f = kjlVar2.f;
                        f2 = kiuVar2.ah;
                    } else if (i4 != 0) {
                        f = kjlVar2.f;
                        f2 = kiuVar2.ah;
                    } else {
                        f3 = kjlVar2.f * kiuVar2.ah;
                        kjlVar.c((int) (f3 + 0.5f));
                    }
                    f3 = f / f2;
                    kjlVar.c((int) (f3 + 0.5f));
                }
            }
        }
        kjk kjkVar = this.i;
        if (kjkVar.c) {
            kjk kjkVar2 = this.j;
            if (kjkVar2.c) {
                if (kjkVar.i && kjkVar2.i && this.f.i) {
                    return;
                }
                if (!this.f.i && this.k == 3) {
                    kiu kiuVar4 = this.d;
                    if (kiuVar4.C == 0 && !kiuVar4.T()) {
                        kjk kjkVar3 = (kjk) this.i.k.get(0);
                        kjk kjkVar4 = (kjk) this.j.k.get(0);
                        int i5 = kjkVar3.f;
                        kjk kjkVar5 = this.i;
                        int i6 = i5 + kjkVar5.e;
                        int i7 = kjkVar4.f + this.j.e;
                        kjkVar5.c(i6);
                        this.j.c(i7);
                        this.f.c(i7 - i6);
                        return;
                    }
                }
                if (!this.f.i && this.k == 3 && this.c == 1 && this.i.k.size() > 0 && this.j.k.size() > 0) {
                    kjk kjkVar6 = (kjk) this.i.k.get(0);
                    kjk kjkVar7 = (kjk) this.j.k.get(0);
                    int i8 = kjkVar6.f + this.i.e;
                    int i9 = kjkVar7.f + this.j.e;
                    kjl kjlVar3 = this.f;
                    int i10 = i9 - i8;
                    int i11 = kjlVar3.m;
                    if (i10 < i11) {
                        kjlVar3.c(i10);
                    } else {
                        kjlVar3.c(i11);
                    }
                }
                if (!this.f.i || this.i.k.size() <= 0 || this.j.k.size() <= 0) {
                    return;
                }
                kjk kjkVar8 = (kjk) this.i.k.get(0);
                kjk kjkVar9 = (kjk) this.j.k.get(0);
                int i12 = kjkVar8.f;
                kjk kjkVar10 = this.i;
                int i13 = kjkVar10.e + i12;
                int i14 = kjkVar9.f;
                int i15 = this.j.e + i14;
                float f4 = this.d.ap;
                if (kjkVar8 == kjkVar9) {
                    f4 = 0.5f;
                }
                if (kjkVar8 != kjkVar9) {
                    i14 = i15;
                }
                if (kjkVar8 != kjkVar9) {
                    i12 = i13;
                }
                kjkVar10.c((int) (i12 + 0.5f + (((i14 - i12) - this.f.f) * f4)));
                this.j.c(this.i.f + this.f.f);
            }
        }
    }

    public final void g() {
        this.h = false;
        this.i.b();
        this.i.i = false;
        this.j.b();
        this.j.i = false;
        this.a.b();
        this.a.i = false;
        this.f.i = false;
    }

    public final String toString() {
        return "VerticalRun ".concat(String.valueOf(this.d.as));
    }
}
