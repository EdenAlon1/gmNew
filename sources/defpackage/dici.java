package defpackage;

import android.net.Uri;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.IWearableService;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dici extends dibk {
    final /* synthetic */ Uri a;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dici(dfre dfreVar, Uri uri, int i) {
        super(dfreVar);
        this.a = uri;
        this.h = i;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ dfrl a(Status status) {
        return new dicl(status, 0);
    }

    @Override // defpackage.dfsd
    protected final /* bridge */ /* synthetic */ void b(dfqk dfqkVar) {
        ((IWearableService) ((difp) dfqkVar).w()).deleteDataItemsByUriFilter(new difg(this), this.a, this.h);
    }
}
