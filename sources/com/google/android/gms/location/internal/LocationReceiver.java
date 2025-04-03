package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.ILocationCallback;
import com.google.android.gms.location.ILocationListener;
import defpackage.dfxk;
import defpackage.dham;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LocationReceiver extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationReceiver> CREATOR = new dham();
    public final int a;
    public final IBinder b;
    public final IBinder c;
    public final PendingIntent d;
    public final String e;

    public LocationReceiver(int i, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str) {
        this.a = i;
        this.b = iBinder;
        this.c = iBinder2;
        this.d = pendingIntent;
        this.e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.IBinder, com.google.android.gms.location.ILocationCallback] */
    public static LocationReceiver a(IInterface iInterface, ILocationCallback iLocationCallback, String str) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new LocationReceiver(2, iInterface, iLocationCallback, null, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.IBinder, com.google.android.gms.location.ILocationListener] */
    public static LocationReceiver b(IInterface iInterface, ILocationListener iLocationListener, String str) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new LocationReceiver(1, iInterface, iLocationListener, null, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, i2);
        dfxk.u(parcel, 2, this.b);
        dfxk.u(parcel, 3, this.c);
        dfxk.k(parcel, 4, this.d, i, false);
        dfxk.m(parcel, 6, this.e, false);
        dfxk.c(parcel, a);
    }
}
