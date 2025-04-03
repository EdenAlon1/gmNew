package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhcq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        String str3 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        float f7 = 1.0f;
        float f8 = 0.5f;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 2:
                    latLng = (LatLng) dfxj.n(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 4:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 5:
                    iBinder = dfxj.l(parcel, readInt);
                    break;
                case 6:
                    f = dfxj.c(parcel, readInt);
                    break;
                case 7:
                    f2 = dfxj.c(parcel, readInt);
                    break;
                case 8:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 9:
                    z2 = dfxj.D(parcel, readInt);
                    break;
                case 10:
                    z3 = dfxj.D(parcel, readInt);
                    break;
                case 11:
                    f3 = dfxj.c(parcel, readInt);
                    break;
                case 12:
                    f8 = dfxj.c(parcel, readInt);
                    break;
                case 13:
                    f4 = dfxj.c(parcel, readInt);
                    break;
                case 14:
                    f7 = dfxj.c(parcel, readInt);
                    break;
                case 15:
                    f5 = dfxj.c(parcel, readInt);
                    break;
                case 16:
                default:
                    dfxj.C(parcel, readInt);
                    break;
                case 17:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 18:
                    iBinder2 = dfxj.l(parcel, readInt);
                    break;
                case 19:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 20:
                    str3 = dfxj.t(parcel, readInt);
                    break;
                case 21:
                    f6 = dfxj.c(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new MarkerOptions(latLng, str, str2, iBinder, f, f2, z, z2, z3, f3, f8, f4, f7, f5, i, iBinder2, i2, str3, f6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MarkerOptions[i];
    }
}
