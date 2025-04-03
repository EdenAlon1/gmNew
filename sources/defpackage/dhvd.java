package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import com.google.android.gms.usagereporting.internal.UsageReportingClientImpl;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhvd extends UsageReportingClientImpl.AbstractCallbacks {
    final /* synthetic */ dhri a;

    public dhvd(dhri dhriVar) {
        this.a = dhriVar;
    }

    @Override // com.google.android.gms.usagereporting.internal.UsageReportingClientImpl.AbstractCallbacks, com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
    public final void onGetOptInOptions(Status status, UsageReportingOptInOptions usageReportingOptInOptions) {
        dfup.b(status, new dhvh(new dhvq(Status.a, usageReportingOptInOptions)), this.a);
    }
}
