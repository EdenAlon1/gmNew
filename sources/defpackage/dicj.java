package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.internal.IWearableService;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dicj extends dibk {
    final /* synthetic */ Asset a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dicj(dfre dfreVar, Asset asset) {
        super(dfreVar);
        this.a = asset;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ dfrl a(Status status) {
        return new dicm(status, null);
    }

    @Override // defpackage.dfsd
    protected final /* bridge */ /* synthetic */ void b(dfqk dfqkVar) {
        ((IWearableService) ((difp) dfqkVar).w()).getFdForAsset(new difj(this), this.a);
    }
}
