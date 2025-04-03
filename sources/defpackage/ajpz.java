package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajpz implements ajqb {
    private static final entd a = entd.c("BugleReplies");

    @Override // defpackage.ajqb
    public final void a(equc equcVar, ajqc ajqcVar) {
        String str = ajqcVar.a.b;
        if (str == null) {
            a.o().q("ClearcutOutgoingRepliesTransportLogger.applyReplyQueuedInfo with no rcsMessageId");
        }
        fayv fayvVar = ajqcVar.b;
        if (fayvVar == null) {
            ensk o = a.o();
            ensn ensnVar = ajro.a;
            o.Y(ajro.b, ajqcVar.a.f());
            o.q("ClearcutOutgoingRepliesTransportLogger.applyReplyQueuedInfo with null customCpimHeaders");
        } else if (cnmg.a(fayvVar).i()) {
            ensk o2 = a.o();
            ensn ensnVar2 = ajro.a;
            o2.Y(ajro.b, ajqcVar.a.f());
            o2.q("ClearcutOutgoingRepliesTransportLogger.applyReplyQueuedInfo with no inReplyToMessageIdHeader");
        }
        eqfp eqfpVar = (eqfp) eqfq.a.createBuilder();
        eqfpVar.getClass();
        equd.c(true, eqfpVar);
        eqfr eqfrVar = (eqfr) eqfs.a.createBuilder();
        eqfrVar.getClass();
        eqyj.c(true, eqfrVar);
        eqyj.b(true, eqfrVar);
        if (str != null) {
            eqyj.d(str, eqfrVar);
        }
        equd.b(eqyj.a(eqfrVar), eqfpVar);
        eqfq a2 = equd.a(eqfpVar);
        eqaq eqaqVar = equcVar.a;
        eqaqVar.copyOnWrite();
        eqar eqarVar = (eqar) eqaqVar.instance;
        eqar eqarVar2 = eqar.a;
        eqarVar.h = a2;
        eqarVar.b |= 16;
    }
}
