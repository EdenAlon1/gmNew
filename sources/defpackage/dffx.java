package defpackage;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.delegate.FinishSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dffx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        Bundle bundle = null;
        AppDescription appDescription = null;
        String str = null;
        AccountAuthenticatorResponse accountAuthenticatorResponse = null;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                i = dfxj.f(parcel, readInt);
            } else if (d == 2) {
                bundle = dfxj.k(parcel, readInt);
            } else if (d == 3) {
                appDescription = (AppDescription) dfxj.n(parcel, readInt, AppDescription.CREATOR);
            } else if (d == 4) {
                str = dfxj.t(parcel, readInt);
            } else if (d != 5) {
                dfxj.C(parcel, readInt);
            } else {
                accountAuthenticatorResponse = (AccountAuthenticatorResponse) dfxj.n(parcel, readInt, AccountAuthenticatorResponse.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new FinishSessionWorkflowRequest(i, bundle, appDescription, str, accountAuthenticatorResponse);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FinishSessionWorkflowRequest[i];
    }
}
