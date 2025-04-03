package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgnc extends dgnd {
    final /* synthetic */ dhri a;

    public dgnc(dhri dhriVar) {
        this.a = dhriVar;
    }

    @Override // defpackage.dgnd, com.google.android.gms.gmscompliance.IGmsDeviceComplianceServiceCallback
    public final void onGetGmsDeviceCompliance(Status status, GmsDeviceComplianceResponse gmsDeviceComplianceResponse) {
        dfup.c(status, gmsDeviceComplianceResponse, this.a);
    }
}
