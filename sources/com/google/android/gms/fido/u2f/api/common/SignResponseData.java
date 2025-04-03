package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfwq;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dglk;
import defpackage.emwz;
import defpackage.emxa;
import defpackage.eoeg;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class SignResponseData extends ResponseData {
    public static final Parcelable.Creator<SignResponseData> CREATOR = new dglk();
    public final byte[] a;
    public final String b;
    public final byte[] c;
    public final byte[] d;

    public SignResponseData(byte[] bArr, String str, byte[] bArr2, byte[] bArr3) {
        dfwv.n(bArr);
        this.a = bArr;
        dfwv.n(str);
        this.b = str;
        dfwv.n(bArr2);
        this.c = bArr2;
        dfwv.n(bArr3);
        this.d = bArr3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignResponseData)) {
            return false;
        }
        SignResponseData signResponseData = (SignResponseData) obj;
        return Arrays.equals(this.a, signResponseData.a) && dfwq.a(this.b, signResponseData.b) && Arrays.equals(this.c, signResponseData.c) && Arrays.equals(this.d, signResponseData.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b, Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.d))});
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("keyHandle", eoeg.h.j(this.a));
        b.b("clientDataString", this.b);
        b.b("signatureData", eoeg.h.j(this.c));
        b.b("application", eoeg.h.j(this.d));
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = dfxk.a(parcel);
        dfxk.f(parcel, 2, bArr, false);
        dfxk.m(parcel, 3, this.b, false);
        dfxk.f(parcel, 4, this.c, false);
        dfxk.f(parcel, 5, this.d, false);
        dfxk.c(parcel, a);
    }
}
