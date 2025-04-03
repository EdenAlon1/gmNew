package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cllo extends clju {
    @Override // defpackage.clju
    public final void b(awyr awyrVar, clrq clrqVar) {
        awui awuiVar = awyrVar.c;
        if (awuiVar == null) {
            awuiVar = awui.a;
        }
        clns a = clkl.a(awuiVar, awyrVar.e);
        clrqVar.copyOnWrite();
        clrr clrrVar = (clrr) clrqVar.instance;
        clrr clrrVar2 = clrr.a;
        a.getClass();
        clrrVar.d = a;
        clrrVar.b |= 4;
    }

    @Override // defpackage.clju
    public final void c(awyr awyrVar, clrq clrqVar) {
        eydp eydpVar = (eydp) eydq.a.createBuilder();
        eyee eyeeVar = awyrVar.f;
        eydpVar.copyOnWrite();
        eydq eydqVar = (eydq) eydpVar.instance;
        eyeeVar.getClass();
        eydqVar.c = eyeeVar;
        clrqVar.copyOnWrite();
        clrr clrrVar = (clrr) clrqVar.instance;
        eydq eydqVar2 = (eydq) eydpVar.build();
        clrr clrrVar2 = clrr.a;
        eydqVar2.getClass();
        clrrVar.c = eydqVar2;
        clrrVar.b |= 1;
    }

    @Override // defpackage.clju
    public final void d(awyr awyrVar, clrq clrqVar) {
        clqw clqwVar = (clqw) clqx.a.createBuilder();
        String str = awyrVar.d;
        clqwVar.copyOnWrite();
        clqx clqxVar = (clqx) clqwVar.instance;
        str.getClass();
        clqxVar.b |= 1;
        clqxVar.c = str;
        clqx clqxVar2 = (clqx) clqwVar.build();
        clrqVar.copyOnWrite();
        clrr clrrVar = (clrr) clrqVar.instance;
        clrr clrrVar2 = clrr.a;
        clqxVar2.getClass();
        clrrVar.e = clqxVar2;
        clrrVar.b |= 16;
    }
}
