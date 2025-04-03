package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awgu extends ceut {
    private static final entd a = entd.c("BugleGroupManagement");
    private final cknc b;

    public awgu(cknc ckncVar) {
        this.b = ckncVar;
    }

    private static boolean k(awyj awyjVar) {
        return (awyjVar.b & 2) == 0;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("OnRemoveUserFromGroupChatCompleteHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return awyn.a.getParserForType();
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final String f() {
        return "incoming_chat_api_queue";
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        awyn awynVar = (awyn) eyhsVar;
        awud awudVar = awynVar.c;
        if (awudVar == null) {
            awudVar = awud.a;
        }
        awyj awyjVar = awyj.a;
        Optional empty = Optional.empty();
        try {
            awyjVar = (awyj) eyfy.parseFrom(awyj.a, awynVar.d, eyfc.a());
        } catch (eygu e) {
            empty = Optional.of(e);
        }
        awuc awucVar = awuc.OK;
        awuc b = awuc.b(awudVar.c);
        if (b == null) {
            b = awuc.UNKNOWN_STATUS;
        }
        if (!awucVar.equals(b)) {
            ensz enszVar = (ensz) a.j();
            enszVar.Y(awgo.a, awudVar);
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/chatapi/groups/OnRemoveUserFromGroupChatCompleteHandler", "processPendingWorkItemAsync", 84, "OnRemoveUserFromGroupChatCompleteHandler.java")).q("RemoveUserFromGroupChatResponse failed.");
            if (k(awyjVar)) {
                this.b.q(awyjVar.e, awudVar, 3);
            } else {
                cknc ckncVar = this.b;
                axad axadVar = awyjVar.f;
                if (axadVar == null) {
                    axadVar = axad.a;
                }
                axad axadVar2 = axadVar;
                axadVar2.getClass();
                awudVar.getClass();
                cknc.r(ckncVar, 19, 3, null, axadVar2, null, ckncVar.n(3, awudVar), 20);
            }
            return elfo.e(ceyt.k());
        }
        if (empty.isEmpty()) {
            ensk n = a.n();
            n.Y(csux.J, awyj.a.c.equals(awyjVar.c) ? "missing-rcs-group-id" : awyjVar.c);
            n.Y(csux.m, awyj.a.d.equals(awyjVar.d) ? "missing-participant-id" : awyjVar.d);
            ((ensz) n.h("com/google/android/apps/messaging/shared/chatapi/groups/OnRemoveUserFromGroupChatCompleteHandler", "processPendingWorkItemAsync", 114, "OnRemoveUserFromGroupChatCompleteHandler.java")).q("RCS backend has successfully processed the request to remove user from the group chat.");
        } else {
            ((ensz) ((ensz) a.n().g((Throwable) empty.get())).h("com/google/android/apps/messaging/shared/chatapi/groups/OnRemoveUserFromGroupChatCompleteHandler", "processPendingWorkItemAsync", 118, "OnRemoveUserFromGroupChatCompleteHandler.java")).q("RCS backend has successfully processed the request to remove user from the group chat but we are unable to parse the opaque data in the response.");
        }
        if (k(awyjVar)) {
            this.b.k(awyjVar.e);
        } else {
            cknc ckncVar2 = this.b;
            axad axadVar3 = awyjVar.f;
            if (axadVar3 == null) {
                axadVar3 = axad.a;
            }
            axad axadVar4 = axadVar3;
            axadVar4.getClass();
            cknc.r(ckncVar2, 19, 2, null, axadVar4, null, null, 52);
        }
        return elfo.e(ceyt.i());
    }
}
