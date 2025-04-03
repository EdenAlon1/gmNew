package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rze implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        ArrayList arrayList = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        ryz ryzVar = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        float f = 0.0f;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    arrayList = dfxj.z(parcel, readInt, rzb.CREATOR);
                    break;
                case 2:
                    f = dfxj.c(parcel, readInt);
                    break;
                case 3:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 4:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 5:
                    i3 = dfxj.f(parcel, readInt);
                    break;
                case 6:
                    iBinder = dfxj.l(parcel, readInt);
                    break;
                case 7:
                    i4 = dfxj.f(parcel, readInt);
                    break;
                case 8:
                    i5 = dfxj.f(parcel, readInt);
                    break;
                case 9:
                    iBinder2 = dfxj.l(parcel, readInt);
                    break;
                case 10:
                    i6 = dfxj.f(parcel, readInt);
                    break;
                case 11:
                    ryzVar = (ryz) dfxj.n(parcel, readInt, ryz.CREATOR);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new rzd(arrayList, f, i, i2, i3, iBinder, i4, i5, iBinder2, i6, ryzVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new rzd[i];
    }
}
