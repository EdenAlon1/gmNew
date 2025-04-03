package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckpp extends ceut {
    public static final entd a = entd.c("BugleGroupManagement");
    public final ckju b;
    public final dtuu c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final cqoh h;
    public final ffbr i;
    public final ckds j;
    private final Context k;
    private final errm l;
    private final errl m;
    private final ffbr n;
    private final cbfs o;

    public ckpp(Context context, errm errmVar, errl errlVar, ckju ckjuVar, dtuu dtuuVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, cbfs cbfsVar, ffbr ffbrVar4, ffbr ffbrVar5, cqoh cqohVar, ffbr ffbrVar6, ckds ckdsVar) {
        this.k = context;
        this.l = errmVar;
        this.m = errlVar;
        this.b = ckjuVar;
        this.c = dtuuVar;
        this.n = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.o = cbfsVar;
        this.f = ffbrVar4;
        this.g = ffbrVar5;
        this.h = cqohVar;
        this.i = ffbrVar6;
        this.j = ckdsVar;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("IncomingRcsGroupInvitationHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return ckpr.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        ckpr ckprVar = (ckpr) eyhsVar;
        if (!ctid.h(this.k)) {
            return elfo.e(ckprVar).h(new emwl() { // from class: ckph
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    final ConversationIdType conversationIdType;
                    ckpr ckprVar2 = (ckpr) obj;
                    if (ckprVar2.c.isEmpty()) {
                        ((ensz) ((ensz) ckpp.a.j()).h("com/google/android/apps/messaging/shared/rcs/groups/invite/IncomingRcsGroupInvitationHandler", "areValidIncomingRcsGroupInvitationParameters", 246, "IncomingRcsGroupInvitationHandler.java")).q("Invalid parameters. RCS group ID not set");
                    } else if (ckprVar2.d.isEmpty()) {
                        ((ensz) ((ensz) ckpp.a.j()).h("com/google/android/apps/messaging/shared/rcs/groups/invite/IncomingRcsGroupInvitationHandler", "areValidIncomingRcsGroupInvitationParameters", 251, "IncomingRcsGroupInvitationHandler.java")).q("Invalid parameters. RCS conference URI not set");
                    } else {
                        if (ckprVar2.f.size() != 0) {
                            final ckpp ckppVar = ckpp.this;
                            ckjy w = ckjz.w();
                            w.q(true);
                            w.w(epby.INCOMING_GROUP_INVITE_HANDLER);
                            w.p(false);
                            w.z(ckprVar2.b);
                            w.u(ckprVar2.c);
                            w.n(ckprVar2.e);
                            w.j(false);
                            final ConversationIdType a2 = ckppVar.b.a(w.D());
                            if (a2.b()) {
                                ckju ckjuVar = ckppVar.b;
                                w.j(true);
                                w.s(ckprVar2.d);
                                Stream map = Collection.EL.stream(ckprVar2.f).map(new Function() { // from class: ckpl
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        entd entdVar = ckpp.a;
                                        return bdqu.f((String) obj2).a();
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                int i = engw.d;
                                w.r((List) map.collect(endq.a));
                                final ConversationIdType a3 = ckjuVar.a(w.D());
                                if (a3.b()) {
                                    ensz enszVar = (ensz) ckpp.a.i();
                                    enszVar.Y(csux.H, Long.valueOf(ckprVar2.b));
                                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/rcs/groups/invite/IncomingRcsGroupInvitationHandler", "processPendingWorkItemAsync", 195, "IncomingRcsGroupInvitationHandler.java")).q("Unable to get or create conversation for incoming RCS group.");
                                    return ceyt.m();
                                }
                                ensk n = ckpp.a.n();
                                n.Y(csux.o, a3.toString());
                                n.Y(csux.H, Long.valueOf(ckprVar2.b));
                                ((ensz) n.h("com/google/android/apps/messaging/shared/rcs/groups/invite/IncomingRcsGroupInvitationHandler", "processPendingWorkItemAsync", BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, "IncomingRcsGroupInvitationHandler.java")).q("Received a group invitation for a new conversation");
                                final eygr eygrVar = ckprVar2.f;
                                final String str = ckprVar2.g;
                                final long j = ckprVar2.b;
                                ckppVar.c.d("IncomingRcsGroupInvitationHandler.handleIncomingInviteForNewConversation", new Runnable() { // from class: ckpm
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ckpp ckppVar2;
                                        ArrayList<ParticipantsTable.BindData> arrayList = new ArrayList();
                                        Iterator it = eygrVar.iterator();
                                        while (true) {
                                            ckppVar2 = ckpp.this;
                                            if (!it.hasNext()) {
                                                break;
                                            } else {
                                                arrayList.add(ckppVar2.k((String) it.next()));
                                            }
                                        }
                                        String str2 = str;
                                        ParticipantsTable.BindData k = emxe.c(str2) ? null : ckppVar2.k(str2);
                                        long j2 = j;
                                        ConversationIdType conversationIdType2 = a3;
                                        String str3 = "IncomingRcsGroupInvitationHandler.java";
                                        if (k != null) {
                                            for (ParticipantsTable.BindData bindData : arrayList) {
                                                ensk n2 = ckpp.a.n();
                                                n2.Y(csux.o, conversationIdType2.toString());
                                                n2.Y(csux.H, Long.valueOf(j2));
                                                ((ensz) n2.h("com/google/android/apps/messaging/shared/rcs/groups/invite/IncomingRcsGroupInvitationHandler", "insertNewConversationParticipantTombstoneWithReferrer", 404, "IncomingRcsGroupInvitationHandler.java")).D("%s added %s", cskt.b(((bdrt) ckppVar2.i.b()).a(k, true)), cskt.b(((bdrt) ckppVar2.i.b()).a(bindData, true)));
                                            }
                                            ((cbvt) ckppVar2.f.b()).k(Optional.empty(), conversationIdType2, ckppVar2.j.h(), k, arrayList, BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, ckppVar2.h.f().toEpochMilli(), j2, null);
                                            return;
                                        }
                                        ((ensz) ckpp.a.n().h("com/google/android/apps/messaging/shared/rcs/groups/invite/IncomingRcsGroupInvitationHandler", "handleIncomingInviteForNewConversation", 305, "IncomingRcsGroupInvitationHandler.java")).q("Referrer msisdn is empty. Adding participants individually");
                                        for (ParticipantsTable.BindData bindData2 : arrayList) {
                                            ensk n3 = ckpp.a.n();
                                            n3.Y(csux.o, conversationIdType2.toString());
                                            n3.Y(csux.H, Long.valueOf(j2));
                                            ((ensz) n3.h("com/google/android/apps/messaging/shared/rcs/groups/invite/IncomingRcsGroupInvitationHandler", "insertNewConversationParticipantTombstoneNoReferrer", 373, str3)).t("%s joined", cskt.b(((bdrt) ckppVar2.i.b()).a(bindData2, true)));
                                            ConversationIdType conversationIdType3 = conversationIdType2;
                                            long j3 = j2;
                                            ((cbvt) ckppVar2.f.b()).k(Optional.empty(), conversationIdType3, ckppVar2.j.h(), bindData2, new ArrayList(engw.r(bindData2)), BasePaymentResult.ERROR_REQUEST_FAILED, ckppVar2.h.f().toEpochMilli(), j3, null);
                                            str3 = str3;
                                            conversationIdType2 = conversationIdType3;
                                            j2 = j3;
                                        }
                                    }
                                });
                                conversationIdType = a3;
                            } else {
                                ensk n2 = ckpp.a.n();
                                n2.Y(csux.o, a2.toString());
                                n2.Y(csux.H, Long.valueOf(ckprVar2.b));
                                ((ensz) n2.h("com/google/android/apps/messaging/shared/rcs/groups/invite/IncomingRcsGroupInvitationHandler", "processPendingWorkItemAsync", 173, "IncomingRcsGroupInvitationHandler.java")).q("Received a group invitation for an existing conversation");
                                final long j2 = ckprVar2.b;
                                ckppVar.c.d("IncomingRcsGroupInvitationHandler.handleIncomingInviteForExistingConversation", new Runnable() { // from class: ckpk
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        final ckpp ckppVar2 = ckpp.this;
                                        final ConversationIdType conversationIdType2 = a2;
                                        final long j3 = j2;
                                        bsom.m(conversationIdType2, new Consumer() { // from class: ckpo
                                            @Override // java.util.function.Consumer
                                            /* renamed from: accept */
                                            public final void o(Object obj2) {
                                                if (((bseh) obj2).m() == 2) {
                                                    long j4 = j3;
                                                    ConversationIdType conversationIdType3 = conversationIdType2;
                                                    ckpp ckppVar3 = ckpp.this;
                                                    ((cbvt) ckppVar3.f.b()).l(ckppVar3.j.h(), ckppVar3.h.f().toEpochMilli(), conversationIdType3, j4, BasePaymentResult.ERROR_REQUEST_FAILED);
                                                }
                                            }

                                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                return Consumer$CC.$default$andThen(this, consumer);
                                            }
                                        });
                                    }
                                });
                                conversationIdType = a2;
                            }
                            final MessageCoreData n3 = ((bdmq) ckppVar.d.b()).n(conversationIdType);
                            final long j3 = ckprVar2.b;
                            final String str2 = ckprVar2.g;
                            ckppVar.c.d("IncomingRcsGroupInvitationHandler.updateConversationMetadata", new Runnable() { // from class: ckpn
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ConversationIdType conversationIdType2 = conversationIdType;
                                    ckpp ckppVar2 = ckpp.this;
                                    String str3 = str2;
                                    byyt byytVar = byyt.UNARCHIVED;
                                    if (!emxe.c(str3)) {
                                        byytVar = ((bdmq) ckppVar2.d.b()).F(conversationIdType2, str3, ((crrm) ckppVar2.g.b()).e(str3), true);
                                    }
                                    byyt byytVar2 = byytVar;
                                    MessageCoreData messageCoreData = n3;
                                    bdfl bdflVar = (bdfl) ckppVar2.e.b();
                                    MessageIdType B = messageCoreData == null ? bdhb.a : messageCoreData.B();
                                    long epochMilli = messageCoreData == null ? ckppVar2.h.f().toEpochMilli() : messageCoreData.o();
                                    bdflVar.f(conversationIdType2, B, Long.valueOf(epochMilli), byytVar2, j3, 0);
                                }
                            });
                            return ceyt.i();
                        }
                        ((ensz) ((ensz) ckpp.a.j()).h("com/google/android/apps/messaging/shared/rcs/groups/invite/IncomingRcsGroupInvitationHandler", "areValidIncomingRcsGroupInvitationParameters", 256, "IncomingRcsGroupInvitationHandler.java")).q("Invalid parameters. Empty participants");
                    }
                    ensz enszVar2 = (ensz) ckpp.a.j();
                    enszVar2.Y(csux.J, ckprVar2.c);
                    ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/rcs/groups/invite/IncomingRcsGroupInvitationHandler", "processPendingWorkItemAsync", 148, "IncomingRcsGroupInvitationHandler.java")).r("IncomingRcsGroupInvitationParameters still invalid after retrieving information from RCS process. Participant count: %d", ckprVar2.f.size());
                    return ceyt.m();
                }
            }, this.l).f(TimeoutException.class, new eroh() { // from class: ckpi
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    entd entdVar = ckpp.a;
                    return elfo.e(ceyt.m());
                }
            }, this.m).f(ehxg.class, new eroh() { // from class: ckpj
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    entd entdVar = ckpp.a;
                    return elfo.e(ceyt.m());
                }
            }, this.m);
        }
        ((ensz) a.n().h("com/google/android/apps/messaging/shared/rcs/groups/invite/IncomingRcsGroupInvitationHandler", "processPendingWorkItemAsync", 137, "IncomingRcsGroupInvitationHandler.java")).q("Ignoring incoming RCS group invitation for secondary user");
        return elfo.e(ceyt.i());
    }

    public final ParticipantsTable.BindData k(String str) {
        ffbr ffbrVar = this.n;
        bvpo f = bdqu.f(str);
        f.v(((bdrr) ffbrVar.b()).j(f));
        this.o.f(f, 3);
        return f.a();
    }
}
