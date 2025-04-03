package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.duokit.LookupSingleRemoteReachabilityResponse;
import com.google.android.gms.duokit.RemoteUserReachability;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgfq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        RemoteUserReachability remoteUserReachability = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (dfxj.d(readInt) != 1) {
                dfxj.C(parcel, readInt);
            } else {
                remoteUserReachability = (RemoteUserReachability) dfxj.n(parcel, readInt, RemoteUserReachability.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new LookupSingleRemoteReachabilityResponse(remoteUserReachability);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LookupSingleRemoteReachabilityResponse[i];
    }
}
