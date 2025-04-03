package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhvi;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SafetyOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SafetyOptions> CREATOR = new dhvi();
    public final boolean a;
    public final boolean b;
    public final int c;

    public SafetyOptions(boolean z, boolean z2, int i) {
        this.a = z;
        this.b = z2;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.d(parcel, 2, this.a);
        dfxk.d(parcel, 3, this.b);
        dfxk.i(parcel, 4, this.c);
        dfxk.c(parcel, a);
    }
}
