package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfrl;
import defpackage.dfxk;
import defpackage.dhop;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GlobalQueryCall$Response extends AbstractSafeParcelable implements dfrl {
    public static final Parcelable.Creator<GlobalQueryCall$Response> CREATOR = new dhop();
    public Status a;
    public SearchResults b;
    public Bundle c;

    public GlobalQueryCall$Response() {
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

    public GlobalQueryCall$Response(Status status, SearchResults searchResults, Bundle bundle) {
        this.a = status;
        this.b = searchResults;
        this.c = bundle;
    }
}
