package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhcv;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PolylineOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolylineOptions> CREATOR = new dhcv();
    public final List a;
    public float b;
    public int c;
    public float d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public List i;
    private Cap j;
    private Cap k;
    private List l;

    public PolylineOptions() {
        this.b = 10.0f;
        this.c = -16777216;
        this.d = 0.0f;
        this.e = true;
        this.f = false;
        this.g = false;
        this.j = new ButtCap();
        this.k = new ButtCap();
        this.h = 0;
        this.i = null;
        this.l = new ArrayList();
        this.a = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = dfxk.a(parcel);
        dfxk.n(parcel, 2, list, false);
        dfxk.h(parcel, 3, this.b);
        dfxk.i(parcel, 4, this.c);
        dfxk.h(parcel, 5, this.d);
        dfxk.d(parcel, 6, this.e);
        dfxk.d(parcel, 7, this.f);
        dfxk.d(parcel, 8, this.g);
        dfxk.k(parcel, 9, this.j.a(), i, false);
        dfxk.k(parcel, 10, this.k.a(), i, false);
        dfxk.i(parcel, 11, this.h);
        dfxk.n(parcel, 12, this.i, false);
        ArrayList arrayList = new ArrayList(this.l.size());
        for (StyleSpan styleSpan : this.l) {
            StrokeStyle strokeStyle = styleSpan.a;
            float f = strokeStyle.a;
            Pair pair = new Pair(Integer.valueOf(strokeStyle.b), Integer.valueOf(strokeStyle.c));
            int intValue = ((Integer) pair.first).intValue();
            int intValue2 = ((Integer) pair.second).intValue();
            boolean z = strokeStyle.d;
            arrayList.add(new StyleSpan(new StrokeStyle(this.b, intValue, intValue2, this.e, strokeStyle.e), styleSpan.b));
        }
        dfxk.n(parcel, 13, arrayList, false);
        dfxk.c(parcel, a);
    }

    public PolylineOptions(List list, float f, int i, float f2, boolean z, boolean z2, boolean z3, Cap cap, Cap cap2, int i2, List list2, List list3) {
        this.b = 10.0f;
        this.c = -16777216;
        this.d = 0.0f;
        this.e = true;
        this.f = false;
        this.g = false;
        this.j = new ButtCap();
        this.k = new ButtCap();
        this.h = 0;
        this.i = null;
        this.l = new ArrayList();
        this.a = list;
        this.b = f;
        this.c = i;
        this.d = f2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        if (cap != null) {
            this.j = cap;
        }
        if (cap2 != null) {
            this.k = cap2;
        }
        this.h = i2;
        this.i = list2;
        if (list3 != null) {
            this.l = list3;
        }
    }
}
