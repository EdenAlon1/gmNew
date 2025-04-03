package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cllv extends cljz {
    @Override // defpackage.cljz
    public final void a(clqc clqcVar, coth cothVar) {
        int[] iArr = cllu.b;
        cloe b = cloe.b(clqcVar.d);
        if (b == null) {
            b = cloe.ERROR_CAUSE_UNKNOWN;
        }
        int i = iArr[b.ordinal()];
        cothVar.copyOnWrite();
        cotk cotkVar = (cotk) cothVar.instance;
        cotk cotkVar2 = cotk.a;
        cotkVar.d = 0;
        cotkVar.b |= 2;
    }

    @Override // defpackage.cljz
    public final void b(clqc clqcVar, coth cothVar) {
        clog b = clog.b(clqcVar.c);
        if (b == null) {
            b = clog.ERROR_CODE_UNKNOWN;
        }
        int ordinal = b.ordinal();
        int i = 2;
        if (ordinal != 1) {
            if (ordinal != 2) {
                i = 1;
            } else {
                clrl clrlVar = clqcVar.e;
                if (clrlVar == null) {
                    clrlVar = clrl.a;
                }
                int a = clrk.a(clrlVar.c);
                i = (a != 0 && a == 2) ? 4 : 5;
            }
        }
        cothVar.copyOnWrite();
        cotk cotkVar = (cotk) cothVar.instance;
        cotk cotkVar2 = cotk.a;
        cotkVar.c = i - 1;
        cotkVar.b |= 1;
    }
}
