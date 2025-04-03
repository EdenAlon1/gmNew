package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awpj extends ceut {
    public static final entd a = entd.c("BugleGroupManagement");
    public final errl b;
    public final errl c;
    public final awmi d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final cqoh i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    public final ffbr m;
    private final bdtd n;
    private final cbfs o;
    private final ffbr p;
    private final ffbr q;

    public awpj(errl errlVar, errl errlVar2, ffbr ffbrVar, awmi awmiVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, bdtd bdtdVar, cbfs cbfsVar, ffbr ffbrVar5, cqoh cqohVar, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10) {
        this.b = errlVar;
        this.c = errlVar2;
        this.k = ffbrVar;
        this.d = awmiVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.n = bdtdVar;
        this.o = cbfsVar;
        this.h = ffbrVar5;
        this.i = cqohVar;
        this.p = ffbrVar6;
        this.j = ffbrVar7;
        this.q = ffbrVar8;
        this.l = ffbrVar9;
        this.m = ffbrVar10;
    }

    public static engw l(awvy awvyVar) {
        Stream map = Collection.EL.stream(awvyVar.h).map(new awpe());
        int i = engw.d;
        return (engw) map.collect(endq.a);
    }

    public static String m(awxr awxrVar) {
        int i = awxrVar.b;
        int a2 = awxq.a(i);
        if (a2 == 0) {
            throw null;
        }
        int i2 = a2 - 1;
        if (i2 == 0) {
            return (i == 1 ? (awvt) awxrVar.c : awvt.c).e;
        }
        if (i2 != 1) {
            return "unknown";
        }
        return (i == 2 ? (awvy) awxrVar.c : awvy.b).d;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("IncomingGroupChatNotificationRequestHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return awxr.a.getParserForType();
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final String f() {
        return "incoming_chat_api_queue";
    }

    @Override // defpackage.ceut
    protected final /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final awxr awxrVar = (awxr) eyhsVar;
        ekzz f = eleg.f("IncomingGroupChatNotificationRequestHandler#processPendingWorkItemAsync");
        try {
            ekzz f2 = eleg.f("IncomingGroupChatNotificationRequestHandler#ensureProvisioningEngineIsInitialized");
            try {
                elfl g = elfl.g(((djrv) this.q.b()).h());
                f2.b(g);
                f2.close();
                elfl i = g.i(new eroh() { // from class: awpa
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        elfl f3;
                        final awxr awxrVar2 = awxrVar;
                        int i2 = awxrVar2.b;
                        int a2 = awxq.a(i2);
                        if (a2 == 0) {
                            throw null;
                        }
                        int i3 = a2 - 1;
                        final awpj awpjVar = awpj.this;
                        awmi awmiVar = awpjVar.d;
                        if (i3 == 0) {
                            awui awuiVar = (i2 == 1 ? (awvt) awxrVar2.c : awvt.c).r;
                            if (awuiVar == null) {
                                awuiVar = awui.a;
                            }
                            f3 = awmiVar.f(awuiVar, (awxrVar2.b == 1 ? (awvt) awxrVar2.c : awvt.c).e);
                        } else {
                            if (i3 != 1) {
                                throw new IllegalArgumentException("No notification set in IncomingGroupChatNotificationRequest");
                            }
                            awui awuiVar2 = (i2 == 2 ? (awvy) awxrVar2.c : awvy.b).l;
                            if (awuiVar2 == null) {
                                awuiVar2 = awui.a;
                            }
                            f3 = awmiVar.f(awuiVar2, (awxrVar2.b == 2 ? (awvy) awxrVar2.c : awvy.b).d);
                        }
                        return f3.i(new eroh() { // from class: awoy
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                elfl a3;
                                elfl i4;
                                final awpj awpjVar2 = awpj.this;
                                final awxr awxrVar3 = awxrVar2;
                                final awkh awkhVar = (awkh) obj2;
                                if (awkhVar != null) {
                                    int a4 = awxq.a(awxrVar3.b);
                                    if (a4 == 0) {
                                        throw null;
                                    }
                                    int i5 = a4 - 1;
                                    if (i5 == 0) {
                                        a3 = ((awlh) awpjVar2.f.b()).a(awxrVar3.b == 1 ? (awvt) awxrVar3.c : awvt.c, awkhVar);
                                    } else {
                                        if (i5 != 1) {
                                            if (i5 != 2) {
                                                throw new IllegalArgumentException("No case handled in getGroupConversationMetadata");
                                            }
                                            throw new IllegalArgumentException("No notification set in IncomingGroupChatNotificationRequest");
                                        }
                                        a3 = ((awlh) awpjVar2.e.b()).a(awxrVar3.b == 2 ? (awvy) awxrVar3.c : awvy.b, awkhVar);
                                    }
                                    return a3.i(new eroh() { // from class: awph
                                        @Override // defpackage.eroh
                                        public final ListenableFuture a(Object obj3) {
                                            final awxc awxcVar = (awxc) obj3;
                                            final awkq awkqVar = (awkq) awpj.this.g.b();
                                            awju awjuVar = awkqVar.c;
                                            final ConversationIdType f4 = awkhVar.f();
                                            return awjuVar.a(f4, awxcVar).i(new eroh() { // from class: awki
                                                @Override // defpackage.eroh
                                                public final ListenableFuture a(Object obj4) {
                                                    return awkq.a(awkq.this.b, f4, awxcVar, (ceyt) obj4);
                                                }
                                            }, awkqVar.h).i(new eroh() { // from class: awkj
                                                @Override // defpackage.eroh
                                                public final ListenableFuture a(Object obj4) {
                                                    return awkq.a(awkq.this.e, f4, awxcVar, (ceyt) obj4);
                                                }
                                            }, awkqVar.h).i(new eroh() { // from class: awkk
                                                @Override // defpackage.eroh
                                                public final ListenableFuture a(Object obj4) {
                                                    ceyt ceytVar = (ceyt) obj4;
                                                    awkq awkqVar2 = awkq.this;
                                                    if (!((atzy) awkqVar2.k.b()).a()) {
                                                        return elfo.e(ceytVar);
                                                    }
                                                    awxc awxcVar2 = awxcVar;
                                                    return awkq.a(awkqVar2.f, f4, awxcVar2, ceytVar);
                                                }
                                            }, awkqVar.h).i(new eroh() { // from class: awkl
                                                @Override // defpackage.eroh
                                                public final ListenableFuture a(Object obj4) {
                                                    return awkq.a(awkq.this.g, f4, awxcVar, (ceyt) obj4);
                                                }
                                            }, awkqVar.h).i(new eroh() { // from class: awkm
                                                @Override // defpackage.eroh
                                                public final ListenableFuture a(Object obj4) {
                                                    return awkq.a(awkq.this.d, f4, awxcVar, (ceyt) obj4);
                                                }
                                            }, awkqVar.h).i(new eroh() { // from class: awkn
                                                @Override // defpackage.eroh
                                                public final ListenableFuture a(Object obj4) {
                                                    return awkq.a(awkq.this.i, f4, awxcVar, (ceyt) obj4);
                                                }
                                            }, awkqVar.h).i(new eroh() { // from class: awko
                                                @Override // defpackage.eroh
                                                public final ListenableFuture a(Object obj4) {
                                                    return awkq.a(awkq.this.j, f4, awxcVar, (ceyt) obj4);
                                                }
                                            }, awkqVar.h).e(awmj.class, new emwl() { // from class: awkp
                                                @Override // defpackage.emwl
                                                public final Object apply(Object obj4) {
                                                    ensz enszVar = (ensz) ((ensz) awkq.a.j()).g((awmj) obj4);
                                                    enszVar.Y(csux.p, ConversationIdType.this);
                                                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/GroupMetadataActuator", "apply", 100, "GroupMetadataActuator.java")).q("Failed to retrieve GroupConversationMetadata while processing metadata update");
                                                    return ceyt.k();
                                                }
                                            }, awkqVar.h);
                                        }
                                    }, awpjVar2.b).h(new emwl() { // from class: awpi
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj3) {
                                            awxr awxrVar4 = awxrVar3;
                                            ceyt ceytVar = (ceyt) obj3;
                                            int i6 = awxrVar4.b;
                                            int a5 = awxq.a(i6);
                                            awpj awpjVar3 = awpj.this;
                                            awkh awkhVar2 = awkhVar;
                                            if (a5 == 2) {
                                                ((cknb) awpjVar3.l.b()).b(awxrVar4.b == 2 ? (awvy) awxrVar4.c : awvy.b, awkhVar2, ezkp.GROUP_FULL_STATE_UPDATE_NOTIFICATION);
                                                return ceytVar;
                                            }
                                            if (awxq.a(i6) == 1) {
                                                cknb cknbVar = (cknb) awpjVar3.l.b();
                                                awvt awvtVar = awxrVar4.b == 1 ? (awvt) awxrVar4.c : awvt.c;
                                                awvtVar.getClass();
                                                ConversationIdType f4 = awkhVar2.f();
                                                if (f4.b()) {
                                                    ((ensz) cknb.a.j()).q("Propagating invalid groupConversationId. Impossible to log participant count.");
                                                    return ceytVar;
                                                }
                                                axol.k(cknbVar.f, null, new ckmz(cknbVar, awvtVar, f4, null), 3);
                                            }
                                            return ceytVar;
                                        }
                                    }, awpjVar2.c);
                                }
                                int i6 = awxrVar3.b;
                                if (awxq.a(i6) != 2) {
                                    ensz enszVar = (ensz) awpj.a.j();
                                    enszVar.Y(csux.J, awpj.m(awxrVar3));
                                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingGroupChatNotificationRequestHandler", "createNewGroup", 243, "IncomingGroupChatNotificationRequestHandler.java")).q("Received group event for nonexistent group");
                                    return elfo.e(ceyt.k());
                                }
                                final awmi awmiVar2 = awpjVar2.d;
                                final awvy awvyVar = i6 == 2 ? (awvy) awxrVar3.c : awvy.b;
                                awui awuiVar3 = awvyVar.l;
                                if (awuiVar3 == null) {
                                    awuiVar3 = awui.a;
                                }
                                final awui awuiVar4 = awuiVar3;
                                final eygr<awwq> eygrVar = awvyVar.h;
                                int i7 = engw.d;
                                engr engrVar = new engr();
                                for (awwq awwqVar : eygrVar) {
                                    awwp b = awwp.b(awwqVar.d);
                                    if (b == null) {
                                        b = awwp.UNKNOWN_STATE;
                                    }
                                    if (!b.equals(awwp.JOINED)) {
                                        awwp b2 = awwp.b(awwqVar.d);
                                        if (b2 == null) {
                                            b2 = awwp.UNKNOWN_STATE;
                                        }
                                        if (!b2.equals(awwp.PENDING)) {
                                            awwp b3 = awwp.b(awwqVar.d);
                                            if (b3 == null) {
                                                b3 = awwp.UNKNOWN_STATE;
                                            }
                                            if (!b3.equals(awwp.UNKNOWN_STATE)) {
                                                ensk e = awmi.a.e();
                                                e.Y(ente.a, "BugleGroupManagement");
                                                ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IncomingRcsGroupNotificationConversationGetter", "getParticipantDataListFromGroupParticipantList", 621, "IncomingRcsGroupNotificationConversationGetter.java")).q("Server participant list contains a user not in the JOINED, PENDING or UNKNOWN state. Ignoring participant for creating conversation.");
                                            }
                                        }
                                    }
                                    awui awuiVar5 = awwqVar.c;
                                    if (awuiVar5 == null) {
                                        awuiVar5 = awui.a;
                                    }
                                    engrVar.h(bdqu.b(awuiVar5.d));
                                }
                                final engw g2 = engrVar.g();
                                if (awmiVar2.i(awvyVar) || awmiVar2.j()) {
                                    final boolean i8 = awmiVar2.i(awvyVar);
                                    final boolean j = awmiVar2.j();
                                    ensk h = awmi.a.h();
                                    h.Y(ente.a, "BugleGroupManagement");
                                    ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IncomingRcsGroupNotificationConversationGetter", "tryToUpgradeExistingMmsGroup", 417, "IncomingRcsGroupNotificationConversationGetter.java")).q(true != i8 ? "Searching MMS group to upgrade because implicit upgrade is enabled." : "Searching MMS group to upgrade because group notification was explicitly flagged.");
                                    final String str = awuiVar4.d;
                                    i4 = ((ayif) awmiVar2.f.b()).j((engw) Collection.EL.stream(g2).distinct().map(new Function() { // from class: awlo
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj3) {
                                            return emxe.b(((ParticipantsTable.BindData) obj3).U());
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    }).filter(new Predicate() { // from class: awlp
                                        public final /* synthetic */ Predicate and(Predicate predicate) {
                                            return Predicate$CC.$default$and(this, predicate);
                                        }

                                        @Override // java.util.function.Predicate
                                        /* renamed from: negate */
                                        public final /* synthetic */ Predicate mo439negate() {
                                            return Predicate$CC.$default$negate(this);
                                        }

                                        public final /* synthetic */ Predicate or(Predicate predicate) {
                                            return Predicate$CC.$default$or(this, predicate);
                                        }

                                        @Override // java.util.function.Predicate
                                        public final boolean test(Object obj3) {
                                            return !((String) obj3).equals(str);
                                        }
                                    }).collect(endq.a)).i(new eroh() { // from class: awlu
                                        @Override // defpackage.eroh
                                        public final ListenableFuture a(Object obj3) {
                                            elfl c;
                                            Optional optional = (Optional) obj3;
                                            boolean isEmpty = optional.isEmpty();
                                            final awmi awmiVar3 = awmi.this;
                                            boolean z = i8;
                                            boolean z2 = true;
                                            if (isEmpty || !byyr.e(((bseh) optional.get()).k())) {
                                                ensk h2 = awmi.a.h();
                                                h2.Y(ente.a, "BugleGroupManagement");
                                                ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IncomingRcsGroupNotificationConversationGetter", "tryToUpgradeExistingMmsGroup", 431, "IncomingRcsGroupNotificationConversationGetter.java")).q("No MMS conversation found to upgrade, creating new RCS group instead.");
                                                if (z) {
                                                    ConversationIdType conversationIdType = (ConversationIdType) optional.map(new Function() { // from class: awmc
                                                        @Override // java.util.function.Function
                                                        /* renamed from: andThen */
                                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                                            return Function$CC.$default$andThen(this, function);
                                                        }

                                                        @Override // java.util.function.Function
                                                        public final Object apply(Object obj4) {
                                                            return ((bseh) obj4).C();
                                                        }

                                                        public final /* synthetic */ Function compose(Function function) {
                                                            return Function$CC.$default$compose(this, function);
                                                        }
                                                    }).orElse(bdgq.a);
                                                    ((cktw) awmiVar3.j.b()).b(conversationIdType);
                                                    cktw cktwVar = (cktw) awmiVar3.j.b();
                                                    conversationIdType.getClass();
                                                    eqbb eqbbVar = (eqbb) eqbp.b.createBuilder();
                                                    eqbbVar.getClass();
                                                    equi.b(((akvz) cktwVar.a.b()).b(conversationIdType), eqbbVar);
                                                    equi.c(5, eqbbVar);
                                                    equi.e(3, eqbbVar);
                                                    equi.d(3, eqbbVar);
                                                    eqbbVar.copyOnWrite();
                                                    eqbp eqbpVar = (eqbp) eqbbVar.instance;
                                                    eqbpVar.k = 1;
                                                    eqbpVar.c |= 32;
                                                    cktwVar.a(equi.a(eqbbVar));
                                                }
                                                return elfo.e(null);
                                            }
                                            final boolean z3 = j;
                                            final ConversationIdType C = ((bseh) optional.get()).C();
                                            if (z) {
                                                ((cktw) awmiVar3.j.b()).b(C);
                                            } else {
                                                z2 = false;
                                                if (z3) {
                                                    cktw cktwVar2 = (cktw) awmiVar3.j.b();
                                                    C.getClass();
                                                    eqbb eqbbVar2 = (eqbb) eqbp.b.createBuilder();
                                                    eqbbVar2.getClass();
                                                    equi.b(((akvz) cktwVar2.a.b()).b(C), eqbbVar2);
                                                    equi.c(3, eqbbVar2);
                                                    equi.e(2, eqbbVar2);
                                                    equi.d(3, eqbbVar2);
                                                    cktwVar2.a(equi.a(eqbbVar2));
                                                }
                                            }
                                            final boolean z4 = z2;
                                            awvy awvyVar2 = awvyVar;
                                            final String str2 = awvyVar2.d;
                                            awui awuiVar6 = awvyVar2.f;
                                            if (awuiVar6 == null) {
                                                awuiVar6 = awui.a;
                                            }
                                            String str3 = awuiVar6.d;
                                            awwy awwyVar = awvyVar2.i;
                                            if (awwyVar == null) {
                                                awwyVar = awwy.a;
                                            }
                                            engw engwVar = g2;
                                            awui awuiVar7 = awuiVar4;
                                            aolr aolrVar = awmiVar3.l;
                                            String str4 = awwyVar.c;
                                            aoku b4 = aolrVar.b(awuiVar7);
                                            SelfIdentityId g3 = awmiVar3.b(awuiVar7, (bseh) optional.get()).g();
                                            cknh d = awmiVar3.d(awvyVar2);
                                            cktv cktvVar = (cktv) awmiVar3.i.b();
                                            C.getClass();
                                            str2.getClass();
                                            str3.getClass();
                                            engwVar.getClass();
                                            c = axol.c(cktvVar.c, ffhe.a, ffsm.a, new cktu(cktvVar, C, str2, str3, d, str4, b4, g3, engwVar, null));
                                            return c.h(new emwl() { // from class: awmd
                                                @Override // defpackage.emwl
                                                public final Object apply(Object obj4) {
                                                    boolean booleanValue = ((Boolean) obj4).booleanValue();
                                                    final ConversationIdType conversationIdType2 = C;
                                                    String str5 = str2;
                                                    if (!booleanValue) {
                                                        ensk j2 = awmi.a.j();
                                                        j2.Y(ente.a, "BugleGroupManagement");
                                                        enrr enrrVar = (enrr) j2;
                                                        enrrVar.Y(csux.p, conversationIdType2);
                                                        enrrVar.Y(csux.J, str5);
                                                        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IncomingRcsGroupNotificationConversationGetter", "tryToUpgradeExistingMmsGroup", 492, "IncomingRcsGroupNotificationConversationGetter.java")).q("Upgrade of MMS group to RCS failed.");
                                                        return null;
                                                    }
                                                    boolean z5 = z4;
                                                    awmi awmiVar4 = awmi.this;
                                                    ensk h3 = awmi.a.h();
                                                    h3.Y(ente.a, "BugleGroupManagement");
                                                    enrr enrrVar2 = (enrr) h3;
                                                    enrrVar2.Y(csux.p, conversationIdType2);
                                                    enrrVar2.Y(csux.J, str5);
                                                    ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IncomingRcsGroupNotificationConversationGetter", "tryToUpgradeExistingMmsGroup", 499, "IncomingRcsGroupNotificationConversationGetter.java")).q("Upgrade of MMS group to RCS was successful.");
                                                    if (z5) {
                                                        cktw cktwVar3 = (cktw) awmiVar4.j.b();
                                                        conversationIdType2.getClass();
                                                        eqbb eqbbVar3 = (eqbb) eqbp.b.createBuilder();
                                                        eqbbVar3.getClass();
                                                        equi.b(((akvz) cktwVar3.a.b()).b(conversationIdType2), eqbbVar3);
                                                        equi.c(4, eqbbVar3);
                                                        equi.e(3, eqbbVar3);
                                                        equi.d(3, eqbbVar3);
                                                        cktwVar3.a(equi.a(eqbbVar3));
                                                    } else if (z3) {
                                                        cktw cktwVar4 = (cktw) awmiVar4.j.b();
                                                        conversationIdType2.getClass();
                                                        eqbb eqbbVar4 = (eqbb) eqbp.b.createBuilder();
                                                        eqbbVar4.getClass();
                                                        equi.b(((akvz) cktwVar4.a.b()).b(conversationIdType2), eqbbVar4);
                                                        equi.c(4, eqbbVar4);
                                                        equi.e(2, eqbbVar4);
                                                        equi.d(3, eqbbVar4);
                                                        cktwVar4.a(equi.a(eqbbVar4));
                                                    }
                                                    Stream map = Collection.EL.stream(awmiVar4.m).map(new Function() { // from class: awlm
                                                        @Override // java.util.function.Function
                                                        /* renamed from: andThen */
                                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                                            return Function$CC.$default$andThen(this, function);
                                                        }

                                                        @Override // java.util.function.Function
                                                        public final Object apply(Object obj5) {
                                                            return ((cktx) obj5).a(ConversationIdType.this);
                                                        }

                                                        public final /* synthetic */ Function compose(Function function) {
                                                            return Function$CC.$default$compose(this, function);
                                                        }
                                                    });
                                                    int i9 = engw.d;
                                                    elfo.a((engw) map.collect(endq.a)).k(axnw.b(), awmiVar4.c);
                                                    return conversationIdType2;
                                                }
                                            }, awmiVar3.c);
                                        }
                                    }, awmiVar2.d).i(new eroh() { // from class: awlz
                                        @Override // defpackage.eroh
                                        public final ListenableFuture a(Object obj3) {
                                            ConversationIdType conversationIdType = (ConversationIdType) obj3;
                                            if (conversationIdType != null) {
                                                return elfo.e(conversationIdType);
                                            }
                                            engw engwVar = g2;
                                            final awvy awvyVar2 = awvyVar;
                                            final awmi awmiVar3 = awmi.this;
                                            return awmiVar3.e(awvyVar2, engwVar).h(new emwl() { // from class: awlq
                                                @Override // defpackage.emwl
                                                public final Object apply(Object obj4) {
                                                    ConversationIdType conversationIdType2 = (ConversationIdType) obj4;
                                                    if (conversationIdType2 != null) {
                                                        awvy awvyVar3 = awvyVar2;
                                                        awmi awmiVar4 = awmi.this;
                                                        if (awmiVar4.i(awvyVar3)) {
                                                            bczy bczyVar = (bczy) awmiVar4.h.b();
                                                            String[] strArr = bsom.a;
                                                            bsoe bsoeVar = new bsoe();
                                                            bsoeVar.B(ckte.j);
                                                            bsoeVar.h(byyt.ARCHIVED);
                                                            bczyVar.W(conversationIdType2, bsoeVar);
                                                        }
                                                    }
                                                    return conversationIdType2;
                                                }
                                            }, awmiVar3.c);
                                        }
                                    }, awmiVar2.b);
                                } else {
                                    i4 = awmiVar2.e(awvyVar, g2);
                                }
                                return i4.h(new emwl() { // from class: awmg
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj3) {
                                        ConversationIdType conversationIdType = (ConversationIdType) obj3;
                                        if (conversationIdType == null) {
                                            return null;
                                        }
                                        List list = eygrVar;
                                        final awmi awmiVar3 = awmi.this;
                                        enhk enhkVar = (enhk) Collection.EL.stream(list).collect(endq.a(new Function() { // from class: awma
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj4) {
                                                awui awuiVar6 = ((awwq) obj4).c;
                                                if (awuiVar6 == null) {
                                                    awuiVar6 = awui.a;
                                                }
                                                return awuiVar6.d;
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        }, new Function() { // from class: awmb
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj4) {
                                                awwp b4 = awwp.b(((awwq) obj4).d);
                                                return b4 == null ? awwp.UNKNOWN_STATE : b4;
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        }));
                                        engw x = ((bczy) awmiVar3.h.b()).x(conversationIdType);
                                        int i9 = ((enou) x).c;
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            bjjo bjjoVar = (bjjo) x.get(i10);
                                            awwp awwpVar = (awwp) enhkVar.get(bjjoVar.g());
                                            if (awwpVar != null && !awwpVar.equals(bjjoVar.f())) {
                                                bczy bczyVar = (bczy) awmiVar3.h.b();
                                                bjjoVar.az(1, "participant_id");
                                                bczyVar.am(conversationIdType, Long.toString(bjjoVar.a), new bdgi(awwpVar));
                                            }
                                        }
                                        final awui awuiVar6 = awuiVar4;
                                        return (awkh) bsom.k(conversationIdType, new Function() { // from class: awmf
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj4) {
                                                return awmi.this.a(awuiVar6, (bseh) obj4);
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        });
                                    }
                                }, awmiVar2.d).i(new eroh() { // from class: awpd
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj3) {
                                        final awkh awkhVar2 = (awkh) obj3;
                                        if (awkhVar2 == null) {
                                            return elfo.e(ceyt.m());
                                        }
                                        final awxr awxrVar4 = awxrVar3;
                                        final awpj awpjVar3 = awpj.this;
                                        return elfo.e(ceyt.i()).h(new emwl() { // from class: awpg
                                            @Override // defpackage.emwl
                                            public final Object apply(Object obj4) {
                                                awwq awwqVar2;
                                                ceyt i9;
                                                long epochMilli;
                                                awxr awxrVar5 = awxrVar4;
                                                awvy awvyVar2 = awxrVar5.b == 2 ? (awvy) awxrVar5.c : awvy.b;
                                                final awkh awkhVar3 = awkhVar2;
                                                final awpj awpjVar4 = awpj.this;
                                                if (awkhVar3.o()) {
                                                    i9 = ceyt.i();
                                                } else {
                                                    Iterator<E> it = awvyVar2.h.iterator();
                                                    while (true) {
                                                        if (!it.hasNext()) {
                                                            awwqVar2 = null;
                                                            break;
                                                        }
                                                        awwqVar2 = (awwq) it.next();
                                                        awui c = awkhVar3.c();
                                                        awui awuiVar6 = awwqVar2.c;
                                                        if (awuiVar6 == null) {
                                                            awuiVar6 = awui.a;
                                                        }
                                                        if (c.equals(awuiVar6)) {
                                                            break;
                                                        }
                                                    }
                                                    if (awwqVar2 == null) {
                                                        i9 = ceyt.k();
                                                    } else {
                                                        awxf awxfVar = awxf.a;
                                                        awxf awxfVar2 = awwqVar2.e;
                                                        if (awxfVar2 == null) {
                                                            awxfVar2 = awxfVar;
                                                        }
                                                        if (awxfVar.equals(awxfVar2)) {
                                                            ensk n = awpj.a.n();
                                                            n.Y(csux.o, awkhVar3.f().toString());
                                                            n.Y(csux.J, awkhVar3.n());
                                                            ((ensz) n.h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingGroupChatNotificationRequestHandler", "insertNewConversationParticipantTombstoneNoReferrer", 406, "IncomingGroupChatNotificationRequestHandler.java")).q("New incoming RCS group conversation without referrer.");
                                                            Stream map = Collection.EL.stream(awpj.l(awvyVar2)).map(new Function() { // from class: awow
                                                                @Override // java.util.function.Function
                                                                /* renamed from: andThen */
                                                                public final /* synthetic */ Function mo448andThen(Function function) {
                                                                    return Function$CC.$default$andThen(this, function);
                                                                }

                                                                @Override // java.util.function.Function
                                                                public final Object apply(Object obj5) {
                                                                    return awpj.this.k((awui) obj5, awkhVar3);
                                                                }

                                                                public final /* synthetic */ Function compose(Function function) {
                                                                    return Function$CC.$default$compose(this, function);
                                                                }
                                                            });
                                                            int i10 = engw.d;
                                                            for (ParticipantsTable.BindData bindData : (List) map.collect(endq.a)) {
                                                                ((cbvt) awpjVar4.h.b()).j(Optional.empty(), awkhVar3.f(), awkhVar3.e(), bindData, new ArrayList(engw.r(bindData)), BasePaymentResult.ERROR_REQUEST_FAILED, awpjVar4.i.f().toEpochMilli(), -1L);
                                                            }
                                                        } else {
                                                            final awxf awxfVar3 = awwqVar2.e;
                                                            if (awxfVar3 == null) {
                                                                awxfVar3 = awxf.a;
                                                            }
                                                            ensk n2 = awpj.a.n();
                                                            n2.Y(csux.o, awkhVar3.f().toString());
                                                            n2.Y(csux.J, awkhVar3.n());
                                                            ((ensz) n2.h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingGroupChatNotificationRequestHandler", "insertNewConversationParticipantTombstoneWithReferrer", 440, "IncomingGroupChatNotificationRequestHandler.java")).q("New incoming RCS group conversation with referrer.");
                                                            Stream filter = Collection.EL.stream(awpj.l(awvyVar2)).filter(new Predicate() { // from class: awpf
                                                                public final /* synthetic */ Predicate and(Predicate predicate) {
                                                                    return Predicate$CC.$default$and(this, predicate);
                                                                }

                                                                @Override // java.util.function.Predicate
                                                                /* renamed from: negate */
                                                                public final /* synthetic */ Predicate mo439negate() {
                                                                    return Predicate$CC.$default$negate(this);
                                                                }

                                                                public final /* synthetic */ Predicate or(Predicate predicate) {
                                                                    return Predicate$CC.$default$or(this, predicate);
                                                                }

                                                                @Override // java.util.function.Predicate
                                                                public final boolean test(Object obj5) {
                                                                    awui awuiVar7 = (awui) obj5;
                                                                    entd entdVar = awpj.a;
                                                                    awui awuiVar8 = awxf.this.c;
                                                                    if (awuiVar8 == null) {
                                                                        awuiVar8 = awui.a;
                                                                    }
                                                                    return !awuiVar7.equals(awuiVar8);
                                                                }
                                                            });
                                                            int i11 = engw.d;
                                                            List list = (List) Collection.EL.stream((engw) filter.collect(endq.a)).map(new Function() { // from class: awpb
                                                                @Override // java.util.function.Function
                                                                /* renamed from: andThen */
                                                                public final /* synthetic */ Function mo448andThen(Function function) {
                                                                    return Function$CC.$default$andThen(this, function);
                                                                }

                                                                @Override // java.util.function.Function
                                                                public final Object apply(Object obj5) {
                                                                    return awpj.this.k((awui) obj5, awkhVar3);
                                                                }

                                                                public final /* synthetic */ Function compose(Function function) {
                                                                    return Function$CC.$default$compose(this, function);
                                                                }
                                                            }).collect(endq.a);
                                                            awui awuiVar7 = awxfVar3.c;
                                                            if (awuiVar7 == null) {
                                                                awuiVar7 = awui.a;
                                                            }
                                                            ParticipantsTable.BindData k = awpjVar4.k(awuiVar7, awkhVar3);
                                                            cbvt cbvtVar = (cbvt) awpjVar4.h.b();
                                                            Optional empty = Optional.empty();
                                                            ConversationIdType f4 = awkhVar3.f();
                                                            aztg e2 = awkhVar3.e();
                                                            if ((awxfVar3.b & 2) != 0) {
                                                                eyja eyjaVar = awxfVar3.d;
                                                                if (eyjaVar == null) {
                                                                    eyjaVar = eyja.a;
                                                                }
                                                                epochMilli = eykm.b(eyjaVar);
                                                            } else {
                                                                epochMilli = awpjVar4.i.f().toEpochMilli();
                                                            }
                                                            final MessageCoreData j2 = cbvtVar.j(empty, f4, e2, k, list, BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, epochMilli, -1L);
                                                            if (j2 != null) {
                                                                ((azei) awpjVar4.m.b()).d(new Consumer() { // from class: awpc
                                                                    @Override // java.util.function.Consumer
                                                                    /* renamed from: accept */
                                                                    public final void o(Object obj5) {
                                                                        entd entdVar = awpj.a;
                                                                        ((cujk) obj5).a.a(MessageCoreData.this, null, null);
                                                                    }

                                                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                                        return Consumer$CC.$default$andThen(this, consumer);
                                                                    }
                                                                });
                                                            }
                                                        }
                                                        i9 = ceyt.i();
                                                    }
                                                }
                                                bzrd bzrdVar = (bzrd) awpjVar4.j.b();
                                                final Set e3 = ((crgh) awpjVar4.k.b()).e();
                                                Stream filter2 = Collection.EL.stream(awvyVar2.h).map(new awpe()).filter(new Predicate() { // from class: awox
                                                    public final /* synthetic */ Predicate and(Predicate predicate) {
                                                        return Predicate$CC.$default$and(this, predicate);
                                                    }

                                                    @Override // java.util.function.Predicate
                                                    /* renamed from: negate */
                                                    public final /* synthetic */ Predicate mo439negate() {
                                                        return Predicate$CC.$default$negate(this);
                                                    }

                                                    public final /* synthetic */ Predicate or(Predicate predicate) {
                                                        return Predicate$CC.$default$or(this, predicate);
                                                    }

                                                    @Override // java.util.function.Predicate
                                                    public final boolean test(Object obj5) {
                                                        return e3.contains((awui) obj5);
                                                    }
                                                });
                                                int i12 = engw.d;
                                                engw engwVar = (engw) filter2.collect(endq.a);
                                                bzrb bzrbVar = (bzrb) bzrc.a.createBuilder();
                                                String a5 = awkhVar3.f().a();
                                                bzrbVar.copyOnWrite();
                                                bzrc bzrcVar = (bzrc) bzrbVar.instance;
                                                a5.getClass();
                                                bzrcVar.b = a5;
                                                bzrbVar.copyOnWrite();
                                                bzrc bzrcVar2 = (bzrc) bzrbVar.instance;
                                                bzrcVar2.a();
                                                eydl.addAll(engwVar, bzrcVar2.c);
                                                bzrdVar.a((bzrc) bzrbVar.build());
                                                ((cknb) awpjVar4.l.b()).b(awxrVar5.b == 2 ? (awvy) awxrVar5.c : awvy.b, awkhVar3, ezkp.GROUP_FULL_STATE_NOTIFICATION);
                                                return i9;
                                            }
                                        }, awpjVar3.c);
                                    }
                                }, awpjVar2.c);
                            }
                        }, awpjVar.b).e(awnb.class, new emwl() { // from class: awoz
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                ensz enszVar = (ensz) ((ensz) awpj.a.j()).g((awnb) obj2);
                                enszVar.Y(csux.J, awpj.m(awxr.this));
                                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingGroupChatNotificationRequestHandler", "process", 188, "IncomingGroupChatNotificationRequestHandler.java")).q("Failed to retrieve self MSISDN");
                                return ceyt.m();
                            }
                        }, awpjVar.b);
                    }
                }, this.b);
                f.b(i);
                f.close();
                return i;
            } finally {
            }
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ParticipantsTable.BindData k(awui awuiVar, awkh awkhVar) {
        awui c = awkhVar.c();
        bvpo f = bdqu.f(awuiVar.d);
        if (!awuiVar.equals(c)) {
            f.v(((bdrr) this.p.b()).j(f));
            this.o.f(f, 3);
            return f.a();
        }
        aztg f2 = this.n.f(awkhVar.b());
        f2.getClass();
        f.T(f2.e());
        f.v(((bdrr) this.p.b()).j(f));
        return f.a();
    }
}
