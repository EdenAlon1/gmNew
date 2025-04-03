package com.google.android.gms.clearcut.sampler;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfnj;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SamplerConfigParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SamplerConfigParcelable> CREATOR = new dfnj();
    public final int a;
    public final double b;
    public final int c;
    public final int d;
    public final String e;

    public SamplerConfigParcelable(int i, double d, int i2, int i3, String str) {
        this.a = i;
        this.b = d;
        this.c = i2;
        this.d = i3;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, i2);
        dfxk.g(parcel, 2, this.b);
        dfxk.i(parcel, 3, this.c);
        dfxk.i(parcel, 4, this.d);
        dfxk.m(parcel, 5, this.e, false);
        dfxk.c(parcel, a);
    }
}
