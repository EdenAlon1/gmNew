package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfdp;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ProxyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyRequest> CREATOR = new dfdp();
    final int a;
    public final String b;
    public final int c;
    public final long d;
    public final byte[] e;
    final Bundle f;

    public ProxyRequest(int i, String str, int i2, long j, byte[] bArr, Bundle bundle) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = j;
        this.e = bArr;
        this.f = bundle;
    }

    public final String toString() {
        return "ProxyRequest[ url: " + this.b + ", method: " + this.c + " ]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.b;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.i(parcel, 2, this.c);
        dfxk.j(parcel, 3, this.d);
        dfxk.f(parcel, 4, this.e, false);
        dfxk.p(parcel, 5, this.f);
        dfxk.i(parcel, 1000, this.a);
        dfxk.c(parcel, a);
    }
}
