package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.time.trustedtime.dto.GlobalState;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhsp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = 0;
        Long l = null;
        String str = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                l = dfxj.s(parcel, readInt);
            } else if (d == 2) {
                str = dfxj.t(parcel, readInt);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                i = dfxj.f(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new GlobalState(l, str, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GlobalState[i];
    }
}
