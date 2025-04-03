package defpackage;

import com.google.android.gms.location.ILocationListener;
import com.google.android.gms.location.internal.FusedLocationProviderResult;
import com.google.android.gms.location.internal.IFusedLocationProviderCallback;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhac extends IFusedLocationProviderCallback.Stub {
    final /* synthetic */ dhri a;
    final /* synthetic */ ILocationListener b;

    public dhac(dhri dhriVar, ILocationListener iLocationListener) {
        this.a = dhriVar;
        this.b = iLocationListener;
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
