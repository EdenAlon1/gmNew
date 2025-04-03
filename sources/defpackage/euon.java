package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euon extends IStatusCallback.Stub {
    final /* synthetic */ dhri a;
    final /* synthetic */ euoo b;

    public euon(euoo euooVar, dhri dhriVar) {
        this.a = dhriVar;
        this.b = euooVar;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        if (this.a.d(null)) {
            if (status.d()) {
                this.b.a.b.b(null);
                return;
            }
            euoo euooVar = this.b;
            euooVar.a.b.a(eupi.a(status, "Indexing error, please try again."));
        }
    }
}
