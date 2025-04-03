package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.constellation.GetIidTokenResponse;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfzp extends dfzr {
    final /* synthetic */ dhri a;

    public dfzp(dhri dhriVar) {
        this.a = dhriVar;
    }

    @Override // defpackage.dfzr, com.google.android.gms.constellation.internal.IConstellationCallbacks
    public final void onIidTokenGenerated(Status status, GetIidTokenResponse getIidTokenResponse) {
        try {
            dfup.b(status, getIidTokenResponse, this.a);
        } catch (RejectedExecutionException e) {
            dfzs.a.f("Rejected API result: ", e, new Object[0]);
        }
    }
}
