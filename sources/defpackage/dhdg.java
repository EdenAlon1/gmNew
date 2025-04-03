package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.TileOverlayOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhdg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = true;
        boolean z2 = false;
        IBinder iBinder = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 2) {
                iBinder = dfxj.l(parcel, readInt);
            } else if (d == 3) {
                z2 = dfxj.D(parcel, readInt);
            } else if (d == 4) {
                f = dfxj.c(parcel, readInt);
            } else if (d == 5) {
                z = dfxj.D(parcel, readInt);
            } else if (d != 6) {
                dfxj.C(parcel, readInt);
            } else {
                f2 = dfxj.c(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new TileOverlayOptions(iBinder, z2, f, z, f2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new TileOverlayOptions[i];
    }
}
