package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfrl;
import defpackage.dfxk;
import defpackage.dhor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class QueryCall$Response extends AbstractSafeParcelable implements dfrl {
    public static final Parcelable.Creator<QueryCall$Response> CREATOR = new dhor();
    public Status a;
    public SearchResults b;
    public Bundle c;

    public QueryCall$Response() {
    }

    @Override // defpackage.dfrl
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, this.a, i, false);
        dfxk.k(parcel, 2, this.b, i, false);
        dfxk.p(parcel, 3, this.c);
        dfxk.c(parcel, a);
    }

    public QueryCall$Response(Status status, SearchResults searchResults, Bundle bundle) {
        this.a = status;
        this.b = searchResults;
        this.c = bundle;
    }
}
