package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awgp extends ceut {
    private static final entd a = entd.c("BugleGroupManagement");
    private final cknc b;

    public awgp(cknc ckncVar) {
        this.b = ckncVar;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("OnAddUserToGroupChatCompleteHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return awtx.a.getParserForType();
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final String f() {
        return "incoming_chat_api_queue";
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        awtx awtxVar = (awtx) eyhsVar;
        awud awudVar = awtxVar.c;
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
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/chatapi/groups/OnAddUserToGroupChatCompleteHandler", "processPendingWorkItemAsync", 75, "OnAddUserToGroupChatCompleteHandler.java")).q("AddUserToGroupChatResponse failed.");
            this.b.c(awtxVar);
            return elfo.e(ceyt.k());
        }
        try {
            awtt awttVar = (awtt) eyfy.parseFrom(awtt.a, awtxVar.d, eyfc.a());
            for (String str : awttVar.d) {
                ensk n = a.n();
                n.Y(csux.J, awttVar.c);
                n.Y(csux.m, str);
                ((ensz) n.h("com/google/android/apps/messaging/shared/chatapi/groups/OnAddUserToGroupChatCompleteHandler", "processPendingWorkItemAsync", 91, "OnAddUserToGroupChatCompleteHandler.java")).q("RCS backend has successfully processed the request to add user to the group chat.");
            }
            cknc ckncVar = this.b;
            String str2 = awttVar.e;
            str2.getClass();
            cknc.r(ckncVar, 17, 2, str2, null, null, null, 56);
        } catch (eygu e) {
            ((ensz) ((ensz) a.n().g(e)).h("com/google/android/apps/messaging/shared/chatapi/groups/OnAddUserToGroupChatCompleteHandler", "processPendingWorkItemAsync", 97, "OnAddUserToGroupChatCompleteHandler.java")).q("RCS backend has successfully processed the request to add user(s) to the group chat but we are unable to parse the opaque data in the response.");
        }
        return elfo.e(ceyt.i());
    }
}
