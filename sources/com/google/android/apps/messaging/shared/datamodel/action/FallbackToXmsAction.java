package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.FallbackToXmsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.akzt;
import defpackage.altk;
import defpackage.baec;
import defpackage.baed;
import defpackage.bbew;
import defpackage.bdhg;
import defpackage.ckds;
import defpackage.cqoh;
import defpackage.csix;
import defpackage.cskc;
import defpackage.dtus;
import defpackage.dtuu;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.emxf;
import defpackage.enru;
import defpackage.eogt;
import defpackage.eqyl;
import defpackage.errl;
import defpackage.ffbr;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class FallbackToXmsAction extends Action<Void> {
    public final akzt c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final cqoh g;
    public final altk h;
    public final ckds i;
    public final dtuu j;
    public final errl k;
    public static final cskc a = cskc.g("BugleDataModel", "FallbackToXmsAction");
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/datamodel/action/FallbackToXmsAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new baec();

    /* compiled from: PG */
    public interface a {
        baed hJ();
    }

    public FallbackToXmsAction(akzt akztVar, ffbr ffbrVar, ffbr ffbrVar2, cqoh cqohVar, altk altkVar, ckds ckdsVar, dtuu dtuuVar, ffbr ffbrVar3, errl errlVar, Parcel parcel) {
        super(parcel, eogt.FALLBACK_TO_XMS_ACTION);
        this.c = akztVar;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.g = cqohVar;
        this.h = altkVar;
        this.i = ckdsVar;
        this.j = dtuuVar;
        this.f = ffbrVar3;
        this.k = errlVar;
    }

    public static int g(int i) {
        emxf.a(bbew.a(i));
        if (i != 0) {
            return i == 4 ? 0 : 1;
        }
        throw null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("FallbackToXmsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        ekzz f = eleg.f("FallbackToXmsAction.executeAction");
        try {
            final bdhg b2 = bdhg.b(this.t.f(), "rcs_message_id");
            final int i = new int[]{1, 2, 3, 4, 5}[this.t.a("rcs_fallback_reason")];
            emxf.a(bbew.a(i));
            final eqyl eqylVar = eqyl.values()[this.t.a("rcs_transport_type")];
            int intValue = ((Integer) this.j.a("FallbackToXmsAction#executeAction", new dtus() { // from class: bady
                @Override // defpackage.dtus
                public final Object a(cbwn cbwnVar) {
                    int i2;
                    final FallbackToXmsAction fallbackToXmsAction = FallbackToXmsAction.this;
                    bdmq bdmqVar = (bdmq) fallbackToXmsAction.e.b();
                    bdhg bdhgVar = b2;
                    final MessageCoreData w = bdmqVar.w(bdhgVar);
                    if (w == null) {
                        csjb b3 = FallbackToXmsAction.a.b();
                        b3.h(bdhgVar);
                        b3.I("missing and it can't fallback to xMS.");
                        b3.r();
                        return 0;
                    }
                    if (!w.cX()) {
                        return 0;
                    }
                    ConversationIdType z = w.z();
                    if (((bczy) fallbackToXmsAction.d.b()).ae(z)) {
                        csjb a2 = FallbackToXmsAction.a.a();
                        a2.I("Skipping rcs during sending fallback for RBM.");
                        a2.c(z);
                        a2.r();
                        cbwnVar.a(0);
                    }
                    int k = w.k();
                    if (k == 2 || k == 11) {
                        csjb e = FallbackToXmsAction.a.e();
                        e.I("Skipping fallback for message already delivered as rcs.");
                        e.c(z);
                        e.r();
                        cbwnVar.a(0);
                    }
                    final int i3 = i;
                    final eqyl eqylVar2 = eqylVar;
                    fallbackToXmsAction.h.A(bdhgVar, ((bdmq) fallbackToXmsAction.e.b()).w(bdhgVar), 25, eqylVar2);
                    ckds ckdsVar = fallbackToXmsAction.i;
                    cqoh cqohVar = fallbackToXmsAction.g;
                    int g = FallbackToXmsAction.g(i3);
                    ckdsVar.O(w, g, cqohVar.f().toEpochMilli());
                    if (i3 == 0) {
                        throw null;
                    }
                    int i4 = i3 - 1;
                    if (i4 != 1) {
                        i2 = 3;
                        if (i4 != 2) {
                            if (i4 == 3) {
                                i2 = 4;
                            } else {
                                if (i4 != 4) {
                                    throw new IllegalArgumentException("Invalid fallback reason");
                                }
                                i2 = 5;
                            }
                        }
                    } else {
                        i2 = 2;
                    }
                    fallbackToXmsAction.c.e("Bugle.Fallback.Message.Succeeded.As", g == 0 ? 1 : 2);
                    fallbackToXmsAction.c.e("Bugle.Fallback.Message.Succeeded.Reason", i2);
                    fallbackToXmsAction.j.g(new dtut() { // from class: badz
                        @Override // defpackage.dtut
                        public final ekzz a() {
                            return eleg.f("logNsfToClearcut");
                        }
                    }, null, new Runnable() { // from class: baea
                        @Override // java.lang.Runnable
                        public final void run() {
                            final FallbackToXmsAction fallbackToXmsAction2 = FallbackToXmsAction.this;
                            aqvh aqvhVar = (aqvh) fallbackToXmsAction2.f.b();
                            final MessageCoreData messageCoreData = w;
                            elfl d = aqvhVar.d(messageCoreData.v());
                            final int i5 = i3;
                            final eqyl eqylVar3 = eqylVar2;
                            axnw.h(d.h(new emwl() { // from class: baeb
                                @Override // defpackage.emwl
                                public final Object apply(Object obj) {
                                    Optional optional = (Optional) obj;
                                    boolean isEmpty = optional.isEmpty();
                                    MessageCoreData messageCoreData2 = messageCoreData;
                                    if (isEmpty) {
                                        ensk j = FallbackToXmsAction.b.j();
                                        j.Y(ente.a, "BugleDataModel");
                                        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/action/FallbackToXmsAction", "logNfsFallbackToClearCut", 183, "FallbackToXmsAction.java")).t("Missing self identity for message %s", messageCoreData2.E());
                                        return null;
                                    }
                                    eqyl eqylVar4 = eqylVar3;
                                    int i6 = i5;
                                    FallbackToXmsAction fallbackToXmsAction3 = FallbackToXmsAction.this;
                                    fallbackToXmsAction3.h.aI(messageCoreData2, FallbackToXmsAction.g(i6), eqylVar4, ((aqux) optional.get()).b(), 4);
                                    return null;
                                }
                            }, fallbackToXmsAction2.k));
                        }
                    });
                    return 1;
                }
            })).intValue();
            if (intValue > 0) {
                this.c.e("Bugle.Fallback.Conversation.Succeeded.Messages.Count", intValue);
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
        return "Bugle.DataModel.Action.FallbackToXmsAction.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public FallbackToXmsAction(akzt akztVar, ffbr ffbrVar, ffbr ffbrVar2, cqoh cqohVar, altk altkVar, ckds ckdsVar, dtuu dtuuVar, ffbr ffbrVar3, errl errlVar, bdhg bdhgVar, int i, eqyl eqylVar) {
        super(eogt.FALLBACK_TO_XMS_ACTION);
        this.c = akztVar;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.g = cqohVar;
        this.h = altkVar;
        this.i = ckdsVar;
        this.j = dtuuVar;
        this.f = ffbrVar3;
        this.k = errlVar;
        csix.l(bdhgVar);
        bdhg.h(this.t.f(), "rcs_message_id", bdhgVar);
        this.t.r("rcs_fallback_reason", i - 1);
        this.t.r("rcs_transport_type", eqylVar.h);
    }
}
