package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.DeviceOrientation;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgyj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        byte b = 0;
        long j = 0;
        float[] fArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d != 1) {
                switch (d) {
                    case 4:
                        f = dfxj.c(parcel, readInt);
                        break;
                    case 5:
                        f2 = dfxj.c(parcel, readInt);
                        break;
                    case 6:
                        j = dfxj.i(parcel, readInt);
                        break;
                    case 7:
                        b = dfxj.a(parcel, readInt);
                        break;
                    case 8:
                        f3 = dfxj.c(parcel, readInt);
                        break;
                    case 9:
                        f4 = dfxj.c(parcel, readInt);
                        break;
                    default:
                        dfxj.C(parcel, readInt);
                        break;
                }
            } else {
                fArr = dfxj.G(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new DeviceOrientation(fArr, f, f2, j, b, f3, f4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DeviceOrientation[i];
    }
}
