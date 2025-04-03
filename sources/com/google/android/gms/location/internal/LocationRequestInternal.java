package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dfzc;
import defpackage.dgyu;
import defpackage.dhan;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class LocationRequestInternal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationRequestInternal> CREATOR = new dhan();
    LocationRequest a;

    public LocationRequestInternal(LocationRequest locationRequest, List list, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        WorkSource workSource;
        dgyu dgyuVar = new dgyu(locationRequest);
        if (list != null) {
            if (list.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ClientIdentity clientIdentity = (ClientIdentity) it.next();
                    dfzc.a(workSource, clientIdentity.a, clientIdentity.b);
                }
            }
            dgyuVar.c = workSource;
        }
        if (z) {
            dgyuVar.c(1);
        }
        if (z2) {
            dgyuVar.g(2);
        }
        if (z3) {
            dgyuVar.b = true;
        }
        if (z4) {
            dgyuVar.a = true;
        }
        if (j != Long.MAX_VALUE) {
            dgyuVar.d(j);
        }
        this.a = dgyuVar.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequestInternal) {
            return dfwq.a(this.a, ((LocationRequestInternal) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, this.a, i, false);
        dfxk.c(parcel, a);
    }
}
