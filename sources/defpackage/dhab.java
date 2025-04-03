package defpackage;

import com.google.android.gms.location.internal.FusedLocationProviderResult;
import com.google.android.gms.location.internal.IFusedLocationProviderCallback;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhab extends IFusedLocationProviderCallback.Stub {
    final /* synthetic */ Object a;
    final /* synthetic */ dhri b;

    public dhab(Object obj, dhri dhriVar) {
        this.a = obj;
        this.b = dhriVar;
    }

    @Override // com.google.android.gms.location.internal.IFusedLocationProviderCallback
    public final void onFusedLocationProviderResult(FusedLocationProviderResult fusedLocationProviderResult) {
        dfup.b(fusedLocationProviderResult.a, this.a, this.b);
    }

    @Override // com.google.android.gms.location.internal.IFusedLocationProviderCallback
    public final void onRequestRemoved() {
    }
}
