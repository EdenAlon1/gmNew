package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfrl;
import defpackage.dfxk;
import defpackage.dhng;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetCorpusStatusCall$Response extends AbstractSafeParcelable implements dfrl {
    public static final Parcelable.Creator<GetCorpusStatusCall$Response> CREATOR = new dhng();
    public Status a;
    public CorpusStatus b;

    public GetCorpusStatusCall$Response() {
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
        dfxk.c(parcel, a);
    }

    public GetCorpusStatusCall$Response(Status status, CorpusStatus corpusStatus) {
        this.a = status;
        this.b = corpusStatus;
    }
}
