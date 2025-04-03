package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amca implements ambs {
    public static final entd a = entd.c("BugleDataModel");
    public final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final errl j;
    private final ffbr k;

    public amca(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, errl errlVar, ffbr ffbrVar8, ffbr ffbrVar9) {
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
        this.g = ffbrVar5;
        this.h = ffbrVar6;
        this.i = ffbrVar7;
        this.j = errlVar;
        this.b = ffbrVar8;
        this.k = ffbrVar9;
    }

    private final Action p(Optional optional, MessageCoreData messageCoreData, boolean z, long j, MessageUsageStatisticsData messageUsageStatisticsData) {
        messageCoreData.bE(messageUsageStatisticsData);
        ensz enszVar = (ensz) a.h();
        enszVar.Y(csux.o, messageCoreData.z().toString());
        enszVar.Y(csux.a, messageCoreData.B() == null ? "" : messageCoreData.B().b());
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/api/messaging/control/MessageControllerImpl", "prepareToSendMessage", 170, "MessageControllerImpl.java")).q("Send Message");
        return optional.isEmpty() ? ((bbfb) this.d.b()).a(messageCoreData, z, messageUsageStatisticsData.j(), null, -1, Optional.of(Integer.valueOf(((ctwb) this.k.b()).c())), j, false) : ((bbfb) this.d.b()).a(messageCoreData, z, messageUsageStatisticsData.j(), null, ((Integer) optional.get()).intValue(), Optional.empty(), j, false);
    }

    private final Action q(int i, MessageCoreData messageCoreData, long j) {
        ensz enszVar = (ensz) a.h();
        enszVar.Y(csux.o, messageCoreData.z().toString());
        enszVar.Y(csux.a, messageCoreData.B().b());
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/api/messaging/control/MessageControllerImpl", "prepareToSendScheduledMessage", 222, "MessageControllerImpl.java")).q("Send Scheduled Message");
        return ((bbfb) this.d.b()).d(messageCoreData, i, eooi.SCHEDULED_SEND, j);
    }

    @Override // defpackage.ambs
    public final IncomingDraft a(Context context, bcse bcseVar) {
        Stream filter = Collection.EL.stream(bcseVar.Y()).map(new Function() { // from class: ambt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj;
                entd entdVar = amca.a;
                String V = messagePartCoreData.V();
                Uri t = messagePartCoreData.t();
                if (V != null && t != null) {
                    return new IncomingDraft.Attachment(V, t, Long.valueOf(messagePartCoreData.l()));
                }
                ((ensz) ((ensz) amca.a.j()).h("com/google/android/apps/messaging/shared/api/messaging/control/MessageControllerImpl", "createForwardedDraft", 310, "MessageControllerImpl.java")).J("Skipping attachment for forwarded draft because of null contentType %s or contentUri %s: %s", V, t, messagePartCoreData);
                return null;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: ambu
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
                return Objects.nonNull((IncomingDraft.Attachment) obj);
            }
        });
        int i = engw.d;
        return new IncomingDraft(aygq.c, bcseVar.V(context), (List) filter.collect(endq.a), bcseVar.F(context.getResources()), false, null, null, false);
    }

    @Override // defpackage.ambs
    @Deprecated
    public final MessageCoreData b(Resources resources, bcse bcseVar) {
        MessageCoreData a2 = ((byzp) this.e.b()).a();
        a2.bG(bcseVar.F(resources));
        for (MessagePartCoreData messagePartCoreData : bcseVar.g) {
            bcvz bcvzVar = (bcvz) this.c.b();
            a2.aL((messagePartCoreData.bA() || messagePartCoreData.bt()) ? bcvzVar.a.i(messagePartCoreData.ae()) : le.i(messagePartCoreData.V()) ? bcvzVar.b.c(messagePartCoreData.V(), messagePartCoreData.t(), eohh.FORWARD, messagePartCoreData.Y(), messagePartCoreData.p()) : messagePartCoreData.by() ? bcvzVar.a.i(messagePartCoreData.W()) : bcvzVar.b.b(messagePartCoreData.V(), messagePartCoreData.t(), eohh.FORWARD));
        }
        return a2;
    }

    @Override // defpackage.ambs
    public final elfl c(List list) {
        return ((cgrq) this.h.b()).c(list);
    }

    @Override // defpackage.ambs
    public final elfl d(List list, cgrr cgrrVar) {
        cgrq cgrqVar = (cgrq) this.h.b();
        if (!cgrqVar.c.a()) {
            return cgrqVar.c(list);
        }
        cgrc cgrcVar = cgrqVar.a;
        cgra cgraVar = (cgra) cgrb.a.createBuilder();
        cgraVar.a((Iterable) Collection.EL.stream(list).map(new cgrj()).collect(Collectors.toCollection(new cgrk())));
        cgraVar.copyOnWrite();
        cgrb cgrbVar = (cgrb) cgraVar.instance;
        cgrbVar.e = cgrrVar.a();
        cgrbVar.b |= 1;
        return cgrcVar.a((cgrb) cgraVar.build()).i(new cgrl(), cgrqVar.b).h(new cgrm(), cgrqVar.b);
    }

    @Override // defpackage.ambs
    public final elfl e(BugleConversationId bugleConversationId) {
        return elfl.g(((bbfd) this.i.b()).h(bugleConversationId.a, bdhb.a).s());
    }

    @Override // defpackage.ambs
    public final elfl f(final engw engwVar) {
        if (!engwVar.isEmpty()) {
            return elfo.g(new Callable() { // from class: ambz
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    buxo d = MessagesTable.d();
                    d.z("+markMessagesAsRead");
                    final engw engwVar2 = engwVar;
                    d.h(new Function() { // from class: ambv
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            buxz buxzVar = (buxz) obj;
                            entd entdVar = amca.a;
                            buxzVar.ac(engw.this);
                            return buxzVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    d.e(new Function() { // from class: ambw
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            entd entdVar = amca.a;
                            return new buun[]{((buum) obj).a};
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    engw g = d.b().g();
                    if (g.isEmpty()) {
                        ((ensz) ((ensz) amca.a.j()).h("com/google/android/apps/messaging/shared/api/messaging/control/MessageControllerImpl", "markMessagesAsRead", 405, "MessageControllerImpl.java")).q("Request to mark as read with invalid uri list");
                        return null;
                    }
                    enou enouVar = (enou) g;
                    if (enouVar.c != engwVar2.size()) {
                        ((ensz) ((ensz) amca.a.j()).h("com/google/android/apps/messaging/shared/api/messaging/control/MessageControllerImpl", "markMessagesAsRead", 408, "MessageControllerImpl.java")).u("request has %d uris, but found %d messages", engwVar2.size(), enouVar.c);
                    }
                    amcq amcqVar = (amcq) amca.this.b.b();
                    amcb amcbVar = (amcb) amcc.a.createBuilder();
                    Iterable iterable = (Iterable) Collection.EL.stream(g).map(new Function() { // from class: ambx
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            entd entdVar = amca.a;
                            return ((MessageIdType) obj).b();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.toCollection(new Supplier() { // from class: amby
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return new ArrayList();
                        }
                    }));
                    amcbVar.copyOnWrite();
                    amcc amccVar = (amcc) amcbVar.instance;
                    eygr eygrVar = amccVar.b;
                    if (!eygrVar.c()) {
                        amccVar.b = eyfy.mutableCopy(eygrVar);
                    }
                    eydl.addAll(iterable, amccVar.b);
                    amcbVar.copyOnWrite();
                    ((amcc) amcbVar.instance).c = true;
                    ((cevh) amcqVar.a.b()).a(ceyr.g("mark_messages_as_read_handler", (amcc) amcbVar.build()));
                    return null;
                }
            }, this.j);
        }
        ((ensz) a.n().h("com/google/android/apps/messaging/shared/api/messaging/control/MessageControllerImpl", "markMessagesAsRead", 390, "MessageControllerImpl.java")).q("Request to mark as read but with an empty uri list");
        return elfo.e(null);
    }

    @Override // defpackage.ambs
    public final elfl g(int i, MessageCoreData messageCoreData, long j, MessageUsageStatisticsData messageUsageStatisticsData) {
        return elfl.g(p(Optional.of(Integer.valueOf(i)), messageCoreData, true, j, messageUsageStatisticsData).s());
    }

    @Override // defpackage.ambs
    public final elfl h(int i, MessageCoreData messageCoreData, long j) {
        return elfl.g(q(i, messageCoreData, j).t());
    }

    @Override // defpackage.ambs
    public final elfl i(int i, MessageCoreData messageCoreData, long j, cniz cnizVar) {
        return elfl.g(q(i, messageCoreData, j).r(cnizVar));
    }

    @Override // defpackage.ambs
    public final void j(List list) {
        ((cgrq) this.h.b()).i(list);
    }

    @Override // defpackage.ambs
    public final void k(List list, cgrr cgrrVar) {
        cgrq cgrqVar = (cgrq) this.h.b();
        if (!cgrqVar.c.a()) {
            cgrqVar.i(list);
            return;
        }
        cgrc cgrcVar = cgrqVar.a;
        cgra cgraVar = (cgra) cgrb.a.createBuilder();
        cgraVar.a((Iterable) Collection.EL.stream(list).map(new cgrj()).collect(Collectors.toCollection(new cgrk())));
        cgraVar.copyOnWrite();
        cgrb cgrbVar = (cgrb) cgraVar.instance;
        cgrbVar.e = cgrrVar.a();
        cgrbVar.b |= 1;
        cgrcVar.b((cgrb) cgraVar.build());
    }

    @Override // defpackage.ambs
    public final void l(MessageIdType messageIdType) {
        ensz enszVar = (ensz) a.h();
        enszVar.Y(csux.a, messageIdType.b());
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/api/messaging/control/MessageControllerImpl", "downloadMessageAsync", 238, "MessageControllerImpl.java")).q("Download Message");
        ((bbff) this.f.b()).d(messageIdType);
    }

    @Override // defpackage.ambs
    public final void m(MessageIdType messageIdType, MessageUsageStatisticsData messageUsageStatisticsData) {
        ensz enszVar = (ensz) a.h();
        enszVar.Y(csux.a, messageIdType.b());
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/api/messaging/control/MessageControllerImpl", "resendMessageAsync", 247, "MessageControllerImpl.java")).q("Resend Message");
        ((bbfg) this.g.b()).b(messageIdType, messageUsageStatisticsData);
    }

    @Override // defpackage.ambs
    public final void n(MessageCoreData messageCoreData, long j, MessageUsageStatisticsData messageUsageStatisticsData) {
        p(Optional.empty(), messageCoreData, true, j, messageUsageStatisticsData).t();
    }

    @Override // defpackage.ambs
    public final void o(aqux aquxVar, MessageCoreData messageCoreData, long j, MessageUsageStatisticsData messageUsageStatisticsData) {
        p(Optional.of(Integer.valueOf(aquxVar.b())), messageCoreData, false, j, messageUsageStatisticsData).t();
    }
}
