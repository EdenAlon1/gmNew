package com.google.android.gms.duokit;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dgfw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SetupDuoResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SetupDuoResponse> CREATOR = new dgfw();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof SetupDuoResponse);
    }

    public final int hashCode() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dfxk.c(parcel, dfxk.a(parcel));
    }
}
