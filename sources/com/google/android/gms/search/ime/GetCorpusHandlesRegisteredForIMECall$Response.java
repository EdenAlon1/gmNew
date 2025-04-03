package com.google.android.gms.search.ime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfrl;
import defpackage.dfxk;
import defpackage.dhoa;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetCorpusHandlesRegisteredForIMECall$Response extends AbstractSafeParcelable implements dfrl {
    public static final Parcelable.Creator<GetCorpusHandlesRegisteredForIMECall$Response> CREATOR = new dhoa();
    public Status a;
    public String[] b;

    public GetCorpusHandlesRegisteredForIMECall$Response() {
    }

    @Override // defpackage.dfrl
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, this.a, i, false);
        dfxk.C(parcel, 2, this.b);
        dfxk.c(parcel, a);
    }

    public GetCorpusHandlesRegisteredForIMECall$Response(Status status, String[] strArr) {
        this.a = status;
        this.b = strArr;
    }
}
