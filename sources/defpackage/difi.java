package defpackage;

import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class difi extends diff {
    public difi(dfse dfseVar) {
        super(dfseVar);
    }

    @Override // com.google.android.gms.wearable.internal.AbstractWearableCallbacks, com.google.android.gms.wearable.internal.IWearableCallbacks
    public final void onDataHolderReady(DataHolder dataHolder) {
        a(new dhzo(dataHolder));
    }
}
