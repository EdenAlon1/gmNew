package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cllx extends clkb {
    @Override // defpackage.clkb
    public final void b(axaj axajVar, clss clssVar) {
        awwf awwfVar = axajVar.c;
        if (awwfVar == null) {
            awwfVar = awwf.a;
        }
        awui awuiVar = awwfVar.d;
        if (awuiVar == null) {
            awuiVar = awui.a;
        }
        awwf awwfVar2 = axajVar.c;
        if (awwfVar2 == null) {
            awwfVar2 = awwf.a;
        }
        clns a = clkl.a(awuiVar, awwfVar2.c);
        clssVar.copyOnWrite();
        clst clstVar = (clst) clssVar.instance;
        clst clstVar2 = clst.a;
        a.getClass();
        clstVar.d = a;
        clstVar.b |= 4;
    }

    @Override // defpackage.clkb
    public final void c(axaj axajVar, clss clssVar) {
        eydp eydpVar = (eydp) eydq.a.createBuilder();
        eyee eyeeVar = axajVar.d;
        eydpVar.copyOnWrite();
        eydq eydqVar = (eydq) eydpVar.instance;
        eyeeVar.getClass();
        eydqVar.c = eyeeVar;
        clssVar.copyOnWrite();
        clst clstVar = (clst) clssVar.instance;
        eydq eydqVar2 = (eydq) eydpVar.build();
        clst clstVar2 = clst.a;
        eydqVar2.getClass();
        clstVar.c = eydqVar2;
        clstVar.b |= 1;
    }
}
