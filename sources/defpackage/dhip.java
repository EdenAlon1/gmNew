package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.identity.internal.ParcelableGetOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhip implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        Bundle bundle = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                z = dfxj.D(parcel, readInt);
            } else if (d == 2) {
                z2 = dfxj.D(parcel, readInt);
            } else if (d == 3) {
                str = dfxj.t(parcel, readInt);
            } else if (d == 4) {
                z3 = dfxj.D(parcel, readInt);
            } else if (d != 5) {
                dfxj.C(parcel, readInt);
            } else {
                bundle = dfxj.k(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new ParcelableGetOptions(z, z2, z3, str, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ParcelableGetOptions[i];
    }
}
