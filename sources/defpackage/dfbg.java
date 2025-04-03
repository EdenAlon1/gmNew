package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferProgress;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorAnnotatedData;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfbg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        ArrayList arrayList = null;
        AccountTransferProgress accountTransferProgress = null;
        int i2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                i = dfxj.f(parcel, readInt);
                hashSet.add(1);
            } else if (d == 2) {
                arrayList = dfxj.z(parcel, readInt, AuthenticatorAnnotatedData.CREATOR);
                hashSet.add(2);
            } else if (d == 3) {
                i2 = dfxj.f(parcel, readInt);
                hashSet.add(3);
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else {
                accountTransferProgress = (AccountTransferProgress) dfxj.n(parcel, readInt, AccountTransferProgress.CREATOR);
                hashSet.add(4);
            }
        }
        if (parcel.dataPosition() == h) {
            return new AccountTransferMsg(hashSet, i, arrayList, i2, accountTransferProgress);
        }
        throw new dfxi(a.h(h, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountTransferMsg[i];
    }
}
