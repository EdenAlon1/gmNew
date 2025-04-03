package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.GetDefaultAccountResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfcs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        Account account = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (dfxj.d(readInt) != 1) {
                dfxj.C(parcel, readInt);
            } else {
                account = (Account) dfxj.n(parcel, readInt, Account.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new GetDefaultAccountResult(account);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetDefaultAccountResult[i];
    }
}
