package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avle {
    private final ffbr a;
    private final cqoh b;
    private final avuh c;

    public avle(ffbr ffbrVar, cqoh cqohVar, avuh avuhVar) {
        this.a = ffbrVar;
        this.b = cqohVar;
        this.c = avuhVar;
    }

    public final void a(axad axadVar, bdhg bdhgVar) {
        e(axadVar, bdhgVar, 21, 8, 5);
    }

    public final void b(axad axadVar, bdhg bdhgVar) {
        e(axadVar, bdhgVar, 21, 8, 6);
    }

    public final void c(Optional optional, bdhg bdhgVar) {
        if (optional.isEmpty()) {
            return;
        }
        e((axad) optional.get(), bdhgVar, 21, 8, 4);
    }

    public final void d(Optional optional, bdhg bdhgVar) {
        if (optional.isEmpty()) {
            return;
        }
        e((axad) optional.get(), bdhgVar, 21, 8, 9);
    }

    public final void e(axad axadVar, bdhg bdhgVar, int i, int i2, int i3) {
        fjay fjayVar = (fjay) this.c.m().fP(axadVar);
        if (cslz.a(fjayVar)) {
            fgkd fgkdVar = (fgkd) fgki.a.createBuilder();
            fgkdVar.copyOnWrite();
            fgki fgkiVar = (fgki) fgkdVar.instance;
            fjayVar.getClass();
            fgkiVar.c = fjayVar;
            fgkiVar.b |= 1;
            if (bdhg.l(bdhgVar)) {
                fgkb fgkbVar = (fgkb) fgkc.a.createBuilder();
                fgkbVar.a(bdhgVar.f());
                fgkdVar.copyOnWrite();
                fgki fgkiVar2 = (fgki) fgkdVar.instance;
                fgkc fgkcVar = (fgkc) fgkbVar.build();
                fgkcVar.getClass();
                fgkiVar2.d = fgkcVar;
                fgkiVar2.b |= 2;
            }
            fgkdVar.copyOnWrite();
            ((fgki) fgkdVar.instance).f = fjaz.a(i);
            fgkdVar.copyOnWrite();
            ((fgki) fgkdVar.instance).g = fgkg.a(i2);
            fgkdVar.copyOnWrite();
            ((fgki) fgkdVar.instance).e = fgkh.a(i3);
            eyja d = eykm.d(this.b.f().toEpochMilli());
            fgkdVar.copyOnWrite();
            fgki fgkiVar3 = (fgki) fgkdVar.instance;
            d.getClass();
            fgkiVar3.h = d;
            fgkiVar3.b |= 4;
            akxl akxlVar = (akxl) this.a.b();
            eolu eoluVar = (eolu) eolv.a.createBuilder();
            eolt eoltVar = eolt.XSL_REQUEST_EVENT;
            eoluVar.copyOnWrite();
            eolv eolvVar = (eolv) eoluVar.instance;
            eolvVar.j = eoltVar.dk;
            eolvVar.b |= 1;
            eoluVar.copyOnWrite();
            eolv eolvVar2 = (eolv) eoluVar.instance;
            fgki fgkiVar4 = (fgki) fgkdVar.build();
            fgkiVar4.getClass();
            eolvVar2.aY = fgkiVar4;
            eolvVar2.e |= 16777216;
            akxlVar.j(eoluVar);
        }
    }
}
