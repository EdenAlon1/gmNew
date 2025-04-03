package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvlt extends dvjy {
    static final emwd a = new dvlm();
    static final emwd b = new dvla();

    @Override // defpackage.dvjy
    public final void a(eyas eyasVar, evzx evzxVar) {
        if ((eyasVar.b & 16) != 0) {
            evxh evxhVar = (evxh) evxi.a.createBuilder();
            emwd emwdVar = b;
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
            eyan eyanVar2 = eyasVar.i;
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
            eyan eyanVar3 = eyasVar.i;
            if (eyanVar3 == null) {
                eyanVar3 = eyan.a;
            }
            if ((eyanVar3.b & 4) != 0) {
                evzk evzkVar = (evzk) evzn.a.createBuilder();
                emwd emwdVar2 = a;
                eyan eyanVar4 = eyasVar.i;
                if (eyanVar4 == null) {
                    eyanVar4 = eyan.a;
                }
                exzp exzpVar = eyanVar4.e;
                if (exzpVar == null) {
                    exzpVar = exzp.a;
                }
                evwv evwvVar = (evwv) emwdVar2.fP(exzpVar);
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
            eyan eyanVar5 = eyasVar.i;
            if (eyanVar5 == null) {
                eyanVar5 = eyan.a;
            }
            if ((eyanVar5.b & 8) != 0) {
                evzk evzkVar2 = (evzk) evzn.a.createBuilder();
                emwd emwdVar3 = a;
                eyan eyanVar6 = eyasVar.i;
                if (eyanVar6 == null) {
                    eyanVar6 = eyan.a;
                }
                exzp exzpVar2 = eyanVar6.f;
                if (exzpVar2 == null) {
                    exzpVar2 = exzp.a;
                }
                evwv evwvVar2 = (evwv) emwdVar3.fP(exzpVar2);
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
            evzxVar.copyOnWrite();
            ewab ewabVar = (ewab) evzxVar.instance;
            evxi evxiVar3 = (evxi) evxhVar.build();
            ewab ewabVar2 = ewab.a;
            evxiVar3.getClass();
            ewabVar.j = evxiVar3;
            ewabVar.b |= 16;
        }
    }

    @Override // defpackage.dvjy
    public final void b(eyas eyasVar, evzx evzxVar) {
        int i = eyasVar.b;
        if ((i & 4) != 0) {
            exzp exzpVar = eyasVar.g;
            if (exzpVar == null) {
                exzpVar = exzp.a;
            }
            faul faulVar = exzpVar.e;
            if (faulVar == null) {
                faulVar = faul.a;
            }
            evzxVar.copyOnWrite();
            ewab ewabVar = (ewab) evzxVar.instance;
            ewab ewabVar2 = ewab.a;
            faulVar.getClass();
            ewabVar.e = faulVar;
            ewabVar.b |= 1;
            return;
        }
        if ((i & 8) == 0) {
            evzxVar.copyOnWrite();
            ewab ewabVar3 = (ewab) evzxVar.instance;
            ewab ewabVar4 = ewab.a;
            ewabVar3.e = null;
            ewabVar3.b &= -2;
            return;
        }
        exzp exzpVar2 = eyasVar.h;
        if (exzpVar2 == null) {
            exzpVar2 = exzp.a;
        }
        faul faulVar2 = exzpVar2.e;
        if (faulVar2 == null) {
            faulVar2 = faul.a;
        }
        evzxVar.copyOnWrite();
        ewab ewabVar5 = (ewab) evzxVar.instance;
        ewab ewabVar6 = ewab.a;
        faulVar2.getClass();
        ewabVar5.e = faulVar2;
        ewabVar5.b |= 1;
    }

    @Override // defpackage.dvjy
    public final void c(eyas eyasVar, evzx evzxVar) {
        if ((eyasVar.b & 2) != 0) {
            fauw fauwVar = eyasVar.f;
            if (fauwVar == null) {
                fauwVar = fauw.a;
            }
            String str = fauwVar.b;
            evzxVar.copyOnWrite();
            ewab ewabVar = (ewab) evzxVar.instance;
            ewab ewabVar2 = ewab.a;
            str.getClass();
            ewabVar.b |= 8;
            ewabVar.h = str;
        }
    }

    @Override // defpackage.dvjy
    public final void d(eyas eyasVar, evzx evzxVar) {
        if ((eyasVar.b & 1) != 0) {
            fauw fauwVar = eyasVar.e;
            if (fauwVar == null) {
                fauwVar = fauw.a;
            }
            String str = fauwVar.b;
            evzxVar.copyOnWrite();
            ewab ewabVar = (ewab) evzxVar.instance;
            ewab ewabVar2 = ewab.a;
            str.getClass();
            ewabVar.b |= 4;
            ewabVar.g = str;
        }
    }

    @Override // defpackage.dvjy
    public final void e(eyas eyasVar, evzx evzxVar) {
        if ((eyasVar.b & 4) != 0) {
            evzk evzkVar = (evzk) evzn.a.createBuilder();
            emwd emwdVar = a;
            exzp exzpVar = eyasVar.g;
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
            evzxVar.a(evzkVar);
        }
        if ((eyasVar.b & 8) != 0) {
            evzk evzkVar2 = (evzk) evzn.a.createBuilder();
            emwd emwdVar2 = a;
            exzp exzpVar2 = eyasVar.h;
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
            evzxVar.a(evzkVar2);
        }
    }

    @Override // defpackage.dvjy
    public final void f(eyas eyasVar, evzx evzxVar) {
        if ((eyasVar.b & 32) != 0) {
            int a2 = eyar.a(eyasVar.j);
            if (a2 == 0) {
                a2 = 1;
            }
            int i = a2 - 1;
            int i2 = i != 0 ? i != 1 ? 3 : 2 : 1;
            evzxVar.copyOnWrite();
            ewab ewabVar = (ewab) evzxVar.instance;
            ewab ewabVar2 = ewab.a;
            ewabVar.l = i2 - 1;
            ewabVar.b |= 64;
        }
    }

    @Override // defpackage.dvjy
    public final void g(eyas eyasVar, evzx evzxVar) {
        int i = eyasVar.b;
        if ((i & 4) != 0) {
            exzp exzpVar = eyasVar.g;
            if (exzpVar == null) {
                exzpVar = exzp.a;
            }
            faul faulVar = exzpVar.c;
            if (faulVar == null) {
                faulVar = faul.a;
            }
            evzxVar.copyOnWrite();
            ewab ewabVar = (ewab) evzxVar.instance;
            ewab ewabVar2 = ewab.a;
            faulVar.getClass();
            ewabVar.f = faulVar;
            ewabVar.b |= 2;
            return;
        }
        if ((i & 8) == 0) {
            evzxVar.copyOnWrite();
            ewab ewabVar3 = (ewab) evzxVar.instance;
            ewab ewabVar4 = ewab.a;
            ewabVar3.f = null;
            ewabVar3.b &= -3;
            return;
        }
        exzp exzpVar2 = eyasVar.h;
        if (exzpVar2 == null) {
            exzpVar2 = exzp.a;
        }
        faul faulVar2 = exzpVar2.c;
        if (faulVar2 == null) {
            faulVar2 = faul.a;
        }
        evzxVar.copyOnWrite();
        ewab ewabVar5 = (ewab) evzxVar.instance;
        ewab ewabVar6 = ewab.a;
        faulVar2.getClass();
        ewabVar5.f = faulVar2;
        ewabVar5.b |= 2;
    }
}
