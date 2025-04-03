package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhxn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 2) {
                bArr = dfxj.E(parcel, readInt);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                bArr2 = dfxj.E(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new GetBuyFlowInitializationTokenRequest(bArr, bArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetBuyFlowInitializationTokenRequest[i];
    }
}
