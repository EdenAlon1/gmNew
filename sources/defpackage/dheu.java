package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdisync.internal.SyncRequest;
import com.google.android.gms.mdisync.internal.TeleportingSyncRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dheu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        SyncRequest syncRequest = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (dfxj.d(readInt) != 1) {
                dfxj.C(parcel, readInt);
            } else {
                syncRequest = (SyncRequest) dfxj.n(parcel, readInt, SyncRequest.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new TeleportingSyncRequest(syncRequest);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new TeleportingSyncRequest[i];
    }
}
