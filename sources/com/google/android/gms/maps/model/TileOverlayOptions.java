package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.internal.ITileProviderDelegate;
import defpackage.dfxk;
import defpackage.dhdg;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class TileOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new dhdg();
    public boolean a;
    public float b;
    public boolean c;
    public float d;
    private ITileProviderDelegate e;

    public TileOverlayOptions() {
        this.a = true;
        this.c = true;
        this.d = 0.0f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        ITileProviderDelegate iTileProviderDelegate = this.e;
        dfxk.u(parcel, 2, iTileProviderDelegate == null ? null : iTileProviderDelegate.asBinder());
        dfxk.d(parcel, 3, this.a);
        dfxk.h(parcel, 4, this.b);
        dfxk.d(parcel, 5, this.c);
        dfxk.h(parcel, 6, this.d);
        dfxk.c(parcel, a);
    }

    public TileOverlayOptions(IBinder iBinder, boolean z, float f, boolean z2, float f2) {
        this.a = true;
        this.c = true;
        this.d = 0.0f;
        this.e = ITileProviderDelegate.Stub.asInterface(iBinder);
        this.a = z;
        this.b = f;
        this.c = z2;
        this.d = f2;
    }
}
