package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhdd;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class StrokeStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StrokeStyle> CREATOR = new dhdd();
    public final float a;
    public final int b;
    public final int c;
    public final boolean d;
    public final StampStyle e;

    public StrokeStyle(float f, int i, int i2, boolean z, StampStyle stampStyle) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = stampStyle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        float f = this.a;
        int a = dfxk.a(parcel);
        dfxk.h(parcel, 2, f);
        dfxk.i(parcel, 3, this.b);
        dfxk.i(parcel, 4, this.c);
        dfxk.d(parcel, 5, this.d);
        dfxk.k(parcel, 6, this.e, i, false);
        dfxk.c(parcel, a);
    }
}
