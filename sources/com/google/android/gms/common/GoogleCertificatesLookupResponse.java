package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfpg;
import defpackage.dfpx;
import defpackage.dfqb;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GoogleCertificatesLookupResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleCertificatesLookupResponse> CREATOR = new dfpx();
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final GoogleCertificatesLookupResponse f;

    public GoogleCertificatesLookupResponse(boolean z, String str, int i, int i2, long j, GoogleCertificatesLookupResponse googleCertificatesLookupResponse) {
        this.a = z;
        this.b = str;
        this.c = dfqb.a(i) - 1;
        this.d = dfpg.a(i2) - 1;
        this.e = j;
        this.f = googleCertificatesLookupResponse;
    }

    public final int a() {
        return dfqb.a(this.c);
    }

    public final void b() {
        dfpg.a(this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = dfxk.a(parcel);
        dfxk.d(parcel, 1, z);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.i(parcel, 3, this.c);
        dfxk.i(parcel, 4, this.d);
        dfxk.j(parcel, 5, this.e);
        dfxk.k(parcel, 6, this.f, i, false);
        dfxk.c(parcel, a);
    }
}
