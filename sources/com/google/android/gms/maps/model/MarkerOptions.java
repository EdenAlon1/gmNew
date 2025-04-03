package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.dfxk;
import defpackage.dhcc;
import defpackage.dhcq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MarkerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new dhcq();
    public LatLng a;
    public String b;
    public String c;
    public float d;
    public float e;
    public boolean f;
    public boolean g;
    public boolean h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public int n;
    public int o;
    public String p;
    public float q;
    private dhcc r;
    private View s;

    public MarkerOptions() {
        this.d = 0.5f;
        this.e = 1.0f;
        this.g = true;
        this.h = false;
        this.i = 0.0f;
        this.j = 0.5f;
        this.k = 0.0f;
        this.l = 1.0f;
        this.n = 0;
    }

    /* JADX WARN: Type inference failed for: r6v19, types: [android.os.IBinder, com.google.android.gms.dynamic.IObjectWrapper] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 2, this.a, i, false);
        dfxk.m(parcel, 3, this.b, false);
        dfxk.m(parcel, 4, this.c, false);
        dhcc dhccVar = this.r;
        dfxk.u(parcel, 5, dhccVar == null ? null : dhccVar.a.asBinder());
        dfxk.h(parcel, 6, this.d);
        dfxk.h(parcel, 7, this.e);
        dfxk.d(parcel, 8, this.f);
        dfxk.d(parcel, 9, this.g);
        dfxk.d(parcel, 10, this.h);
        dfxk.h(parcel, 11, this.i);
        dfxk.h(parcel, 12, this.j);
        dfxk.h(parcel, 13, this.k);
        dfxk.h(parcel, 14, this.l);
        dfxk.h(parcel, 15, this.m);
        dfxk.i(parcel, 17, this.n);
        dfxk.u(parcel, 18, ObjectWrapper.wrap(this.s));
        dfxk.i(parcel, 19, this.o);
        dfxk.m(parcel, 20, this.p, false);
        dfxk.h(parcel, 21, this.q);
        dfxk.c(parcel, a);
    }

    public MarkerOptions(LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7, int i, IBinder iBinder2, int i2, String str3, float f8) {
        this.d = 0.5f;
        this.e = 1.0f;
        this.g = true;
        this.h = false;
        this.i = 0.0f;
        this.j = 0.5f;
        this.k = 0.0f;
        this.l = 1.0f;
        this.n = 0;
        this.a = latLng;
        this.b = str;
        this.c = str2;
        if (iBinder == null) {
            this.r = null;
        } else {
            this.r = new dhcc(IObjectWrapper.Stub.asInterface(iBinder));
        }
        this.d = f;
        this.e = f2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = f3;
        this.j = f4;
        this.k = f5;
        this.l = f6;
        this.m = f7;
        this.o = i2;
        this.n = i;
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(iBinder2);
        this.s = asInterface != null ? (View) ObjectWrapper.unwrap(asInterface) : null;
        this.p = str3;
        this.q = f8;
    }
}
