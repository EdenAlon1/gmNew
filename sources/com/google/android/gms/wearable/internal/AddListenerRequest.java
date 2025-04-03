package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.internal.IWearableListener;
import defpackage.dfxk;
import defpackage.dibc;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AddListenerRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AddListenerRequest> CREATOR = new dibc();
    public final IWearableListener a;
    public final IntentFilter[] b;
    public final String c;
    public final String d;

    public AddListenerRequest(IBinder iBinder, IntentFilter[] intentFilterArr, String str, String str2) {
        this.a = iBinder != null ? IWearableListener.Stub.asInterface(iBinder) : null;
        this.b = intentFilterArr;
        this.c = str;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IWearableListener iWearableListener = this.a;
        int a = dfxk.a(parcel);
        dfxk.u(parcel, 2, iWearableListener == null ? null : iWearableListener.asBinder());
        dfxk.E(parcel, 3, this.b, i);
        dfxk.m(parcel, 4, this.c, false);
        dfxk.m(parcel, 5, this.d, false);
        dfxk.c(parcel, a);
    }

    public AddListenerRequest(WearableListenerStubImpl wearableListenerStubImpl) {
        this.a = wearableListenerStubImpl;
        this.b = wearableListenerStubImpl.getFilters();
        this.c = wearableListenerStubImpl.getChannelToken();
        this.d = null;
    }
}
