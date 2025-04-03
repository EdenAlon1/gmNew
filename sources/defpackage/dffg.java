package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.GoogleAccountData;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dffg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        String str3 = null;
        Account account = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 2:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 3:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 4:
                    arrayList = dfxj.y(parcel, readInt);
                    break;
                case 5:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 6:
                    str3 = dfxj.t(parcel, readInt);
                    break;
                case 7:
                    account = (Account) dfxj.n(parcel, readInt, Account.CREATOR);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new GoogleAccountData(i, str, z, arrayList, str2, str3, account);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleAccountData[i];
    }
}
