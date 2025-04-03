package defpackage;

import com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch;
import com.google.android.gms.appdatasearch.internal.UsageReportingApiImpl;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euos extends euou {
    final /* synthetic */ euof[] a;

    public euos(euof[] euofVarArr) {
        this.a = euofVarArr;
    }

    @Override // defpackage.euou
    protected final void b(ILightweightAppDataSearch iLightweightAppDataSearch) {
        iLightweightAppDataSearch.reportUserActions(new UsageReportingApiImpl.OnStatusCallback(this), this.a);
    }
}
