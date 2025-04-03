package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.internal.ParcelableGeofence;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhap implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = -1;
        int i2 = 0;
        short s = 0;
        int i3 = 0;
        long j = 0;
        float f = 0.0f;
        double d = 0.0d;
        double d2 = 0.0d;
        String str = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 2:
                    j = dfxj.i(parcel, readInt);
                    break;
                case 3:
                    s = dfxj.A(parcel, readInt);
                    break;
                case 4:
                    d = dfxj.b(parcel, readInt);
                    break;
                case 5:
                    d2 = dfxj.b(parcel, readInt);
                    break;
                case 6:
                    f = dfxj.c(parcel, readInt);
                    break;
                case 7:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 8:
                    i3 = dfxj.f(parcel, readInt);
                    break;
                case 9:
                    i = dfxj.f(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new ParcelableGeofence(str, i2, s, d, d2, f, j, i3, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ParcelableGeofence[i];
    }
}
