package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhxv;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class WarmUpUiProcessRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WarmUpUiProcessRequest> CREATOR = new dhxv();
    long a;

    public WarmUpUiProcessRequest(long j) {
        this.a = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.j(parcel, 1, this.a);
        dfxk.c(parcel, a);
    }

    public WarmUpUiProcessRequest() {
        this(SystemClock.elapsedRealtime());
    }
}
