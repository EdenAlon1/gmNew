package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.IWearableService;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dicg extends dibk {
    public dicg(dfre dfreVar) {
        super(dfreVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ dfrl a(Status status) {
        return new dhzo(new DataHolder(DataHolder.a, status.f));
    }

    @Override // defpackage.dfsd
    protected final /* synthetic */ void b(dfqk dfqkVar) {
        ((IWearableService) ((difp) dfqkVar).w()).getDataItems(new difi(this));
    }
}
