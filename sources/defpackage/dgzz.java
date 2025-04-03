package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgzz extends IStatusCallback.Stub {
    final /* synthetic */ Object a;
    final /* synthetic */ dhri b;

    public dgzz(Object obj, dhri dhriVar) {
        this.a = obj;
        this.b = dhriVar;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        dfup.b(status, this.a, this.b);
    }
}
