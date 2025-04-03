package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import androidx.car.app.model.Alert;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.libs.identity.ClientIdentity;
import defpackage.dfwq;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dfzc;
import defpackage.dgyo;
import defpackage.dgyv;
import defpackage.dgzd;
import defpackage.dgzf;
import defpackage.dhbc;
import defpackage.eobe;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new dgyv();
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public int f;
    public float g;
    public boolean h;
    public long i;
    public final int j;
    public final int k;
    public final boolean l;
    public final WorkSource m;
    public final ClientIdentity n;

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Alert.DURATION_SHOW_INDEFINITELY, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }

    private static String d(long j) {
        String sb;
        if (j == Long.MAX_VALUE) {
            return "∞";
        }
        synchronized (dhbc.b) {
            dhbc.b.setLength(0);
            StringBuilder sb2 = dhbc.b;
            dhbc.a(j, sb2);
            sb = sb2.toString();
        }
        return sb;
    }

    public final boolean a() {
        long j = this.d;
        return j > 0 && (j >> 1) >= this.b;
    }

    public final boolean b() {
        return this.a == 105;
    }

    @Deprecated
    public final void c(long j) {
        dfwv.b(true, "intervalMillis must be greater than or equal to 0");
        long j2 = this.c;
        long j3 = this.b;
        if (j2 == j3 / 6) {
            this.c = j / 6;
        }
        if (this.i == j3) {
            this.i = j;
        }
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            boolean a = a();
            if (this.a == locationRequest.a && ((b() || this.b == locationRequest.b) && this.c == locationRequest.c && a == locationRequest.a() && ((!a || this.d == locationRequest.d) && this.e == locationRequest.e && this.f == locationRequest.f && this.g == locationRequest.g && this.h == locationRequest.h && this.j == locationRequest.j && this.k == locationRequest.k && this.l == locationRequest.l && this.m.equals(locationRequest.m) && dfwq.a(this.n, locationRequest.n)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), this.m});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        if (b()) {
            sb.append(dgzd.a(this.a));
            if (this.d > 0) {
                sb.append("/");
                dhbc.a(this.d, sb);
            }
        } else {
            sb.append("@");
            if (a()) {
                dhbc.a(this.b, sb);
                sb.append("/");
                dhbc.a(this.d, sb);
            } else {
                dhbc.a(this.b, sb);
            }
            sb.append(" ");
            sb.append(dgzd.a(this.a));
        }
        if (b() || this.c != this.b) {
            sb.append(", minUpdateInterval=");
            sb.append(d(this.c));
        }
        if (this.g > eobe.a) {
            sb.append(", minUpdateDistance=");
            sb.append(this.g);
        }
        if (!b() ? this.i != this.b : this.i != Long.MAX_VALUE) {
            sb.append(", maxUpdateAge=");
            sb.append(d(this.i));
        }
        if (this.e != Long.MAX_VALUE) {
            sb.append(", duration=");
            dhbc.a(this.e, sb);
        }
        if (this.f != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=");
            sb.append(this.f);
        }
        if (this.k != 0) {
            sb.append(", ");
            sb.append(dgzf.a(this.k));
        }
        if (this.j != 0) {
            sb.append(", ");
            sb.append(dgyo.a(this.j));
        }
        if (this.h) {
            sb.append(", waitForAccurateLocation");
        }
        if (this.l) {
            sb.append(", bypass");
        }
        if (!dfzc.c(this.m)) {
            sb.append(", ");
            sb.append(this.m);
        }
        if (this.n != null) {
            sb.append(", impersonation=");
            sb.append(this.n);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.j(parcel, 2, this.b);
        dfxk.j(parcel, 3, this.c);
        dfxk.i(parcel, 6, this.f);
        dfxk.h(parcel, 7, this.g);
        dfxk.j(parcel, 8, this.d);
        dfxk.d(parcel, 9, this.h);
        dfxk.j(parcel, 10, this.e);
        dfxk.j(parcel, 11, this.i);
        dfxk.i(parcel, 12, this.j);
        dfxk.i(parcel, 13, this.k);
        dfxk.d(parcel, 15, this.l);
        dfxk.k(parcel, 16, this.m, i, false);
        dfxk.k(parcel, 17, this.n, i, false);
        dfxk.c(parcel, a);
    }

    public LocationRequest(int i, long j, long j2, long j3, long j4, long j5, int i2, float f, boolean z, long j6, int i3, int i4, boolean z2, WorkSource workSource, ClientIdentity clientIdentity) {
        this.a = i;
        if (i == 105) {
            this.b = Long.MAX_VALUE;
        } else {
            this.b = j;
        }
        this.c = j2;
        this.d = j3;
        this.e = j4 == Long.MAX_VALUE ? j5 : Math.min(Math.max(1L, j4 - SystemClock.elapsedRealtime()), j5);
        this.f = i2;
        this.g = f;
        this.h = z;
        this.i = j6 != -1 ? j6 : j;
        this.j = i3;
        this.k = i4;
        this.l = z2;
        this.m = workSource;
        this.n = clientIdentity;
    }
}
