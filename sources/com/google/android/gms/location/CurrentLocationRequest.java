package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.libs.identity.ClientIdentity;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dfzc;
import defpackage.dgyh;
import defpackage.dgyo;
import defpackage.dgzd;
import defpackage.dgzf;
import defpackage.dhbc;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CurrentLocationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CurrentLocationRequest> CREATOR = new dgyh();
    public final long a;
    public final int b;
    public final int c;
    public final long d;
    public final boolean e;
    public final int f;
    public final WorkSource g;
    public final ClientIdentity h;

    public CurrentLocationRequest(long j, int i, int i2, long j2, boolean z, int i3, WorkSource workSource, ClientIdentity clientIdentity) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = j2;
        this.e = z;
        this.f = i3;
        this.g = workSource;
        this.h = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CurrentLocationRequest)) {
            return false;
        }
        CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) obj;
        return this.a == currentLocationRequest.a && this.b == currentLocationRequest.b && this.c == currentLocationRequest.c && this.d == currentLocationRequest.d && this.e == currentLocationRequest.e && this.f == currentLocationRequest.f && dfwq.a(this.g, currentLocationRequest.g) && dfwq.a(this.h, currentLocationRequest.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Long.valueOf(this.d)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CurrentLocationRequest[");
        sb.append(dgzd.a(this.c));
        if (this.a != Long.MAX_VALUE) {
            sb.append(", maxAge=");
            dhbc.a(this.a, sb);
        }
        if (this.d != Long.MAX_VALUE) {
            sb.append(", duration=");
            sb.append(this.d);
            sb.append("ms");
        }
        if (this.b != 0) {
            sb.append(", ");
            sb.append(dgyo.a(this.b));
        }
        if (this.e) {
            sb.append(", bypass");
        }
        if (this.f != 0) {
            sb.append(", ");
            sb.append(dgzf.a(this.f));
        }
        if (!dfzc.c(this.g)) {
            sb.append(", workSource=");
            sb.append(this.g);
        }
        if (this.h != null) {
            sb.append(", impersonation=");
            sb.append(this.h);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = dfxk.a(parcel);
        dfxk.j(parcel, 1, j);
        dfxk.i(parcel, 2, this.b);
        dfxk.i(parcel, 3, this.c);
        dfxk.j(parcel, 4, this.d);
        dfxk.d(parcel, 5, this.e);
        dfxk.k(parcel, 6, this.g, i, false);
        dfxk.i(parcel, 7, this.f);
        dfxk.k(parcel, 9, this.h, i, false);
        dfxk.c(parcel, a);
    }
}
