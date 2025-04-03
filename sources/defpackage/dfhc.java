package defpackage;

import com.google.android.gms.auth.folsom.internal.IKeyRetrievalSyncStatusCallback;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfhc extends IKeyRetrievalSyncStatusCallback.Stub {
    final /* synthetic */ dhri a;

    public dfhc(dhri dhriVar) {
        this.a = dhriVar;
    }

    @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalSyncStatusCallback
    public final void onSyncStatusResult(Status status, int i) {
        dfup.c(status, Integer.valueOf(i), this.a);
    }
}
