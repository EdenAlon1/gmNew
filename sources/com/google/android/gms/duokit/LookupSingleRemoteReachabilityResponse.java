package com.google.android.gms.duokit;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dgfq;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LookupSingleRemoteReachabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LookupSingleRemoteReachabilityResponse> CREATOR = new dgfq();
    public RemoteUserReachability a;

    public LookupSingleRemoteReachabilityResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LookupSingleRemoteReachabilityResponse) {
            return dfwq.a(this.a, ((LookupSingleRemoteReachabilityResponse) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, this.a, i, false);
        dfxk.c(parcel, a);
    }

    public LookupSingleRemoteReachabilityResponse(RemoteUserReachability remoteUserReachability) {
        this.a = remoteUserReachability;
    }
}
