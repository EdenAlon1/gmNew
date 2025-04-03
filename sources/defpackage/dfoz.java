package defpackage;

import com.google.android.gms.cobalt.internal.ICobaltLoggerCallbacks;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfoz extends ICobaltLoggerCallbacks.Stub {
    final /* synthetic */ dhri a;

    public dfoz(dhri dhriVar) {
        this.a = dhriVar;
    }

    @Override // com.google.android.gms.cobalt.internal.ICobaltLoggerCallbacks
    public final void onLogInteger(Status status) {
        dfup.a(status, this.a);
    }

    @Override // com.google.android.gms.cobalt.internal.ICobaltLoggerCallbacks
    public final void onLogOccurrence(Status status) {
        dfup.a(status, this.a);
    }
}
