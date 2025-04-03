package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvlu extends dvjz {
    static final emwd a = new dvlm();
    static final emwd b = new dvmc();
    static final emwd c = new dvla();

    @Override // defpackage.dvjz
    public final void a(eyaw eyawVar, evzo evzoVar) {
        evxh evxhVar = (evxh) evxi.a.createBuilder();
        emwd emwdVar = c;
        eyas eyasVar = eyawVar.c;
        if (eyasVar == null) {
            eyasVar = eyas.a;
        }
        eyan eyanVar = eyasVar.i;
        if (eyanVar == null) {
            eyanVar = eyan.a;
        }
        exzn b2 = exzn.b(eyanVar.d);
        if (b2 == null) {
            b2 = exzn.USER_ACTION_UNSPECIFIED;
        }
        evxg evxgVar = (evxg) emwdVar.fP(b2);
        evxhVar.copyOnWrite();
        evxi evxiVar = (evxi) evxhVar.instance;
        evxiVar.e = evxgVar.f;
        evxiVar.b |= 1;
        eyas eyasVar2 = eyawVar.c;
        if (eyasVar2 == null) {
            eyasVar2 = eyas.a;
        }
        eyan eyanVar2 = eyasVar2.i;
        if (eyanVar2 == null) {
            eyanVar2 = eyan.a;
        }
        fauw fauwVar = eyanVar2.c;
        if (fauwVar == null) {
            fauwVar = fauw.a;
        }
        String str = fauwVar.b;
        evxhVar.copyOnWrite();
        evxi evxiVar2 = (evxi) evxhVar.instance;
        str.getClass();
        evxiVar2.b |= 2;
        evxiVar2.f = str;
        eyas eyasVar3 = eyawVar.c;
        if (eyasVar3 == null) {
            eyasVar3 = eyas.a;
        }
        exzp exzpVar = eyasVar3.g;
        if (exzpVar == null) {
            exzpVar = exzp.a;
        }
        faul faulVar = exzpVar.f;
        if (faulVar == null) {
            faulVar = faul.a;
        }
        evxhVar.copyOnWrite();
        evxi evxiVar3 = (evxi) evxhVar.instance;
        faulVar.getClass();
        evxiVar3.h = faulVar;
        evxiVar3.b |= 8;
        eyas eyasVar4 = eyawVar.c;
        if (eyasVar4 == null) {
            eyasVar4 = eyas.a;
        }
        eyan eyanVar3 = eyasVar4.i;
        if (eyanVar3 == null) {
            eyanVar3 = eyan.a;
        }
        if ((eyanVar3.b & 4) != 0) {
            evzk evzkVar = (evzk) evzn.a.createBuilder();
            emwd emwdVar2 = a;
            eyas eyasVar5 = eyawVar.c;
            if (eyasVar5 == null) {
                eyasVar5 = eyas.a;
            }
            eyan eyanVar4 = eyasVar5.i;
            if (eyanVar4 == null) {
                eyanVar4 = eyan.a;
            }
            exzp exzpVar2 = eyanVar4.e;
            if (exzpVar2 == null) {
                exzpVar2 = exzp.a;
            }
            evwv evwvVar = (evwv) emwdVar2.fP(exzpVar2);
            evzkVar.copyOnWrite();
            evzn evznVar = (evzn) evzkVar.instance;
            evwvVar.getClass();
            evznVar.d = evwvVar;
            evznVar.b |= 2;
            evzm evzmVar = evzm.LIGHT;
            evzkVar.copyOnWrite();
            evzn evznVar2 = (evzn) evzkVar.instance;
            evznVar2.c = evzmVar.d;
            evznVar2.b |= 1;
            evxhVar.a(evzkVar);
        }
        eyas eyasVar6 = eyawVar.c;
        if (eyasVar6 == null) {
            eyasVar6 = eyas.a;
        }
        eyan eyanVar5 = eyasVar6.i;
        if (eyanVar5 == null) {
            eyanVar5 = eyan.a;
        }
        if ((eyanVar5.b & 8) != 0) {
            evzk evzkVar2 = (evzk) evzn.a.createBuilder();
            emwd emwdVar3 = a;
            eyas eyasVar7 = eyawVar.c;
            if (eyasVar7 == null) {
                eyasVar7 = eyas.a;
            }
            eyan eyanVar6 = eyasVar7.i;
            if (eyanVar6 == null) {
                eyanVar6 = eyan.a;
            }
            exzp exzpVar3 = eyanVar6.f;
            if (exzpVar3 == null) {
                exzpVar3 = exzp.a;
            }
            evwv evwvVar2 = (evwv) emwdVar3.fP(exzpVar3);
            evzkVar2.copyOnWrite();
            evzn evznVar3 = (evzn) evzkVar2.instance;
            evwvVar2.getClass();
            evznVar3.d = evwvVar2;
            evznVar3.b |= 2;
            evzm evzmVar2 = evzm.DARK;
            evzkVar2.copyOnWrite();
            evzn evznVar4 = (evzn) evzkVar2.instance;
            evznVar4.c = evzmVar2.d;
            evznVar4.b |= 1;
            evxhVar.a(evzkVar2);
        }
        evzoVar.copyOnWrite();
        evzr evzrVar = (evzr) evzoVar.instance;
        evxi evxiVar4 = (evxi) evxhVar.build();
        evzr evzrVar2 = evzr.a;
        evxiVar4.getClass();
        evzrVar.p = evxiVar4;
        evzrVar.b |= 1024;
    }

    @Override // defpackage.dvjz
    public final void b(eyaw eyawVar, evzo evzoVar) {
        eyas eyasVar = eyawVar.c;
        if (eyasVar == null) {
            eyasVar = eyas.a;
        }
        exzp exzpVar = eyasVar.g;
        if (exzpVar == null) {
            exzpVar = exzp.a;
        }
        faul faulVar = exzpVar.e;
        if (faulVar == null) {
            faulVar = faul.a;
        }
        evzoVar.copyOnWrite();
        evzr evzrVar = (evzr) evzoVar.instance;
        evzr evzrVar2 = evzr.a;
        faulVar.getClass();
        evzrVar.e = faulVar;
        evzrVar.b |= 1;
    }

    @Override // defpackage.dvjz
    public final void c(eyaw eyawVar, evzo evzoVar) {
        eyas eyasVar = eyawVar.c;
        if (eyasVar == null) {
            eyasVar = eyas.a;
        }
        fauw fauwVar = eyasVar.f;
        if (fauwVar == null) {
            fauwVar = fauw.a;
        }
        String str = fauwVar.b;
        evzoVar.copyOnWrite();
        evzr evzrVar = (evzr) evzoVar.instance;
        evzr evzrVar2 = evzr.a;
        str.getClass();
        evzrVar.b |= 512;
        evzrVar.o = str;
    }

    @Override // defpackage.dvjz
    public final void d(eyaw eyawVar, evzo evzoVar) {
        exzp exzpVar = eyawVar.d;
        if (exzpVar == null) {
            exzpVar = exzp.a;
        }
        if ((exzpVar.b & 1) != 0) {
            exzp exzpVar2 = eyawVar.d;
            if (exzpVar2 == null) {
                exzpVar2 = exzp.a;
            }
            faul faulVar = exzpVar2.c;
            if (faulVar == null) {
                faulVar = faul.a;
            }
            evzoVar.copyOnWrite();
            evzr evzrVar = (evzr) evzoVar.instance;
            evzr evzrVar2 = evzr.a;
            faulVar.getClass();
            evzrVar.j = faulVar;
            evzrVar.b |= 32;
        }
    }

    @Override // defpackage.dvjz
    public final void e(eyaw eyawVar, evzo evzoVar) {
        eyas eyasVar = eyawVar.c;
        if (eyasVar == null) {
            eyasVar = eyas.a;
        }
        if (eyasVar.c == 6) {
            eyas eyasVar2 = eyawVar.c;
            if (eyasVar2 == null) {
                eyasVar2 = eyas.a;
            }
            String str = eyasVar2.c == 6 ? (String) eyasVar2.d : "";
            evzoVar.copyOnWrite();
            evzr evzrVar = (evzr) evzoVar.instance;
            evzr evzrVar2 = evzr.a;
            str.getClass();
            evzrVar.c = 1;
            evzrVar.d = str;
        }
    }

    @Override // defpackage.dvjz
    public final void f(eyaw eyawVar, evzo evzoVar) {
        if ((eyawVar.b & 2) != 0) {
            evzk evzkVar = (evzk) evzn.a.createBuilder();
            emwd emwdVar = a;
            exzp exzpVar = eyawVar.d;
            if (exzpVar == null) {
                exzpVar = exzp.a;
            }
            evwv evwvVar = (evwv) emwdVar.fP(exzpVar);
            evzkVar.copyOnWrite();
            evzn evznVar = (evzn) evzkVar.instance;
            evwvVar.getClass();
            evznVar.d = evwvVar;
            evznVar.b |= 2;
            evzm evzmVar = evzm.LIGHT;
            evzkVar.copyOnWrite();
            evzn evznVar2 = (evzn) evzkVar.instance;
            evznVar2.c = evzmVar.d;
            evznVar2.b |= 1;
            evzoVar.a(evzkVar);
        }
        if ((eyawVar.b & 4) != 0) {
            evzk evzkVar2 = (evzk) evzn.a.createBuilder();
            emwd emwdVar2 = a;
            exzp exzpVar2 = eyawVar.e;
            if (exzpVar2 == null) {
                exzpVar2 = exzp.a;
            }
            evwv evwvVar2 = (evwv) emwdVar2.fP(exzpVar2);
            evzkVar2.copyOnWrite();
            evzn evznVar3 = (evzn) evzkVar2.instance;
            evwvVar2.getClass();
            evznVar3.d = evwvVar2;
            evznVar3.b |= 2;
            evzm evzmVar2 = evzm.DARK;
            evzkVar2.copyOnWrite();
            evzn evznVar4 = (evzn) evzkVar2.instance;
            evznVar4.c = evzmVar2.d;
            evznVar4.b |= 1;
            evzoVar.a(evzkVar2);
        }
    }

    @Override // defpackage.dvjz
    public final void g(eyaw eyawVar, evzo evzoVar) {
        eyas eyasVar = eyawVar.c;
        if (eyasVar == null) {
            eyasVar = eyas.a;
        }
        if (eyasVar.c == 7) {
            eyas eyasVar2 = eyawVar.c;
            if (eyasVar2 == null) {
                eyasVar2 = eyas.a;
            }
            String str = eyasVar2.c == 7 ? (String) eyasVar2.d : "";
            evzoVar.copyOnWrite();
            evzr evzrVar = (evzr) evzoVar.instance;
            evzr evzrVar2 = evzr.a;
            str.getClass();
            evzrVar.c = 10;
            evzrVar.d = str;
        }
    }

    @Override // defpackage.dvjz
    public final void h(eyaw eyawVar, evzo evzoVar) {
        eyas eyasVar = eyawVar.c;
        if (eyasVar == null) {
            eyasVar = eyas.a;
        }
        fauw fauwVar = eyasVar.e;
        if (fauwVar == null) {
            fauwVar = fauw.a;
        }
        String str = fauwVar.b;
        evzoVar.copyOnWrite();
        evzr evzrVar = (evzr) evzoVar.instance;
        evzr evzrVar2 = evzr.a;
        str.getClass();
        evzrVar.b |= 256;
        evzrVar.n = str;
    }

    @Override // defpackage.dvjz
    public final void i(eyaw eyawVar, evzo evzoVar) {
        eyav b2 = eyav.b(eyawVar.f);
        if (b2 == null) {
            b2 = eyav.PULSE_ANIMATION_TYPE_UNSPECIFIED;
        }
        if (b2.equals(eyav.PULSE_WITH_INNER_CIRCLE)) {
            exzp exzpVar = eyawVar.d;
            if (exzpVar == null) {
                exzpVar = exzp.a;
            }
            faul faulVar = exzpVar.e;
            if (faulVar == null) {
                faulVar = faul.a;
            }
            evzoVar.copyOnWrite();
            evzr evzrVar = (evzr) evzoVar.instance;
            evzr evzrVar2 = evzr.a;
            faulVar.getClass();
            evzrVar.f = faulVar;
            evzrVar.b |= 2;
        }
    }

    @Override // defpackage.dvjz
    public final void j(eyaw eyawVar, evzo evzoVar) {
        exzp exzpVar = eyawVar.d;
        if (exzpVar == null) {
            exzpVar = exzp.a;
        }
        if ((exzpVar.b & 8) != 0) {
            exzp exzpVar2 = eyawVar.d;
            if (exzpVar2 == null) {
                exzpVar2 = exzp.a;
            }
            faul faulVar = exzpVar2.f;
            if (faulVar == null) {
                faulVar = faul.a;
            }
            evzoVar.copyOnWrite();
            evzr evzrVar = (evzr) evzoVar.instance;
            evzr evzrVar2 = evzr.a;
            faulVar.getClass();
            evzrVar.g = faulVar;
            evzrVar.b |= 4;
        }
    }

    @Override // defpackage.dvjz
    public final void k(eyaw eyawVar, evzo evzoVar) {
        eyas eyasVar = eyawVar.c;
        if (eyasVar == null) {
            eyasVar = eyas.a;
        }
        exzp exzpVar = eyasVar.g;
        if (exzpVar == null) {
            exzpVar = exzp.a;
        }
        if ((exzpVar.b & 16) != 0) {
            eyas eyasVar2 = eyawVar.c;
            if (eyasVar2 == null) {
                eyasVar2 = eyas.a;
            }
            exzp exzpVar2 = eyasVar2.g;
            if (exzpVar2 == null) {
                exzpVar2 = exzp.a;
            }
            faul faulVar = exzpVar2.g;
            if (faulVar == null) {
                faulVar = faul.a;
            }
            evzoVar.copyOnWrite();
            evzr evzrVar = (evzr) evzoVar.instance;
            evzr evzrVar2 = evzr.a;
            faulVar.getClass();
            evzrVar.k = faulVar;
            evzrVar.b |= 64;
        }
    }

    @Override // defpackage.dvjz
    public final void l(eyaw eyawVar, evzo evzoVar) {
        eyas eyasVar = eyawVar.c;
        if (eyasVar == null) {
            eyasVar = eyas.a;
        }
        if ((eyasVar.b & 4) != 0) {
            evzk evzkVar = (evzk) evzn.a.createBuilder();
            emwd emwdVar = a;
            eyas eyasVar2 = eyawVar.c;
            if (eyasVar2 == null) {
                eyasVar2 = eyas.a;
            }
            exzp exzpVar = eyasVar2.g;
            if (exzpVar == null) {
                exzpVar = exzp.a;
            }
            evwv evwvVar = (evwv) emwdVar.fP(exzpVar);
            evzkVar.copyOnWrite();
            evzn evznVar = (evzn) evzkVar.instance;
            evwvVar.getClass();
            evznVar.d = evwvVar;
            evznVar.b |= 2;
            evzm evzmVar = evzm.LIGHT;
            evzkVar.copyOnWrite();
            evzn evznVar2 = (evzn) evzkVar.instance;
            evznVar2.c = evzmVar.d;
            evznVar2.b |= 1;
            evzoVar.b(evzkVar);
        }
        eyas eyasVar3 = eyawVar.c;
        if (eyasVar3 == null) {
            eyasVar3 = eyas.a;
        }
        if ((eyasVar3.b & 8) != 0) {
            evzk evzkVar2 = (evzk) evzn.a.createBuilder();
            emwd emwdVar2 = a;
            eyas eyasVar4 = eyawVar.c;
            if (eyasVar4 == null) {
                eyasVar4 = eyas.a;
            }
            exzp exzpVar2 = eyasVar4.h;
            if (exzpVar2 == null) {
                exzpVar2 = exzp.a;
            }
            evwv evwvVar2 = (evwv) emwdVar2.fP(exzpVar2);
            evzkVar2.copyOnWrite();
            evzn evznVar3 = (evzn) evzkVar2.instance;
            evwvVar2.getClass();
            evznVar3.d = evwvVar2;
            evznVar3.b |= 2;
            evzm evzmVar2 = evzm.DARK;
            evzkVar2.copyOnWrite();
            evzn evznVar4 = (evzn) evzkVar2.instance;
            evznVar4.c = evzmVar2.d;
            evznVar4.b |= 1;
            evzoVar.b(evzkVar2);
        }
    }

    @Override // defpackage.dvjz
    public final void m(eyaw eyawVar, evzo evzoVar) {
        eyas eyasVar = eyawVar.c;
        if (eyasVar == null) {
            eyasVar = eyas.a;
        }
        exzp exzpVar = eyasVar.g;
        if (exzpVar == null) {
            exzpVar = exzp.a;
        }
        if ((exzpVar.b & 2) != 0) {
            eyas eyasVar2 = eyawVar.c;
            if (eyasVar2 == null) {
                eyasVar2 = eyas.a;
            }
            exzp exzpVar2 = eyasVar2.g;
            if (exzpVar2 == null) {
                exzpVar2 = exzp.a;
            }
            faul faulVar = exzpVar2.d;
            if (faulVar == null) {
                faulVar = faul.a;
            }
            evzoVar.copyOnWrite();
            evzr evzrVar = (evzr) evzoVar.instance;
            evzr evzrVar2 = evzr.a;
            faulVar.getClass();
            evzrVar.i = faulVar;
            evzrVar.b |= 16;
        }
    }

    @Override // defpackage.dvjz
    public final void n(eyaw eyawVar, evzo evzoVar) {
        eyas eyasVar = eyawVar.c;
        if (eyasVar == null) {
            eyasVar = eyas.a;
        }
        exzp exzpVar = eyasVar.g;
        if (exzpVar == null) {
            exzpVar = exzp.a;
        }
        if ((exzpVar.b & 1) != 0) {
            eyas eyasVar2 = eyawVar.c;
            if (eyasVar2 == null) {
                eyasVar2 = eyas.a;
            }
            exzp exzpVar2 = eyasVar2.g;
            if (exzpVar2 == null) {
                exzpVar2 = exzp.a;
            }
            faul faulVar = exzpVar2.c;
            if (faulVar == null) {
                faulVar = faul.a;
            }
            evzoVar.copyOnWrite();
            evzr evzrVar = (evzr) evzoVar.instance;
            evzr evzrVar2 = evzr.a;
            faulVar.getClass();
            evzrVar.h = faulVar;
            evzrVar.b |= 8;
        }
    }

    @Override // defpackage.dvjz
    public final void o(eyaw eyawVar, evzo evzoVar) {
        eyas eyasVar = eyawVar.c;
        if (eyasVar == null) {
            eyasVar = eyas.a;
        }
        if (eyasVar.c == 8) {
            eyas eyasVar2 = eyawVar.c;
            if (eyasVar2 == null) {
                eyasVar2 = eyas.a;
            }
            int intValue = eyasVar2.c == 8 ? ((Integer) eyasVar2.d).intValue() : 0;
            evzoVar.copyOnWrite();
            evzr evzrVar = (evzr) evzoVar.instance;
            evzr evzrVar2 = evzr.a;
            evzrVar.c = 11;
            evzrVar.d = Integer.valueOf(intValue);
        }
    }
}
