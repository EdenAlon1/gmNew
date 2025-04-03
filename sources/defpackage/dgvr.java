package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.learning.internal.training.IInAppTrainerCanceller;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgvr extends IStatusCallback.Stub {
    final /* synthetic */ dhri a;
    final /* synthetic */ IInAppTrainerCanceller b;

    public dgvr(dhri dhriVar, IInAppTrainerCanceller iInAppTrainerCanceller) {
        this.a = dhriVar;
        this.b = iInAppTrainerCanceller;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        if (status.f == 0) {
            this.a.b(new dgvt(this.b));
        } else {
            this.a.a(new dfqu(status));
        }
    }
}
