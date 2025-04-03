package defpackage;

import com.google.android.gms.auth.api.internal.AbstractAuthCallbacks;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfds extends AbstractAuthCallbacks {
    final /* synthetic */ dhri a;

    public dfds(dhri dhriVar) {
        this.a = dhriVar;
    }

    @Override // com.google.android.gms.auth.api.internal.AbstractAuthCallbacks, com.google.android.gms.auth.api.internal.IAuthCallbacks
    public final void handleSpatulaHeader(String str) {
        dfup.b(str != null ? Status.a : new Status(3006), str, this.a);
    }
}
