package defpackage;

import android.net.Uri;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.IWearableService;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dich extends dibk {
    final /* synthetic */ Uri a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dich(dfre dfreVar, Uri uri) {
        super(dfreVar);
        this.a = uri;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ dfrl a(Status status) {
        return new dhzo(new DataHolder(DataHolder.a, status.f));
    }

    @Override // defpackage.dfsd
    protected final /* bridge */ /* synthetic */ void b(dfqk dfqkVar) {
        ((IWearableService) ((difp) dfqkVar).w()).getDataItemsByUriFilter(new difi(this), this.a, 0);
    }
}
