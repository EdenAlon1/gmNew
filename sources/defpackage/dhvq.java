package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhvq implements dfrl {
    public final UsageReportingOptInOptions a;
    private final Status b;

    public dhvq(Status status, UsageReportingOptInOptions usageReportingOptInOptions) {
        this.b = status;
        this.a = usageReportingOptInOptions;
    }

    @Override // defpackage.dfrl
    public final Status a() {
        return this.b;
    }

    public final String toString() {
        dfwv.n(this.a);
        return String.format("OptInOptionsResultImpl[%s]", Boolean.valueOf(this.a.a == 1));
    }
}
