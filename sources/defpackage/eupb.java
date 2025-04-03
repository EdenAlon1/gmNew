package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eupb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        Bundle bundle = null;
        Bundle bundle2 = null;
        boolean z = false;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                z = dfxj.D(parcel, readInt);
            } else if (d == 2) {
                i = dfxj.f(parcel, readInt);
            } else if (d == 3) {
                str = dfxj.t(parcel, readInt);
            } else if (d == 4) {
                bundle = dfxj.k(parcel, readInt);
            } else if (d != 5) {
                dfxj.C(parcel, readInt);
            } else {
                bundle2 = dfxj.k(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new eupg(z, i, str, bundle, bundle2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new eupg[i];
    }
}
