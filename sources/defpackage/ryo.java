package defpackage;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ryo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = 0;
        ArrayList arrayList = null;
        IBinder iBinder = null;
        int i2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                arrayList = dfxj.z(parcel, readInt, Bitmap.CREATOR);
            } else if (d == 2) {
                iBinder = dfxj.l(parcel, readInt);
            } else if (d == 3) {
                i = dfxj.f(parcel, readInt);
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else {
                i2 = dfxj.f(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new ryn(arrayList, iBinder, i, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ryn[i];
    }
}
