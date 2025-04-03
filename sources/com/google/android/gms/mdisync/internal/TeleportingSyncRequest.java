package com.google.android.gms.mdisync.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.mdisync.internal.SyncRequest;
import com.google.android.gms.mdisync.internal.TeleportingSyncRequest;
import defpackage.dheu;
import defpackage.dhfz;
import defpackage.dhga;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class TeleportingSyncRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TeleportingSyncRequest> CREATOR = new dhga(new dheu());
    public final SyncRequest a;

    public TeleportingSyncRequest(SyncRequest syncRequest) {
        this.a = syncRequest;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, final int i) {
        dhga.a(this, parcel, new dhfz() { // from class: dhet
            @Override // defpackage.dhfz
            public final void a(SafeParcelable safeParcelable, Parcel parcel2) {
                SyncRequest syncRequest = ((TeleportingSyncRequest) safeParcelable).a;
                int i2 = i;
                int a = dfxk.a(parcel2);
                dfxk.k(parcel2, 1, syncRequest, i2, false);
                dfxk.c(parcel2, a);
            }
        });
    }
}
