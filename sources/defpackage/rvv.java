package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rvv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                i = dfxj.f(parcel, readInt);
            } else if (d == 2) {
                arrayList = dfxj.y(parcel, readInt);
            } else if (d == 3) {
                arrayList2 = dfxj.y(parcel, readInt);
            } else if (d == 4) {
                z = dfxj.D(parcel, readInt);
            } else if (d != 5) {
                dfxj.C(parcel, readInt);
            } else {
                z2 = dfxj.D(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new rvu(i, arrayList, arrayList2, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new rvu[i];
    }
}
