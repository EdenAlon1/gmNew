package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dibf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        byte b = 0;
        byte b2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 2) {
                b = dfxj.a(parcel, readInt);
            } else if (d == 3) {
                b2 = dfxj.a(parcel, readInt);
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else {
                str = dfxj.t(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new AmsEntityUpdateParcelable(b, b2, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AmsEntityUpdateParcelable[i];
    }
}
