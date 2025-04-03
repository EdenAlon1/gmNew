package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dffj;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GplusInfoResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GplusInfoResponse> CREATOR = new dffj();
    final int a;
    final boolean b;
    final String c;
    final String d;
    final String e;
    final boolean f;
    final boolean g;
    final String h;
    final String i;
    final String j;

    public GplusInfoResponse(int i, boolean z, String str, String str2, String str3, boolean z2, boolean z3, String str4, String str5, String str6) {
        this.a = i;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z2;
        this.g = z3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.d(parcel, 2, this.b);
        dfxk.m(parcel, 3, this.c, false);
        dfxk.m(parcel, 4, this.d, false);
        dfxk.m(parcel, 5, this.e, false);
        dfxk.d(parcel, 6, this.f);
        dfxk.d(parcel, 7, this.g);
        dfxk.m(parcel, 8, this.h, false);
        dfxk.m(parcel, 9, this.i, false);
        dfxk.m(parcel, 10, this.j, false);
        dfxk.c(parcel, a);
    }
}
