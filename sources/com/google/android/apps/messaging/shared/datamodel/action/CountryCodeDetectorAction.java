package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import defpackage.bacy;
import defpackage.bacz;
import defpackage.ctvi;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.eogt;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class CountryCodeDetectorAction extends ThrottledAction {
    private final ctvi b;
    private static final long a = TimeUnit.MINUTES.toMillis(2);
    public static final Parcelable.Creator<ThrottledAction> CREATOR = new bacy();

    /* compiled from: PG */
    public interface CountryCodeDetectorActionInjector {
        bacz hG();
    }

    public CountryCodeDetectorAction(ctvi ctviVar) {
        super(eogt.COUNTRY_CODE_DETECTOR_ACTION);
        this.b = ctviVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("CountryCodeDetectorAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.CountryCodeDetector.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final int f() {
        return 102;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final long g() {
        return a;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final String h() {
        return "CountryCodeDetectorAction";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final void i() {
        this.b.e();
    }

    public CountryCodeDetectorAction(ctvi ctviVar, Parcel parcel) {
        super(parcel, eogt.COUNTRY_CODE_DETECTOR_ACTION);
        this.b = ctviVar;
    }
}
