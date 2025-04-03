package com.google.android.gms.auth.frp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfhs;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class UnlockFactoryResetProtectionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UnlockFactoryResetProtectionRequest> CREATOR = new dfhs();
    final int a;
    public final String b;
    public final String c;
    public final String d;

    public UnlockFactoryResetProtectionRequest(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.m(parcel, 3, this.c, false);
        dfxk.m(parcel, 4, this.d, false);
        dfxk.c(parcel, a);
    }
}
