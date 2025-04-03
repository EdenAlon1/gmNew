package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dewb;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PIMEUpdateResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PIMEUpdateResponse> CREATOR = new dewb();
    final String a;
    public final byte[] b;
    public final PIMEUpdate[] c;

    public PIMEUpdateResponse(String str, byte[] bArr, PIMEUpdate[] pIMEUpdateArr) {
        this.a = str;
        this.b = bArr;
        this.c = pIMEUpdateArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.f(parcel, 2, this.b, false);
        dfxk.E(parcel, 3, this.c, i);
        dfxk.c(parcel, a);
    }
}
