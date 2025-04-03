package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.dfxk;
import defpackage.dhcc;
import defpackage.dhcx;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class StampStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StampStyle> CREATOR = new dhcx();
    protected final dhcc a;

    public StampStyle(IBinder iBinder) {
        this.a = new dhcc(IObjectWrapper.Stub.asInterface(iBinder));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.u(parcel, 2, this.a.a.asBinder());
        dfxk.c(parcel, a);
    }
}
