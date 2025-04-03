package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awna implements awks {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/SelfMembershipGroupMetadataProcessor");
    public final ffbr b;
    public final ffbr c;
    public final dtuu d;
    public final cbgf e;
    public final akzt f;
    public final awkr g;
    public final coxk h;
    public final clbb i;
    public final Context j;
    private final ffbr k;
    private final ffbr l;
    private final awmi m;
    private final bdtd n;
    private final cbfs o;
    private final cqoh p;
    private final errl q;

    public awna(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, dtuu dtuuVar, ffbr ffbrVar4, awmi awmiVar, bdtd bdtdVar, cbfs cbfsVar, cqoh cqohVar, cbgf cbgfVar, errl errlVar, akzt akztVar, awkr awkrVar, coxk coxkVar, clbb clbbVar, Context context) {
        this.k = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = dtuuVar;
        this.l = ffbrVar4;
        this.m = awmiVar;
        this.n = bdtdVar;
        this.o = cbfsVar;
        this.p = cqohVar;
        this.e = cbgfVar;
        this.q = errlVar;
        this.f = akztVar;
        this.g = awkrVar;
        this.h = coxkVar;
        this.i = clbbVar;
        this.j = context;
    }

    private final aztg d(awkh awkhVar, awww awwwVar) {
        if (!awwwVar.f.isEmpty()) {
            Optional filter = Optional.of(awwwVar.f).map(new Function() { // from class: awmv
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return aqvf.c((String) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).filter(new Predicate() { // from class: awmw
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
                public final boolean test(Object obj) {
                    return Objects.nonNull((SelfIdentityId) obj);
                }
            });
            final bdtd bdtdVar = this.n;
            bdtdVar.getClass();
            Optional map = filter.map(new Function() { // from class: awmx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return bdtd.this.f((SelfIdentityId) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            if (map.isPresent()) {
                return (aztg) map.get();
            }
        }
        aztg f = this.n.f(awkhVar.b());
        f.getClass();
        return f;
    }

    @Override // defpackage.awks
    public final elfl a(final ConversationIdType conversationIdType, awxc awxcVar) {
        final awww awwwVar = awxcVar.i;
        if (awwwVar == null) {
            awwwVar = awww.a;
        }
        return this.m.g(conversationIdType).h(new emwl() { // from class: awmu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                final awkh awkhVar = (awkh) obj;
                final awww awwwVar2 = awwwVar;
                awwv b = awwv.b(awwwVar2.c);
                ConversationIdType conversationIdType2 = conversationIdType;
                if (b == null) {
                    b = awwv.UNKNOWN_STATE;
                }
                final awna awnaVar = awna.this;
                if (b == awwv.KICKED_OUT) {
                    awui awuiVar = awui.a;
                    awxf awxfVar = awwwVar2.d;
                    if (awxfVar == null) {
                        awxfVar = awxf.a;
                    }
                    awui awuiVar2 = awxfVar.c;
                    if (awuiVar2 == null) {
                        awuiVar2 = awui.a;
                    }
                    awkr awkrVar = awnaVar.g;
                    if (!awuiVar.equals(awuiVar2)) {
                        awui c = awkhVar.c();
                        awxf awxfVar2 = awwwVar2.d;
                        if (awxfVar2 == null) {
                            awxfVar2 = awxf.a;
                        }
                        awui awuiVar3 = awxfVar2.c;
                        if (awuiVar3 == null) {
                            awuiVar3 = awui.a;
                        }
                        if (!c.equals(awuiVar3)) {
                            awkrVar.a.b(awkhVar.n(), 3);
                        }
                    }
                    awkrVar.a.b(awkhVar.n(), 4);
                }
                awui awuiVar4 = awwwVar2.e;
                if (awuiVar4 == null) {
                    awuiVar4 = awui.a;
                }
                if (!awuiVar4.d.isEmpty()) {
                    awui awuiVar5 = awwwVar2.e;
                    if (awuiVar5 == null) {
                        awuiVar5 = awui.a;
                    }
                    String[] strArr = bsom.a;
                    bsoe bsoeVar = new bsoe();
                    bsoeVar.ap("updateRcsGroupSelfMsisdnColumn");
                    bsoeVar.S(awuiVar5.d);
                    bsoeVar.f(awkhVar.f());
                    String I = awnaVar.h.I(awkhVar.i());
                    if (I == null) {
                        ensk j = awna.a.j();
                        j.Y(ente.a, "BugleGroupManagement");
                        enrr enrrVar = (enrr) j;
                        enrrVar.Y(csux.p, awkhVar.f());
                        enrrVar.Y(csux.J, awkhVar.n());
                        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/SelfMembershipGroupMetadataProcessor", "updateTelephonyCanonicalAddress", 185, "SelfMembershipGroupMetadataProcessor.java")).q("Skipping group canonical address changed because thread not found");
                    } else {
                        int c2 = awnaVar.h.c(awnaVar.j.getContentResolver(), I, awnaVar.i.a(awuiVar5.d, awkhVar.n(), awkhVar.l()));
                        ensk h = awna.a.h();
                        h.Y(ente.a, "BugleGroupManagement");
                        enrr enrrVar2 = (enrr) h;
                        enrrVar2.Y(csux.p, awkhVar.f());
                        enrrVar2.Y(csux.J, awkhVar.n());
                        ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/SelfMembershipGroupMetadataProcessor", "updateTelephonyCanonicalAddress", 199, "SelfMembershipGroupMetadataProcessor.java")).r("%s canonical address changed because of self change in group", c2);
                    }
                }
                awwv b2 = awwv.b(awwwVar2.c);
                if (b2 == null) {
                    b2 = awwv.UNKNOWN_STATE;
                }
                int ordinal = b2.ordinal();
                if (ordinal != 1) {
                    if ((ordinal == 2 || ordinal == 3) && awkhVar.a() != 2) {
                        ensk e = awna.a.e();
                        e.Y(ente.a, "BugleGroupManagement");
                        enrr enrrVar3 = (enrr) e;
                        enrrVar3.Y(csux.p, awkhVar.f());
                        enrrVar3.Y(csux.J, awkhVar.n());
                        ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/SelfMembershipGroupMetadataProcessor", "processSelfLeftGroup", 273, "SelfMembershipGroupMetadataProcessor.java")).q("Self left the group");
                        final ParticipantsTable.BindData b3 = awnaVar.b(awkhVar, awwwVar2);
                        awnaVar.d.d("SelfMembershipGroupMetadataProcessor#processSelfRejoinedGroup", new Runnable() { // from class: awms
                            @Override // java.lang.Runnable
                            public final void run() {
                                awna awnaVar2 = awna.this;
                                awkh awkhVar2 = awkhVar;
                                awww awwwVar3 = awwwVar2;
                                if (awnaVar2.c(awkhVar2, awwwVar3, b3).isEmpty()) {
                                    ensk j2 = awna.a.j();
                                    j2.Y(ente.a, "BugleGroupManagement");
                                    enrr enrrVar4 = (enrr) j2;
                                    enrrVar4.Y(csux.p, awkhVar2.f());
                                    enrrVar4.Y(csux.J, awkhVar2.n());
                                    ((enrr) enrrVar4.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/SelfMembershipGroupMetadataProcessor", "processSelfLeftGroup", 286, "SelfMembershipGroupMetadataProcessor.java")).q("Failed to insert tombstones for self left the group");
                                }
                                if (awwwVar3.f.isEmpty()) {
                                    ((bczy) awnaVar2.b.b()).N(awkhVar2.f());
                                }
                            }
                        });
                        awnaVar.e.d(awkhVar.f());
                    }
                } else if (awkhVar.a() != 0 && awkhVar.a() != 1) {
                    ensk e2 = awna.a.e();
                    e2.Y(ente.a, "BugleGroupManagement");
                    enrr enrrVar4 = (enrr) e2;
                    enrrVar4.Y(csux.p, awkhVar.f());
                    enrrVar4.Y(csux.J, awkhVar.n());
                    ((enrr) enrrVar4.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/SelfMembershipGroupMetadataProcessor", "processSelfRejoinedGroup", 213, "SelfMembershipGroupMetadataProcessor.java")).q("Self rejoined the group");
                    final ParticipantsTable.BindData b4 = awnaVar.b(awkhVar, awwwVar2);
                    awnaVar.d.d("SelfMembershipGroupMetadataProcessor#processSelfRejoinedGroup", new Runnable() { // from class: awmt
                        @Override // java.lang.Runnable
                        public final void run() {
                            awna awnaVar2 = awna.this;
                            awkh awkhVar2 = awkhVar;
                            Optional empty = Optional.empty();
                            if (awkhVar2.a() == 2) {
                                empty = awnaVar2.c(awkhVar2, awwwVar2, b4);
                                if (empty.isEmpty()) {
                                    ensk j2 = awna.a.j();
                                    j2.Y(ente.a, "BugleGroupManagement");
                                    enrr enrrVar5 = (enrr) j2;
                                    enrrVar5.Y(csux.p, awkhVar2.f());
                                    enrrVar5.Y(csux.J, awkhVar2.n());
                                    ((enrr) enrrVar5.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/SelfMembershipGroupMetadataProcessor", "processSelfRejoinedGroup", 227, "SelfMembershipGroupMetadataProcessor.java")).q("Failed to insert tombstones for self rejoined the group");
                                }
                            }
                            ((bdfl) awnaVar2.c.b()).f(awkhVar2.f(), (MessageIdType) empty.map(new Function() { // from class: awmy
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return ((MessageCoreData) obj2).B();
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).orElse(bdhb.a), (Long) empty.map(new Function() { // from class: awmz
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return Long.valueOf(((MessageCoreData) obj2).o());
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).orElse(null), byyt.UNARCHIVED, -1L, 0);
                        }
                    });
                    awnaVar.e.c();
                    awnaVar.e.d(awkhVar.f());
                    if (awkhVar.a() == 4) {
                        awnaVar.f.c("Bugle.Rcs.Groups.Recovery.ConversationRecoveredFromTelephony.Enabled.Counts");
                    } else if (awkhVar.a() == 7) {
                        awnaVar.f.c("Bugle.Rcs.Groups.Recovery.ConversationDowngradedFromChatApiToVanillaRcs.Enabled.Counts");
                    }
                }
                ekzz f = eleg.f("SelfMembershipGroupMetadataProcessor::process_dsdrGroupsFlag");
                try {
                    if (!awwwVar2.f.isEmpty()) {
                        ((bczy) awnaVar.b.b()).al(conversationIdType2, aqvf.b(awwwVar2.f));
                    }
                    ceyt i = ceyt.i();
                    f.close();
                    return i;
                } finally {
                }
            }
        }, this.q);
    }

    public final ParticipantsTable.BindData b(awkh awkhVar, awww awwwVar) {
        aztg d = d(awkhVar, awwwVar);
        awui awuiVar = awui.a;
        awxf awxfVar = awwwVar.d;
        if (awxfVar == null) {
            awxfVar = awxf.a;
        }
        awui awuiVar2 = awxfVar.c;
        if (awuiVar2 == null) {
            awuiVar2 = awui.a;
        }
        if (!awuiVar.equals(awuiVar2)) {
            awui c = awkhVar.c();
            awxf awxfVar2 = awwwVar.d;
            if (awxfVar2 == null) {
                awxfVar2 = awxf.a;
            }
            awui awuiVar3 = awxfVar2.c;
            if (awuiVar3 == null) {
                awuiVar3 = awui.a;
            }
            if (!c.equals(awuiVar3)) {
                awxf awxfVar3 = awwwVar.d;
                if (awxfVar3 == null) {
                    awxfVar3 = awxf.a;
                }
                awui awuiVar4 = awxfVar3.c;
                if (awuiVar4 == null) {
                    awuiVar4 = awui.a;
                }
                bvpo f = bdqu.f(awuiVar4.d);
                f.v(((bdrr) this.k.b()).j(f));
                this.o.f(f, 3);
                return f.a();
            }
        }
        return d.a();
    }

    public final Optional c(awkh awkhVar, awww awwwVar, ParticipantsTable.BindData bindData) {
        aztg d = d(awkhVar, awwwVar);
        awwv b = awwv.b(awwwVar.c);
        if (b == null) {
            b = awwv.UNKNOWN_STATE;
        }
        int ordinal = b.ordinal();
        return Optional.ofNullable(((cbvt) this.l.b()).k(Optional.empty(), awkhVar.f(), d, bindData, engw.r(d.a()), ordinal != 1 ? ordinal != 2 ? 220 : BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED : BasePaymentResult.ERROR_REQUEST_FAILED, this.p.f().toEpochMilli(), -1L, null));
    }
}
