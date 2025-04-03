package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpor {
    private final ffbr a;
    private final cqoh b;
    private final avuh c;

    public cpor(ffbr ffbrVar, cqoh cqohVar, avuh avuhVar) {
        this.a = ffbrVar;
        this.b = cqohVar;
        this.c = avuhVar;
    }

    public final void a(awyz awyzVar) {
        if ((awyzVar.b & 2048) != 0) {
            axad axadVar = awyzVar.n;
            if (axadVar == null) {
                axadVar = axad.a;
            }
            d(axadVar, bdhg.a(awyzVar.h), 4);
        }
    }

    public final void b(awyz awyzVar) {
        if ((awyzVar.b & 2048) != 0) {
            axad axadVar = awyzVar.n;
            if (axadVar == null) {
                axadVar = axad.a;
            }
            d(axadVar, bdhg.a(awyzVar.h), 9);
        }
    }

    public final void c(fjay fjayVar, bdhg bdhgVar, int i, int i2) {
        if (cslz.a(fjayVar)) {
            akxl akxlVar = (akxl) this.a.b();
            eolu eoluVar = (eolu) eolv.a.createBuilder();
            eolt eoltVar = eolt.XSL_REQUEST_EVENT;
            eoluVar.copyOnWrite();
            eolv eolvVar = (eolv) eoluVar.instance;
            eolvVar.j = eoltVar.dk;
            eolvVar.b |= 1;
            fgkd fgkdVar = (fgkd) fgki.a.createBuilder();
            fgkdVar.copyOnWrite();
            fgki fgkiVar = (fgki) fgkdVar.instance;
            fjayVar.getClass();
            fgkiVar.c = fjayVar;
            fgkiVar.b |= 1;
            fgkb fgkbVar = (fgkb) fgkc.a.createBuilder();
            fgkbVar.a(bdhgVar.f());
            fgkdVar.copyOnWrite();
            fgki fgkiVar2 = (fgki) fgkdVar.instance;
            fgkc fgkcVar = (fgkc) fgkbVar.build();
            fgkcVar.getClass();
            fgkiVar2.d = fgkcVar;
            fgkiVar2.b |= 2;
            fgkdVar.copyOnWrite();
            ((fgki) fgkdVar.instance).f = fjaz.a(27);
            fgkdVar.copyOnWrite();
            ((fgki) fgkdVar.instance).e = fgkh.a(i);
            fgkdVar.copyOnWrite();
            ((fgki) fgkdVar.instance).g = fgkg.a(i2);
            eyja d = eykm.d(this.b.f().toEpochMilli());
            fgkdVar.copyOnWrite();
            fgki fgkiVar3 = (fgki) fgkdVar.instance;
            d.getClass();
            fgkiVar3.h = d;
            fgkiVar3.b |= 4;
            eoluVar.copyOnWrite();
            eolv eolvVar2 = (eolv) eoluVar.instance;
            fgki fgkiVar4 = (fgki) fgkdVar.build();
            fgkiVar4.getClass();
            eolvVar2.aY = fgkiVar4;
            eolvVar2.e |= 16777216;
            akxlVar.j(eoluVar);
        }
    }

    public final void d(axad axadVar, bdhg bdhgVar, int i) {
        c((fjay) this.c.m().fP(axadVar), bdhgVar, i, 42);
    }
}
