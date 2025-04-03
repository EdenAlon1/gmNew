package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.devs;
import defpackage.dfrl;
import defpackage.dfxk;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetRecentContextCall$Response extends AbstractSafeParcelable implements dfrl {
    public static final Parcelable.Creator<GetRecentContextCall$Response> CREATOR = new devs();
    public Status a;
    public List b;

    @Deprecated
    public String[] c;

    public GetRecentContextCall$Response() {
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
        dfxk.C(parcel, 3, this.c);
        dfxk.c(parcel, a);
    }

    public GetRecentContextCall$Response(Status status, List list, String[] strArr) {
        this.a = status;
        this.b = list;
        this.c = strArr;
    }
}
