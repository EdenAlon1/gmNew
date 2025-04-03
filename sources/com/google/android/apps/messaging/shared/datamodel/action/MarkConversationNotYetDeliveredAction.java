package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.MarkConversationNotYetDeliveredAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import defpackage.akzt;
import defpackage.baij;
import defpackage.baik;
import defpackage.bajq;
import defpackage.bdhg;
import defpackage.bdmr;
import defpackage.ckdr;
import defpackage.ckds;
import defpackage.csix;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.dtus;
import defpackage.dtuu;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.eogt;
import defpackage.ffbr;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class MarkConversationNotYetDeliveredAction extends Action<Void> {
    public final ffbr b;
    public final ffbr c;
    public final akzt d;
    public final bdmr e;
    private final ckds f;
    private final dtuu g;
    public static final cskc a = cskc.g("BugleDataModel", "MarkConversationNotYetDeliveredAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new baij();

    /* compiled from: PG */
    public interface a {
        baik hT();
    }

    public MarkConversationNotYetDeliveredAction(ffbr ffbrVar, ffbr ffbrVar2, ckds ckdsVar, akzt akztVar, dtuu dtuuVar, bdmr bdmrVar, Parcel parcel) {
        super(parcel, eogt.MARK_CONVERSATION_NOT_YET_DELIVERED_ACTION);
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.f = ckdsVar;
        this.d = akztVar;
        this.g = dtuuVar;
        this.e = bdmrVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("MarkConversationNotYetDeliveredAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        ekzz f = eleg.f("MarkConversationNotYetDeliveredAction.executeAction");
        try {
            final bdhg b = bdhg.b(this.t.f(), "rcs_message_id");
            final ckdr j = this.f.j(b);
            if (j == ckdr.NONE) {
                a.q("client side fallback is disabled.");
            } else {
                int intValue = ((Integer) this.g.a("MarkConversationNotYetDeliveredAction#executeAction", new dtus() { // from class: baii
                    @Override // defpackage.dtus
                    public final Object a(cbwn cbwnVar) {
                        MarkConversationNotYetDeliveredAction markConversationNotYetDeliveredAction = MarkConversationNotYetDeliveredAction.this;
                        bdmq bdmqVar = (bdmq) markConversationNotYetDeliveredAction.c.b();
                        bdhg bdhgVar = b;
                        MessageCoreData w = bdmqVar.w(bdhgVar);
                        int i = 0;
                        if (w == null) {
                            csjb e = MarkConversationNotYetDeliveredAction.a.e();
                            e.I("rcs");
                            e.h(bdhgVar);
                            e.I("missing cant mark NotDelivered.");
                            e.r();
                            cbwnVar.a(0);
                            throw new IllegalStateException();
                        }
                        ffbr ffbrVar = markConversationNotYetDeliveredAction.b;
                        final ConversationIdType z = w.z();
                        if (((bczy) ffbrVar.b()).ae(z)) {
                            csjb a2 = MarkConversationNotYetDeliveredAction.a.a();
                            a2.I("Skipping client side fallback for RBM.");
                            a2.c(z);
                            a2.r();
                            cbwnVar.a(0);
                        }
                        ckdr ckdrVar = j;
                        markConversationNotYetDeliveredAction.d.g("Bugle.Rcs.Chat.Message.NotYetDelivered.Counts", ckdrVar.e);
                        if (markConversationNotYetDeliveredAction.t.y("rcs_offline")) {
                            markConversationNotYetDeliveredAction.d.g("Bugle.Rcs.Chat.Message.NotYetDelivered.Offline.Counts", ckdrVar.e);
                        }
                        final bdmq bdmqVar2 = (bdmq) markConversationNotYetDeliveredAction.c.b();
                        final long r = w.r();
                        ekzz f2 = eleg.f("MessageDatabaseOperations#getUndeliveredRcsMessages");
                        try {
                            buxo d = MessagesTable.d();
                            d.z("getUndeliveredRcsMessages");
                            d.h(new Function() { // from class: bdkz
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    buxz buxzVar = (buxz) obj;
                                    cskc cskcVar = bdmq.a;
                                    buxzVar.m(ConversationIdType.this);
                                    buxzVar.K(3);
                                    buxzVar.af(1);
                                    buxzVar.aa(r);
                                    return buxzVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            d.d(new buxl(MessagesTable.c.i, true));
                            Stream D = d.b().D();
                            try {
                                List<MessageCoreData> list = (List) D.map(new Function() { // from class: bdla
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        bdmq bdmqVar3 = bdmq.this;
                                        MessageCoreData a3 = ((byzp) bdmqVar3.e.b()).a();
                                        a3.aM((MessagesTable.BindData) obj);
                                        ((bdpt) bdmqVar3.f.b()).c(a3, false);
                                        return a3;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).collect(Collectors.toCollection(new bdjw()));
                                if (D != null) {
                                    D.close();
                                }
                                f2.close();
                                for (MessageCoreData messageCoreData : list) {
                                    markConversationNotYetDeliveredAction.e.a(messageCoreData, -1);
                                    if (messageCoreData.cB()) {
                                        ((bdmq) markConversationNotYetDeliveredAction.c.b()).Y(messageCoreData.z(), messageCoreData.B());
                                    } else if (ckdrVar.ordinal() == 1) {
                                        ((bdmq) markConversationNotYetDeliveredAction.c.b()).Y(messageCoreData.z(), messageCoreData.B());
                                    }
                                    i++;
                                }
                                return Integer.valueOf(i);
                            } finally {
                            }
                        } catch (Throwable th) {
                            try {
                                f2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                })).intValue();
                csjb a2 = a.a();
                a2.I("MarkConversationNotYetDeliveredAction client side fallback enabled for");
                a2.G(intValue);
                a2.I("messages.");
                a2.h(b);
                a2.A("fallbackMode", j);
                a2.r();
                if (intValue > 0) {
                    bajq.d(7, this);
                }
            }
            f.close();
            return null;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.MarkConversationNotYetDelivered.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public MarkConversationNotYetDeliveredAction(ffbr ffbrVar, ffbr ffbrVar2, ckds ckdsVar, akzt akztVar, dtuu dtuuVar, bdmr bdmrVar, bdhg bdhgVar, boolean z) {
        super(eogt.MARK_CONVERSATION_NOT_YET_DELIVERED_ACTION);
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.f = ckdsVar;
        this.d = akztVar;
        this.g = dtuuVar;
        this.e = bdmrVar;
        csix.l(bdhgVar);
        bdhg.h(this.t.f(), "rcs_message_id", bdhgVar);
        this.t.p("rcs_offline", z);
    }
}
