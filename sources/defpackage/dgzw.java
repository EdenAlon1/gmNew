package defpackage;

import com.google.android.gms.location.ILocationCallback;
import com.google.android.gms.location.internal.FusedLocationProviderResult;
import com.google.android.gms.location.internal.IFusedLocationProviderCallback;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgzw extends IFusedLocationProviderCallback.Stub {
    final /* synthetic */ dhri a;
    final /* synthetic */ ILocationCallback b;

    public dgzw(dhri dhriVar, ILocationCallback iLocationCallback) {
        this.a = dhriVar;
        this.b = iLocationCallback;
    }

    @Override // com.google.android.gms.location.internal.IFusedLocationProviderCallback
    public final void onFusedLocationProviderResult(FusedLocationProviderResult fusedLocationProviderResult) {
        dfup.a(fusedLocationProviderResult.a, this.a);
    }

    @Override // com.google.android.gms.location.internal.IFusedLocationProviderCallback
    public final void onRequestRemoved() {
        this.b.onRemoved();
    }
}
