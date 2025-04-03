package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awgw extends ceut {
    private static final entd a = entd.c("BugleGroupManagement");

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("OnTriggerChatGroupFullStateUpdateCompleteHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return axal.a.getParserForType();
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final String f() {
        return "incoming_chat_api_queue";
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        axal axalVar = (axal) eyhsVar;
        awud awudVar = axalVar.c;
        if (awudVar == null) {
            awudVar = awud.a;
        }
        awuc awucVar = awuc.OK;
        awuc b = awuc.b(awudVar.c);
        if (b == null) {
            b = awuc.UNKNOWN_STATUS;
        }
        if (!awucVar.equals(b)) {
            ensz enszVar = (ensz) a.j();
            enszVar.Y(awgo.a, awudVar);
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/chatapi/groups/OnTriggerChatGroupFullStateUpdateCompleteHandler", "processPendingWorkItemAsync", 63, "OnTriggerChatGroupFullStateUpdateCompleteHandler.java")).q("TriggerChatGroupFullStateUpdateResponse failed.");
            return elfo.e(ceyt.k());
        }
        try {
            axah axahVar = (axah) eyfy.parseFrom(axah.a, axalVar.d, eyfc.a());
            ensk n = a.n();
            n.Y(csux.J, axahVar.c);
            ((ensz) n.h("com/google/android/apps/messaging/shared/chatapi/groups/OnTriggerChatGroupFullStateUpdateCompleteHandler", "processPendingWorkItemAsync", 77, "OnTriggerChatGroupFullStateUpdateCompleteHandler.java")).q("Group full state successfully requested.");
        } catch (eygu e) {
            ((ensz) ((ensz) a.n().g(e)).h("com/google/android/apps/messaging/shared/chatapi/groups/OnTriggerChatGroupFullStateUpdateCompleteHandler", "processPendingWorkItemAsync", 79, "OnTriggerChatGroupFullStateUpdateCompleteHandler.java")).q("Group full state successfully requested but we were unable to parse the opaque data in the response.");
        }
        return elfo.e(ceyt.i());
    }
}
