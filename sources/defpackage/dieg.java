package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.LogTimerRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dieg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        long j = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                str = dfxj.t(parcel, readInt);
            } else if (d == 2) {
                j = dfxj.i(parcel, readInt);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                bArr = dfxj.E(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new LogTimerRequest(str, j, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LogTimerRequest[i];
    }
}
