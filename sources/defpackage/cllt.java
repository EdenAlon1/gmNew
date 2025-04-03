package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cllt extends cljy {
    private final cqoh a;
    private final clhi b;

    public cllt(cqoh cqohVar, clhi clhiVar) {
        this.b = clhiVar;
        this.a = cqohVar;
    }

    @Override // defpackage.cljy
    public final void b(clsd clsdVar, awzc awzcVar) {
        clqc clqcVar = clsdVar.e;
        if (clqcVar == null) {
            clqcVar = clqc.a;
        }
        awud a = clkk.a(clqcVar);
        awzcVar.copyOnWrite();
        awzd awzdVar = (awzd) awzcVar.instance;
        awzd awzdVar2 = awzd.a;
        a.getClass();
        awzdVar.c = a;
        awzdVar.b |= 1;
    }

    @Override // defpackage.cljy
    public final void c(clsd clsdVar, awzc awzcVar) {
        if ((clsdVar.b & 1) != 0) {
            eydq eydqVar = clsdVar.c;
            if (eydqVar == null) {
                eydqVar = eydq.a;
            }
            eyee eyeeVar = eydqVar.c;
            awzcVar.copyOnWrite();
            awzd awzdVar = (awzd) awzcVar.instance;
            awzd awzdVar2 = awzd.a;
            eyeeVar.getClass();
            awzdVar.b |= 2;
            awzdVar.d = eyeeVar;
        }
    }

    @Override // defpackage.cljy
    public final void d(clsd clsdVar, awzc awzcVar) {
        clqc clqcVar = clsdVar.e;
        if (clqcVar == null) {
            clqcVar = clqc.a;
        }
        clog b = clog.b(clqcVar.c);
        if (b == null) {
            b = clog.ERROR_CODE_UNKNOWN;
        }
        if (b != clog.ERROR_CODE_OK) {
            clqc clqcVar2 = clsdVar.e;
            if (clqcVar2 == null) {
                clqcVar2 = clqc.a;
            }
            awyo awyoVar = (awyo) awyp.a.createBuilder();
            clrl clrlVar = clqcVar2.e;
            if (clrlVar == null) {
                clrlVar = clrl.a;
            }
            int a = clrk.a(clrlVar.c);
            boolean z = false;
            if (a != 0 && a == 3) {
                z = true;
            }
            awyoVar.copyOnWrite();
            awyp awypVar = (awyp) awyoVar.instance;
            awypVar.b = 1 | awypVar.b;
            awypVar.c = z;
            clrl clrlVar2 = clqcVar2.e;
            if (((clrlVar2 == null ? clrl.a : clrlVar2).b & 2) != 0) {
                if (clrlVar2 == null) {
                    clrlVar2 = clrl.a;
                }
                eyev eyevVar = clrlVar2.d;
                if (eyevVar == null) {
                    eyevVar = eyev.a;
                }
                awyoVar.copyOnWrite();
                awyp awypVar2 = (awyp) awyoVar.instance;
                eyevVar.getClass();
                awypVar2.d = eyevVar;
                awypVar2.b |= 2;
            }
            awyp awypVar3 = (awyp) awyoVar.build();
            awzcVar.copyOnWrite();
            awzd awzdVar = (awzd) awzcVar.instance;
            awzd awzdVar2 = awzd.a;
            awypVar3.getClass();
            awzdVar.g = awypVar3;
            awzdVar.b |= 16;
        }
    }

    @Override // defpackage.cljy
    public final void e(awzc awzcVar) {
        eyja b = eykj.b(this.a.f());
        awzcVar.copyOnWrite();
        awzd awzdVar = (awzd) awzcVar.instance;
        awzd awzdVar2 = awzd.a;
        b.getClass();
        awzdVar.e = b;
        awzdVar.b |= 4;
    }

    @Override // defpackage.cljy
    public final void f(awzc awzcVar) {
        eopq a = this.b.a();
        awzcVar.copyOnWrite();
        awzd awzdVar = (awzd) awzcVar.instance;
        awzd awzdVar2 = awzd.a;
        a.getClass();
        awzdVar.h = a;
        awzdVar.b |= 32;
    }
}
