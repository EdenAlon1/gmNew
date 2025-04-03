package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhbt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        StreetViewPanoramaCamera streetViewPanoramaCamera = null;
        String str = null;
        LatLng latLng = null;
        Integer num = null;
        StreetViewSource streetViewSource = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 2:
                    streetViewPanoramaCamera = (StreetViewPanoramaCamera) dfxj.n(parcel, readInt, StreetViewPanoramaCamera.CREATOR);
                    break;
                case 3:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 4:
                    latLng = (LatLng) dfxj.n(parcel, readInt, LatLng.CREATOR);
                    break;
                case 5:
                    num = dfxj.r(parcel, readInt);
                    break;
                case 6:
                    b = dfxj.a(parcel, readInt);
                    break;
                case 7:
                    b2 = dfxj.a(parcel, readInt);
                    break;
                case 8:
                    b3 = dfxj.a(parcel, readInt);
                    break;
                case 9:
                    b4 = dfxj.a(parcel, readInt);
                    break;
                case 10:
                    b5 = dfxj.a(parcel, readInt);
                    break;
                case 11:
                    streetViewSource = (StreetViewSource) dfxj.n(parcel, readInt, StreetViewSource.CREATOR);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new StreetViewPanoramaOptions(streetViewPanoramaCamera, str, latLng, num, b, b2, b3, b4, b5, streetViewSource);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaOptions[i];
    }
}
