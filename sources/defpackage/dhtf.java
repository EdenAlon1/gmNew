package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.time.trustedtime.dto.GlobalState;
import com.google.android.gms.time.trustedtime.internal.IOnRetrieveGlobalStateCallback;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhtf extends IOnRetrieveGlobalStateCallback.Stub {
    final /* synthetic */ dhri a;

    public dhtf(dhri dhriVar) {
        this.a = dhriVar;
    }

    @Override // com.google.android.gms.time.trustedtime.internal.IOnRetrieveGlobalStateCallback
    public final void onRetrieveGlobalState(Status status, GlobalState globalState) {
        dfup.b(status, globalState, this.a);
    }
}
