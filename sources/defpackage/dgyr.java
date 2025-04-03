package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.location.LocationAvailabilityRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgyr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        ClientIdentity clientIdentity = null;
        boolean z = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                z = dfxj.D(parcel, readInt);
            } else if (d != 2) {
                dfxj.C(parcel, readInt);
            } else {
                clientIdentity = (ClientIdentity) dfxj.n(parcel, readInt, ClientIdentity.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new LocationAvailabilityRequest(z, clientIdentity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationAvailabilityRequest[i];
    }
}
