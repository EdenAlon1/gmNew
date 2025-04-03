package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clln extends cljt {
    @Override // defpackage.cljt
    public final void b(clqz clqzVar, awym awymVar) {
        clqc clqcVar = clqzVar.d;
        if (clqcVar == null) {
            clqcVar = clqc.a;
        }
        awud a = clkk.a(clqcVar);
        awymVar.copyOnWrite();
        awyn awynVar = (awyn) awymVar.instance;
        awyn awynVar2 = awyn.a;
        a.getClass();
        awynVar.c = a;
        awynVar.b |= 1;
    }

    @Override // defpackage.cljt
    public final void c(clqz clqzVar, awym awymVar) {
        if ((clqzVar.b & 1) != 0) {
            eydq eydqVar = clqzVar.c;
            if (eydqVar == null) {
                eydqVar = eydq.a;
            }
            eyee eyeeVar = eydqVar.c;
            awymVar.copyOnWrite();
            awyn awynVar = (awyn) awymVar.instance;
            awyn awynVar2 = awyn.a;
            eyeeVar.getClass();
            awynVar.b |= 2;
            awynVar.d = eyeeVar;
        }
    }
}
