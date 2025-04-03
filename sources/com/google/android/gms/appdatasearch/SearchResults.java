package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dewq;
import defpackage.dewr;
import defpackage.dews;
import defpackage.dfxk;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SearchResults extends AbstractSafeParcelable implements Iterable<dewq> {
    public static final Parcelable.Creator<SearchResults> CREATOR = new dews();
    final String a;
    public final int[] b;
    public final byte[] c;
    final Bundle[] d;
    public final Bundle[] e;
    public final Bundle[] f;
    public final int g;
    public final int[] h;
    public final String[] i;
    final byte[] j;
    final double[] k;
    final Bundle l;
    final int m;
    final long[] n;
    final long[] o;
    final Bundle[] p;
    final int[] q;
    final byte[] r;
    final boolean s;

    public SearchResults(String str, int[] iArr, byte[] bArr, Bundle[] bundleArr, Bundle[] bundleArr2, Bundle[] bundleArr3, int i, int[] iArr2, String[] strArr, byte[] bArr2, double[] dArr, Bundle bundle, int i2, long[] jArr, long[] jArr2, Bundle[] bundleArr4, int[] iArr3, byte[] bArr3, boolean z) {
        this.a = str;
        this.b = iArr;
        this.c = bArr;
        this.d = bundleArr;
        this.e = bundleArr2;
        this.f = bundleArr3;
        this.g = i;
        this.h = iArr2;
        this.i = strArr;
        this.j = bArr2;
        this.k = dArr;
        this.l = bundle;
        this.m = i2;
        this.n = jArr;
        this.o = jArr2;
        this.p = bundleArr4;
        this.q = iArr3;
        this.r = bArr3;
        this.s = z;
    }

    public final boolean a() {
        return this.a != null;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator<dewq> iterator() {
        return new dewr(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.v(parcel, 2, this.b);
        dfxk.f(parcel, 3, this.c, false);
        dfxk.E(parcel, 4, this.d, i);
        dfxk.E(parcel, 5, this.e, i);
        dfxk.E(parcel, 6, this.f, i);
        dfxk.i(parcel, 7, this.g);
        dfxk.v(parcel, 8, this.h);
        dfxk.C(parcel, 9, this.i);
        dfxk.f(parcel, 10, this.j, false);
        double[] dArr = this.k;
        if (dArr != null) {
            int b = dfxk.b(parcel, 11);
            parcel.writeDoubleArray(dArr);
            dfxk.c(parcel, b);
        }
        dfxk.p(parcel, 12, this.l);
        dfxk.i(parcel, 13, this.m);
        dfxk.y(parcel, 14, this.n);
        dfxk.y(parcel, 15, this.o);
        dfxk.E(parcel, 16, this.p, i);
        dfxk.v(parcel, 17, this.q);
        dfxk.f(parcel, 18, this.r, false);
        dfxk.d(parcel, 19, this.s);
        dfxk.c(parcel, a);
    }
}
