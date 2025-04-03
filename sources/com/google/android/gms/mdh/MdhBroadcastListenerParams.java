package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dhdq;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MdhBroadcastListenerParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MdhBroadcastListenerParams> CREATOR = new dhdq();
    public final LatestFootprintFilter a;

    public MdhBroadcastListenerParams(LatestFootprintFilter latestFootprintFilter) {
        this.a = latestFootprintFilter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MdhBroadcastListenerParams) {
            return dfwq.a(this.a, ((MdhBroadcastListenerParams) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return "MdhBroadcastListenerParams{latestFootprintFilter=" + String.valueOf(this.a) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LatestFootprintFilter latestFootprintFilter = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, latestFootprintFilter, i, false);
        dfxk.c(parcel, a);
    }
}
