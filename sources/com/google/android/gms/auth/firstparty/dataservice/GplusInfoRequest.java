package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dffi;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GplusInfoRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GplusInfoRequest> CREATOR = new dffi();
    final int a;

    @Deprecated
    String b;
    CaptchaSolution c;
    Account d;

    public GplusInfoRequest() {
        this.a = 2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.k(parcel, 3, this.c, i, false);
        dfxk.k(parcel, 4, this.d, i, false);
        dfxk.c(parcel, a);
    }

    public GplusInfoRequest(int i, String str, CaptchaSolution captchaSolution, Account account) {
        this.a = i;
        this.b = str;
        this.c = captchaSolution;
        if (account != null || TextUtils.isEmpty(str)) {
            this.d = account;
        } else {
            this.d = new Account(str, "com.google");
        }
    }
}
