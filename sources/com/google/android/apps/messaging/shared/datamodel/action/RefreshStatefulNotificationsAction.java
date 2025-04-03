package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.alrv;
import defpackage.batr;
import defpackage.bbfw;
import defpackage.bdgq;
import defpackage.cins;
import defpackage.cird;
import defpackage.csux;
import defpackage.csxu;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.ensz;
import defpackage.entd;
import defpackage.eogt;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class RefreshStatefulNotificationsAction extends ThrottledAction {
    private final cins b;
    private final alrv c;
    private final csxu d;
    private static final entd a = entd.c("BugleNotifications");
    public static final Parcelable.Creator<ThrottledAction> CREATOR = new batr();

    /* compiled from: PG */
    public interface a {
        bbfw bm();
    }

    public RefreshStatefulNotificationsAction(cins cinsVar, alrv alrvVar, csxu csxuVar, Parcel parcel) {
        super(parcel, eogt.REFRESH_STATEFUL_NOTIFICATIONS_ACTION);
        this.b = cinsVar;
        this.c = alrvVar;
        this.d = csxuVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("RefreshStatefulNotificationsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.RefreshNotificationsAction.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final int f() {
        return 108;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final boolean fV() {
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final long g() {
        return this.d.c("bugle_refresh_notification_backoff_duration_in_millis", 100L);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final String h() {
        return "RefreshStatefulNotificationsAction";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final void j(ThrottledAction throttledAction) {
        I(throttledAction, "silent");
        if (!TextUtils.equals(this.t.l("conv_id"), throttledAction.t.l("conv_id"))) {
            this.t.v("conv_id", null);
        }
        J(throttledAction, "refresh_incoming");
        J(throttledAction, "refresh_failure");
        J(throttledAction, "quick_reply");
        I(throttledAction, "smart_replies");
        J(throttledAction, "is_from_notification_action");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final elfl k() {
        ekzz f = eleg.f("RefreshStatefulNotificationsAction.doThrottledWork");
        try {
            boolean y = this.t.y("refresh_incoming");
            boolean y2 = this.t.y("refresh_failure");
            boolean y3 = this.t.y("silent");
            boolean y4 = this.t.y("quick_reply");
            boolean y5 = this.t.y("smart_replies");
            this.t.y("is_from_notification_action");
            ConversationIdType b = bdgq.b(this.t.l("conv_id"));
            ensz enszVar = (ensz) a.h();
            enszVar.Y(cird.f, Boolean.valueOf(y));
            enszVar.Y(cird.g, Boolean.valueOf(y2));
            enszVar.Y(cird.h, Boolean.valueOf(y3));
            enszVar.Y(cird.i, Boolean.valueOf(y4));
            enszVar.Y(cird.j, Boolean.valueOf(y5));
            enszVar.Y(csux.o, b.toString());
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/action/RefreshStatefulNotificationsAction", "doThrottledWorkAsync", 147, "RefreshStatefulNotificationsAction.java")).q("Refreshing message notifications");
            elfl N = y ? this.b.N() : y4 ? this.b.N() : elfo.e(null);
            if (y2) {
                this.b.C();
            }
            this.c.f(alrv.o);
            f.close();
            return N;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public RefreshStatefulNotificationsAction(cins cinsVar, alrv alrvVar, csxu csxuVar, boolean z, boolean z2, boolean z3, ConversationIdType conversationIdType) {
        super(eogt.REFRESH_STATEFUL_NOTIFICATIONS_ACTION);
        this.b = cinsVar;
        this.c = alrvVar;
        this.d = csxuVar;
        this.t.p("refresh_incoming", z);
        this.t.p("refresh_failure", z2);
        this.t.p("quick_reply", false);
        this.t.p("silent", z3);
        this.t.p("smart_replies", false);
        this.t.v("conv_id", conversationIdType.toString());
        this.t.p("is_from_notification_action", false);
        this.t.p("is_background", false);
    }
}
