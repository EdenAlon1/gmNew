package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfrl;
import defpackage.dfxk;
import defpackage.dhna;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ClearCorpusCall$Response extends AbstractSafeParcelable implements dfrl {
    public static final Parcelable.Creator<ClearCorpusCall$Response> CREATOR = new dhna();
    public Status a;

    public ClearCorpusCall$Response() {
    }

    @Override // defpackage.dfrl
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, this.a, i, false);
        dfxk.c(parcel, a);
    }

    public ClearCorpusCall$Response(Status status) {
        this.a = status;
    }
}
