package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.learning.internal.training.IInAppTrainer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgvw extends IStatusCallback.Stub {
    final /* synthetic */ dhri a;
    final /* synthetic */ IInAppTrainer b;

    public dgvw(dhri dhriVar, IInAppTrainer iInAppTrainer) {
        this.a = dhriVar;
        this.b = iInAppTrainer;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        if (status.f == 0) {
            this.a.b(new dgvz(this.b));
        } else {
            this.a.a(new dfqu(status));
        }
    }
}
