package com.google.android.gms.appdatasearch.internal;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Response;
import com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks;
import com.google.android.gms.common.api.Status;
import defpackage.dfup;
import defpackage.dhri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConnectionlessLightweightAppDataSearchCallbacks<T> extends ILightweightAppDataSearchCallbacks.Stub {
    private final dhri a;

    public ConnectionlessLightweightAppDataSearchCallbacks(dhri<T> dhriVar) {
        this.a = dhriVar;
    }

    @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks
    public void onFileDescriptor(Status status, ParcelFileDescriptor parcelFileDescriptor) {
        dfup.b(status, parcelFileDescriptor, this.a);
    }

    @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks
    public void onGetRecentContextResponse(GetRecentContextCall$Response getRecentContextCall$Response) {
        dfup.b(getRecentContextCall$Response.a, getRecentContextCall$Response.b, this.a);
    }

    @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks
    public void onStatus(Status status) {
        dfup.b(status, null, this.a);
    }
}
