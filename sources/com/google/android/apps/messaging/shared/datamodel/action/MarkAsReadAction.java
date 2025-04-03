package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.MarkAsReadAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import defpackage.akzt;
import defpackage.altk;
import defpackage.axmt;
import defpackage.axmw;
import defpackage.azwh;
import defpackage.bahz;
import defpackage.baig;
import defpackage.bbfd;
import defpackage.bbgg;
import defpackage.bcyk;
import defpackage.bdgq;
import defpackage.bdhb;
import defpackage.bdmq;
import defpackage.buxo;
import defpackage.buxr;
import defpackage.buxs;
import defpackage.buxz;
import defpackage.cbek;
import defpackage.cbgf;
import defpackage.cins;
import defpackage.cipm;
import defpackage.cisd;
import defpackage.cisg;
import defpackage.cish;
import defpackage.cisl;
import defpackage.coxk;
import defpackage.cpdg;
import defpackage.cpxu;
import defpackage.cpxv;
import defpackage.cqoh;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.ctba;
import defpackage.ctvb;
import defpackage.dtuu;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.emxe;
import defpackage.emyx;
import defpackage.entd;
import defpackage.eogt;
import defpackage.eoqn;
import defpackage.equw;
import defpackage.ffbr;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class MarkAsReadAction extends Action<Void> implements Parcelable {
    private final akzt A;
    private final coxk B;
    private final dtuu C;
    private final cpdg D;
    private final axmw E;
    private final cbek F;
    private final cipm G;
    private final ffbr H;
    private final ffbr I;
    public final cins c;
    public final bbgg d;
    public final cbgf e;
    public final cqoh f;
    public final ffbr g;
    public final ffbr h;
    public final altk i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    public equw m;
    private final Context n;
    private final cish o;
    private final cisl p;
    private final ctvb q;
    private final ffbr y;
    private final ffbr z;
    public static final cskc a = cskc.g("BugleDataModel", "MarkAsReadAction");
    public static final entd b = entd.c("BugleNotifications");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new baig();

    /* compiled from: PG */
    public interface a {
        bbfd aX();

        cbgf bI();

        bbgg bu();

        cins cb();

        cish cc();

        cisl cd();

        ffbr gj();

        ffbr gs();
    }

    public MarkAsReadAction(Context context, cqoh cqohVar, ctvb ctvbVar, akzt akztVar, altk altkVar, coxk coxkVar, dtuu dtuuVar, cpdg cpdgVar, axmw axmwVar, cbek cbekVar, cipm cipmVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, Parcel parcel) {
        super(parcel, eogt.MARK_AS_READ_ACTION);
        this.m = equw.MESSAGE_TYPE_UNKNOWN;
        this.n = context;
        this.f = cqohVar;
        this.q = ctvbVar;
        this.A = akztVar;
        this.i = altkVar;
        this.B = coxkVar;
        this.C = dtuuVar;
        this.D = cpdgVar;
        this.E = axmwVar;
        this.F = cbekVar;
        this.G = cipmVar;
        this.H = ffbrVar;
        this.g = ffbrVar2;
        this.h = ffbrVar3;
        this.j = ffbrVar4;
        this.k = ffbrVar5;
        this.l = ffbrVar6;
        this.I = ffbrVar7;
        a aVar = (a) ctba.a(a.class);
        this.c = aVar.cb();
        this.d = aVar.bu();
        this.o = aVar.cc();
        this.p = aVar.cd();
        this.e = aVar.bI();
        this.y = aVar.gj();
        this.z = aVar.gs();
    }

    private final void h(Exception exc) {
        if (this.t.y("from_notification")) {
            this.G.g(this.m, 3, cipm.c(exc), Optional.of(true));
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("MarkAsReadAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        try {
            cskc cskcVar = a;
            cskcVar.m("Starting MarkAsReadAction");
            if (!this.q.G()) {
                cskcVar.r("Not default SMS app. Can't mark as read.");
                return null;
            }
            final boolean z = this.t.z("should_mark_as_notified", true);
            this.C.d("MarkAsReadAction#executeAction", new Runnable() { // from class: baia
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r7v1 */
                /* JADX WARN: Type inference failed for: r7v17 */
                /* JADX WARN: Type inference failed for: r7v2, types: [boolean] */
                @Override // java.lang.Runnable
                public final void run() {
                    engw n;
                    char c;
                    Object apply;
                    Object apply2;
                    List list;
                    baia baiaVar = this;
                    MarkAsReadAction markAsReadAction = MarkAsReadAction.this;
                    if (markAsReadAction.t.y("mark_all_as_read")) {
                        n = ((bczy) markAsReadAction.g.b()).A();
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(bdgq.d(Arrays.asList(markAsReadAction.t.B("conversation_ids"))));
                        ConversationIdType b2 = bdgq.b(markAsReadAction.t.l("conversation_id"));
                        if (!b2.b()) {
                            arrayList.add(b2);
                        }
                        n = engw.n(arrayList);
                    }
                    MarkAsReadAction.a.m("Setting markAsUnread to false for " + n.size() + " conversation(s).");
                    ?? r7 = 0;
                    cesm.k((bczy) markAsReadAction.g.b(), markAsReadAction.e, n, false);
                    markAsReadAction.t.I(new ArrayList());
                    int i = 0;
                    while (i < n.size()) {
                        final ConversationIdType conversationIdType = (ConversationIdType) n.get(i);
                        ekzz f = eleg.f("MarkAsReadAction::markConversationAsRead");
                        try {
                            String[] strArr = MessagesTable.a;
                            buxr buxrVar = new buxr();
                            buxrVar.ap("markConversationAsRead#update");
                            buxrVar.n(conversationIdType);
                            buxrVar.F(true);
                            boolean z2 = z;
                            if (z2) {
                                buxrVar.v(true);
                            }
                            String.valueOf(conversationIdType);
                            boolean z3 = csjy.b;
                            buxz buxzVar = new buxz();
                            if (z2) {
                                buxz[] buxzVarArr = new buxz[2];
                                buxz buxzVar2 = new buxz();
                                buxzVar2.P(r7);
                                buxzVarArr[r7] = buxzVar2;
                                buxz buxzVar3 = new buxz();
                                buxzVar3.F();
                                buxzVarArr[1] = buxzVar3;
                                buxzVar.ar(buxzVarArr);
                            } else {
                                buxzVar.P(r7);
                            }
                            buxzVar.m(conversationIdType);
                            String l = markAsReadAction.t.l("message_id");
                            if (l != null) {
                                final MessageIdType b3 = bdhb.b(l);
                                buxo d = MessagesTable.d();
                                c = r7;
                                d.z("markConversationAsReadInLighter-messages1");
                                d.f(new Function() { // from class: baib
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        cskc cskcVar2 = MarkAsReadAction.a;
                                        return ((buum) obj).i;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                d.h(new Function() { // from class: baic
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        buxz buxzVar4 = (buxz) obj;
                                        cskc cskcVar2 = MarkAsReadAction.a;
                                        buxzVar4.q(MessageIdType.this);
                                        return buxzVar4;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                buxzVar.aq(new dtru("messages.received_timestamp", 10, d.b()));
                            } else {
                                c = r7;
                            }
                            buxo d2 = MessagesTable.d();
                            d2.z("+markConversationAsReadInLighter-messages2");
                            d2.f(new Function() { // from class: baid
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    cskc cskcVar2 = MarkAsReadAction.a;
                                    return ((buum) obj).a;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            d2.g(buxzVar);
                            List list2 = (List) Collection.EL.stream(d2.b().g()).collect(Collectors.toCollection(new bahz()));
                            if (!list2.isEmpty()) {
                                markAsReadAction.t.F().addAll((java.util.Collection) Collection.EL.stream(list2).map(new Function() { // from class: baie
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        cskc cskcVar2 = MarkAsReadAction.a;
                                        return ((MessageIdType) obj).b();
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).collect(Collectors.toCollection(new bahz())));
                                buxrVar.X(buxzVar);
                                if (buxrVar.b().e() > 0) {
                                    markAsReadAction.e.m(conversationIdType, list2, "read");
                                }
                            }
                            if (!list2.isEmpty()) {
                                markAsReadAction.e.d(conversationIdType);
                            }
                            String[] strArr2 = bsam.a;
                            bsaj bsajVar = new bsaj();
                            bsajVar.ap("markConversationAsRead-conversationsuggestions");
                            bsajVar.c();
                            ekzz f2 = eleg.f("ConversationSuggestionDatabaseOperations#updateConversationSuggestionRowsFromConversationId");
                            try {
                                csix.h();
                                bsal bsalVar = new bsal();
                                String[] strArr3 = bynb.a;
                                bymy bymyVar = new bymy(bynb.a);
                                bymv[] bymvVarArr = new bymv[1];
                                apply = new Function() { // from class: ctpf
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        return ((bymu) obj).a;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }.apply(bynb.c);
                                bymvVarArr[c] = (bymv) apply;
                                int a2 = bynb.a().P().a();
                                Integer.valueOf(a2).getClass();
                                engw engwVar = n;
                                int i2 = i;
                                if (((Integer) bynb.b.getOrDefault(bymvVarArr[c].toString(), -1)).intValue() > a2) {
                                    dtub.w("columnReference.toString()", a2);
                                }
                                bymyVar.m(bymvVarArr);
                                apply2 = new Function() { // from class: ctpg
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        byna bynaVar = (byna) obj;
                                        bynaVar.aq(new dtrt("messages.conversation_id", 1, Long.valueOf(bdgq.a(ConversationIdType.this))));
                                        return bynaVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }.apply(new byna());
                                bymyVar.k(new bymz((byna) apply2));
                                bsalVar.aq(new dtru("conversation_suggestions._id", 3, bymyVar.b()));
                                bsajVar.af(new bsak(bsalVar));
                                bsajVar.a().e();
                                f2.close();
                                if (z2) {
                                    ensz enszVar = (ensz) MarkAsReadAction.b.h();
                                    enszVar.Y(csux.o, conversationIdType.toString());
                                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/action/MarkAsReadAction", "markConversationAsRead", 512, "MarkAsReadAction.java")).q("Canceling incoming message notification from mark as read");
                                    ((cjbc) markAsReadAction.j.b()).a(conversationIdType);
                                }
                                if (markAsReadAction.t.y("from_notification")) {
                                    akxl akxlVar = (akxl) markAsReadAction.k.b();
                                    eolu eoluVar = (eolu) eolv.a.createBuilder();
                                    eolt eoltVar = eolt.BUGLE_CONVERSATION;
                                    eoluVar.copyOnWrite();
                                    eolv eolvVar = (eolv) eoluVar.instance;
                                    eolvVar.j = eoltVar.dk;
                                    eolvVar.b |= 1;
                                    eokv eokvVar = (eokv) eokw.a.createBuilder();
                                    long b4 = ((akvz) markAsReadAction.l.b()).b(conversationIdType);
                                    eokvVar.copyOnWrite();
                                    eokw eokwVar = (eokw) eokvVar.instance;
                                    list = list2;
                                    eokwVar.b |= 65536;
                                    eokwVar.r = b4;
                                    eoluVar.copyOnWrite();
                                    eolv eolvVar2 = (eolv) eoluVar.instance;
                                    eokw eokwVar2 = (eokw) eokvVar.build();
                                    eokwVar2.getClass();
                                    eolvVar2.m = eokwVar2;
                                    eolvVar2.b |= 8;
                                    akxlVar.k(eoluVar, epyw.ACTIVE_USER_ENTER_CONVERSATION_WITH_UNREAD_MESSAGE);
                                } else {
                                    list = list2;
                                }
                                markAsReadAction.d.a(bdhb.a, conversationIdType, 2, eooi.MARK_AS_READ_ACTION).C(markAsReadAction);
                                ensz enszVar2 = (ensz) MarkAsReadAction.b.h();
                                enszVar2.Y(csux.o, conversationIdType.toString());
                                ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/datamodel/action/MarkAsReadAction", "markConversationAsRead", 538, "MarkAsReadAction.java")).J("Marking %d message(s) as read (shouldMarkAsNotified = %b, fromNotification = %b)", Integer.valueOf(list.size()), Boolean.valueOf(z2), Boolean.valueOf(markAsReadAction.t.y("from_notification")));
                                f.close();
                                i = i2 + 1;
                                baiaVar = this;
                                r7 = c;
                                n = engwVar;
                            } catch (Throwable th) {
                                try {
                                    f2.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        } finally {
                        }
                    }
                    engw engwVar2 = n;
                    int i3 = r7;
                    markAsReadAction.i.ai(markAsReadAction.m == equw.MESSAGE_TYPE_RCS ? 1 : i3);
                    markAsReadAction.t.w("conversation_ids", (String[]) ((ArrayList) Collection.EL.stream(engwVar2).map(new Function() { // from class: baif
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            cskc cskcVar2 = MarkAsReadAction.a;
                            return ((ConversationIdType) obj).a();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.toCollection(new bahz()))).toArray(new String[i3]));
                    markAsReadAction.t.s("timestamp", markAsReadAction.f.f().toEpochMilli());
                }
            });
            cisd cisdVar = (cisd) cisg.a.createBuilder();
            if (this.t.y("from_notification")) {
                cisdVar.copyOnWrite();
                cisg cisgVar = (cisg) cisdVar.instance;
                cisgVar.c = 3;
                cisgVar.b = 1 | cisgVar.b;
            }
            this.o.a((cisg) cisdVar.build());
            this.p.b();
            w();
            return null;
        } catch (RuntimeException e) {
            h(e);
            throw e;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.MarkAsRead.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fR() {
        ParticipantsTable.BindData b2;
        String[] f;
        cpxu cpxuVar;
        try {
            ConversationIdType[] conversationIdTypeArr = (ConversationIdType[]) bdgq.e(Arrays.asList(this.t.B("conversation_ids"))).toArray(new ConversationIdType[0]);
            int length = conversationIdTypeArr.length;
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                try {
                    cpxuVar = this.F.a(conversationIdTypeArr[i]);
                } catch (emyx e) {
                    cpxu cpxuVar2 = new cpxu();
                    h(e);
                    cpxuVar = cpxuVar2;
                }
                jArr[i] = cpxv.a(cpxuVar);
            }
            long d = this.t.d("timestamp");
            boolean y = this.t.y("should_mark_as_notified");
            for (int i2 = 0; i2 < length; i2++) {
                ConversationIdType conversationIdType = conversationIdTypeArr[i2];
                String[] strArr = MessagesTable.a;
                buxz buxzVar = new buxz();
                buxzVar.P(false);
                if (y) {
                    buxz buxzVar2 = new buxz();
                    buxz buxzVar3 = new buxz();
                    buxzVar3.F();
                    buxzVar2.ar(buxzVar, buxzVar3);
                    buxzVar = buxzVar2;
                }
                if (((axmt) this.y.b()).d(conversationIdType, cpxu.b(jArr[i2])) && (f = ((axmt) this.y.b()).f(conversationIdType, new buxs(buxzVar))) != null) {
                    this.E.f(this.n, f, y);
                }
            }
            for (int i3 = 0; i3 < length; i3++) {
                long j = jArr[i3];
                if (j != -1) {
                    this.B.j(j, d);
                }
            }
            this.m = equw.MESSAGE_TYPE_UNKNOWN;
            ArrayList F = this.t.F();
            if (F != null) {
                HashMap hashMap = new HashMap();
                int size = F.size();
                for (int i4 = 0; i4 < size; i4++) {
                    String str = (String) F.get(i4);
                    if (!TextUtils.isEmpty(str)) {
                        MessageIdType b3 = bdhb.b(str);
                        MessageCoreData v = ((bdmq) this.z.b()).v(b3);
                        if (v == null) {
                            csjb e2 = a.e();
                            e2.d(b3);
                            e2.I("no longer exists.");
                            e2.r();
                        } else {
                            this.m = cipm.a(this.m, v);
                            Optional empty = Optional.empty();
                            ConversationIdType z = v.z();
                            if (!hashMap.containsKey(z)) {
                                bcyk a2 = ((azwh) this.H.b()).a(z);
                                if (a2 != null) {
                                    empty = Optional.of(Integer.valueOf(a2.L()));
                                }
                                hashMap.put(z, empty);
                            }
                            Optional optional = (Optional) hashMap.get(z);
                            this.i.aN(v, optional);
                            String aA = v.aA();
                            if (aA != null && (b2 = ParticipantsTable.b(aA)) != null) {
                                String U = b2.U();
                                if (!TextUtils.isEmpty(U) && (v.N().a() || this.D.j(b2.U()))) {
                                    this.i.p(U, -1, v.B().b(), emxe.b(v.ar()), v.N());
                                }
                            }
                        }
                    }
                }
                int size2 = F.size();
                if (this.t.y("mark_all_as_read")) {
                    final bdmq bdmqVar = (bdmq) this.z.b();
                    ekzz f2 = eleg.f("MessageDatabaseOperations#hasUnreadMessages");
                    try {
                        buxo d2 = MessagesTable.d();
                        d2.z("hasUnreadMessages");
                        d2.c(MessagesTable.c.a);
                        d2.h(new Function() { // from class: bdld
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                buxz buxzVar4 = (buxz) obj;
                                buxzVar4.P(false);
                                return buxzVar4;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        boolean T = d2.b().T();
                        f2.close();
                        if (T) {
                            a.r("Forcing remaining unread msgs to be read.");
                            buxr buxrVar = new buxr();
                            buxrVar.ap("MarkAsReadAction#runBackgroundWork");
                            buxrVar.F(true);
                            buxrVar.v(true);
                            buxz buxzVar4 = new buxz();
                            buxzVar4.P(false);
                            size2 += buxrVar.ae(new buxs(buxzVar4), "messages-buildAndUpdateForRead");
                        }
                        this.e.c();
                    } finally {
                    }
                }
                this.t.r("total_messages_marked_as_read", size2);
            }
            if (!this.t.y("from_notification")) {
                return null;
            }
            this.A.c("Bugle.Notification.MarkAsRead.Count");
            this.i.aE(eoqn.INCOMING_MSG_NOTIFICATION, 2, (List) DesugarArrays.stream(conversationIdTypeArr).collect(Collectors.toCollection(new bahz())));
            this.G.f(Optional.of(this.m), 2, Duration.between(Instant.ofEpochMilli(this.t.d("start_timestamp")), this.f.f()));
            return null;
        } catch (RuntimeException e3) {
            h(e3);
            throw e3;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public MarkAsReadAction(Context context, cqoh cqohVar, ctvb ctvbVar, akzt akztVar, altk altkVar, coxk coxkVar, dtuu dtuuVar, cpdg cpdgVar, axmw axmwVar, cbek cbekVar, cipm cipmVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ConversationIdType[] conversationIdTypeArr, MessageIdType messageIdType, boolean z, boolean z2, int i) {
        super(eogt.MARK_AS_READ_ACTION);
        this.m = equw.MESSAGE_TYPE_UNKNOWN;
        this.n = context;
        this.f = cqohVar;
        this.q = ctvbVar;
        this.A = akztVar;
        this.i = altkVar;
        this.B = coxkVar;
        this.C = dtuuVar;
        this.D = cpdgVar;
        this.E = axmwVar;
        this.F = cbekVar;
        this.H = ffbrVar;
        this.g = ffbrVar2;
        this.h = ffbrVar3;
        this.G = cipmVar;
        this.j = ffbrVar4;
        this.k = ffbrVar5;
        this.l = ffbrVar6;
        this.I = ffbrVar7;
        this.t.w("conversation_ids", (String[]) ((ArrayList) DesugarArrays.stream(conversationIdTypeArr).map(new Function() { // from class: bahy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cskc cskcVar = MarkAsReadAction.a;
                return ((ConversationIdType) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new bahz()))).toArray(new String[0]));
        if (!messageIdType.c()) {
            this.t.v("message_id", messageIdType.b());
        }
        this.t.p("should_mark_as_notified", z);
        this.t.p("from_notification", z2);
        this.t.s("start_timestamp", cqohVar.f().toEpochMilli());
        if (i == 1) {
            this.t.p("mark_all_as_read", true);
        } else if (i == 2) {
            this.t.p("should_mark_payment_requests_read", true);
        }
        a aVar = (a) ctba.a(a.class);
        this.c = aVar.cb();
        this.d = aVar.bu();
        this.e = aVar.bI();
        this.o = aVar.cc();
        this.p = aVar.cd();
        this.y = aVar.gj();
        this.z = aVar.gs();
    }
}
