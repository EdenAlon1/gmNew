package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.ILocationCallback;
import com.google.android.gms.location.ILocationListener;
import com.google.android.gms.location.internal.IFusedLocationProviderCallback;
import defpackage.dfxk;
import defpackage.dhao;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class LocationRequestUpdateData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationRequestUpdateData> CREATOR = new dhao();
    public final int a;
    public final LocationRequestInternal b;
    public final PendingIntent c;
    public final String d;
    private final ILocationListener e;
    private final ILocationCallback f;
    private final IFusedLocationProviderCallback g;

    public LocationRequestUpdateData(int i, LocationRequestInternal locationRequestInternal, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        this.a = i;
        this.b = locationRequestInternal;
        this.e = iBinder != null ? ILocationListener.Stub.asInterface(iBinder) : null;
        this.c = pendingIntent;
        this.f = iBinder2 != null ? ILocationCallback.Stub.asInterface(iBinder2) : null;
        this.g = iBinder3 != null ? IFusedLocationProviderCallback.Stub.asInterface(iBinder3) : null;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, i2);
        dfxk.k(parcel, 2, this.b, i, false);
        ILocationListener iLocationListener = this.e;
        dfxk.u(parcel, 3, iLocationListener == null ? null : iLocationListener.asBinder());
        dfxk.k(parcel, 4, this.c, i, false);
        ILocationCallback iLocationCallback = this.f;
        dfxk.u(parcel, 5, iLocationCallback == null ? null : iLocationCallback.asBinder());
        IFusedLocationProviderCallback iFusedLocationProviderCallback = this.g;
        dfxk.u(parcel, 6, iFusedLocationProviderCallback != null ? iFusedLocationProviderCallback.asBinder() : null);
        dfxk.m(parcel, 8, this.d, false);
        dfxk.c(parcel, a);
    }
}
