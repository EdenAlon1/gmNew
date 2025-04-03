package com.google.android.apps.messaging.shared.datamodel.action;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.action.SendMessageToConversationOrParticipantsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.baxi;
import defpackage.bbfb;
import defpackage.bbgf;
import defpackage.bcvw;
import defpackage.bcwz;
import defpackage.bdtd;
import defpackage.byzp;
import defpackage.covs;
import defpackage.cqoh;
import defpackage.ctba;
import defpackage.dtuu;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.enru;
import defpackage.eogt;
import defpackage.erog;
import defpackage.eroh;
import defpackage.errl;
import defpackage.ffbr;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class SendMessageToConversationOrParticipantsAction extends Action<Void> implements Parcelable {
    public final ffbr b;
    public final bbfb c;
    public final bdtd d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final covs h;
    public final cqoh i;
    public final byzp j;
    public final dtuu k;
    public final bcvw l;
    public final bcwz m;
    public final errl n;
    public final errl o;
    public final ffbr p;
    public final ffbr q;
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/action/SendMessageToConversationOrParticipantsAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new baxi();

    /* compiled from: PG */
    public interface a {
        bbfb aW();

        bbgf bt();
    }

    public SendMessageToConversationOrParticipantsAction(Parcel parcel, bdtd bdtdVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, covs covsVar, cqoh cqohVar, byzp byzpVar, dtuu dtuuVar, bcvw bcvwVar, bcwz bcwzVar, errl errlVar, errl errlVar2, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6) {
        super(parcel, eogt.SEND_MESSAGE_TO_CONVERSATION_OR_PARTICIPANTS_ACTION);
        this.d = bdtdVar;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.h = covsVar;
        this.i = cqohVar;
        this.j = byzpVar;
        this.k = dtuuVar;
        this.l = bcvwVar;
        this.m = bcwzVar;
        this.n = errlVar;
        this.o = errlVar2;
        this.b = ffbrVar5;
        this.p = ffbrVar4;
        this.q = ffbrVar6;
        this.c = ((a) ctba.a(a.class)).aW();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("SendMessageToConversationOrParticipantsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        throw new IllegalStateException("SendMessageToConversationOrParticipantsAction#executeAction called without an implementation. Only executeActionAsync should be called.");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.SendMessageToConversationOrParticipants.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final elfl e() {
        return elfo.h(new erog() { // from class: baxf
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.erog
            public final ListenableFuture a() {
                elfl i;
                final SendMessageToConversationOrParticipantsAction sendMessageToConversationOrParticipantsAction = SendMessageToConversationOrParticipantsAction.this;
                final long epochMilli = sendMessageToConversationOrParticipantsAction.i.f().toEpochMilli();
                bbcg bbcgVar = sendMessageToConversationOrParticipantsAction.t;
                final boolean z = bbcgVar.z("use_cloud_sync", false);
                final ConversationIdType b = bdgq.b(bbcgVar.l("conversation_id"));
                if (b.b()) {
                    final engw B = ((bczy) sendMessageToConversationOrParticipantsAction.e.b()).B(engw.n(sendMessageToConversationOrParticipantsAction.t.m("participants_list")));
                    if (z) {
                        b = (ConversationIdType) sendMessageToConversationOrParticipantsAction.k.c("SendMessageToConversationOrParticipantsAction#getConversationId", new emyl() { // from class: baxh
                            @Override // defpackage.emyl
                            public final Object get() {
                                return ((axmt) SendMessageToConversationOrParticipantsAction.this.g.b()).b(byyt.UNARCHIVED, B);
                            }
                        });
                    } else if (((Boolean) ayhv.a.e()).booleanValue()) {
                        ArrayList arrayList = new ArrayList();
                        int size = B.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            String U = ((ParticipantsTable.BindData) B.get(i2)).U();
                            if (U != null) {
                                arrayList.add(U);
                            }
                        }
                        engw n = engw.n(arrayList);
                        bdgc y = bdgd.y();
                        y.p(B);
                        y.l(false);
                        y.z(new cpxu());
                        y.k(false);
                        final bdgd A = y.A();
                        b = ((ayif) sendMessageToConversationOrParticipantsAction.b.b()).d(n, new ffbr() { // from class: bawu
                            @Override // defpackage.ffbr, defpackage.ffbq
                            public final Object b() {
                                return bdgd.this;
                            }
                        }).C();
                        if (b.b()) {
                            b = bdgq.a;
                        }
                    } else {
                        long d = sendMessageToConversationOrParticipantsAction.h.d(B);
                        if (d < 0) {
                            ensk j = SendMessageToConversationOrParticipantsAction.a.j();
                            j.Y(ente.a, "Bugle");
                            enrr enrrVar = (enrr) j;
                            enrrVar.Y(csux.E, bdqu.l(B).toString());
                            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageToConversationOrParticipantsAction", "getConversationId", 639, "SendMessageToConversationOrParticipantsAction.java")).q("Couldn't create a threadId in SMS db for the numbers.");
                            b = bdgq.a;
                        } else {
                            b = ((bczy) sendMessageToConversationOrParticipantsAction.e.b()).ar(d, byyt.UNARCHIVED, B);
                        }
                    }
                }
                if (b.b()) {
                    ensk j2 = SendMessageToConversationOrParticipantsAction.a.j();
                    j2.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageToConversationOrParticipantsAction", "executeInner", 451, "SendMessageToConversationOrParticipantsAction.java")).q("Couldn't find a conversation id.");
                    return elfo.e(null);
                }
                final bcyk a2 = ((azwh) sendMessageToConversationOrParticipantsAction.p.b()).a(b);
                if (a2 == null) {
                    ensk j3 = SendMessageToConversationOrParticipantsAction.a.j();
                    j3.Y(ente.a, "Bugle");
                    enrr enrrVar2 = (enrr) j3;
                    enrrVar2.Y(csux.p, b);
                    ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageToConversationOrParticipantsAction", "executeInner", 461, "SendMessageToConversationOrParticipantsAction.java")).q("Couldn't find conversation item data.");
                    return elfo.e(null);
                }
                aztg f = sendMessageToConversationOrParticipantsAction.d.f(a2.f());
                elfl h = (f == null || f.j()) ? ((aqvh) sendMessageToConversationOrParticipantsAction.q.b()).e().h(new emwl() { // from class: baxb
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        Optional optional = (Optional) obj;
                        enru enruVar = SendMessageToConversationOrParticipantsAction.a;
                        if (!optional.isEmpty()) {
                            return optional.map(new Function() { // from class: bawt
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return ((aqux) obj2).g();
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                        }
                        ensk j4 = SendMessageToConversationOrParticipantsAction.a.j();
                        j4.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) j4).h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageToConversationOrParticipantsAction", "getSelfIdentity", 576, "SendMessageToConversationOrParticipantsAction.java")).q("Invalid selfId when creating conversation.");
                        return Optional.empty();
                    }
                }, sendMessageToConversationOrParticipantsAction.o) : elfo.e(Optional.of(f.g()));
                bbcg bbcgVar2 = sendMessageToConversationOrParticipantsAction.t;
                final String l = bbcgVar2.l("message_text");
                String l2 = bbcgVar2.l("message_attachment_type");
                if (l2 == null) {
                    i = h.i(new eroh() { // from class: bawv
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            elfl h2;
                            final SendMessageToConversationOrParticipantsAction sendMessageToConversationOrParticipantsAction2 = SendMessageToConversationOrParticipantsAction.this;
                            Optional optional = (Optional) obj;
                            Optional k = sendMessageToConversationOrParticipantsAction2.k(optional);
                            if (k.isEmpty()) {
                                return elfo.e(Optional.empty());
                            }
                            final String str = l;
                            final ConversationIdType conversationIdType = b;
                            boolean z2 = z;
                            final SelfIdentityId selfIdentityId = (SelfIdentityId) optional.get();
                            int intValue = ((Integer) k.get()).intValue();
                            if (z2) {
                                final long epochMilli2 = sendMessageToConversationOrParticipantsAction2.i.f().toEpochMilli();
                                Callable callable = new Callable() { // from class: baxa
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        ConversationIdType conversationIdType2 = conversationIdType;
                                        SelfIdentityId selfIdentityId2 = selfIdentityId;
                                        return SendMessageToConversationOrParticipantsAction.this.j.d(null, conversationIdType2, selfIdentityId2.b(), selfIdentityId2, str, "", 0L, epochMilli2, true, true, 3, null);
                                    }
                                };
                                sendMessageToConversationOrParticipantsAction2 = sendMessageToConversationOrParticipantsAction2;
                                h2 = elfo.g(callable, sendMessageToConversationOrParticipantsAction2.o);
                            } else {
                                h2 = sendMessageToConversationOrParticipantsAction2.h(conversationIdType, selfIdentityId, intValue, str, Collections.singletonList(sendMessageToConversationOrParticipantsAction2.m.i(str)));
                            }
                            return h2.h(new baxg(), sendMessageToConversationOrParticipantsAction2.o);
                        }
                    }, sendMessageToConversationOrParticipantsAction.o);
                } else {
                    if (!le.f(l2)) {
                        throw new IllegalArgumentException(a.a(l2, "Attachment type ", " is not supported."));
                    }
                    i = h.i(new eroh() { // from class: baww
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            SendMessageToConversationOrParticipantsAction sendMessageToConversationOrParticipantsAction2 = SendMessageToConversationOrParticipantsAction.this;
                            Optional optional = (Optional) obj;
                            Optional k = sendMessageToConversationOrParticipantsAction2.k(optional);
                            if (k.isEmpty()) {
                                return elfo.e(Optional.empty());
                            }
                            String str = l;
                            ConversationIdType conversationIdType = b;
                            SelfIdentityId selfIdentityId = (SelfIdentityId) optional.get();
                            int intValue = ((Integer) k.get()).intValue();
                            bbcg bbcgVar3 = sendMessageToConversationOrParticipantsAction2.t;
                            String l3 = bbcgVar3.l("message_attachment_type");
                            Uri uri = (Uri) bbcgVar3.h("message_attachment_uri");
                            bcwz bcwzVar = sendMessageToConversationOrParticipantsAction2.m;
                            long d2 = bbcgVar3.d("message_attachment_duration");
                            bcxb C = bcxc.C();
                            bcqk bcqkVar = (bcqk) C;
                            bcqkVar.c = l3;
                            bcqkVar.d = uri;
                            bcqkVar.e = uri;
                            C.g(d2);
                            return sendMessageToConversationOrParticipantsAction2.h(conversationIdType, selfIdentityId, intValue, str, Collections.singletonList(bcwzVar.c(C.r()))).h(new baxg(), sendMessageToConversationOrParticipantsAction2.o);
                        }
                    }, sendMessageToConversationOrParticipantsAction.o);
                }
                final elfl elflVar = i;
                final elfl elflVar2 = h;
                return elfo.k(h, i).a(new Callable() { // from class: baxc
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Optional optional = (Optional) erqt.q(elflVar2);
                        Optional optional2 = (Optional) erqt.q(elflVar);
                        SendMessageToConversationOrParticipantsAction sendMessageToConversationOrParticipantsAction2 = SendMessageToConversationOrParticipantsAction.this;
                        Optional k = sendMessageToConversationOrParticipantsAction2.k(optional);
                        if (k.isEmpty() || optional2.isEmpty()) {
                            ensk j4 = SendMessageToConversationOrParticipantsAction.a.j();
                            j4.Y(ente.a, "Bugle");
                            ((enrr) ((enrr) j4).h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageToConversationOrParticipantsAction", "executeInner", 477, "SendMessageToConversationOrParticipantsAction.java")).q("Unable to create conversation, invalid selfIdentity.");
                        } else {
                            MessageCoreData messageCoreData = (MessageCoreData) optional2.get();
                            int intValue = ((Integer) k.get()).intValue();
                            bbcg bbcgVar3 = sendMessageToConversationOrParticipantsAction2.t;
                            eooi eooiVar = eooi.OBSOLETE_WEARABLE_REPLY;
                            boolean y2 = bbcgVar3.y("initiated_by_secondary_device");
                            messageCoreData.bE(a2.h(eooiVar, y2 ? new DeviceData(eolm.WEARABLE) : null, epochMilli));
                            sendMessageToConversationOrParticipantsAction2.c.f(messageCoreData, intValue, y2).A();
                        }
                        return null;
                    }
                }, sendMessageToConversationOrParticipantsAction.n);
            }
        }, this.n);
    }

    public final elfl h(final ConversationIdType conversationIdType, final SelfIdentityId selfIdentityId, final int i, final String str, final List list) {
        return elfo.g(new Callable() { // from class: baxd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ((bdfw) SendMessageToConversationOrParticipantsAction.this.f.b()).b(conversationIdType);
            }
        }, this.n).i(new eroh() { // from class: baxe
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                String str2 = str;
                final List list2 = list;
                final SendMessageToConversationOrParticipantsAction sendMessageToConversationOrParticipantsAction = SendMessageToConversationOrParticipantsAction.this;
                bcvw bcvwVar = sendMessageToConversationOrParticipantsAction.l;
                final ConversationIdType conversationIdType2 = conversationIdType;
                elfl b = bcvwVar.b(conversationIdType2, (engw) obj, null, str2, list2, i, false, false);
                final SelfIdentityId selfIdentityId2 = selfIdentityId;
                return b.h(new emwl() { // from class: bawz
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        MessageCoreData j = SendMessageToConversationOrParticipantsAction.this.j.j(((Integer) obj2).intValue(), conversationIdType2, selfIdentityId2);
                        ((MessageData) j).i.addAll(list2);
                        return j;
                    }
                }, sendMessageToConversationOrParticipantsAction.o);
            }
        }, this.n);
    }

    public final Optional k(Optional optional) {
        final bdtd bdtdVar = this.d;
        return optional.map(new Function() { // from class: bawx
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
        }).map(new Function() { // from class: bawy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((aztg) obj).e());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public SendMessageToConversationOrParticipantsAction(bdtd bdtdVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, covs covsVar, cqoh cqohVar, byzp byzpVar, dtuu dtuuVar, bcvw bcvwVar, bcwz bcwzVar, errl errlVar, errl errlVar2, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ConversationIdType conversationIdType, Uri uri, long j, String str) {
        super(eogt.SEND_MESSAGE_TO_CONVERSATION_OR_PARTICIPANTS_ACTION);
        this.d = bdtdVar;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.h = covsVar;
        this.i = cqohVar;
        this.j = byzpVar;
        this.k = dtuuVar;
        this.l = bcvwVar;
        this.m = bcwzVar;
        this.n = errlVar;
        this.o = errlVar2;
        this.b = ffbrVar4;
        this.p = ffbrVar5;
        this.q = ffbrVar6;
        this.c = ((a) ctba.a(a.class)).aW();
        this.t.v("conversation_id", conversationIdType.a());
        this.t.t("message_attachment_uri", uri);
        this.t.s("message_attachment_duration", j);
        this.t.v("message_attachment_type", str);
        this.t.p("use_cloud_sync", false);
        this.t.p("initiated_by_secondary_device", true);
    }

    public SendMessageToConversationOrParticipantsAction(bdtd bdtdVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, covs covsVar, cqoh cqohVar, byzp byzpVar, dtuu dtuuVar, bcvw bcvwVar, bcwz bcwzVar, errl errlVar, errl errlVar2, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ConversationIdType conversationIdType, String str) {
        this(bdtdVar, ffbrVar, ffbrVar2, ffbrVar3, covsVar, cqohVar, byzpVar, dtuuVar, bcvwVar, bcwzVar, errlVar, errlVar2, ffbrVar4, ffbrVar5, ffbrVar6, str);
        this.t.v("conversation_id", conversationIdType.a());
    }

    public SendMessageToConversationOrParticipantsAction(bdtd bdtdVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, covs covsVar, cqoh cqohVar, byzp byzpVar, dtuu dtuuVar, bcvw bcvwVar, bcwz bcwzVar, errl errlVar, errl errlVar2, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, String str) {
        super(eogt.SEND_MESSAGE_TO_CONVERSATION_OR_PARTICIPANTS_ACTION);
        this.d = bdtdVar;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.h = covsVar;
        this.i = cqohVar;
        this.j = byzpVar;
        this.k = dtuuVar;
        this.l = bcvwVar;
        this.m = bcwzVar;
        this.n = errlVar;
        this.o = errlVar2;
        this.b = ffbrVar4;
        this.p = ffbrVar5;
        this.q = ffbrVar6;
        this.c = ((a) ctba.a(a.class)).aW();
        this.t.v("message_text", str);
        this.t.p("use_cloud_sync", false);
        this.t.p("initiated_by_secondary_device", true);
    }

    public SendMessageToConversationOrParticipantsAction(bdtd bdtdVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, covs covsVar, cqoh cqohVar, byzp byzpVar, dtuu dtuuVar, bcvw bcvwVar, bcwz bcwzVar, errl errlVar, errl errlVar2, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ArrayList arrayList, String str) {
        this(bdtdVar, ffbrVar, ffbrVar2, ffbrVar3, covsVar, cqohVar, byzpVar, dtuuVar, bcvwVar, bcwzVar, errlVar, errlVar2, ffbrVar4, ffbrVar5, ffbrVar6, str);
        this.t.u("participants_list", arrayList);
    }
}
