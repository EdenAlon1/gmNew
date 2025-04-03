package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfgh;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FACLData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FACLData> CREATOR = new dfgh();
    final int a;
    final FACLConfig b;
    final String c;
    final boolean d;
    final String e;

    public FACLData(int i, FACLConfig fACLConfig, String str, boolean z, String str2) {
        this.a = i;
        this.b = fACLConfig;
        this.c = str;
        this.d = z;
        this.e = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.k(parcel, 2, this.b, i, false);
        dfxk.m(parcel, 3, this.c, false);
        dfxk.d(parcel, 4, this.d);
        dfxk.m(parcel, 5, this.e, false);
        dfxk.c(parcel, a);
    }
}
