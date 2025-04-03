package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;
import defpackage.dfwp;
import defpackage.dfxk;
import defpackage.dhbt;
import defpackage.dhbz;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOptions> CREATOR = new dhbt();
    public StreetViewPanoramaCamera a;
    public String b;
    public LatLng c;
    public Integer d;
    public StreetViewSource e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;

    public StreetViewPanoramaOptions() {
        this.f = true;
        this.g = true;
        this.h = true;
        this.i = true;
        this.e = StreetViewSource.a;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        dfwp.b("PanoramaId", this.b, arrayList);
        dfwp.b("Position", this.c, arrayList);
        dfwp.b("Radius", this.d, arrayList);
        dfwp.b("Source", this.e, arrayList);
        dfwp.b("StreetViewPanoramaCamera", this.a, arrayList);
        dfwp.b("UserNavigationEnabled", this.f, arrayList);
        dfwp.b("ZoomGesturesEnabled", this.g, arrayList);
        dfwp.b("PanningGesturesEnabled", this.h, arrayList);
        dfwp.b("StreetNamesEnabled", this.i, arrayList);
        dfwp.b("UseViewLifecycleInFragment", this.j, arrayList);
        return dfwp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 2, this.a, i, false);
        dfxk.m(parcel, 3, this.b, false);
        dfxk.k(parcel, 4, this.c, i, false);
        dfxk.x(parcel, 5, this.d);
        dfxk.e(parcel, 6, dhbz.a(this.f));
        dfxk.e(parcel, 7, dhbz.a(this.g));
        dfxk.e(parcel, 8, dhbz.a(this.h));
        dfxk.e(parcel, 9, dhbz.a(this.i));
        dfxk.e(parcel, 10, dhbz.a(this.j));
        dfxk.k(parcel, 11, this.e, i, false);
        dfxk.c(parcel, a);
    }

    public StreetViewPanoramaOptions(StreetViewPanoramaCamera streetViewPanoramaCamera, String str, LatLng latLng, Integer num, byte b, byte b2, byte b3, byte b4, byte b5, StreetViewSource streetViewSource) {
        this.f = true;
        this.g = true;
        this.h = true;
        this.i = true;
        this.e = StreetViewSource.a;
        this.a = streetViewPanoramaCamera;
        this.c = latLng;
        this.d = num;
        this.b = str;
        this.f = dhbz.b(b);
        this.g = dhbz.b(b2);
        this.h = dhbz.b(b3);
        this.i = dhbz.b(b4);
        this.j = dhbz.b(b5);
        this.e = streetViewSource;
    }
}
