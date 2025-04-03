package defpackage;

import com.google.android.gms.auth.folsom.internal.IKeyRetrievalCallback;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfhg extends IKeyRetrievalCallback.Stub {
    final /* synthetic */ dhri a;

    public dfhg(dhri dhriVar) {
        this.a = dhriVar;
    }

    @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalCallback
    public final void onResult(Status status) {
        dfup.c(status, null, this.a);
    }
}
