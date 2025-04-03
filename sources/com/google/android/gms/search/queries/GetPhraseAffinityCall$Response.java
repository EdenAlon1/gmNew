package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.PhraseAffinityResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfrl;
import defpackage.dfxk;
import defpackage.dhon;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetPhraseAffinityCall$Response extends AbstractSafeParcelable implements dfrl {
    public static final Parcelable.Creator<GetPhraseAffinityCall$Response> CREATOR = new dhon();
    public Status a;
    public PhraseAffinityResponse b;
    public Bundle c;

    public GetPhraseAffinityCall$Response() {
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

    public GetPhraseAffinityCall$Response(Status status, PhraseAffinityResponse phraseAffinityResponse, Bundle bundle) {
        this.a = status;
        this.b = phraseAffinityResponse;
        this.c = bundle;
    }
}
