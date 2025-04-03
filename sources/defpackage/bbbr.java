package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbbr {
    private final ffbr a;
    private final cqoh b;

    public bbbr(ffbr ffbrVar, cqoh cqohVar) {
        this.a = ffbrVar;
        this.b = cqohVar;
    }

    public final void a(bbbq bbbqVar) {
        bbbl bbblVar = (bbbl) bbbqVar;
        eyja eyjaVar = bbblVar.d;
        if (eyjaVar == null) {
            eyjaVar = eykm.d(this.b.f().toEpochMilli());
        }
        b(bbblVar.a, bbblVar.b, bbblVar.e, bbblVar.f, bbblVar.g, Optional.ofNullable(bbblVar.c), eyjaVar);
    }

    public final void b(fjay fjayVar, bdhg bdhgVar, int i, int i2, int i3, Optional optional, eyja eyjaVar) {
        if (cslz.a(fjayVar)) {
            fgkd fgkdVar = (fgkd) fgki.a.createBuilder();
            fgkdVar.copyOnWrite();
            ((fgki) fgkdVar.instance).e = fgkh.a(i);
            fgkdVar.copyOnWrite();
            ((fgki) fgkdVar.instance).f = fjaz.a(i2);
            fgkdVar.copyOnWrite();
            ((fgki) fgkdVar.instance).g = fgkg.a(i3);
            fgkdVar.copyOnWrite();
            fgki fgkiVar = (fgki) fgkdVar.instance;
            eyjaVar.getClass();
            fgkiVar.h = eyjaVar;
            fgkiVar.b |= 4;
            if (fjayVar != null) {
                fgkdVar.copyOnWrite();
                fgki fgkiVar2 = (fgki) fgkdVar.instance;
                fgkiVar2.c = fjayVar;
                fgkiVar2.b |= 1;
            }
            if (optional.isPresent()) {
                fgke fgkeVar = (fgke) fgkf.a.createBuilder();
                fgjz fgjzVar = (fgjz) optional.get();
                fgkeVar.copyOnWrite();
                fgkf fgkfVar = (fgkf) fgkeVar.instance;
                fgkfVar.c = Integer.valueOf(fgjzVar.a());
                fgkfVar.b = 2;
                fgkdVar.copyOnWrite();
                fgki fgkiVar3 = (fgki) fgkdVar.instance;
                fgkf fgkfVar2 = (fgkf) fgkeVar.build();
                fgkfVar2.getClass();
                fgkiVar3.i = fgkfVar2;
                fgkiVar3.b |= 32;
            }
            if (bdhgVar != null && bdhg.l(bdhgVar)) {
                fgkb fgkbVar = (fgkb) fgkc.a.createBuilder();
                fgkbVar.a(bdhgVar.f());
                fgkdVar.copyOnWrite();
                fgki fgkiVar4 = (fgki) fgkdVar.instance;
                fgkc fgkcVar = (fgkc) fgkbVar.build();
                fgkcVar.getClass();
                fgkiVar4.d = fgkcVar;
                fgkiVar4.b |= 2;
            }
            long b = eykm.b(eyjaVar);
            akxl akxlVar = (akxl) this.a.b();
            eolu eoluVar = (eolu) eolv.a.createBuilder();
            eolt eoltVar = eolt.XSL_REQUEST_EVENT;
            eoluVar.copyOnWrite();
            eolv eolvVar = (eolv) eoluVar.instance;
            eolvVar.j = eoltVar.dk;
            eolvVar.b |= 1;
            eoluVar.copyOnWrite();
            eolv eolvVar2 = (eolv) eoluVar.instance;
            fgki fgkiVar5 = (fgki) fgkdVar.build();
            fgkiVar5.getClass();
            eolvVar2.aY = fgkiVar5;
            eolvVar2.e |= 16777216;
            akxlVar.l(eoluVar, epyw.XSL_REQUEST_EVENT, b);
        }
    }

    public final void c(fjay fjayVar, bdhg bdhgVar, int i, Optional optional) {
        b(fjayVar, bdhgVar, 10, 21, i, optional, eykm.d(this.b.f().toEpochMilli()));
    }
}
