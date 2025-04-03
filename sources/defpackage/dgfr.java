package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.duokit.DuoId;
import com.google.android.gms.duokit.RemoteUserReachability;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgfr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = 0;
        DuoId duoId = null;
        int i2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                duoId = (DuoId) dfxj.n(parcel, readInt, DuoId.CREATOR);
            } else if (d == 2) {
                i = dfxj.f(parcel, readInt);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                i2 = dfxj.f(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new RemoteUserReachability(duoId, i, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RemoteUserReachability[i];
    }
}
