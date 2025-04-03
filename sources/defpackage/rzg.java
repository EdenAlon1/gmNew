package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rzg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        float f = 1.0f;
        ArrayList arrayList = null;
        rwh rwhVar = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                arrayList = dfxj.z(parcel, readInt, rwt.CREATOR);
            } else if (d == 2) {
                rwhVar = (rwh) dfxj.n(parcel, readInt, rwh.CREATOR);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                f = dfxj.c(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new rzf(arrayList, rwhVar, f);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new rzf[i];
    }
}
