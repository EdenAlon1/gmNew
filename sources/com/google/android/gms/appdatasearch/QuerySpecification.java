package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dewg;
import defpackage.dfxk;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class QuerySpecification extends AbstractSafeParcelable {
    public static final Parcelable.Creator<QuerySpecification> CREATOR = new dewg();
    public final boolean a;
    public final List b;
    public final List c;
    public final boolean d;
    public final int e;
    public final int f;
    public final boolean g;
    public final int h;
    public final boolean i;
    public final int[] j;
    public final byte[] k;
    public final STSortSpec l;
    public final String m;
    public final CacheSpec n;

    public QuerySpecification(boolean z, List list, List list2, boolean z2, int i, int i2, boolean z3, int i3, boolean z4, int[] iArr, byte[] bArr, STSortSpec sTSortSpec, String str, CacheSpec cacheSpec) {
        this.a = z;
        this.b = list;
        this.c = list2;
        this.d = z2;
        this.e = i;
        this.f = i2;
        this.g = z3;
        this.h = i3;
        this.i = z4;
        this.j = iArr;
        this.k = bArr;
        this.l = sTSortSpec;
        this.m = str;
        this.n = cacheSpec;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.d(parcel, 1, this.a);
        dfxk.D(parcel, 2, this.b);
        dfxk.n(parcel, 3, this.c, false);
        dfxk.d(parcel, 4, this.d);
        dfxk.i(parcel, 5, this.e);
        dfxk.i(parcel, 6, this.f);
        dfxk.d(parcel, 7, this.g);
        dfxk.i(parcel, 8, this.h);
        dfxk.d(parcel, 9, this.i);
        dfxk.v(parcel, 10, this.j);
        dfxk.f(parcel, 11, this.k, false);
        dfxk.k(parcel, 12, this.l, i, false);
        dfxk.m(parcel, 13, this.m, false);
        dfxk.k(parcel, 15, this.n, i, false);
        dfxk.c(parcel, a);
    }
}
