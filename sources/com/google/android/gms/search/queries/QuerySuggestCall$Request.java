package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.SuggestSpecification;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhos;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class QuerySuggestCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<QuerySuggestCall$Request> CREATOR = new dhos();
    public String a;
    public String b;
    public String[] c;
    public int d;
    public SuggestSpecification e;
    public Bundle f;

    public QuerySuggestCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, this.a, false);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.C(parcel, 3, this.c);
        dfxk.i(parcel, 4, this.d);
        dfxk.k(parcel, 5, this.e, i, false);
        dfxk.p(parcel, 6, this.f);
        dfxk.c(parcel, a);
    }

    public QuerySuggestCall$Request(String str, String str2, String[] strArr, int i, SuggestSpecification suggestSpecification, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = strArr;
        this.d = i;
        this.e = suggestSpecification;
        this.f = bundle;
    }
}
