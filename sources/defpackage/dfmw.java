package defpackage;

import com.google.android.gms.clearcut.internal.DefaultClearcutLoggerCallbacks;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfmw extends DefaultClearcutLoggerCallbacks {
    final /* synthetic */ dhri a;

    public dfmw(dhri dhriVar) {
        this.a = dhriVar;
    }

    @Override // com.google.android.gms.clearcut.internal.DefaultClearcutLoggerCallbacks, com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks
    public final void onLogError(Status status) {
        this.a.b(status);
    }
}
