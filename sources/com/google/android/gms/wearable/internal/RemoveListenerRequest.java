package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.internal.IWearableListener;
import defpackage.dfxk;
import defpackage.diev;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RemoveListenerRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoveListenerRequest> CREATOR = new diev();
    final int a;
    public final IWearableListener b;

    public RemoveListenerRequest(int i, IBinder iBinder) {
        this.a = i;
        this.b = iBinder != null ? IWearableListener.Stub.asInterface(iBinder) : null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        IWearableListener iWearableListener = this.b;
        dfxk.u(parcel, 2, iWearableListener == null ? null : iWearableListener.asBinder());
        dfxk.c(parcel, a);
    }
}
