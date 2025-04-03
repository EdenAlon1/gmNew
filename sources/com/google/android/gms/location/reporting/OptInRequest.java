package com.google.android.gms.location.reporting;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dhat;
import defpackage.dhbb;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class OptInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OptInRequest> CREATOR = new dhat();
    public final Account a;
    public final String b;
    public final String c;
    private final boolean d;

    public OptInRequest(Account account, String str, String str2, boolean z) {
        this.a = account;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptInRequest)) {
            return false;
        }
        OptInRequest optInRequest = (OptInRequest) obj;
        return this.a.equals(optInRequest.a) && dfwq.a(this.b, optInRequest.b) && dfwq.a(this.c, optInRequest.c) && dfwq.a(Boolean.valueOf(this.d), Boolean.valueOf(optInRequest.d));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Boolean.valueOf(this.d)});
    }

    public final String toString() {
        return "UploadRequest{, account=" + dhbb.a(this.a) + ", tag='" + this.b + ", auditToken=" + this.c + ", enableAdsSubconsent=" + this.d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 2, account, i, false);
        dfxk.m(parcel, 3, this.b, false);
        dfxk.m(parcel, 4, this.c, false);
        boolean z = this.d;
        Boolean.valueOf(z).getClass();
        dfxk.d(parcel, 5, z);
        dfxk.c(parcel, a);
    }
}
