package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhsz extends fhsy {
    public fhsz(fhsu fhsuVar, fhsx fhsxVar, fhsx fhsxVar2) {
        super(fhsuVar, fhsxVar, fhsxVar2);
    }

    @Override // defpackage.fhta
    public final fhsx c() {
        int g = g();
        if (g != 5 && g != 6) {
            return this.d;
        }
        fhsx fhsxVar = this.c;
        fhsx fhsxVar2 = this.d;
        if (n() || fhsxVar.o()) {
            return fhsxVar2;
        }
        fhsx h = fhsxVar2.d(fhsxVar).h(fhsxVar);
        if (g == 6) {
            fhsx fhsxVar3 = this.e[0];
            if (!fhsxVar3.n()) {
                return h.f(fhsxVar3);
            }
        }
        return h;
    }

    @Override // defpackage.fhta
    public final fhta d(fhta fhtaVar) {
        fhsx fhsxVar;
        fhsx fhsxVar2;
        fhsx fhsxVar3;
        fhsx fhsxVar4;
        fhsx fhsxVar5;
        fhsx fhsxVar6;
        if (n()) {
            return fhtaVar;
        }
        if (fhtaVar.n()) {
            return this;
        }
        fhsu fhsuVar = this.b;
        fhsx fhsxVar7 = this.c;
        int i = fhsuVar.h;
        fhsx fhsxVar8 = fhtaVar.c;
        if (i == 0) {
            fhsx fhsxVar9 = this.d;
            fhsx fhsxVar10 = fhtaVar.d;
            fhsx d = fhsxVar7.d(fhsxVar8);
            fhsx d2 = fhsxVar9.d(fhsxVar10);
            if (!d.o()) {
                fhsx f = d2.f(d);
                fhsx d3 = f.k().d(f).d(d).d(fhsuVar.d);
                return new fhsz(fhsuVar, d3, f.h(fhsxVar7.d(d3)).d(d3).d(fhsxVar9));
            }
            if (d2.o()) {
                return f();
            }
        } else if (i == 1) {
            fhsx fhsxVar11 = this.d;
            fhsx fhsxVar12 = this.e[0];
            fhsx fhsxVar13 = fhtaVar.d;
            fhsx fhsxVar14 = fhtaVar.e[0];
            boolean n = fhsxVar14.n();
            fhsx d4 = fhsxVar12.h(fhsxVar13).d(n ? fhsxVar11 : fhsxVar11.h(fhsxVar14));
            fhsx d5 = fhsxVar12.h(fhsxVar8).d(n ? fhsxVar7 : fhsxVar7.h(fhsxVar14));
            if (!d5.o()) {
                fhsx k = d5.k();
                fhsx h = k.h(d5);
                if (!n) {
                    fhsxVar12 = fhsxVar12.h(fhsxVar14);
                }
                fhsx d6 = d4.d(d5);
                fhsx d7 = d6.i(d4, k, fhsuVar.d).h(fhsxVar12).d(h);
                fhsx h2 = d5.h(d7);
                if (!n) {
                    k = k.h(fhsxVar14);
                }
                return new fhsz(fhsuVar, h2, d4.i(fhsxVar7, d5, fhsxVar11).i(k, d6, d7), new fhsx[]{h.h(fhsxVar12)});
            }
            if (d4.o()) {
                return f();
            }
        } else {
            if (i != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            if (!fhsxVar7.o()) {
                fhsx fhsxVar15 = this.d;
                fhsx fhsxVar16 = this.e[0];
                fhsx fhsxVar17 = fhtaVar.d;
                fhsx fhsxVar18 = fhtaVar.e[0];
                boolean n2 = fhsxVar16.n();
                if (n2) {
                    fhsxVar = fhsxVar8;
                    fhsxVar2 = fhsxVar17;
                } else {
                    fhsxVar = fhsxVar8.h(fhsxVar16);
                    fhsxVar2 = fhsxVar17.h(fhsxVar16);
                }
                boolean n3 = fhsxVar18.n();
                if (n3) {
                    fhsxVar3 = fhsxVar15;
                } else {
                    fhsxVar7 = fhsxVar7.h(fhsxVar18);
                    fhsxVar3 = fhsxVar15.h(fhsxVar18);
                }
                fhsx d8 = fhsxVar3.d(fhsxVar2);
                fhsx d9 = fhsxVar7.d(fhsxVar);
                if (!d9.o()) {
                    if (fhsxVar8.o()) {
                        fhta j = j();
                        fhsx fhsxVar19 = j.c;
                        fhsx c = j.c();
                        fhsx f2 = c.d(fhsxVar17).f(fhsxVar19);
                        fhsxVar4 = f2.k().d(f2).d(fhsxVar19).d(fhsuVar.d);
                        if (fhsxVar4.o()) {
                            return new fhsz(fhsuVar, fhsxVar4, fhsuVar.e.j());
                        }
                        fhsxVar6 = f2.h(fhsxVar19.d(fhsxVar4)).d(fhsxVar4).d(c).f(fhsxVar4).d(fhsxVar4);
                        fhsxVar5 = fhsuVar.c(fhsr.b);
                    } else {
                        fhsx k2 = d9.k();
                        fhsx h3 = d8.h(fhsxVar7);
                        fhsx h4 = d8.h(fhsxVar);
                        fhsx h5 = h3.h(h4);
                        if (h5.o()) {
                            return new fhsz(fhsuVar, h5, fhsuVar.e.j());
                        }
                        fhsx h6 = d8.h(k2);
                        fhsx h7 = !n3 ? h6.h(fhsxVar18) : h6;
                        fhsx l = h4.d(k2).l(h7, fhsxVar15.d(fhsxVar16));
                        if (!n2) {
                            h7 = h7.h(fhsxVar16);
                        }
                        fhsxVar4 = h5;
                        fhsxVar5 = h7;
                        fhsxVar6 = l;
                    }
                    return new fhsz(fhsuVar, fhsxVar4, fhsxVar6, new fhsx[]{fhsxVar5});
                }
                if (d8.o()) {
                    return f();
                }
            } else if (!fhsxVar8.o()) {
                return fhtaVar.d(this);
            }
        }
        return ((fhst) fhsuVar).b;
    }

    @Override // defpackage.fhta
    public final fhta e() {
        if (!n()) {
            fhsx fhsxVar = this.c;
            if (!fhsxVar.o()) {
                int g = g();
                if (g == 0) {
                    return new fhsz(this.b, fhsxVar, this.d.d(fhsxVar));
                }
                if (g == 1) {
                    return new fhsz(this.b, fhsxVar, this.d.d(fhsxVar), new fhsx[]{this.e[0]});
                }
                if (g == 5) {
                    return new fhsz(this.b, fhsxVar, this.d.e());
                }
                if (g != 6) {
                    throw new IllegalStateException("unsupported coordinate system");
                }
                fhsx fhsxVar2 = this.d;
                fhsx fhsxVar3 = this.e[0];
                return new fhsz(this.b, fhsxVar, fhsxVar2.d(fhsxVar3), new fhsx[]{fhsxVar3});
            }
        }
        return this;
    }

    @Override // defpackage.fhta
    public final fhta f() {
        fhsx d;
        if (n()) {
            return this;
        }
        fhsu fhsuVar = this.b;
        fhsx fhsxVar = this.c;
        if (fhsxVar.o()) {
            return ((fhst) fhsuVar).b;
        }
        int i = fhsuVar.h;
        if (i == 0) {
            fhsx d2 = this.d.f(fhsxVar).d(fhsxVar);
            fhsx d3 = d2.k().d(d2).d(fhsuVar.d);
            return new fhsz(fhsuVar, d3, fhsxVar.l(d3, d2.e()));
        }
        if (i == 1) {
            fhsx fhsxVar2 = this.d;
            fhsx fhsxVar3 = this.e[0];
            boolean n = fhsxVar3.n();
            fhsx h = n ? fhsxVar : fhsxVar.h(fhsxVar3);
            if (!n) {
                fhsxVar2 = fhsxVar2.h(fhsxVar3);
            }
            fhsx k = fhsxVar.k();
            fhsx d4 = k.d(fhsxVar2);
            fhsx k2 = h.k();
            fhsx d5 = d4.d(h);
            fhsx i2 = d5.i(d4, k2, fhsuVar.d);
            return new fhsz(fhsuVar, h.h(i2), k.k().i(h, i2, d5), new fhsx[]{h.h(k2)});
        }
        if (i != 6) {
            throw new IllegalStateException("unsupported coordinate system");
        }
        fhsx fhsxVar4 = this.d;
        fhsx fhsxVar5 = this.e[0];
        boolean n2 = fhsxVar5.n();
        fhsx h2 = n2 ? fhsxVar4 : fhsxVar4.h(fhsxVar5);
        fhsx k3 = n2 ? fhsxVar5 : fhsxVar5.k();
        fhsx fhsxVar6 = fhsuVar.d;
        fhsx h3 = n2 ? fhsxVar6 : fhsxVar6.h(k3);
        fhsx d6 = fhsxVar4.k().d(h2).d(h3);
        if (d6.o()) {
            return new fhsz(fhsuVar, d6, fhsuVar.e.j());
        }
        fhsx k4 = d6.k();
        fhsx h4 = n2 ? d6 : d6.h(k3);
        fhsx fhsxVar7 = fhsuVar.e;
        if (((fhsw) fhsxVar7).f.a() < (((fhst) fhsuVar).a >> 1)) {
            fhsx k5 = fhsxVar4.d(fhsxVar).k();
            d = k5.d(d6).d(k3).h(k5).d(fhsxVar7.n() ? h3.d(k3).k() : h3.l(fhsxVar7, k3.k())).d(k4);
            if (fhsxVar6.o()) {
                d = d.d(h4);
            } else if (!fhsxVar6.n()) {
                d = d.d(fhsxVar6.e().h(h4));
            }
        } else {
            if (!n2) {
                fhsxVar = fhsxVar.h(fhsxVar5);
            }
            d = fhsxVar.l(d6, h2).d(k4).d(h4);
        }
        return new fhsz(fhsuVar, k4, d, new fhsx[]{h4});
    }

    public fhsz(fhsu fhsuVar, fhsx fhsxVar, fhsx fhsxVar2, fhsx[] fhsxVarArr) {
        super(fhsuVar, fhsxVar, fhsxVar2, fhsxVarArr);
    }
}
