package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.location.LastLocationRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgyp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        ClientIdentity clientIdentity = null;
        int i = 0;
        boolean z = false;
        long j = Long.MAX_VALUE;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                j = dfxj.i(parcel, readInt);
            } else if (d == 2) {
                i = dfxj.f(parcel, readInt);
            } else if (d == 3) {
                z = dfxj.D(parcel, readInt);
            } else if (d != 5) {
                dfxj.C(parcel, readInt);
            } else {
                clientIdentity = (ClientIdentity) dfxj.n(parcel, readInt, ClientIdentity.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new LastLocationRequest(j, i, z, clientIdentity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LastLocationRequest[i];
    }
}
