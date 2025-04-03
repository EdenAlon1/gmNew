package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorAnnotatedData;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfbi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        AuthenticatorTransferInfo authenticatorTransferInfo = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                i = dfxj.f(parcel, readInt);
                hashSet.add(1);
            } else if (d == 2) {
                authenticatorTransferInfo = (AuthenticatorTransferInfo) dfxj.n(parcel, readInt, AuthenticatorTransferInfo.CREATOR);
                hashSet.add(2);
            } else if (d == 3) {
                str = dfxj.t(parcel, readInt);
                hashSet.add(3);
            } else if (d == 4) {
                str2 = dfxj.t(parcel, readInt);
                hashSet.add(4);
            } else if (d != 5) {
                dfxj.C(parcel, readInt);
            } else {
                str3 = dfxj.t(parcel, readInt);
                hashSet.add(5);
            }
        }
        if (parcel.dataPosition() == h) {
            return new AuthenticatorAnnotatedData(hashSet, i, authenticatorTransferInfo, str, str2, str3);
        }
        throw new dfxi(a.h(h, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthenticatorAnnotatedData[i];
    }
}
