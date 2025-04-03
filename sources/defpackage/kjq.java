package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kjq extends kjv {
    private static final int[] a = new int[2];

    public kjq(kiu kiuVar) {
        super(kiuVar);
        this.i.l = 4;
        this.j.l = 5;
        this.g = 0;
    }

    private static final void n(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i4 - i3;
        int i7 = i2 - i;
        if (i5 != -1) {
            if (i5 != 0) {
                iArr[0] = i7;
                iArr[1] = (int) ((i7 * f) + 0.5f);
                return;
            } else {
                iArr[0] = (int) ((i6 * f) + 0.5f);
                iArr[1] = i6;
                return;
            }
        }
        float f2 = (i7 / f) + 0.5f;
        int i8 = (int) ((i6 * f) + 0.5f);
        if (i8 <= i7) {
            iArr[0] = i8;
            iArr[1] = i6;
            return;
        }
        int i9 = (int) f2;
        if (i9 <= i6) {
            iArr[0] = i7;
            iArr[1] = i9;
        }
    }

    @Override // defpackage.kjv
    public final void b() {
        kiu kiuVar;
        kiu kiuVar2;
        kiu kiuVar3;
        kiu kiuVar4 = this.d;
        if (kiuVar4.l) {
            this.f.c(kiuVar4.j());
        }
        if (!this.f.i) {
            int X = this.d.X();
            this.k = X;
            if (X != 3) {
                if (this.k == 4 && (kiuVar3 = this.d.ae) != null && (kiuVar3.X() == 1 || kiuVar3.X() == 4)) {
                    int j = (kiuVar3.j() - this.d.T.b()) - this.d.V.b();
                    j(this.i, kiuVar3.o.i, this.d.T.b());
                    j(this.j, kiuVar3.o.j, -this.d.V.b());
                    this.f.c(j);
                    return;
                }
                if (this.k == 1) {
                    this.f.c(this.d.j());
                }
            }
        } else if (this.k == 4 && (kiuVar = this.d.ae) != null && (kiuVar.X() == 1 || kiuVar.X() == 4)) {
            j(this.i, kiuVar.o.i, this.d.T.b());
            j(this.j, kiuVar.o.j, -this.d.V.b());
            return;
        }
        kjl kjlVar = this.f;
        if (kjlVar.i) {
            kiu kiuVar5 = this.d;
            if (kiuVar5.l) {
                kit[] kitVarArr = kiuVar5.ab;
                kit kitVar = kitVarArr[0];
                kit kitVar2 = kitVar.e;
                if (kitVar2 != null && kitVarArr[1].e != null) {
                    if (kiuVar5.S()) {
                        this.i.e = this.d.ab[0].b();
                        this.j.e = -this.d.ab[1].b();
                        return;
                    }
                    kjk k = k(this.d.ab[0]);
                    if (k != null) {
                        j(this.i, k, this.d.ab[0].b());
                    }
                    kjk k2 = k(this.d.ab[1]);
                    if (k2 != null) {
                        j(this.j, k2, -this.d.ab[1].b());
                    }
                    this.i.b = true;
                    this.j.b = true;
                    return;
                }
                if (kitVar2 != null) {
                    kjk k3 = k(kitVar);
                    if (k3 != null) {
                        j(this.i, k3, this.d.ab[0].b());
                        j(this.j, this.i, this.f.f);
                        return;
                    }
                    return;
                }
                kit kitVar3 = kitVarArr[1];
                if (kitVar3.e != null) {
                    kjk k4 = k(kitVar3);
                    if (k4 != null) {
                        j(this.j, k4, -this.d.ab[1].b());
                        j(this.i, this.j, -this.f.f);
                        return;
                    }
                    return;
                }
                if ((kiuVar5 instanceof kiz) || kiuVar5.ae == null || kiuVar5.V(7).e != null) {
                    return;
                }
                kiu kiuVar6 = this.d;
                j(this.i, kiuVar6.ae.o.i, kiuVar6.k());
                j(this.j, this.i, this.f.f);
                return;
            }
        }
        if (this.k == 3) {
            kiu kiuVar7 = this.d;
            int i = kiuVar7.C;
            if (i == 2) {
                kiu kiuVar8 = kiuVar7.ae;
                if (kiuVar8 != null) {
                    kjl kjlVar2 = kiuVar8.p.f;
                    kjlVar.k.add(kjlVar2);
                    kjlVar2.j.add(this.f);
                    kjl kjlVar3 = this.f;
                    kjlVar3.b = true;
                    kjlVar3.j.add(this.i);
                    this.f.j.add(this.j);
                }
            } else if (i == 3) {
                if (kiuVar7.D == 3) {
                    this.i.a = this;
                    this.j.a = this;
                    kjs kjsVar = kiuVar7.p;
                    kjsVar.i.a = this;
                    kjsVar.j.a = this;
                    kjlVar.a = this;
                    if (kiuVar7.T()) {
                        this.f.k.add(this.d.p.f);
                        this.d.p.f.j.add(this.f);
                        kjs kjsVar2 = this.d.p;
                        kjsVar2.f.a = this;
                        this.f.k.add(kjsVar2.i);
                        this.f.k.add(this.d.p.j);
                        this.d.p.i.j.add(this.f);
                        this.d.p.j.j.add(this.f);
                    } else if (this.d.S()) {
                        this.d.p.f.k.add(this.f);
                        this.f.j.add(this.d.p.f);
                    } else {
                        this.d.p.f.k.add(this.f);
                    }
                } else {
                    kjl kjlVar4 = kiuVar7.p.f;
                    kjlVar.k.add(kjlVar4);
                    kjlVar4.j.add(this.f);
                    this.d.p.i.j.add(this.f);
                    this.d.p.j.j.add(this.f);
                    kjl kjlVar5 = this.f;
                    kjlVar5.b = true;
                    kjlVar5.j.add(this.i);
                    this.f.j.add(this.j);
                    this.i.k.add(this.f);
                    this.j.k.add(this.f);
                }
            }
        }
        kiu kiuVar9 = this.d;
        kit[] kitVarArr2 = kiuVar9.ab;
        kit kitVar4 = kitVarArr2[0];
        kit kitVar5 = kitVar4.e;
        if (kitVar5 != null && kitVarArr2[1].e != null) {
            if (kiuVar9.S()) {
                this.i.e = this.d.ab[0].b();
                this.j.e = -this.d.ab[1].b();
                return;
            }
            kjk k5 = k(this.d.ab[0]);
            kjk k6 = k(this.d.ab[1]);
            if (k5 != null) {
                k5.a(this);
            }
            if (k6 != null) {
                k6.a(this);
            }
            this.l = 4;
            return;
        }
        if (kitVar5 != null) {
            kjk k7 = k(kitVar4);
            if (k7 != null) {
                j(this.i, k7, this.d.ab[0].b());
                i(this.j, this.i, 1, this.f);
                return;
            }
            return;
        }
        kit kitVar6 = kitVarArr2[1];
        if (kitVar6.e != null) {
            kjk k8 = k(kitVar6);
            if (k8 != null) {
                j(this.j, k8, -this.d.ab[1].b());
                i(this.i, this.j, -1, this.f);
                return;
            }
            return;
        }
        if ((kiuVar9 instanceof kiz) || (kiuVar2 = kiuVar9.ae) == null) {
            return;
        }
        j(this.i, kiuVar2.o.i, kiuVar9.k());
        i(this.j, this.i, 1, this.f);
    }

    @Override // defpackage.kjv
    public final void c() {
        kjk kjkVar = this.i;
        if (kjkVar.i) {
            this.d.aj = kjkVar.f;
        }
    }

    @Override // defpackage.kjv
    public final void d() {
        this.e = null;
        this.i.b();
        this.j.b();
        this.f.b();
        this.h = false;
    }

    @Override // defpackage.kjv
    public final boolean e() {
        return this.k != 3 || this.d.C == 0;
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
            m(kiuVar.T, kiuVar.V, 0);
            return;
        }
        kjl kjlVar = this.f;
        if (!kjlVar.i && this.k == 3) {
            kiu kiuVar2 = this.d;
            int i3 = kiuVar2.C;
            if (i3 == 2) {
                kiu kiuVar3 = kiuVar2.ae;
                if (kiuVar3 != null) {
                    if (kiuVar3.o.f.i) {
                        kjlVar.c((int) ((r7.f * kiuVar2.H) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = kiuVar2.D;
                if (i4 == 0 || i4 == 3) {
                    kjs kjsVar = kiuVar2.p;
                    kjk kjkVar = kjsVar.i;
                    kjk kjkVar2 = kjsVar.j;
                    boolean z = kiuVar2.T.e != null;
                    boolean z2 = kiuVar2.U.e != null;
                    boolean z3 = kiuVar2.V.e != null;
                    boolean z4 = kiuVar2.W.e != null;
                    int i5 = kiuVar2.ai;
                    if (z && z2 && z3 && z4) {
                        float f4 = kiuVar2.ah;
                        if (kjkVar.i && kjkVar2.i) {
                            kjk kjkVar3 = this.i;
                            if (kjkVar3.c && this.j.c) {
                                int i6 = ((kjk) kjkVar3.k.get(0)).f + this.i.e;
                                int i7 = ((kjk) this.j.k.get(0)).f - this.j.e;
                                int i8 = kjkVar.f + kjkVar.e;
                                int i9 = kjkVar2.f - kjkVar2.e;
                                int[] iArr = a;
                                n(iArr, i6, i7, i8, i9, f4, i5);
                                this.f.c(iArr[0]);
                                this.d.p.f.c(iArr[1]);
                                return;
                            }
                            return;
                        }
                        kjk kjkVar4 = this.i;
                        if (kjkVar4.i) {
                            kjk kjkVar5 = this.j;
                            if (kjkVar5.i) {
                                if (!kjkVar.c || !kjkVar2.c) {
                                    return;
                                }
                                int i10 = kjkVar4.f + kjkVar4.e;
                                int i11 = kjkVar5.f - kjkVar5.e;
                                int i12 = ((kjk) kjkVar.k.get(0)).f + kjkVar.e;
                                int i13 = ((kjk) kjkVar2.k.get(0)).f - kjkVar2.e;
                                int[] iArr2 = a;
                                n(iArr2, i10, i11, i12, i13, f4, i5);
                                this.f.c(iArr2[0]);
                                this.d.p.f.c(iArr2[1]);
                            }
                        }
                        kjk kjkVar6 = this.i;
                        if (!kjkVar6.c || !this.j.c || !kjkVar.c || !kjkVar2.c) {
                            return;
                        }
                        int i14 = ((kjk) kjkVar6.k.get(0)).f + this.i.e;
                        int i15 = ((kjk) this.j.k.get(0)).f - this.j.e;
                        int i16 = ((kjk) kjkVar.k.get(0)).f + kjkVar.e;
                        int i17 = ((kjk) kjkVar2.k.get(0)).f - kjkVar2.e;
                        int[] iArr3 = a;
                        n(iArr3, i14, i15, i16, i17, f4, i5);
                        this.f.c(iArr3[0]);
                        this.d.p.f.c(iArr3[1]);
                    } else if (z && z3) {
                        kjk kjkVar7 = this.i;
                        if (!kjkVar7.c || !this.j.c) {
                            return;
                        }
                        float f5 = kiuVar2.ah;
                        int i18 = (((kjk) this.j.k.get(0)).f - this.j.e) - (((kjk) kjkVar7.k.get(0)).f + this.i.e);
                        if (i5 == -1 || i5 == 0) {
                            int h = h(i18, 0);
                            int i19 = (int) ((h * f5) + 0.5f);
                            int h2 = h(i19, 1);
                            if (i19 != h2) {
                                h = (int) ((h2 / f5) + 0.5f);
                            }
                            this.f.c(h);
                            this.d.p.f.c(h2);
                        } else {
                            int h3 = h(i18, 0);
                            int i20 = (int) ((h3 / f5) + 0.5f);
                            int h4 = h(i20, 1);
                            if (i20 != h4) {
                                h3 = (int) ((h4 * f5) + 0.5f);
                            }
                            this.f.c(h3);
                            this.d.p.f.c(h4);
                        }
                    } else if (z2 && z4) {
                        if (!kjkVar.c || !kjkVar2.c) {
                            return;
                        }
                        float f6 = kiuVar2.ah;
                        int i21 = (((kjk) kjkVar2.k.get(0)).f - kjkVar2.e) - (((kjk) kjkVar.k.get(0)).f + kjkVar.e);
                        if (i5 != 0) {
                            int h5 = h(i21, 1);
                            int i22 = (int) ((h5 / f6) + 0.5f);
                            int h6 = h(i22, 0);
                            if (i22 != h6) {
                                h5 = (int) ((h6 * f6) + 0.5f);
                            }
                            this.f.c(h6);
                            this.d.p.f.c(h5);
                        } else {
                            int h7 = h(i21, 1);
                            int i23 = (int) ((h7 * f6) + 0.5f);
                            int h8 = h(i23, 0);
                            if (i23 != h8) {
                                h7 = (int) ((h8 / f6) + 0.5f);
                            }
                            this.f.c(h8);
                            this.d.p.f.c(h7);
                        }
                    }
                } else {
                    int i24 = kiuVar2.ai;
                    if (i24 == -1) {
                        f = kiuVar2.p.f.f;
                        f2 = kiuVar2.ah;
                    } else if (i24 != 0) {
                        f = kiuVar2.p.f.f;
                        f2 = kiuVar2.ah;
                    } else {
                        f3 = kiuVar2.p.f.f / kiuVar2.ah;
                        kjlVar.c((int) (f3 + 0.5f));
                    }
                    f3 = f * f2;
                    kjlVar.c((int) (f3 + 0.5f));
                }
            }
        }
        kjk kjkVar8 = this.i;
        if (kjkVar8.c) {
            kjk kjkVar9 = this.j;
            if (kjkVar9.c) {
                if (kjkVar8.i && kjkVar9.i && this.f.i) {
                    return;
                }
                if (!this.f.i && this.k == 3) {
                    kiu kiuVar4 = this.d;
                    if (kiuVar4.C == 0 && !kiuVar4.S()) {
                        kjk kjkVar10 = (kjk) this.i.k.get(0);
                        kjk kjkVar11 = (kjk) this.j.k.get(0);
                        int i25 = kjkVar10.f;
                        kjk kjkVar12 = this.i;
                        int i26 = i25 + kjkVar12.e;
                        int i27 = kjkVar11.f + this.j.e;
                        kjkVar12.c(i26);
                        this.j.c(i27);
                        this.f.c(i27 - i26);
                        return;
                    }
                }
                if (!this.f.i && this.k == 3 && this.c == 1 && this.i.k.size() > 0 && this.j.k.size() > 0) {
                    kjk kjkVar13 = (kjk) this.i.k.get(0);
                    int min = Math.min((((kjk) this.j.k.get(0)).f + this.j.e) - (kjkVar13.f + this.i.e), this.f.m);
                    kiu kiuVar5 = this.d;
                    int i28 = kiuVar5.G;
                    int max = Math.max(kiuVar5.F, min);
                    if (i28 > 0) {
                        max = Math.min(i28, max);
                    }
                    this.f.c(max);
                }
                if (this.f.i) {
                    kjk kjkVar14 = (kjk) this.i.k.get(0);
                    kjk kjkVar15 = (kjk) this.j.k.get(0);
                    int i29 = kjkVar14.f;
                    kjk kjkVar16 = this.i;
                    int i30 = kjkVar16.e + i29;
                    int i31 = kjkVar15.f;
                    int i32 = this.j.e + i31;
                    float f7 = this.d.ao;
                    if (kjkVar14 == kjkVar15) {
                        f7 = 0.5f;
                    }
                    if (kjkVar14 != kjkVar15) {
                        i31 = i32;
                    }
                    if (kjkVar14 != kjkVar15) {
                        i29 = i30;
                    }
                    kjkVar16.c((int) (i29 + 0.5f + (((i31 - i29) - this.f.f) * f7)));
                    this.j.c(this.i.f + this.f.f);
                }
            }
        }
    }

    public final void g() {
        this.h = false;
        this.i.b();
        this.i.i = false;
        this.j.b();
        this.j.i = false;
        this.f.i = false;
    }

    public final String toString() {
        return "HorizontalRun ".concat(String.valueOf(this.d.as));
    }
}
