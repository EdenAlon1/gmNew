package defpackage;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AuthAccountRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfvg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = 0;
        boolean z = false;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Integer num = null;
        Integer num2 = null;
        Account account = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 2:
                    iBinder = dfxj.l(parcel, readInt);
                    break;
                case 3:
                    scopeArr = (Scope[]) dfxj.J(parcel, readInt, Scope.CREATOR);
                    break;
                case 4:
                    num = dfxj.r(parcel, readInt);
                    break;
                case 5:
                    num2 = dfxj.r(parcel, readInt);
                    break;
                case 6:
                    account = (Account) dfxj.n(parcel, readInt, Account.CREATOR);
                    break;
                case 7:
                    z = dfxj.D(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new AuthAccountRequest(i, iBinder, scopeArr, num, num2, account, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthAccountRequest[i];
    }
}
