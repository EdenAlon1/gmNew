package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awgs extends ceut {
    public static final emyl a = cfvl.x(200046194, "enable_populate_group_destination_on_create_group_response");
    public static final entd b = entd.c("BugleGroupManagement");
    public final cbgf c;
    private final ckju d;
    private final avlc e;
    private final ffbr f;
    private final ffbr g;
    private final dtuu h;

    public awgs(ckju ckjuVar, cbgf cbgfVar, avlc avlcVar, ffbr ffbrVar, dtuu dtuuVar, ffbr ffbrVar2) {
        this.d = ckjuVar;
        this.c = cbgfVar;
        this.e = avlcVar;
        this.f = ffbrVar;
        this.h = dtuuVar;
        this.g = ffbrVar2;
    }

    private final ConversationIdType k(awut awutVar) {
        ckjy w = ckjz.w();
        w.j(false);
        w.p(false);
        w.q(true);
        w.w(epby.CREATE_GROUP_CHAT_COMPLETE_CALLBACK);
        w.u(awutVar.c);
        return this.d.a(w.D());
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("OnCreateGroupChatCompleteHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return awuz.a.getParserForType();
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final String f() {
        return "incoming_chat_api_queue";
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final awut awutVar;
        awuz awuzVar = (awuz) eyhsVar;
        try {
            awutVar = (awut) eyfy.parseFrom(awut.a, awuzVar.e, eyfc.a());
        } catch (eygu e) {
            ((ensz) ((ensz) b.n().g(e)).h("com/google/android/apps/messaging/shared/chatapi/groups/OnCreateGroupChatCompleteHandler", "getCreateGroupChatData", 186, "OnCreateGroupChatCompleteHandler.java")).q("RCS backend has successfully processed the request to create the group chat but we are unable to parse the opaque data in the response.");
            awutVar = null;
        }
        if (awutVar == null || awutVar.c.isEmpty()) {
            ((ensz) ((ensz) b.j()).h("com/google/android/apps/messaging/shared/chatapi/groups/OnCreateGroupChatCompleteHandler", "processPendingWorkItemAsync", 121, "OnCreateGroupChatCompleteHandler.java")).q("Ignoring CreateGroupChatResponse with invalid opaque data.");
            ((cknc) this.g.b()).h();
            return elfo.e(ceyt.k());
        }
        String str = awutVar.c;
        axad axadVar = awutVar.e;
        if (axadVar == null) {
            axadVar = axad.a;
        }
        axad axadVar2 = axadVar;
        awud awudVar = awuzVar.c;
        if (awudVar == null) {
            awudVar = awud.a;
        }
        awuc awucVar = awuc.OK;
        awuc b2 = awuc.b(awudVar.c);
        if (b2 == null) {
            b2 = awuc.UNKNOWN_STATUS;
        }
        if (!awucVar.equals(b2)) {
            entd entdVar = b;
            ensz enszVar = (ensz) entdVar.j();
            enszVar.Y(awgo.a, awudVar);
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/chatapi/groups/OnCreateGroupChatCompleteHandler", "processPendingWorkItemAsync", 133, "OnCreateGroupChatCompleteHandler.java")).q("CreateGroupChatResponse failed.");
            ((cknc) this.g.b()).g(awutVar, awudVar);
            ConversationIdType k = k(awutVar);
            if (k.b()) {
                ensz enszVar2 = (ensz) entdVar.j();
                enszVar2.Y(csux.J, awutVar.c);
                ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/chatapi/groups/OnCreateGroupChatCompleteHandler", "disableConversationComposeBox", 238, "OnCreateGroupChatCompleteHandler.java")).q("Unable to find conversation for failed CreateGroupChatCompleteResponse. Skipping disabling compose box.");
            } else {
                String[] strArr = bsom.a;
                bsoe bsoeVar = new bsoe();
                bsoeVar.ap("disableConversationComposeBox");
                bsoeVar.A(5);
                awua awuaVar = awua.GROUP_TOO_MANY_PARTICIPANTS;
                awua b3 = awua.b(awudVar.d);
                if (b3 == null) {
                    b3 = awua.UNKNOWN_CAUSE;
                }
                if (awuaVar.equals(b3)) {
                    bsoeVar.x(ayhd.RCS_GROUP_CREATED_TOO_LARGE);
                }
                bsoeVar.f(k);
                this.c.d(k);
            }
            if (awutVar.d) {
                avlb.a(2, (akzt) this.e.a.b());
                avld avldVar = (avld) this.f.b();
                avla avlaVar = avldVar.c;
                awuc b4 = awuc.b(awudVar.c);
                if (b4 == null) {
                    b4 = awuc.UNKNOWN_STATUS;
                }
                eqwy eqwyVar = (eqwy) avlaVar.fP(b4);
                avtu avtuVar = avldVar.b;
                awua b5 = awua.b(awudVar.d);
                if (b5 == null) {
                    b5 = awua.UNKNOWN_CAUSE;
                }
                avldVar.e(str, 3, eqwyVar, (eqww) avtuVar.fP(b5), axadVar2);
            }
            return elfo.e(ceyt.i());
        }
        final awui awuiVar = awuzVar.d;
        if (awuiVar == null) {
            awuiVar = awui.a;
        }
        awuh awuhVar = awuh.GROUP;
        awuh b6 = awuh.b(awuiVar.c);
        if (b6 == null) {
            b6 = awuh.UNKNOWN_TYPE;
        }
        if (!awuhVar.equals(b6) || awuiVar.d.isEmpty()) {
            ((ensz) ((ensz) b.j()).h("com/google/android/apps/messaging/shared/chatapi/groups/OnCreateGroupChatCompleteHandler", "processPendingWorkItemAsync", 148, "OnCreateGroupChatCompleteHandler.java")).q("Ignoring CreateGroupChatResponse with invalid group destination");
            ((cknc) this.g.b()).g(awutVar, awudVar);
            if (awutVar.d) {
                ((avld) this.f.b()).e(str, 3, eqwy.CHAT_API_FAILED_PERMANENTLY, eqww.CHAT_API_INVALID_CONFERENCE_URI, axadVar2);
            }
            return elfo.e(ceyt.k());
        }
        final ConversationIdType k2 = k(awutVar);
        this.h.d("updateConferenceUriAndJoinState", new Runnable() { // from class: awgr
            @Override // java.lang.Runnable
            public final void run() {
                awut awutVar2 = awutVar;
                ConversationIdType conversationIdType = k2;
                if (conversationIdType.b()) {
                    ensz enszVar3 = (ensz) awgs.b.j();
                    enszVar3.Y(csux.J, awutVar2.c);
                    ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/chatapi/groups/OnCreateGroupChatCompleteHandler", "updateConferenceUriAndJoinState", BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, "OnCreateGroupChatCompleteHandler.java")).q("Unable to find conversation for successful CreateGroupChatCompleteResponse. Skipping updating conference URI and join state.");
                    return;
                }
                awui awuiVar2 = awuiVar;
                String[] strArr2 = bsom.a;
                bsoe bsoeVar2 = new bsoe();
                bsoeVar2.ap("updateConferenceUriAndJoinState");
                bsoeVar2.A(0);
                bsoeVar2.N(awuiVar2.d);
                bsoeVar2.f(conversationIdType);
                if (((Boolean) ((cfup) awgs.a.get()).e()).booleanValue()) {
                    awgs awgsVar = awgs.this;
                    awgsVar.c.c();
                    awgsVar.c.d(conversationIdType);
                }
                ensk n = awgs.b.n();
                n.Y(csux.o, conversationIdType.toString());
                n.Y(csux.J, awutVar2.c);
                ((ensz) n.h("com/google/android/apps/messaging/shared/chatapi/groups/OnCreateGroupChatCompleteHandler", "updateConferenceUriAndJoinState", 223, "OnCreateGroupChatCompleteHandler.java")).q("RCS backend has successfully processed the request to add user to the group chat.");
            }
        });
        cknc ckncVar = (cknc) this.g.b();
        if (!awutVar.d) {
            axad axadVar3 = awutVar.e;
            if (axadVar3 == null) {
                axadVar3 = axad.a;
            }
            cknc.r(ckncVar, 3, 2, null, axadVar3, null, null, 52);
        }
        if (awutVar.d) {
            avlb.a(1, (akzt) this.e.a.b());
            avld avldVar2 = (avld) this.f.b();
            eomj a2 = avldVar2.a(str);
            a2.copyOnWrite();
            eomn eomnVar = (eomn) a2.instance;
            eomn eomnVar2 = eomn.a;
            eomnVar.c = 14;
            eomnVar.b |= 1;
            a2.copyOnWrite();
            eomn eomnVar3 = (eomn) a2.instance;
            eomnVar3.d = 1;
            eomnVar3.b |= 2;
            eqrk eqrkVar = (eqrk) eqrm.a.createBuilder();
            fjay fjayVar = (fjay) avldVar2.a.m().fP(axadVar2);
            eqrkVar.copyOnWrite();
            eqrm eqrmVar = (eqrm) eqrkVar.instance;
            fjayVar.getClass();
            eqrmVar.c = fjayVar;
            eqrmVar.b = 1 | eqrmVar.b;
            a2.copyOnWrite();
            eomn eomnVar4 = (eomn) a2.instance;
            eqrm eqrmVar2 = (eqrm) eqrkVar.build();
            eqrmVar2.getClass();
            eomnVar4.m = eqrmVar2;
            eomnVar4.b |= 8192;
            avldVar2.d((eomn) a2.build());
        }
        return elfo.e(ceyt.i());
    }
}
