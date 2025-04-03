package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dhzc;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ConnectionConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ConnectionConfiguration> CREATOR = new dhzc();
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public volatile String g;
    public final boolean h;
    public final String i;
    public final String j;
    public final int k;
    public final List l;
    public final boolean m;
    public final boolean n;
    public final ConnectionRestrictions o;
    public final boolean p;
    public final ConnectionDelayFilters q;
    public final int r;
    public final int s;

    public ConnectionConfiguration(String str, String str2, int i, int i2, boolean z, boolean z2, String str3, boolean z3, String str4, String str5, int i3, List list, boolean z4, boolean z5, ConnectionRestrictions connectionRestrictions, boolean z6, ConnectionDelayFilters connectionDelayFilters, int i4, int i5) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = z2;
        this.g = str3;
        this.h = z3;
        this.i = str4;
        this.j = str5;
        this.k = i3;
        this.l = list;
        this.m = z4;
        this.n = z5;
        this.o = connectionRestrictions;
        this.p = z6;
        this.q = connectionDelayFilters;
        this.r = i4;
        this.s = i5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectionConfiguration)) {
            return false;
        }
        ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
        return dfwq.a(this.a, connectionConfiguration.a) && dfwq.a(this.b, connectionConfiguration.b) && dfwq.a(Integer.valueOf(this.c), Integer.valueOf(connectionConfiguration.c)) && dfwq.a(Integer.valueOf(this.d), Integer.valueOf(connectionConfiguration.d)) && dfwq.a(Boolean.valueOf(this.e), Boolean.valueOf(connectionConfiguration.e)) && dfwq.a(Boolean.valueOf(this.h), Boolean.valueOf(connectionConfiguration.h)) && dfwq.a(Boolean.valueOf(this.m), Boolean.valueOf(connectionConfiguration.m)) && dfwq.a(Boolean.valueOf(this.n), Boolean.valueOf(connectionConfiguration.n));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.h), Boolean.valueOf(this.m), Boolean.valueOf(this.n)});
    }

    public final String toString() {
        return "ConnectionConfiguration[ Name=" + this.a + ", Address=" + this.b + ", Type=" + this.c + ", Role=" + this.d + ", Enabled=" + this.e + ", IsConnected=" + this.f + ", PeerNodeId=" + this.g + ", BtlePriority=" + this.h + ", NodeId=" + this.i + ", PackageName=" + this.j + ", ConnectionRetryStrategy=" + this.k + ", allowedConfigPackages=" + this.l + ", Migrating=" + this.m + ", DataItemSyncEnabled=" + this.n + ", ConnectionRestrictions=" + this.o + ", removeConnectionWhenBondRemovedByUser=" + this.p + ", maxSupportedRemoteAndroidSdkVersion=" + this.r + ", runtimeType=" + this.s + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 2, str, false);
        dfxk.m(parcel, 3, this.b, false);
        dfxk.i(parcel, 4, this.c);
        dfxk.i(parcel, 5, this.d);
        dfxk.d(parcel, 6, this.e);
        dfxk.d(parcel, 7, this.f);
        dfxk.m(parcel, 8, this.g, false);
        dfxk.d(parcel, 9, this.h);
        dfxk.m(parcel, 10, this.i, false);
        dfxk.m(parcel, 11, this.j, false);
        dfxk.i(parcel, 12, this.k);
        dfxk.D(parcel, 13, this.l);
        dfxk.d(parcel, 14, this.m);
        dfxk.d(parcel, 15, this.n);
        dfxk.k(parcel, 16, this.o, i, false);
        dfxk.d(parcel, 17, this.p);
        dfxk.k(parcel, 18, this.q, i, false);
        dfxk.i(parcel, 19, this.r);
        dfxk.i(parcel, 20, this.s);
        dfxk.c(parcel, a);
    }
}
