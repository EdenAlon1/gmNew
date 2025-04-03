package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.telephonyspam.CallSpamOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhru implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        String str = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                i = dfxj.f(parcel, readInt);
            } else if (d == 2) {
                str = dfxj.t(parcel, readInt);
            } else if (d == 3) {
                j = dfxj.i(parcel, readInt);
            } else if (d == 4) {
                i2 = dfxj.f(parcel, readInt);
            } else if (d != 5) {
                dfxj.C(parcel, readInt);
            } else {
                j2 = dfxj.i(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new CallSpamOptions(i, str, j, i2, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CallSpamOptions[i];
    }
}
