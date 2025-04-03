package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdisync.internal.IMdiSyncCallbacks;
import com.google.android.gms.mdisync.internal.SyncResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dheo extends IMdiSyncCallbacks.Stub {
    final /* synthetic */ dhri a;

    public dheo(dhri dhriVar) {
        this.a = dhriVar;
    }

    @Override // com.google.android.gms.mdisync.internal.IMdiSyncCallbacks
    public final void onSyncComplete(Status status, SyncResult syncResult) {
        dfup.c(status, status.d() ? syncResult.a : null, this.a);
    }
}
