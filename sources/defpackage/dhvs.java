package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.usagereporting.internal.UsageReportingClientImpl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhvs extends UsageReportingClientImpl.AbstractCallbacks {
    private final dhri a;

    public dhvs(dhri dhriVar) {
        this.a = dhriVar;
    }

    @Override // com.google.android.gms.usagereporting.internal.UsageReportingClientImpl.AbstractCallbacks, com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
    public final void onGetCheckboxSettingsPendingIntent(PendingIntent pendingIntent) {
        this.a.b(pendingIntent);
    }
}
