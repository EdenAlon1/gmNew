package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.diez;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RpcResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RpcResponse> CREATOR = new diez();
    public final int a;
    public final int b;
    public final byte[] c;

    public RpcResponse(int i, int i2, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.i(parcel, 2, this.b);
        dfxk.f(parcel, 3, this.c, false);
        dfxk.c(parcel, a);
    }
}
