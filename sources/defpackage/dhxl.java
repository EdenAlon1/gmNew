package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.firstparty.ExecuteBuyFlowRequest;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhxl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        WalletCustomTheme walletCustomTheme = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 2) {
                bArr = dfxj.E(parcel, readInt);
            } else if (d == 3) {
                bArr2 = dfxj.E(parcel, readInt);
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else {
                walletCustomTheme = (WalletCustomTheme) dfxj.n(parcel, readInt, WalletCustomTheme.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new ExecuteBuyFlowRequest(bArr, bArr2, walletCustomTheme);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ExecuteBuyFlowRequest[i];
    }
}
