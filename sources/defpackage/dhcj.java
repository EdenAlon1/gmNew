package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.FeatureStyle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhcj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        Integer num = null;
        Integer num2 = null;
        Float f = null;
        Float f2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                num = dfxj.r(parcel, readInt);
            } else if (d == 2) {
                num2 = dfxj.r(parcel, readInt);
            } else if (d == 3) {
                f = dfxj.q(parcel, readInt);
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else {
                f2 = dfxj.q(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new FeatureStyle(num, num2, f, f2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FeatureStyle[i];
    }
}
