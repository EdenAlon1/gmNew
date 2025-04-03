package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import defpackage.dfwp;
import defpackage.dfxk;
import defpackage.dhbk;
import defpackage.dhbs;
import defpackage.dhbz;
import defpackage.dhce;
import java.util.ArrayList;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new dhbk();
    private static final Integer i = Integer.valueOf(Color.argb(PrivateKeyType.INVALID, 236, 233, 225));
    public int a;
    public CameraPosition b;
    public Float c;
    public Float d;
    public LatLngBounds e;
    public Integer f;
    public String g;
    public int h;
    private Boolean j;
    private Boolean k;
    private Boolean l;
    private Boolean m;
    private Boolean n;
    private Boolean o;
    private Boolean p;
    private Boolean q;
    private Boolean r;
    private Boolean s;
    private Boolean t;
    private Boolean u;

    public GoogleMapOptions() {
        this.a = -1;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }

    public static GoogleMapOptions a(Context context, AttributeSet attributeSet) {
        String string;
        LatLngBounds latLngBounds = null;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, dhbs.a);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(16)) {
            googleMapOptions.a = obtainAttributes.getInt(16, -1);
        }
        if (obtainAttributes.hasValue(26)) {
            googleMapOptions.j = Boolean.valueOf(obtainAttributes.getBoolean(26, false));
        }
        if (obtainAttributes.hasValue(25)) {
            googleMapOptions.k = Boolean.valueOf(obtainAttributes.getBoolean(25, false));
        }
        if (obtainAttributes.hasValue(17)) {
            googleMapOptions.m = Boolean.valueOf(obtainAttributes.getBoolean(17, true));
        }
        if (obtainAttributes.hasValue(19)) {
            googleMapOptions.q = Boolean.valueOf(obtainAttributes.getBoolean(19, true));
        }
        if (obtainAttributes.hasValue(21)) {
            googleMapOptions.u = Boolean.valueOf(obtainAttributes.getBoolean(21, true));
        }
        if (obtainAttributes.hasValue(20)) {
            googleMapOptions.n = Boolean.valueOf(obtainAttributes.getBoolean(20, true));
        }
        if (obtainAttributes.hasValue(22)) {
            googleMapOptions.p = Boolean.valueOf(obtainAttributes.getBoolean(22, true));
        }
        if (obtainAttributes.hasValue(24)) {
            googleMapOptions.o = Boolean.valueOf(obtainAttributes.getBoolean(24, true));
        }
        if (obtainAttributes.hasValue(23)) {
            googleMapOptions.l = Boolean.valueOf(obtainAttributes.getBoolean(23, true));
        }
        if (obtainAttributes.hasValue(13)) {
            googleMapOptions.r = Boolean.valueOf(obtainAttributes.getBoolean(13, false));
        }
        if (obtainAttributes.hasValue(18)) {
            googleMapOptions.s = Boolean.valueOf(obtainAttributes.getBoolean(18, true));
        }
        if (obtainAttributes.hasValue(0)) {
            googleMapOptions.t = Boolean.valueOf(obtainAttributes.getBoolean(0, false));
        }
        if (obtainAttributes.hasValue(4)) {
            googleMapOptions.c = Float.valueOf(obtainAttributes.getFloat(4, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(4)) {
            googleMapOptions.d = Float.valueOf(obtainAttributes.getFloat(3, Float.POSITIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(1)) {
            googleMapOptions.f = Integer.valueOf(obtainAttributes.getColor(1, i.intValue()));
        }
        if (obtainAttributes.hasValue(15) && (string = obtainAttributes.getString(15)) != null && !string.isEmpty()) {
            googleMapOptions.g = string;
        }
        if (obtainAttributes.hasValue(14)) {
            googleMapOptions.h = obtainAttributes.getInt(14, 0);
        }
        TypedArray obtainAttributes2 = context.getResources().obtainAttributes(attributeSet, dhbs.a);
        Float valueOf = obtainAttributes2.hasValue(11) ? Float.valueOf(obtainAttributes2.getFloat(11, 0.0f)) : null;
        Float valueOf2 = obtainAttributes2.hasValue(12) ? Float.valueOf(obtainAttributes2.getFloat(12, 0.0f)) : null;
        Float valueOf3 = obtainAttributes2.hasValue(9) ? Float.valueOf(obtainAttributes2.getFloat(9, 0.0f)) : null;
        Float valueOf4 = obtainAttributes2.hasValue(10) ? Float.valueOf(obtainAttributes2.getFloat(10, 0.0f)) : null;
        obtainAttributes2.recycle();
        if (valueOf != null && valueOf2 != null && valueOf3 != null && valueOf4 != null) {
            latLngBounds = new LatLngBounds(new LatLng(valueOf.floatValue(), valueOf2.floatValue()), new LatLng(valueOf3.floatValue(), valueOf4.floatValue()));
        }
        googleMapOptions.e = latLngBounds;
        TypedArray obtainAttributes3 = context.getResources().obtainAttributes(attributeSet, dhbs.a);
        LatLng latLng = new LatLng(obtainAttributes3.hasValue(5) ? obtainAttributes3.getFloat(5, 0.0f) : 0.0f, obtainAttributes3.hasValue(6) ? obtainAttributes3.getFloat(6, 0.0f) : 0.0f);
        dhce dhceVar = new dhce();
        dhceVar.b(latLng);
        if (obtainAttributes3.hasValue(8)) {
            dhceVar.a = obtainAttributes3.getFloat(8, 0.0f);
        }
        if (obtainAttributes3.hasValue(2)) {
            dhceVar.c = obtainAttributes3.getFloat(2, 0.0f);
        }
        if (obtainAttributes3.hasValue(7)) {
            dhceVar.b = obtainAttributes3.getFloat(7, 0.0f);
        }
        obtainAttributes3.recycle();
        googleMapOptions.b = dhceVar.a();
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        dfwp.b("MapType", Integer.valueOf(this.a), arrayList);
        dfwp.b("LiteMode", this.r, arrayList);
        dfwp.b("Camera", this.b, arrayList);
        dfwp.b("CompassEnabled", this.m, arrayList);
        dfwp.b("ZoomControlsEnabled", this.l, arrayList);
        dfwp.b("ScrollGesturesEnabled", this.n, arrayList);
        dfwp.b("ZoomGesturesEnabled", this.o, arrayList);
        dfwp.b("TiltGesturesEnabled", this.p, arrayList);
        dfwp.b("RotateGesturesEnabled", this.q, arrayList);
        dfwp.b("ScrollGesturesEnabledDuringRotateOrZoom", this.u, arrayList);
        dfwp.b("MapToolbarEnabled", this.s, arrayList);
        dfwp.b("AmbientEnabled", this.t, arrayList);
        dfwp.b("MinZoomPreference", this.c, arrayList);
        dfwp.b("MaxZoomPreference", this.d, arrayList);
        dfwp.b("BackgroundColor", this.f, arrayList);
        dfwp.b("LatLngBoundsForCameraTarget", this.e, arrayList);
        dfwp.b("ZOrderOnTop", this.j, arrayList);
        dfwp.b("UseViewLifecycleInFragment", this.k, arrayList);
        dfwp.b("mapColorScheme", Integer.valueOf(this.h), arrayList);
        return dfwp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = dfxk.a(parcel);
        dfxk.e(parcel, 2, dhbz.a(this.j));
        dfxk.e(parcel, 3, dhbz.a(this.k));
        dfxk.i(parcel, 4, this.a);
        dfxk.k(parcel, 5, this.b, i2, false);
        dfxk.e(parcel, 6, dhbz.a(this.l));
        dfxk.e(parcel, 7, dhbz.a(this.m));
        dfxk.e(parcel, 8, dhbz.a(this.n));
        dfxk.e(parcel, 9, dhbz.a(this.o));
        dfxk.e(parcel, 10, dhbz.a(this.p));
        dfxk.e(parcel, 11, dhbz.a(this.q));
        dfxk.e(parcel, 12, dhbz.a(this.r));
        dfxk.e(parcel, 14, dhbz.a(this.s));
        dfxk.e(parcel, 15, dhbz.a(this.t));
        dfxk.t(parcel, 16, this.c);
        dfxk.t(parcel, 17, this.d);
        dfxk.k(parcel, 18, this.e, i2, false);
        dfxk.e(parcel, 19, dhbz.a(this.u));
        dfxk.x(parcel, 20, this.f);
        dfxk.m(parcel, 21, this.g, false);
        dfxk.i(parcel, 23, this.h);
        dfxk.c(parcel, a);
    }

    public GoogleMapOptions(byte b, byte b2, int i2, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, Float f, Float f2, LatLngBounds latLngBounds, byte b12, Integer num, String str, int i3) {
        this.a = -1;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.j = dhbz.b(b);
        this.k = dhbz.b(b2);
        this.a = i2;
        this.b = cameraPosition;
        this.l = dhbz.b(b3);
        this.m = dhbz.b(b4);
        this.n = dhbz.b(b5);
        this.o = dhbz.b(b6);
        this.p = dhbz.b(b7);
        this.q = dhbz.b(b8);
        this.r = dhbz.b(b9);
        this.s = dhbz.b(b10);
        this.t = dhbz.b(b11);
        this.c = f;
        this.d = f2;
        this.e = latLngBounds;
        this.u = dhbz.b(b12);
        this.f = num;
        this.g = str;
        this.h = i3;
    }
}
