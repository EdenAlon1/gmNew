package defpackage;

import com.google.android.gms.wearable.internal.DeleteDataItemsResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class difg extends diff {
    public difg(dfse dfseVar) {
        super(dfseVar);
    }

    @Override // com.google.android.gms.wearable.internal.AbstractWearableCallbacks, com.google.android.gms.wearable.internal.IWearableCallbacks
    public final void onDeleteDataItem(DeleteDataItemsResponse deleteDataItemsResponse) {
        a(new dicl(difd.a(deleteDataItemsResponse.a), deleteDataItemsResponse.b));
    }
}
