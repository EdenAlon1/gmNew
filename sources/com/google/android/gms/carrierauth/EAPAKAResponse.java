package com.google.android.gms.carrierauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfkn;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class EAPAKAResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<EAPAKAResponse> CREATOR = new dfkn();
    public final String a;

    public EAPAKAResponse(String str) {
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
