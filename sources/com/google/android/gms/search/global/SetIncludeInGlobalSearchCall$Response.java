package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfrl;
import defpackage.dfxk;
import defpackage.dhnx;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SetIncludeInGlobalSearchCall$Response extends AbstractSafeParcelable implements dfrl {
    public static final Parcelable.Creator<SetIncludeInGlobalSearchCall$Response> CREATOR = new dhnx();
    public Status a;

    public SetIncludeInGlobalSearchCall$Response() {
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

    public SetIncludeInGlobalSearchCall$Response(Status status) {
        this.a = status;
    }
}
