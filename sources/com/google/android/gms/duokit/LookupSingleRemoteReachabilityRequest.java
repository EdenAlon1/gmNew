package com.google.android.gms.duokit;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dgfp;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LookupSingleRemoteReachabilityRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LookupSingleRemoteReachabilityRequest> CREATOR = new dgfp();
    public DuoId a;
    public String b;

    public LookupSingleRemoteReachabilityRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LookupSingleRemoteReachabilityRequest) {
            LookupSingleRemoteReachabilityRequest lookupSingleRemoteReachabilityRequest = (LookupSingleRemoteReachabilityRequest) obj;
            if (dfwq.a(this.a, lookupSingleRemoteReachabilityRequest.a) && dfwq.a(this.b, lookupSingleRemoteReachabilityRequest.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, this.a, i, false);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.c(parcel, a);
    }

    public LookupSingleRemoteReachabilityRequest(DuoId duoId, String str) {
        this.a = duoId;
        this.b = str;
    }
}
