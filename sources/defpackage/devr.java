package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Request;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class devr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        Account account = null;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                account = (Account) dfxj.n(parcel, readInt, Account.CREATOR);
            } else if (d == 2) {
                z = dfxj.D(parcel, readInt);
            } else if (d == 3) {
                z2 = dfxj.D(parcel, readInt);
            } else if (d == 4) {
                z3 = dfxj.D(parcel, readInt);
            } else if (d != 5) {
                dfxj.C(parcel, readInt);
            } else {
                str = dfxj.t(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new GetRecentContextCall$Request(account, z, z2, z3, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetRecentContextCall$Request[i];
    }
}
