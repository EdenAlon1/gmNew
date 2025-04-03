package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rwo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        ArrayList arrayList = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        String str = null;
        Float f = null;
        Integer num = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    arrayList = dfxj.z(parcel, readInt, rwl.CREATOR);
                    break;
                case 2:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 3:
                    iBinder = dfxj.l(parcel, readInt);
                    break;
                case 4:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 5:
                    i3 = dfxj.f(parcel, readInt);
                    break;
                case 6:
                    iBinder2 = dfxj.l(parcel, readInt);
                    break;
                case 7:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 8:
                    f = dfxj.q(parcel, readInt);
                    break;
                case 9:
                    num = dfxj.r(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new rwn(arrayList, i, iBinder, i2, i3, iBinder2, str, f, num);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new rwn[i];
    }
}
