package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhzd;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ConnectionDelayConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionDelayConfig> CREATOR = new dhzd();
    public final long a;
    public final long b;

    public ConnectionDelayConfig(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = dfxk.a(parcel);
        dfxk.j(parcel, 1, j);
        dfxk.j(parcel, 2, this.b);
        dfxk.c(parcel, a);
    }
}
