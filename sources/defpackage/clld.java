package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clld extends cljp {
    @Override // defpackage.cljp
    public final void b(awud awudVar, clqj clqjVar) {
        awuc b = awuc.b(awudVar.c);
        if (b == null) {
            b = awuc.UNKNOWN_STATUS;
        }
        int ordinal = b.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                clrh clrhVar = clrh.RESPONSE_STATUS_OK;
                clqjVar.copyOnWrite();
                clqk clqkVar = (clqk) clqjVar.instance;
                clqk clqkVar2 = clqk.a;
                clqkVar.c = clrhVar.d;
                clqkVar.b |= 1;
                return;
            }
            if (ordinal != 2) {
                if (ordinal == 3 || ordinal == 4) {
                    clrh clrhVar2 = clrh.RESPONSE_STATUS_FAILED;
                    clqjVar.copyOnWrite();
                    clqk clqkVar3 = (clqk) clqjVar.instance;
                    clqk clqkVar4 = clqk.a;
                    clqkVar3.c = clrhVar2.d;
                    clqkVar3.b |= 1;
                    return;
                }
                return;
            }
        }
        clrh clrhVar3 = clrh.RESPONSE_STATUS_UNKNOWN;
        clqjVar.copyOnWrite();
        clqk clqkVar5 = (clqk) clqjVar.instance;
        clqk clqkVar6 = clqk.a;
        clqkVar5.c = clrhVar3.d;
        clqkVar5.b |= 1;
    }
}
