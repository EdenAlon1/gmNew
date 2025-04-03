package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationSettingsStates;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgza implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 2:
                    z2 = dfxj.D(parcel, readInt);
                    break;
                case 3:
                    z3 = dfxj.D(parcel, readInt);
                    break;
                case 4:
                    z4 = dfxj.D(parcel, readInt);
                    break;
                case 5:
                    z5 = dfxj.D(parcel, readInt);
                    break;
                case 6:
                    z6 = dfxj.D(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new LocationSettingsStates(z, z2, z3, z4, z5, z6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsStates[i];
    }
}
