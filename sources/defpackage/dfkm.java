package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.carrierauth.EAPAKARequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfkm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = 0;
        String str = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                str = dfxj.t(parcel, readInt);
            } else if (d == 2) {
                num = dfxj.r(parcel, readInt);
            } else if (d == 3) {
                num2 = dfxj.r(parcel, readInt);
            } else if (d == 4) {
                num3 = dfxj.r(parcel, readInt);
            } else if (d != 5) {
                dfxj.C(parcel, readInt);
            } else {
                i = dfxj.f(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new EAPAKARequest(str, num, num2, num3, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new EAPAKARequest[i];
    }
}
