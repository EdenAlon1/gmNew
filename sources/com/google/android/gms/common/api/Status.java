package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfqw;
import defpackage.dfrl;
import defpackage.dfro;
import defpackage.dfwp;
import defpackage.dfwq;
import defpackage.dfxk;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class Status extends AbstractSafeParcelable implements ReflectedParcelable, dfrl {
    public final int f;
    public final String g;
    public final PendingIntent h;
    public final ConnectionResult i;
    public static final Status a = new Status(0);
    public static final Status b = new Status(14);
    public static final Status c = new Status(8);
    public static final Status d = new Status(15);
    public static final Status e = new Status(16);
    public static final Parcelable.Creator<Status> CREATOR = new dfro();

    public Status(int i, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f = i;
        this.g = str;
        this.h = pendingIntent;
        this.i = connectionResult;
    }

    public final String b() {
        String str = this.g;
        return str != null ? str : dfqw.a(this.f);
    }

    public final boolean c() {
        return this.h != null;
    }

    public final boolean d() {
        return this.f <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f == status.f && dfwq.a(this.g, status.g) && dfwq.a(this.h, status.h) && dfwq.a(this.i, status.i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f), this.g, this.h, this.i});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        dfwp.b("statusCode", b(), arrayList);
        dfwp.b("resolution", this.h, arrayList);
        return dfwp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.f;
        int a2 = dfxk.a(parcel);
        dfxk.i(parcel, 1, i2);
        dfxk.m(parcel, 2, this.g, false);
        dfxk.k(parcel, 3, this.h, i, false);
        dfxk.k(parcel, 4, this.i, i, false);
        dfxk.c(parcel, a2);
    }

    public Status(int i) {
        this(i, (String) null);
    }

    public Status(ConnectionResult connectionResult, String str) {
        this(17, str, connectionResult.d, connectionResult);
    }

    public Status(int i, String str) {
        this(i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(i, str, pendingIntent, null);
    }

    @Override // defpackage.dfrl
    public final Status a() {
        return this;
    }
}
