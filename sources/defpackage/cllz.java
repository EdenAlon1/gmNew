package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cllz extends clkd {
    @Override // defpackage.clkd
    public final void b(axaq axaqVar, clta cltaVar) {
        awwf awwfVar = axaqVar.c;
        if (awwfVar == null) {
            awwfVar = awwf.a;
        }
        awui awuiVar = awwfVar.d;
        if (awuiVar == null) {
            awuiVar = awui.a;
        }
        awwf awwfVar2 = axaqVar.c;
        if (awwfVar2 == null) {
            awwfVar2 = awwf.a;
        }
        clns a = clkl.a(awuiVar, awwfVar2.c);
        cltaVar.copyOnWrite();
        cltb cltbVar = (cltb) cltaVar.instance;
        cltb cltbVar2 = cltb.a;
        a.getClass();
        cltbVar.d = a;
        cltbVar.b |= 4;
    }

    @Override // defpackage.clkd
    public final void c(axaq axaqVar, clta cltaVar) {
        eydp eydpVar = (eydp) eydq.a.createBuilder();
        eyee eyeeVar = axaqVar.e;
        eydpVar.copyOnWrite();
        eydq eydqVar = (eydq) eydpVar.instance;
        eyeeVar.getClass();
        eydqVar.c = eyeeVar;
        cltaVar.copyOnWrite();
        cltb cltbVar = (cltb) cltaVar.instance;
        eydq eydqVar2 = (eydq) eydpVar.build();
        cltb cltbVar2 = cltb.a;
        eydqVar2.getClass();
        cltbVar.c = eydqVar2;
        cltbVar.b |= 1;
    }
}
