package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.CaptchaChallenge;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfet;
import defpackage.dfxk;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AccountNameCheckResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountNameCheckResponse> CREATOR = new dfet();
    final String a;
    final List b;
    final String c;
    final CaptchaChallenge d;

    public AccountNameCheckResponse(String str, List list, String str2, CaptchaChallenge captchaChallenge) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = captchaChallenge;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 2, str, false);
        dfxk.D(parcel, 3, this.b);
        dfxk.m(parcel, 4, this.c, false);
        dfxk.k(parcel, 5, this.d, i, false);
        dfxk.c(parcel, a);
    }
}
