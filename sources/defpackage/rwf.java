package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rwf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        ArrayList arrayList = null;
        rwh rwhVar = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                arrayList = dfxj.y(parcel, readInt);
            } else if (d == 2) {
                rwhVar = (rwh) dfxj.n(parcel, readInt, rwh.CREATOR);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                arrayList2 = dfxj.z(parcel, readInt, rwt.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new rwe(arrayList, rwhVar, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new rwe[i];
    }
}
