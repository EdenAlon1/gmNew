package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dffd;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ConfirmCredentialsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConfirmCredentialsRequest> CREATOR = new dffd();
    final int a;
    AccountCredentials b;
    CaptchaSolution c;

    public ConfirmCredentialsRequest() {
        this.a = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.k(parcel, 2, this.b, i, false);
        dfxk.k(parcel, 3, this.c, i, false);
        dfxk.c(parcel, a);
    }

    public ConfirmCredentialsRequest(int i, AccountCredentials accountCredentials, CaptchaSolution captchaSolution) {
        this.a = i;
        this.b = accountCredentials;
        this.c = captchaSolution;
    }
}
