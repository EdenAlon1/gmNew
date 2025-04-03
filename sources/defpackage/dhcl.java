package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhcl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        boolean z = false;
        boolean z2 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        IBinder iBinder = null;
        LatLng latLng = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 2:
                    iBinder = dfxj.l(parcel, readInt);
                    break;
                case 3:
                    latLng = (LatLng) dfxj.n(parcel, readInt, LatLng.CREATOR);
                    break;
                case 4:
                    f = dfxj.c(parcel, readInt);
                    break;
                case 5:
                    f2 = dfxj.c(parcel, readInt);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) dfxj.n(parcel, readInt, LatLngBounds.CREATOR);
                    break;
                case 7:
                    f3 = dfxj.c(parcel, readInt);
                    break;
                case 8:
                    f4 = dfxj.c(parcel, readInt);
                    break;
                case 9:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 10:
                    f5 = dfxj.c(parcel, readInt);
                    break;
                case 11:
                    f6 = dfxj.c(parcel, readInt);
                    break;
                case 12:
                    f7 = dfxj.c(parcel, readInt);
                    break;
                case 13:
                    z2 = dfxj.D(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new GroundOverlayOptions(iBinder, latLng, f, f2, latLngBounds, f3, f4, z, f5, f6, f7, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GroundOverlayOptions[i];
    }
}
