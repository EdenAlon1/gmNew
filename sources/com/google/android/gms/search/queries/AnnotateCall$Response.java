package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfrl;
import defpackage.dfxk;
import defpackage.dhoi;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AnnotateCall$Response extends AbstractSafeParcelable implements dfrl {
    public static final Parcelable.Creator<AnnotateCall$Response> CREATOR = new dhoi();
    public Status a;
    public List b;
    public Bundle c;

    public AnnotateCall$Response() {
    }

    @Override // defpackage.dfrl
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, this.a, i, false);
        dfxk.n(parcel, 2, this.b, false);
        dfxk.p(parcel, 3, this.c);
        dfxk.c(parcel, a);
    }

    public AnnotateCall$Response(Status status, List list, Bundle bundle) {
        this.a = status;
        this.b = list;
        this.c = bundle;
    }
}
