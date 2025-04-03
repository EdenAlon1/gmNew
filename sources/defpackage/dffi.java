package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.GplusInfoRequest;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dffi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        Account account = null;
        int i = 0;
        CaptchaSolution captchaSolution = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                i = dfxj.f(parcel, readInt);
            } else if (d == 2) {
                str = dfxj.t(parcel, readInt);
            } else if (d == 3) {
                captchaSolution = (CaptchaSolution) dfxj.n(parcel, readInt, CaptchaSolution.CREATOR);
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else {
                account = (Account) dfxj.n(parcel, readInt, Account.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new GplusInfoRequest(i, str, captchaSolution, account);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GplusInfoRequest[i];
    }
}
