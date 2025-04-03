package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfrl;
import defpackage.dfxk;
import defpackage.dhne;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetCorpusInfoCall$Response extends AbstractSafeParcelable implements dfrl {
    public static final Parcelable.Creator<GetCorpusInfoCall$Response> CREATOR = new dhne();
    public Status a;
    public RegisterCorpusInfo b;

    public GetCorpusInfoCall$Response() {
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

    public GetCorpusInfoCall$Response(Status status, RegisterCorpusInfo registerCorpusInfo) {
        this.a = status;
        this.b = registerCorpusInfo;
    }
}
