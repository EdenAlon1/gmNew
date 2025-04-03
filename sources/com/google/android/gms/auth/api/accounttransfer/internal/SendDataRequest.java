package com.google.android.gms.auth.api.accounttransfer.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfbo;
import defpackage.dfwv;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SendDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SendDataRequest> CREATOR = new dfbo();
    public final String a;
    public final byte[] b;

    public SendDataRequest(String str, byte[] bArr) {
        dfwv.n(str);
        this.a = str;
        dfwv.n(bArr);
        this.b = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, 1);
        dfxk.m(parcel, 2, this.a, false);
        dfxk.f(parcel, 3, this.b, false);
        dfxk.c(parcel, a);
    }
}
