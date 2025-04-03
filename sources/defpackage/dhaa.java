package defpackage;

import android.location.Location;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.internal.ILocationStatusCallback;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhaa extends ILocationStatusCallback.Stub {
    final /* synthetic */ dhri a;

    public dhaa(dhri dhriVar) {
        this.a = dhriVar;
    }

    @Override // com.google.android.gms.location.internal.ILocationStatusCallback
    public final void onResult(Status status, Location location) {
        dfup.b(status, location, this.a);
    }
}
