package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.ConfirmCredentialsRequest;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dffd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        AccountCredentials accountCredentials = null;
        int i = 0;
        CaptchaSolution captchaSolution = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                i = dfxj.f(parcel, readInt);
            } else if (d == 2) {
                accountCredentials = (AccountCredentials) dfxj.n(parcel, readInt, AccountCredentials.CREATOR);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                captchaSolution = (CaptchaSolution) dfxj.n(parcel, readInt, CaptchaSolution.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new ConfirmCredentialsRequest(i, accountCredentials, captchaSolution);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConfirmCredentialsRequest[i];
    }
}
