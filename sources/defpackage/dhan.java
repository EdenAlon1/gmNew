package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhan implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        long j = Long.MAX_VALUE;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        LocationRequest locationRequest = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                locationRequest = (LocationRequest) dfxj.n(parcel, readInt, LocationRequest.CREATOR);
            } else if (d == 5) {
                arrayList = dfxj.z(parcel, readInt, ClientIdentity.CREATOR);
            } else if (d == 8) {
                z = dfxj.D(parcel, readInt);
            } else if (d != 9) {
                switch (d) {
                    case 11:
                        z3 = dfxj.D(parcel, readInt);
                        break;
                    case 12:
                        z4 = dfxj.D(parcel, readInt);
                        break;
                    case 13:
                        dfxj.t(parcel, readInt);
                        break;
                    case 14:
                        j = dfxj.i(parcel, readInt);
                        break;
                    default:
                        dfxj.C(parcel, readInt);
                        break;
                }
            } else {
                z2 = dfxj.D(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new LocationRequestInternal(locationRequest, arrayList, z, z2, z3, z4, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequestInternal[i];
    }
}
