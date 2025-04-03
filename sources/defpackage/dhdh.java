package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.VisibleRegion;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhdh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 2) {
                latLng = (LatLng) dfxj.n(parcel, readInt, LatLng.CREATOR);
            } else if (d == 3) {
                latLng2 = (LatLng) dfxj.n(parcel, readInt, LatLng.CREATOR);
            } else if (d == 4) {
                latLng3 = (LatLng) dfxj.n(parcel, readInt, LatLng.CREATOR);
            } else if (d == 5) {
                latLng4 = (LatLng) dfxj.n(parcel, readInt, LatLng.CREATOR);
            } else if (d != 6) {
                dfxj.C(parcel, readInt);
            } else {
                latLngBounds = (LatLngBounds) dfxj.n(parcel, readInt, LatLngBounds.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new VisibleRegion(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new VisibleRegion[i];
    }
}
