package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdfl {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationMetadataDatabaseOperations");
    public final Context b;
    public final ffbr c;
    public final dtuu d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final cqoh h;
    public final cbgf i;
    public final asld j;
    private final ffbr k;
    private final askq l;

    public bdfl(Context context, ffbr ffbrVar, dtuu dtuuVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, cqoh cqohVar, cbgf cbgfVar, askq askqVar, asld asldVar) {
        this.b = context;
        this.c = ffbrVar;
        this.d = dtuuVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.k = ffbrVar5;
        this.h = cqohVar;
        this.i = cbgfVar;
        this.l = askqVar;
        this.j = asldVar;
    }

    private final void m(final Runnable runnable, final String str, final ConversationIdType conversationIdType, final boolean z) {
        this.d.h(new dtut() { // from class: bdfk
            @Override // defpackage.dtut
            public final ekzz a() {
                return eleg.f(str);
            }
        }, ((ersq) ((arnj) this.l).a.b()).a("bugle.enable_deduping_update_conversation_meta_data_runnable_in_silo_execution") ? str.concat(String.valueOf(String.valueOf(conversationIdType))) : null, new Runnable() { // from class: bdfj
            @Override // java.lang.Runnable
            public final void run() {
                runnable.run();
                if (z) {
                    final ConversationIdType conversationIdType2 = conversationIdType;
                    final bdfl bdflVar = bdfl.this;
                    dtut dtutVar = new dtut() { // from class: bdfa
                        @Override // defpackage.dtut
                        public final ekzz a() {
                            return eleg.f("notifyConversationPushAfterCommit");
                        }
                    };
                    String valueOf = String.valueOf(String.valueOf(conversationIdType2));
                    bdflVar.d.g(dtutVar, "notifyConversationPushAfterCommit".concat(valueOf), new Runnable() { // from class: bdfb
                        @Override // java.lang.Runnable
                        public final void run() {
                            bdfl.this.i.e(conversationIdType2, true);
                        }
                    });
                }
            }
        }, dtuz.TXN_1);
    }

    public final void a(final ConversationIdType conversationIdType, final boolean z, final byyt byytVar) {
        d(new Runnable() { // from class: bdet
            @Override // java.lang.Runnable
            public final void run() {
                csix.h();
                bdfl bdflVar = bdfl.this;
                ConversationIdType conversationIdType2 = conversationIdType;
                if (bdflVar.k(conversationIdType2)) {
                    bdflVar.b(conversationIdType2, z, byytVar);
                }
            }
        }, "ConversationMetadataDatabaseOperations#maybeRefreshConversationMetadata", conversationIdType);
    }

    public final void b(final ConversationIdType conversationIdType, final boolean z, final byyt byytVar) {
        if (!((Boolean) this.k.b()).booleanValue()) {
            d(new Runnable() { // from class: bdez
                @Override // java.lang.Runnable
                public final void run() {
                    csix.h();
                    bdfl.this.c(conversationIdType, z, byytVar);
                }
            }, "ConversationMetadataDatabaseOperations#refreshConversationMetadata", conversationIdType);
            return;
        }
        dtuu dtuuVar = this.d;
        dtut dtutVar = new dtut() { // from class: bdex
            @Override // defpackage.dtut
            public final ekzz a() {
                return eleg.f("CMDO::runRefreshConversationMetadata::runAfterCommit");
            }
        };
        String valueOf = String.valueOf(String.valueOf(conversationIdType));
        dtuuVar.g(dtutVar, "ConversationMetadataDatabaseOperations#refreshConversationMetadataRunAfterCommit#conversationId#".concat(valueOf), new Runnable() { // from class: bdey
            @Override // java.lang.Runnable
            public final void run() {
                bdfl.this.c(conversationIdType, z, byytVar);
            }
        });
    }

    public final void c(ConversationIdType conversationIdType, boolean z, byyt byytVar) {
        buxo d = MessagesTable.d();
        d.z("runRefreshConversationMetadataReaction");
        bueb a2 = bueg.a();
        budk budkVar = bueg.c;
        a2.c(budkVar.a, budkVar.e);
        dtvy i = dtvz.i(a2.b(), bueg.c.b, MessagesTable.c.a);
        ((dtrd) i).e = "message_reactions";
        d.E(i.g());
        buxz C = bdmq.C(conversationIdType, true);
        C.b(new Function() { // from class: bdlj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                cskc cskcVar = bdmq.a;
                buxzVar.al();
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: bdls
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                cskc cskcVar = bdmq.a;
                buxzVar.ag();
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d.k(new buxs(C));
        d.d(new buxl(MessagesTable.c.i, false));
        d.x(1);
        d.e(new Function() { // from class: bdfi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buum buumVar = (buum) obj;
                return new buun[]{buumVar.a, buumVar.i, buumVar.c};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buuo buuoVar = (buuo) d.b().o();
        try {
            buxo d2 = MessagesTable.d();
            d2.z("runRefreshConversationMetadata");
            d2.k(new buxs(bdmq.D(conversationIdType)));
            d2.d(new buxl(MessagesTable.c.i, false));
            d2.x(1);
            d2.e(new Function() { // from class: bdfc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buum buumVar = (buum) obj;
                    return new buun[]{buumVar.a, buumVar.i, buumVar.c};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            buuo buuoVar2 = (buuo) d2.b().o();
            try {
                if (buuoVar.moveToFirst() && buuoVar2.moveToFirst()) {
                    buco bucoVar = (buco) ((MessagesTable.BindData) buuoVar.cO()).aw("message_reactions", buco.class);
                    bucoVar.getClass();
                    e(conversationIdType, (bucoVar.o() == cmrv.REACTION_TYPE_UNSPECIFIED || buuoVar.l() <= buuoVar2.l()) ? buuoVar2.q() : buuoVar.q(), Long.valueOf(buuoVar2.l()), byytVar, z);
                } else if (buuoVar2.moveToFirst()) {
                    e(conversationIdType, buuoVar2.q(), Long.valueOf(buuoVar2.l()), byytVar, z);
                }
                buuoVar2.close();
                buuoVar.close();
            } finally {
            }
        } finally {
        }
    }

    public final void d(Runnable runnable, String str, ConversationIdType conversationIdType) {
        m(runnable, str, conversationIdType, false);
    }

    public final void e(ConversationIdType conversationIdType, MessageIdType messageIdType, Long l, byyt byytVar, boolean z) {
        csix.h();
        g(conversationIdType, messageIdType, l, byytVar, null, z);
    }

    public final void f(ConversationIdType conversationIdType, MessageIdType messageIdType, Long l, byyt byytVar, long j, Integer num) {
        csix.h();
        h(conversationIdType, messageIdType, l, byytVar, null, true, j, num, null);
    }

    public final void g(ConversationIdType conversationIdType, MessageIdType messageIdType, Long l, byyt byytVar, String str, boolean z) {
        h(conversationIdType, messageIdType, l, byytVar, str, z, -1L, null, null);
    }

    public final void h(ConversationIdType conversationIdType, MessageIdType messageIdType, Long l, byyt byytVar, String str, boolean z, long j, Integer num, SelfIdentityId selfIdentityId) {
        i(conversationIdType, messageIdType, l, byytVar, str, z, j, num, selfIdentityId, false);
    }

    public final void i(final ConversationIdType conversationIdType, final MessageIdType messageIdType, final Long l, final byyt byytVar, final String str, final boolean z, final long j, final Integer num, final SelfIdentityId selfIdentityId, boolean z2) {
        m(new Runnable() { // from class: bdeu
            @Override // java.lang.Runnable
            public final void run() {
                SelfIdentityId i;
                MessageCoreData v;
                SelfIdentityId v2;
                aztg f;
                csix.h();
                ConversationIdType conversationIdType2 = conversationIdType;
                MessageIdType messageIdType2 = messageIdType;
                bdfl bdflVar = bdfl.this;
                if (bdflVar.j.a()) {
                    ensk h = bdfl.a.h();
                    h.Y(ente.a, "BugleDatabase");
                    enrr enrrVar = (enrr) h;
                    enrrVar.Y(csux.p, conversationIdType2);
                    enrrVar.Y(csux.b, messageIdType2);
                    ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationMetadataDatabaseOperations", "updateConversationMetadata", 177, "ConversationMetadataDatabaseOperations.java")).q("UpdateConversationMetadata: Setting latest message ID for conversation");
                }
                String[] strArr = bsom.a;
                bsoe bsoeVar = new bsoe();
                bsoeVar.al();
                if (!messageIdType2.c()) {
                    if (messageIdType2 == null) {
                        bsoeVar.a.putNull("latest_message_id");
                    } else {
                        bsoeVar.a.put("latest_message_id", Long.valueOf(bdhb.a(messageIdType2)));
                    }
                }
                SelfIdentityId selfIdentityId2 = selfIdentityId;
                if (!TextUtils.isEmpty(aquz.a(selfIdentityId2))) {
                    selfIdentityId2.getClass();
                    bsoeVar.n(((SelfIdentityIdImpl) selfIdentityId2).a);
                }
                Long l2 = l;
                if (l2 != null) {
                    bsoeVar.Z(l2.longValue());
                }
                String str2 = str;
                if (!TextUtils.isEmpty(str2)) {
                    dtub.u(bsoeVar.a, "sms_service_center", str2);
                }
                long j2 = j;
                if (j2 != -1) {
                    if (csjc.c()) {
                        csix.b(((bczy) bdflVar.g.b()).q(j2), conversationIdType2);
                    }
                    bsoeVar.T(j2);
                }
                Integer num2 = num;
                if (num2 != null) {
                    num2.intValue();
                    bsoeVar.A(0);
                }
                byyt byytVar2 = byytVar;
                byyt s = ((bczy) bdflVar.g.b()).s(conversationIdType2);
                if (byytVar2 != null && (s == null || (byytVar2 != s && !s.h()))) {
                    ((croc) bdflVar.e.b()).a(conversationIdType2, byytVar2, eoko.CONVERSATION_FROM_METADATA_UPDATE);
                }
                boolean z3 = z;
                if (!messageIdType2.c() && (v = ((bdmq) bdflVar.f.b()).v(messageIdType2)) != null) {
                    if (ctjd.b() && v.cF() && Collection.EL.stream(((MessageData) v).i).anyMatch(new Predicate() { // from class: bdew
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
                            return ((MessagePartCoreData) obj).bg();
                        }
                    })) {
                        bdmq.V(v, bsoeVar, bdflVar.b.getString(R.string.conversation_photomoji_snippet));
                    } else {
                        bdmq.V(v, bsoeVar, null);
                    }
                    if (z3) {
                        ekzz f2 = eleg.f("ConversationMetadataDatabaseOperations#addSelfIdAutoSwitchInfoToContentValues");
                        try {
                            if (v.cK() && (v2 = v.v()) != null && (f = ((bdtd) bdflVar.c.b()).f(v2)) != null && f.i() && !f.j()) {
                                ((bczy) bdflVar.g.b()).aa(f.g(), bsoeVar);
                            }
                            f2.close();
                        } catch (Throwable th) {
                            try {
                                f2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }
                ((bczy) bdflVar.g.b()).W(conversationIdType2, bsoeVar);
                if (!z3 || (i = ((bczy) bdflVar.g.b()).i(conversationIdType2)) == null) {
                    return;
                }
                ayfe.a(bdflVar.b, conversationIdType2, i);
            }
        }, "ConversationMetadataDatabaseOperations#updateConversationMetadata", conversationIdType, z2);
    }

    public final void j(ConversationIdType conversationIdType, MessageIdType messageIdType, Long l, byyt byytVar, long j, Integer num) {
        csix.h();
        i(conversationIdType, messageIdType, l, byytVar, null, true, j, num, null, true);
    }

    public final boolean k(final ConversationIdType conversationIdType) {
        MessageCoreData n = ((bdmq) this.f.b()).n(conversationIdType);
        MessageIdType B = n == null ? bdhb.a : n.B();
        ekzz f = eleg.f("ConversationMetadataDatabaseOperations#getStoredLatestMessageId");
        try {
            csix.h();
            bsob e = bsom.e();
            e.z("getStoredLatestMessageId");
            e.g(new Function() { // from class: bdfd
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bskp) obj).f;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            e.i(new Function() { // from class: bdfe
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsol bsolVar = (bsol) obj;
                    bsolVar.q(ConversationIdType.this);
                    return bsolVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bskr bskrVar = (bskr) e.b().o();
            try {
                MessageIdType i = bskrVar.moveToFirst() ? bskrVar.i() : bdhb.a;
                bskrVar.close();
                f.close();
                return B.c() || !B.equals(i);
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

    public final void l(final ConversationIdType conversationIdType, final byyt byytVar, final long j) {
        ekzz f = eleg.f("ConversationMetadataDatabaseOperations#maybeUpdateConversationMetadata");
        try {
            if (((bczy) this.g.b()).a(conversationIdType) != 0) {
                try {
                    d(new Runnable() { // from class: bdff
                        @Override // java.lang.Runnable
                        public final void run() {
                            csix.h();
                            bdfl bdflVar = bdfl.this;
                            byyt byytVar2 = byytVar;
                            bdflVar.f(conversationIdType, bdhb.a, null, byytVar2, j, 0);
                        }
                    }, "ConversationMetadataDatabaseOperations#maybeUpdateConversationMetadata", conversationIdType);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        f.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            f.close();
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
