package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfrl;
import defpackage.dfxk;
import defpackage.dhnv;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SetExperimentIdsCall$Response extends AbstractSafeParcelable implements dfrl {
    public static final Parcelable.Creator<SetExperimentIdsCall$Response> CREATOR = new dhnv();
    public Status a;

    public SetExperimentIdsCall$Response() {
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

    public SetExperimentIdsCall$Response(Status status) {
        this.a = status;
    }
}
