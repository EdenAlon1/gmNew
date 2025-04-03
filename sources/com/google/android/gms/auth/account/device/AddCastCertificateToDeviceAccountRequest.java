package com.google.android.gms.auth.account.device;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfax;
import defpackage.dfwv;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AddCastCertificateToDeviceAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AddCastCertificateToDeviceAccountRequest> CREATOR = new dfax();
    public final String a;
    public final byte[][] b;

    public AddCastCertificateToDeviceAccountRequest(String str, byte[][] bArr) {
        dfwv.l(str);
        this.a = str;
        dfwv.n(bArr);
        this.b = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.q(parcel, 2, this.b);
        dfxk.c(parcel, a);
    }
}
