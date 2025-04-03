package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfrl;
import defpackage.dfxk;
import defpackage.dhni;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RegisterCorpusInfoCall$Response extends AbstractSafeParcelable implements dfrl {
    public static final Parcelable.Creator<RegisterCorpusInfoCall$Response> CREATOR = new dhni();
    public Status a;
    public boolean b;

    public RegisterCorpusInfoCall$Response() {
    }

    @Override // defpackage.dfrl
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, this.a, i, false);
        dfxk.d(parcel, 2, this.b);
        dfxk.c(parcel, a);
    }

    public RegisterCorpusInfoCall$Response(Status status, boolean z) {
        this.a = status;
        this.b = z;
    }
}
