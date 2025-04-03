package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cllp extends cljv {
    @Override // defpackage.cljv
    public final void b(clrn clrnVar, awys awysVar) {
        clqc clqcVar = clrnVar.d;
        if (clqcVar == null) {
            clqcVar = clqc.a;
        }
        awud a = clkk.a(clqcVar);
        awysVar.copyOnWrite();
        awyt awytVar = (awyt) awysVar.instance;
        awyt awytVar2 = awyt.a;
        a.getClass();
        awytVar.c = a;
        awytVar.b |= 1;
    }

    @Override // defpackage.cljv
    public final void c(clrn clrnVar, awys awysVar) {
        if ((clrnVar.b & 1) != 0) {
            eydq eydqVar = clrnVar.c;
            if (eydqVar == null) {
                eydqVar = eydq.a;
            }
            eyee eyeeVar = eydqVar.c;
            awysVar.copyOnWrite();
            awyt awytVar = (awyt) awysVar.instance;
            awyt awytVar2 = awyt.a;
            eyeeVar.getClass();
            awytVar.b |= 2;
            awytVar.d = eyeeVar;
        }
    }
}
