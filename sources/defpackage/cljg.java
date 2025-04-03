package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cljg extends clji {
    @Override // defpackage.clji
    public final void a(clne clneVar, awtw awtwVar) {
        clqc clqcVar = clneVar.d;
        if (clqcVar == null) {
            clqcVar = clqc.a;
        }
        awud a = clkk.a(clqcVar);
        awtwVar.copyOnWrite();
        awtx awtxVar = (awtx) awtwVar.instance;
        awtx awtxVar2 = awtx.a;
        a.getClass();
        awtxVar.c = a;
        awtxVar.b |= 1;
    }

    @Override // defpackage.clji
    public final void b(clne clneVar, awtw awtwVar) {
        if ((clneVar.b & 1) != 0) {
            eydq eydqVar = clneVar.c;
            if (eydqVar == null) {
                eydqVar = eydq.a;
            }
            eyee eyeeVar = eydqVar.c;
            awtwVar.copyOnWrite();
            awtx awtxVar = (awtx) awtwVar.instance;
            awtx awtxVar2 = awtx.a;
            eyeeVar.getClass();
            awtxVar.b |= 2;
            awtxVar.d = eyeeVar;
        }
    }
}
