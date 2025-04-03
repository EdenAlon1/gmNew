package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhok;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetDocumentsCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetDocumentsCall$Request> CREATOR = new dhok();
    public String a;
    public String b;
    public String[] c;
    public QuerySpecification d;
    public Bundle e;

    public GetDocumentsCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, this.a, false);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.C(parcel, 3, this.c);
        dfxk.k(parcel, 4, this.d, i, false);
        dfxk.p(parcel, 5, this.e);
        dfxk.c(parcel, a);
    }

    public GetDocumentsCall$Request(String str, String str2, String[] strArr, QuerySpecification querySpecification, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = strArr;
        this.d = querySpecification;
        this.e = bundle;
    }
}
