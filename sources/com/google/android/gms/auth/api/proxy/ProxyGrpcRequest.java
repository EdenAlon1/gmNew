package com.google.android.gms.auth.api.proxy;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfdo;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ProxyGrpcRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyGrpcRequest> CREATOR = new dfdo();
    final int a;
    public final String b;
    public final int c;
    public final long d;
    public final byte[] e;
    public final String f;

    public ProxyGrpcRequest(int i, String str, int i2, long j, byte[] bArr, String str2) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = j;
        this.e = bArr;
        this.f = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.b;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.i(parcel, 2, this.c);
        dfxk.j(parcel, 3, this.d);
        dfxk.f(parcel, 4, this.e, false);
        dfxk.m(parcel, 5, this.f, false);
        dfxk.i(parcel, 1000, this.a);
        dfxk.c(parcel, a);
    }
}
