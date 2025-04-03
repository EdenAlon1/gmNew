package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhoq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class QueryCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<QueryCall$Request> CREATOR = new dhoq();
    public String a;
    public String b;
    public String[] c;
    public int d;
    public int e;
    public QuerySpecification f;
    public Bundle g;

    public QueryCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, this.a, false);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.C(parcel, 3, this.c);
        dfxk.i(parcel, 4, this.d);
        dfxk.i(parcel, 5, this.e);
        dfxk.k(parcel, 6, this.f, i, false);
        dfxk.p(parcel, 7, this.g);
        dfxk.c(parcel, a);
    }

    public QueryCall$Request(String str, String str2, String[] strArr, int i, int i2, QuerySpecification querySpecification, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = strArr;
        this.d = i;
        this.e = i2;
        this.f = querySpecification;
        this.g = bundle;
    }
}
