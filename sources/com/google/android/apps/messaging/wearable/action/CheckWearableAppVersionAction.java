package com.google.android.apps.messaging.wearable.action;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.wearable.action.CheckWearableAppVersionAction;
import defpackage.ctba;
import defpackage.deey;
import defpackage.dhqy;
import defpackage.dhzj;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.entd;
import defpackage.eogt;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CheckWearableAppVersionAction extends Action<Void> {
    public Context c;
    private dhzj d;
    public static final entd a = entd.c("BugleWearable");
    static final Uri b = new Uri.Builder().scheme("wear").path("/bugle/watch_version/").build();
    public static final Parcelable.Creator<CheckWearableAppVersionAction> CREATOR = new deey();

    /* compiled from: PG */
    public interface a {
        Context R();

        /* renamed from: do */
        dhzj mo162do();
    }

    public CheckWearableAppVersionAction() {
        super(eogt.CHECK_WEARABLE_APP_VERSION_ACTION);
        k();
    }

    public static void h() {
        new CheckWearableAppVersionAction().A();
    }

    private final void k() {
        a aVar = (a) ctba.a(a.class);
        this.c = aVar.R();
        this.d = aVar.mo162do();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("CheckWearableAppVersionAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        w();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.CheckWearableAppVersion.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fR() {
        this.d.c(b).a(new dhqy() { // from class: deex
            @Override // defpackage.dhqy
            public final void e(Object obj) {
                int p;
                CheckWearableAppVersionAction checkWearableAppVersionAction = CheckWearableAppVersionAction.this;
                dhzo dhzoVar = (dhzo) obj;
                if (dhzoVar != null) {
                    try {
                        if (dhzoVar.b.d()) {
                            ensk n = CheckWearableAppVersionAction.a.n();
                            n.Y(csux.O, "CheckWearableAppVersionAction");
                            ((ensz) n.h("com/google/android/apps/messaging/wearable/action/CheckWearableAppVersionAction", "doBackgroundWork", 92, "CheckWearableAppVersionAction.java")).q("Successfully retrieved watch's RPC version from DataClient");
                            dfuw dfuwVar = new dfuw(dhzoVar);
                            int i = 0;
                            while (dfuwVar.hasNext()) {
                                dhzm dhzmVar = (dhzm) dfuwVar.next();
                                if (dhzmVar != null && (p = dhzr.a(dhzmVar).a.p("1")) > i) {
                                    i = p;
                                }
                            }
                            ensk n2 = CheckWearableAppVersionAction.a.n();
                            n2.Y(csux.O, "CheckWearableAppVersionAction");
                            ((ensz) n2.h("com/google/android/apps/messaging/wearable/action/CheckWearableAppVersionAction", "saveWearableApiLevel", 117, "CheckWearableAppVersionAction.java")).r("Wearable RPC version is %d", i);
                            SharedPreferences.Editor edit = checkWearableAppVersionAction.c.getSharedPreferences("watch_protocol_version_file", 0).edit();
                            if (i > 0) {
                                edit.putInt("watch_protocol_version_key", i);
                            }
                            edit.apply();
                        }
                    } finally {
                        dhzoVar.b();
                    }
                }
                if (dhzoVar != null) {
                }
            }
        });
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public CheckWearableAppVersionAction(Parcel parcel) {
        super(parcel, eogt.CHECK_WEARABLE_APP_VERSION_ACTION);
        k();
    }
}
