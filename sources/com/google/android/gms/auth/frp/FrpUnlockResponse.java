package com.google.android.gms.auth.frp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfhq;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FrpUnlockResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FrpUnlockResponse> CREATOR = new dfhq();
    public final String a;

    public FrpUnlockResponse(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.c(parcel, a);
    }
}
