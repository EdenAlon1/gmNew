package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rym implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        ArrayList arrayList = null;
        rwh rwhVar = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                arrayList = dfxj.z(parcel, readInt, ryh.CREATOR);
            } else if (d != 2) {
                dfxj.C(parcel, readInt);
            } else {
                rwhVar = (rwh) dfxj.n(parcel, readInt, rwh.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new ryl(arrayList, rwhVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ryl[i];
    }
}
