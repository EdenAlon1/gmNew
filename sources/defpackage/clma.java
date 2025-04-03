package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clma extends clke {
    @Override // defpackage.clke
    public final void b(clsx clsxVar, axas axasVar) {
        clqc clqcVar = clsxVar.d;
        if (clqcVar == null) {
            clqcVar = clqc.a;
        }
        awud a = clkk.a(clqcVar);
        axasVar.copyOnWrite();
        axat axatVar = (axat) axasVar.instance;
        axat axatVar2 = axat.a;
        a.getClass();
        axatVar.c = a;
        axatVar.b |= 1;
    }

    @Override // defpackage.clke
    public final void c(clsx clsxVar, axas axasVar) {
        if ((clsxVar.b & 1) != 0) {
            eydq eydqVar = clsxVar.c;
            if (eydqVar == null) {
                eydqVar = eydq.a;
            }
            eyee eyeeVar = eydqVar.c;
            axasVar.copyOnWrite();
            axat axatVar = (axat) axasVar.instance;
            axat axatVar2 = axat.a;
            eyeeVar.getClass();
            axatVar.b |= 2;
            axatVar.d = eyeeVar;
        }
    }
}
