package defpackage;

import com.google.android.gms.wearable.internal.GetFdForAssetResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class difj extends diff {
    public difj(dfse dfseVar) {
        super(dfseVar);
    }

    @Override // com.google.android.gms.wearable.internal.AbstractWearableCallbacks, com.google.android.gms.wearable.internal.IWearableCallbacks
    public final void onGetFdForAsset(GetFdForAssetResponse getFdForAssetResponse) {
        a(new dicm(difd.a(getFdForAssetResponse.a), getFdForAssetResponse.b));
    }
}
