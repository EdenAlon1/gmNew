package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdd.FileGroupRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhdi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        String str2 = null;
        Account account = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                str = dfxj.t(parcel, readInt);
            } else if (d == 2) {
                str2 = dfxj.t(parcel, readInt);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                account = (Account) dfxj.n(parcel, readInt, Account.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new FileGroupRequest(str, str2, account);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FileGroupRequest[i];
    }
}
