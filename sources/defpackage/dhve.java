package defpackage;

import com.google.android.gms.usagereporting.internal.UsageReportingClientImpl;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhve extends dhvk {
    final /* synthetic */ UsageReportingClientImpl.UsageReportingOptInOptionsChangedListener a;
    final /* synthetic */ dhvg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhve(dhvg dhvgVar, dhri dhriVar, UsageReportingClientImpl.UsageReportingOptInOptionsChangedListener usageReportingOptInOptionsChangedListener) {
        super(dhriVar);
        this.a = usageReportingOptInOptionsChangedListener;
        this.b = dhvgVar;
    }

    @Override // defpackage.dfse
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        ((dhvl) this.b.g).a = this.a;
        this.c.b(null);
    }
}
