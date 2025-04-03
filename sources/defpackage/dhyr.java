package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhyr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        String str2 = null;
        TimeInterval timeInterval = null;
        UriData uriData = null;
        UriData uriData2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 2) {
                str = dfxj.t(parcel, readInt);
            } else if (d == 3) {
                str2 = dfxj.t(parcel, readInt);
            } else if (d == 4) {
                timeInterval = (TimeInterval) dfxj.n(parcel, readInt, TimeInterval.CREATOR);
            } else if (d == 5) {
                uriData = (UriData) dfxj.n(parcel, readInt, UriData.CREATOR);
            } else if (d != 6) {
                dfxj.C(parcel, readInt);
            } else {
                uriData2 = (UriData) dfxj.n(parcel, readInt, UriData.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new WalletObjectMessage(str, str2, timeInterval, uriData, uriData2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new WalletObjectMessage[i];
    }
}
