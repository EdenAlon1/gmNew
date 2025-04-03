package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dewk;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RegisteredPackageInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisteredPackageInfo> CREATOR = new dewk();
    public final String a;
    public final long b;
    public final boolean c;
    public final long d;

    public RegisteredPackageInfo(String str, long j, boolean z, long j2) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.j(parcel, 2, this.b);
        dfxk.d(parcel, 3, this.c);
        dfxk.j(parcel, 4, this.d);
        dfxk.c(parcel, a);
    }
}
