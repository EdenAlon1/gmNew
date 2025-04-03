package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhxu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        Bundle bundle = null;
        String str = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 2) {
                i = dfxj.f(parcel, readInt);
            } else if (d == 3) {
                bundle = dfxj.k(parcel, readInt);
            } else if (d == 4) {
                str = dfxj.t(parcel, readInt);
            } else if (d == 5) {
                i2 = dfxj.f(parcel, readInt);
            } else if (d != 6) {
                dfxj.C(parcel, readInt);
            } else {
                i3 = dfxj.f(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new WalletCustomTheme(i, bundle, str, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new WalletCustomTheme[i];
    }
}
