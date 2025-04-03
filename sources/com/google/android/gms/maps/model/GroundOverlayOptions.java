package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.dfxk;
import defpackage.dhcc;
import defpackage.dhcl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GroundOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GroundOverlayOptions> CREATOR = new dhcl();
    public LatLng a;
    public float b;
    public float c;
    public LatLngBounds d;
    public float e;
    public float f;
    public boolean g;
    public float h;
    public float i;
    public float j;
    public boolean k;
    private dhcc l;

    public GroundOverlayOptions() {
        this.g = true;
        this.h = 0.0f;
        this.i = 0.5f;
        this.j = 0.5f;
        this.k = false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.u(parcel, 2, this.l.a.asBinder());
        dfxk.k(parcel, 3, this.a, i, false);
        dfxk.h(parcel, 4, this.b);
        dfxk.h(parcel, 5, this.c);
        dfxk.k(parcel, 6, this.d, i, false);
        dfxk.h(parcel, 7, this.e);
        dfxk.h(parcel, 8, this.f);
        dfxk.d(parcel, 9, this.g);
        dfxk.h(parcel, 10, this.h);
        dfxk.h(parcel, 11, this.i);
        dfxk.h(parcel, 12, this.j);
        dfxk.d(parcel, 13, this.k);
        dfxk.c(parcel, a);
    }

    public GroundOverlayOptions(IBinder iBinder, LatLng latLng, float f, float f2, LatLngBounds latLngBounds, float f3, float f4, boolean z, float f5, float f6, float f7, boolean z2) {
        this.g = true;
        this.h = 0.0f;
        this.i = 0.5f;
        this.j = 0.5f;
        this.k = false;
        this.l = new dhcc(IObjectWrapper.Stub.asInterface(iBinder));
        this.a = latLng;
        this.b = f;
        this.c = f2;
        this.d = latLngBounds;
        this.e = f3;
        this.f = f4;
        this.g = z;
        this.h = f5;
        this.i = f6;
        this.j = f7;
        this.k = z2;
    }
}
