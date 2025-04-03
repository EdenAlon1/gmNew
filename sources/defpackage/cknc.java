package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cknc {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ckby d;
    private final avla e;
    private final avtu f;
    private final ffbr g;

    public cknc(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ckby ckbyVar, avla avlaVar, avtu avtuVar, ffbr ffbrVar4) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ckbyVar.getClass();
        avlaVar.getClass();
        avtuVar.getClass();
        ffbrVar4.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ckbyVar;
        this.e = avlaVar;
        this.f = avtuVar;
        this.g = ffbrVar4;
    }

    public static /* synthetic */ void m(cknc ckncVar, String str, awud awudVar, int i) {
        if ((i & 2) != 0) {
            awudVar = null;
        }
        ckncVar.q(str, awudVar, 2);
    }

    public static /* synthetic */ void r(cknc ckncVar, int i, int i2, String str, axad axadVar, eoml eomlVar, eqxi eqxiVar, int i3) {
        fjay fjayVar;
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.getClass();
        eoop eoopVar = (eoop) eopq.a.createBuilder();
        eoopVar.getClass();
        if ((i3 & 8) != 0) {
            axadVar = null;
        }
        if (axadVar != null && (fjayVar = (fjay) ((avuh) ckncVar.c.b()).m().fP(axadVar)) != null) {
            eoopVar.copyOnWrite();
            eopq eopqVar = (eopq) eoopVar.instance;
            eopqVar.o = fjayVar;
            eopqVar.b |= 1024;
        }
        if ((i3 & 32) != 0) {
            eqxiVar = null;
        }
        if (eqxiVar != null) {
            eohm.d(eqxiVar, eoopVar);
        }
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        eogy.d(eohm.a(eoopVar), eoluVar);
        int a = ckncVar.d.a(ckcf.s);
        eogy.g(eolt.BUGLE_GROUP, eoluVar);
        eomj eomjVar = (eomj) eomn.a.createBuilder();
        eomjVar.getClass();
        eomjVar.copyOnWrite();
        eomn eomnVar = (eomn) eomjVar.instance;
        eomnVar.c = i - 1;
        eomnVar.b |= 1;
        if (i2 == 0) {
            throw null;
        }
        eomjVar.copyOnWrite();
        eomn eomnVar2 = (eomn) eomjVar.instance;
        eomnVar2.d = i2 - 1;
        eomnVar2.b |= 2;
        eqwf eqwfVar = ((djrv) ckncVar.g.b()).d(a).a;
        eqwfVar.getClass();
        eomjVar.copyOnWrite();
        eomn eomnVar3 = (eomn) eomjVar.instance;
        eomnVar3.f = eqwfVar.N;
        eomnVar3.b |= 8;
        if (axadVar != null) {
            eohc.a(axadVar.c, eomjVar);
        } else {
            if ((i3 & 4) != 0) {
                str = null;
            }
            if (str != null) {
                eohc.a(str, eomjVar);
            }
        }
        if ((i3 & 16) != 0) {
            eomlVar = null;
        }
        if (eomlVar != null) {
            eomjVar.copyOnWrite();
            eomn eomnVar4 = (eomn) eomjVar.instance;
            eomnVar4.g = eomlVar;
            eomnVar4.b |= 16;
        }
        eyfy build = eomjVar.build();
        build.getClass();
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.C = (eomn) build;
        eolvVar.b |= 4194304;
        eyfq builder = eogy.a(eoluVar).toBuilder();
        builder.getClass();
        akxn a2 = ((akyb) ckncVar.a.b()).a();
        a2.d(epyw.BUGLE_GROUP);
        a2.j((eolu) builder, alal.LOG_SPEC_GROUP_OPERATION_EVENT);
    }

    public final axad a() {
        fjay a = cslr.a();
        a.getClass();
        Object fP = ((avuh) this.c.b()).fP(a);
        fP.getClass();
        return (axad) fP;
    }

    public final axad b() {
        axad a = a();
        r(this, 2, 0, null, a, null, null, 54);
        return a;
    }

    public final void c(awtx awtxVar) {
        awtt awttVar;
        awtxVar.getClass();
        try {
            awttVar = (awtt) eyfy.parseFrom(awtt.a, awtxVar.d, eyfc.a());
        } catch (eygu unused) {
            awttVar = null;
        }
        String str = awttVar != null ? awttVar.e : null;
        awud awudVar = awtxVar.c;
        if (awudVar == null) {
            awudVar = awud.a;
        }
        r(this, 17, 3, str, null, null, n(3, awudVar), 24);
    }

    public final void d() {
        r(this, 17, 3, null, null, null, n(3, null), 24);
    }

    public final void e(UUID uuid) {
        uuid.getClass();
        String uuid2 = uuid.toString();
        eqxh eqxhVar = (eqxh) eqxi.a.createBuilder();
        eqxhVar.getClass();
        eqxj eqxjVar = (eqxj) eqxk.a.createBuilder();
        eqxjVar.getClass();
        eqxt.d(2, eqxjVar);
        eqxt.c(eqwy.CHAT_API_FAILED_PERMANENTLY, eqxjVar);
        eqxt.b(eqww.CHAT_API_INVALID_REMOTE_PARTICIPANT, eqxjVar);
        eqwp.b(eqxt.a(eqxjVar), eqxhVar);
        r(this, 17, 3, uuid2, null, null, eqwp.a(eqxhVar), 24);
    }

    public final void f(UUID uuid) {
        uuid.getClass();
        r(this, 16, 0, uuid.toString(), null, null, null, 58);
    }

    public final void g(awut awutVar, awud awudVar) {
        awudVar.getClass();
        if (awutVar.d) {
            return;
        }
        axad axadVar = awutVar.e;
        if (axadVar == null) {
            axadVar = axad.a;
        }
        r(this, 3, 3, null, axadVar, null, n(3, awudVar), 20);
    }

    public final void h() {
        r(this, 3, 3, null, null, null, n(3, null), 20);
    }

    @ffbs
    public final void i(String str, awud awudVar) {
        str.getClass();
        awudVar.getClass();
        p(str, awudVar, 2);
    }

    public final void j(String str) {
        str.getClass();
        m(this, str, null, 6);
    }

    public final void k(String str) {
        str.getClass();
        r(this, 21, 2, str, null, null, null, 56);
    }

    public final void l(axad axadVar, eqww eqwwVar) {
        axadVar.getClass();
        eqwwVar.getClass();
        eqxh eqxhVar = (eqxh) eqxi.a.createBuilder();
        eqxhVar.getClass();
        eqxj eqxjVar = (eqxj) eqxk.a.createBuilder();
        eqxjVar.getClass();
        eqxt.d(2, eqxjVar);
        eqxt.c(eqwy.CHAT_API_FAILED_PERMANENTLY, eqxjVar);
        eqxt.b(eqwwVar, eqxjVar);
        eqwp.b(eqxt.a(eqxjVar), eqxhVar);
        r(this, 19, 3, null, axadVar, null, eqwp.a(eqxhVar), 20);
    }

    public final eqxi n(int i, awud awudVar) {
        eqxh eqxhVar = (eqxh) eqxi.a.createBuilder();
        eqxhVar.getClass();
        eqxj eqxjVar = (eqxj) eqxk.a.createBuilder();
        eqxjVar.getClass();
        eqxt.d(i, eqxjVar);
        if (awudVar != null) {
            awuc b = awuc.b(awudVar.c);
            if (b == null) {
                b = awuc.UNKNOWN_STATUS;
            }
            if (b != null) {
                eqxt.c((eqwy) emwe.a(this.e, b), eqxjVar);
            }
        }
        if (awudVar != null) {
            awua b2 = awua.b(awudVar.d);
            if (b2 == null) {
                b2 = awua.UNKNOWN_CAUSE;
            }
            if (b2 != null) {
                eqxt.b((eqww) emwe.a(this.f, b2), eqxjVar);
            }
        }
        eqwp.b(eqxt.a(eqxjVar), eqxhVar);
        return eqwp.a(eqxhVar);
    }

    public final void o(axad axadVar, awud awudVar, int i) {
        axadVar.getClass();
        awudVar.getClass();
        awuc b = awuc.b(awudVar.c);
        if (b == null) {
            b = awuc.UNKNOWN_STATUS;
        }
        if (b == awuc.OK) {
            r(this, 26, 2, null, axadVar, null, null, 52);
        } else {
            r(this, 26, 3, null, axadVar, null, n(i, awudVar), 20);
        }
    }

    @ffbs
    public final void p(String str, awud awudVar, int i) {
        str.getClass();
        awudVar.getClass();
        r(this, 23, 3, str, null, null, n(i, awudVar), 24);
    }

    public final void q(String str, awud awudVar, int i) {
        str.getClass();
        r(this, 21, 3, str, null, null, n(i, awudVar), 24);
    }
}
