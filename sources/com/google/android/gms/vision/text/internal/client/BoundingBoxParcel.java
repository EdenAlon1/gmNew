package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhwd;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class BoundingBoxParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BoundingBoxParcel> CREATOR = new dhwd();
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public BoundingBoxParcel(int i, int i2, int i3, int i4, float f) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 2, this.a);
        dfxk.i(parcel, 3, this.b);
        dfxk.i(parcel, 4, this.c);
        dfxk.i(parcel, 5, this.d);
        dfxk.h(parcel, 6, this.e);
        dfxk.c(parcel, a);
    }
}
