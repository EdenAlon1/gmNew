package com.google.android.gms.kids;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dgsi;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class EnsureSupervisionSetupRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<EnsureSupervisionSetupRequest> CREATOR = new dgsi();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof EnsureSupervisionSetupRequest);
    }

    public final int hashCode() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dfxk.c(parcel, dfxk.a(parcel));
    }
}
