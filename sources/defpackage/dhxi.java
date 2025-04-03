package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.Cart;
import com.google.android.gms.wallet.WebPaymentDataRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhxi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        Cart cart = null;
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 2) {
                cart = (Cart) dfxj.n(parcel, readInt, Cart.CREATOR);
            } else if (d == 3) {
                str = dfxj.t(parcel, readInt);
            } else if (d == 4) {
                str2 = dfxj.t(parcel, readInt);
            } else if (d == 5) {
                bundle = dfxj.k(parcel, readInt);
            } else if (d != 6) {
                dfxj.C(parcel, readInt);
            } else {
                bArr = dfxj.E(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new WebPaymentDataRequest(cart, str, str2, bArr, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new WebPaymentDataRequest[i];
    }
}
