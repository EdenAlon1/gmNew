package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cllj extends cljr {
    @Override // defpackage.cljr
    public final void b(awud awudVar, clqn clqnVar) {
        awuc b = awuc.b(awudVar.c);
        if (b == null) {
            b = awuc.UNKNOWN_STATUS;
        }
        int ordinal = b.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                clrh clrhVar = clrh.RESPONSE_STATUS_OK;
                clqnVar.copyOnWrite();
                clqo clqoVar = (clqo) clqnVar.instance;
                clqo clqoVar2 = clqo.a;
                clqoVar.c = clrhVar.d;
                clqoVar.b |= 1;
                return;
            }
            if (ordinal != 2) {
                if (ordinal == 3 || ordinal == 4) {
                    clrh clrhVar2 = clrh.RESPONSE_STATUS_FAILED;
                    clqnVar.copyOnWrite();
                    clqo clqoVar3 = (clqo) clqnVar.instance;
                    clqo clqoVar4 = clqo.a;
                    clqoVar3.c = clrhVar2.d;
                    clqoVar3.b |= 1;
                    return;
                }
                return;
            }
        }
        clrh clrhVar3 = clrh.RESPONSE_STATUS_UNKNOWN;
        clqnVar.copyOnWrite();
        clqo clqoVar5 = (clqo) clqnVar.instance;
        clqo clqoVar6 = clqo.a;
        clqoVar5.c = clrhVar3.d;
        clqoVar5.b |= 1;
    }
}
