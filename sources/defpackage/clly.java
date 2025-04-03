package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clly extends clkc {
    @Override // defpackage.clkc
    public final void b(clsp clspVar, axak axakVar) {
        clqc clqcVar = clspVar.d;
        if (clqcVar == null) {
            clqcVar = clqc.a;
        }
        awud a = clkk.a(clqcVar);
        axakVar.copyOnWrite();
        axal axalVar = (axal) axakVar.instance;
        axal axalVar2 = axal.a;
        a.getClass();
        axalVar.c = a;
        axalVar.b |= 1;
    }

    @Override // defpackage.clkc
    public final void c(clsp clspVar, axak axakVar) {
        if ((clspVar.b & 1) != 0) {
            eydq eydqVar = clspVar.c;
            if (eydqVar == null) {
                eydqVar = eydq.a;
            }
            eyee eyeeVar = eydqVar.c;
            axakVar.copyOnWrite();
            axal axalVar = (axal) axakVar.instance;
            axal axalVar2 = axal.a;
            eyeeVar.getClass();
            axalVar.b |= 2;
            axalVar.d = eyeeVar;
        }
    }
}
