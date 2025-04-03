package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhcj;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FeatureStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FeatureStyle> CREATOR = new dhcj();
    public final Integer a;
    public final Integer b;
    public final Float c;
    public final Float d;

    public FeatureStyle(Integer num, Integer num2, Float f, Float f2) {
        this.a = num;
        this.b = num2;
        this.c = f;
        this.d = f2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.a;
        int a = dfxk.a(parcel);
        dfxk.x(parcel, 1, num);
        dfxk.x(parcel, 2, this.b);
        dfxk.t(parcel, 3, this.c);
        dfxk.t(parcel, 4, this.d);
        dfxk.c(parcel, a);
    }
}
