package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.DocumentResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfrl;
import defpackage.dfxk;
import defpackage.dhol;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetDocumentsCall$Response extends AbstractSafeParcelable implements dfrl {
    public static final Parcelable.Creator<GetDocumentsCall$Response> CREATOR = new dhol();
    public Status a;
    public DocumentResults b;
    public Bundle c;

    public GetDocumentsCall$Response() {
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

    public GetDocumentsCall$Response(Status status, DocumentResults documentResults, Bundle bundle) {
        this.a = status;
        this.b = documentResults;
        this.c = bundle;
    }
}
