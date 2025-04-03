package com.google.android.gms.constellation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dfzv;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetIidTokenResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetIidTokenResponse> CREATOR = new dfzv();
    public final String a;
    public final String b;
    public final byte[] c;
    public final long d;

    public GetIidTokenResponse(String str, String str2, byte[] bArr, long j) {
        this.a = str;
        this.b = str2;
        this.c = bArr;
        this.d = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.f(parcel, 3, this.c, false);
        dfxk.j(parcel, 4, this.d);
        dfxk.c(parcel, a);
    }
}
