package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhcn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        double d = eobe.a;
        double d2 = 0.0d;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d3 = dfxj.d(readInt);
            if (d3 == 2) {
                d = dfxj.b(parcel, readInt);
            } else if (d3 != 3) {
                dfxj.C(parcel, readInt);
            } else {
                d2 = dfxj.b(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new LatLng(d, d2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LatLng[i];
    }
}
