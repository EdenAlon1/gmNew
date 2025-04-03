package com.google.android.gms.search;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhlz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GoogleNowAuthState extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleNowAuthState> CREATOR = new dhlz();
    final String a;
    final String b;
    final long c;

    public GoogleNowAuthState(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final String toString() {
        return "mAuthCode = " + this.a + "\nmAccessToken = " + this.b + "\nmNextAllowedTimeMillis = " + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.j(parcel, 3, this.c);
        dfxk.c(parcel, a);
    }
}
