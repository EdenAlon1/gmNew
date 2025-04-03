package com.google.android.gms.constellation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dfzu;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetIidTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetIidTokenRequest> CREATOR = new dfzu();
    public final Long a;

    public GetIidTokenRequest(Long l) {
        this.a = l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.a;
        int a = dfxk.a(parcel);
        dfxk.A(parcel, 1, l);
        dfxk.c(parcel, a);
    }
}
