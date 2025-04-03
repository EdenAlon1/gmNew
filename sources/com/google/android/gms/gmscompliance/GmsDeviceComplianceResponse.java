package com.google.android.gms.gmscompliance;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dgln;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GmsDeviceComplianceResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GmsDeviceComplianceResponse> CREATOR = new dgln();
    final int a;
    public boolean b;
    public PendingIntent c;
    public boolean d;
    public long e;
    public byte[] f;

    public GmsDeviceComplianceResponse(int i, boolean z, PendingIntent pendingIntent, boolean z2, long j, byte[] bArr) {
        this.a = i;
        this.b = z;
        this.c = pendingIntent;
        this.d = z2;
        this.e = j;
        this.f = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.d(parcel, 2, this.b);
        dfxk.k(parcel, 3, this.c, i, false);
        dfxk.d(parcel, 4, this.d);
        dfxk.j(parcel, 5, this.e);
        dfxk.f(parcel, 6, this.f, false);
        dfxk.c(parcel, a);
    }

    public GmsDeviceComplianceResponse() {
        this(1, true, null, false, 0L, null);
    }
}
