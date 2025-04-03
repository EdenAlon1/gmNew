package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgrz extends IStatusCallback.Stub {
    final /* synthetic */ dhri a;

    public dgrz(dhri dhriVar) {
        this.a = dhriVar;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        dfup.b(status, true, this.a);
    }
}
