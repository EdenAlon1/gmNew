package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import defpackage.ames;
import defpackage.ayfg;
import defpackage.bajq;
import defpackage.banu;
import defpackage.batp;
import defpackage.bbff;
import defpackage.bbfw;
import defpackage.bbga;
import defpackage.bbgc;
import defpackage.bczy;
import defpackage.bdhb;
import defpackage.bdmq;
import defpackage.bseh;
import defpackage.buxr;
import defpackage.cisl;
import defpackage.cjbc;
import defpackage.cqoh;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.ensz;
import defpackage.entd;
import defpackage.eogt;
import defpackage.ffbr;
import j$.util.function.Function$CC;
import java.util.function.Function;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class RedownloadMessageAction extends Action<Void> implements Parcelable {
    private final Context c;
    private final ffbr d;
    private final cqoh e;
    private final ayfg f;
    private final bbgc g;
    private final banu h;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;
    private final ffbr l;
    private static final cskc a = cskc.g("BugleDataModel", "RedownloadMessageAction");
    private static final entd b = entd.c("BugleNotifications");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new batp();

    /* compiled from: PG */
    public interface a {
        bbff aZ();
    }

    public RedownloadMessageAction(Context context, ffbr ffbrVar, cqoh cqohVar, ayfg ayfgVar, bbgc bbgcVar, banu banuVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, Parcel parcel) {
        super(parcel, eogt.REDOWNLOAD_MESSAGE_ACTION);
        this.c = context;
        this.d = ffbrVar;
        this.e = cqohVar;
        this.f = ayfgVar;
        this.g = bbgcVar;
        this.h = banuVar;
        this.i = ffbrVar2;
        this.j = ffbrVar3;
        this.k = ffbrVar4;
        this.l = ffbrVar5;
    }

    private final void h(MessageCoreData messageCoreData, int i) {
        long epochMilli = this.e.f().toEpochMilli();
        bdmq bdmqVar = (bdmq) this.d.b();
        ConversationIdType z = messageCoreData.z();
        MessageIdType B = messageCoreData.B();
        String[] strArr = MessagesTable.a;
        buxr buxrVar = new buxr();
        buxrVar.ap("RedownloadMessageAction#updateMessageStatus");
        buxrVar.U(i);
        buxrVar.I(epochMilli);
        bdmqVar.Q(z, B, buxrVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("RedownloadMessageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        MessageCoreData v = ((bdmq) this.d.b()).v(bdhb.b(this.t.l("message_id")));
        if (this.t.y("open_conv") && v != null && !v.z().b()) {
            boolean booleanValue = ((Boolean) v.ae().map(new Function() { // from class: bato
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Boolean.valueOf(((aoku) obj).B());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(false)).booleanValue();
            ayfg ayfgVar = this.f;
            Context context = this.c;
            ConversationIdType z = v.z();
            bseh r = ((bczy) this.l.b()).r(z);
            this.c.startActivity(ayfgVar.l(context, ((ames) this.k.b()).a(z, r == null ? null : r.aa(), booleanValue), null, false, booleanValue));
        }
        if (v == null || ((!v.cj() || v.d() == 1) && !v.cw())) {
            if (v == null) {
                a.n("The message to be downloaded is null.");
            } else {
                csjb b2 = a.b();
                b2.I("Attempt to re-download an un-redownloadable message:");
                b2.A("status", v.aC());
                b2.A("protocol", v.aw());
                b2.r();
                v = null;
            }
        } else if (v.cX()) {
            h(v, 103);
            Action a2 = bbga.a(this.g, v);
            if (a2 != null) {
                a2.C(this);
            }
        } else {
            h(v, 102);
            banu.b(this.h.j.a(v, null), true);
            bajq.d(6, this);
        }
        if (!this.t.y("should_cancel_notification") || v == null) {
            ((ensz) ((ensz) b.h()).h("com/google/android/apps/messaging/shared/datamodel/action/RedownloadMessageAction", "executeAction", 259, "RedownloadMessageAction.java")).q("Creating notification from RedownloadMessageAction");
            ((cjbc) this.i.b()).e();
        } else {
            ((ensz) ((ensz) b.h()).h("com/google/android/apps/messaging/shared/datamodel/action/RedownloadMessageAction", "executeAction", PrivateKeyType.INVALID, "RedownloadMessageAction.java")).q("Canceling incoming message notification from redwonload message action");
            ((cjbc) this.i.b()).a(v.z());
        }
        ((cisl) this.j.b()).b();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.RedownloadMms.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public RedownloadMessageAction(Context context, ffbr<bdmq> ffbrVar, cqoh cqohVar, ayfg ayfgVar, bbgc bbgcVar, bbfw bbfwVar, banu banuVar, ffbr<cjbc> ffbrVar2, ffbr<cisl> ffbrVar3, ffbr<ames> ffbrVar4, ffbr<bczy> ffbrVar5, MessageIdType messageIdType, boolean z) {
        super(eogt.REDOWNLOAD_MESSAGE_ACTION);
        this.c = context;
        this.d = ffbrVar;
        this.e = cqohVar;
        this.f = ayfgVar;
        this.g = bbgcVar;
        this.h = banuVar;
        this.i = ffbrVar2;
        this.j = ffbrVar3;
        this.k = ffbrVar4;
        this.l = ffbrVar5;
        this.t.v("message_id", messageIdType.b());
        this.t.p("open_conv", z);
        this.t.p("should_cancel_notification", false);
    }

    public RedownloadMessageAction(Context context, ffbr<bdmq> ffbrVar, cqoh cqohVar, ayfg ayfgVar, bbgc bbgcVar, bbfw bbfwVar, banu banuVar, ffbr<cjbc> ffbrVar2, ffbr<cisl> ffbrVar3, ffbr<ames> ffbrVar4, ffbr<bczy> ffbrVar5, MessageIdType messageIdType, boolean z, boolean z2) {
        super(eogt.REDOWNLOAD_MESSAGE_ACTION);
        this.c = context;
        this.d = ffbrVar;
        this.e = cqohVar;
        this.f = ayfgVar;
        this.g = bbgcVar;
        this.h = banuVar;
        this.i = ffbrVar2;
        this.j = ffbrVar3;
        this.k = ffbrVar4;
        this.l = ffbrVar5;
        this.t.v("message_id", messageIdType.b());
        this.t.p("open_conv", z);
        this.t.p("should_cancel_notification", z2);
    }
}
