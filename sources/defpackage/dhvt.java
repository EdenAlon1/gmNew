package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.internal.IUsageReportingService;
import com.google.android.gms.usagereporting.internal.UsageReportingClientImpl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhvt extends UsageReportingClientImpl.AbstractCallbacks {
    private final IUsageReportingService a;
    private final dfse b;
    private final UsageReportingClientImpl.UsageReportingOptInOptionsChangedListener c;

    public dhvt(IUsageReportingService iUsageReportingService, dfse dfseVar, UsageReportingClientImpl.UsageReportingOptInOptionsChangedListener usageReportingOptInOptionsChangedListener) {
        this.a = iUsageReportingService;
        this.b = dfseVar;
        this.c = usageReportingOptInOptionsChangedListener;
    }

    @Override // com.google.android.gms.usagereporting.internal.UsageReportingClientImpl.AbstractCallbacks, com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
    public final void onRegisterOptInOptionsChangedListener(Status status) {
        if (status.d()) {
            this.b.c(Status.a);
        } else {
            this.b.c(status);
        }
    }

    @Override // com.google.android.gms.usagereporting.internal.UsageReportingClientImpl.AbstractCallbacks, com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
    public final void onUnregisterOptInOptionsChangedListener(Status status) {
        if (!status.d()) {
            this.b.c(status);
            return;
        }
        UsageReportingClientImpl.UsageReportingOptInOptionsChangedListener usageReportingOptInOptionsChangedListener = this.c;
        if (usageReportingOptInOptionsChangedListener == null) {
            this.b.c(Status.a);
        } else {
            this.a.registerOptInOptionsChangedListener(usageReportingOptInOptionsChangedListener, this);
        }
    }
}
