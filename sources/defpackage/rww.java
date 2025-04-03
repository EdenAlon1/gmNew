package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rww implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z2 = false;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        String str = null;
        Bundle bundle = null;
        float f = 0.0f;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    arrayList = dfxj.z(parcel, readInt, rwr.CREATOR);
                    break;
                case 2:
                    f = dfxj.c(parcel, readInt);
                    break;
                case 3:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 4:
                    arrayList2 = dfxj.y(parcel, readInt);
                    break;
                case 5:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 6:
                    i3 = dfxj.f(parcel, readInt);
                    break;
                case 7:
                    iBinder = dfxj.l(parcel, readInt);
                    break;
                case 8:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 9:
                    i4 = dfxj.f(parcel, readInt);
                    break;
                case 10:
                    iBinder2 = dfxj.l(parcel, readInt);
                    break;
                case 11:
                    i5 = dfxj.f(parcel, readInt);
                    break;
                case 12:
                    i6 = dfxj.f(parcel, readInt);
                    break;
                case 13:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 14:
                    bundle = dfxj.k(parcel, readInt);
                    break;
                case 15:
                    z2 = dfxj.D(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new rwv(arrayList, f, i, arrayList2, i2, i3, iBinder, z, i4, iBinder2, i5, i6, str, bundle, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new rwv[i];
    }
}
