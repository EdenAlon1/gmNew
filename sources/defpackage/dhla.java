package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhla extends IStatusCallback.Stub {
    final /* synthetic */ dhri a;

    public dhla(dhri dhriVar) {
        this.a = dhriVar;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        dfup.a(status, this.a);
    }
}
