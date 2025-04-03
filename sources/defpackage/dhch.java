package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhch implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        LatLng latLng = null;
        ArrayList arrayList = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        double d = 0.0d;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 2:
                    latLng = (LatLng) dfxj.n(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    d = dfxj.b(parcel, readInt);
                    break;
                case 4:
                    f = dfxj.c(parcel, readInt);
                    break;
                case 5:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 6:
                    i2 = dfxj.f(parcel, readInt);
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
                    arrayList = dfxj.z(parcel, readInt, PatternItem.CREATOR);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new CircleOptions(latLng, d, f, i, i2, f2, z, z2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CircleOptions[i];
    }
}
