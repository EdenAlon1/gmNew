package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dgyk;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DeviceOrientationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceOrientationRequest> CREATOR = new dgyk();
    public final long a;
    public final boolean b;

    public DeviceOrientationRequest(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceOrientationRequest)) {
            return false;
        }
        DeviceOrientationRequest deviceOrientationRequest = (DeviceOrientationRequest) obj;
        return this.a == deviceOrientationRequest.a && this.b == deviceOrientationRequest.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Boolean.valueOf(this.b)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceOrientationRequest[samplingPeriodMicros=");
        sb.append(this.a);
        sb.append(true != this.b ? "" : ", withVelocity");
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = dfxk.a(parcel);
        dfxk.j(parcel, 2, j);
        dfxk.d(parcel, 6, this.b);
        dfxk.c(parcel, a);
    }
}
