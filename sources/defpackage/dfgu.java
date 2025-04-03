package defpackage;

import com.google.android.gms.auth.folsom.internal.IKeyRetrievalConsentCallback;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfgu extends IKeyRetrievalConsentCallback.Stub {
    final /* synthetic */ dhri a;

    public dfgu(dhri dhriVar) {
        this.a = dhriVar;
    }

    @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalConsentCallback
    public final void onConsentResult(Status status, boolean z) {
        dfup.c(status, Boolean.valueOf(z), this.a);
    }
}
