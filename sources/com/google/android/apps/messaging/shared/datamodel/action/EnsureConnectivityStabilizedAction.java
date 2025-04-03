package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import defpackage.akzt;
import defpackage.bads;
import defpackage.badt;
import defpackage.cfup;
import defpackage.cfvl;
import defpackage.csjb;
import defpackage.csjk;
import defpackage.cskc;
import defpackage.csmz;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.eogt;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class EnsureConnectivityStabilizedAction extends ThrottledAction {
    private final csjk c;
    private final akzt d;
    public static final cfup a = cfvl.f(cfvl.b, "ensure_connectivity_stabilized_backoff_duration_in_millis", TimeUnit.SECONDS.toMillis(5));
    private static final cskc b = cskc.g("Bugle", "EnsureConnectivityStabilizedAction");
    public static final Parcelable.Creator<ThrottledAction> CREATOR = new bads();

    /* compiled from: PG */
    public interface a {
        badt hH();
    }

    public EnsureConnectivityStabilizedAction(csjk<csmz> csjkVar, akzt akztVar) {
        super(eogt.ENSURE_CONNECTIVITY_STABILIZED_ACTION);
        this.c = csjkVar;
        this.d = akztVar;
        this.t.p("key_is_stable", false);
        this.t.r("key_retry_count", -1);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("EnsureConnectivityStabilizedAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.EnsureConnectivityStabilized.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final int f() {
        return 114;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final long g() {
        return ((Long) a.e()).longValue();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final String h() {
        return "EnsureConnectivityStabilizedAction";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final void i() {
        boolean y = this.t.y("key_is_stable");
        csjb a2 = b.a();
        a2.B("isStable", y);
        a2.r();
        int a3 = this.t.a("key_retry_count");
        if (y) {
            this.d.e("Bugle.Connectivity.Stabilized", a3);
            ((csmz) this.c.a()).k();
        } else {
            this.t.p("key_is_stable", true);
            this.t.r("key_retry_count", a3 + 1);
            G(g());
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final void j(ThrottledAction throttledAction) {
        this.t.p("key_is_stable", false);
    }

    public EnsureConnectivityStabilizedAction(csjk csjkVar, akzt akztVar, Parcel parcel) {
        super(parcel, eogt.ENSURE_CONNECTIVITY_STABILIZED_ACTION);
        this.c = csjkVar;
        this.d = akztVar;
    }
}
