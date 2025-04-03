package com.google.android.gms.auth.proximity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfiq;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class WireMessageParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WireMessageParams> CREATOR = new dfiq();
    final int a;
    public final String b;
    public final byte[] c;
    public final String d;

    public WireMessageParams(int i, String str, byte[] bArr, String str2) {
        this.a = i;
        this.b = str;
        this.c = bArr;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.b;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.f(parcel, 2, this.c, false);
        dfxk.m(parcel, 3, this.d, false);
        dfxk.i(parcel, 10000, this.a);
        dfxk.c(parcel, a);
    }
}
