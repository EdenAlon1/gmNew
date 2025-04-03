package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.LoyaltyPointsBalance;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhym implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = -1;
        long j = 0;
        String str = null;
        String str2 = null;
        double d = 0.0d;
        int i2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 2:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 3:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 4:
                    d = dfxj.b(parcel, readInt);
                    break;
                case 5:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 6:
                    j = dfxj.i(parcel, readInt);
                    break;
                case 7:
                    i = dfxj.f(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new LoyaltyPointsBalance(i2, str, d, str2, j, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LoyaltyPointsBalance[i];
    }
}
