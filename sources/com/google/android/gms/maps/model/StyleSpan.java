package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhde;
import defpackage.eobe;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class StyleSpan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StyleSpan> CREATOR = new dhde();
    public final StrokeStyle a;
    public final double b;

    public StyleSpan(StrokeStyle strokeStyle, double d) {
        if (d <= eobe.a) {
            throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
        }
        this.a = strokeStyle;
        this.b = d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        StrokeStyle strokeStyle = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 2, strokeStyle, i, false);
        dfxk.g(parcel, 3, this.b);
        dfxk.c(parcel, a);
    }
}
