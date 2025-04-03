package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dgle;
import defpackage.dglh;
import defpackage.emwz;
import defpackage.emxa;
import defpackage.eoeg;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class RegisterResponseData extends ResponseData {
    public static final Parcelable.Creator<RegisterResponseData> CREATOR = new dglh();
    public final byte[] a;
    public final String b;
    private final ProtocolVersion c;

    public RegisterResponseData(byte[] bArr, String str, String str2) {
        this.a = bArr;
        try {
            this.c = ProtocolVersion.a(str);
            this.b = str2;
        } catch (dgle e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RegisterResponseData)) {
            return false;
        }
        RegisterResponseData registerResponseData = (RegisterResponseData) obj;
        return dfwq.a(this.c, registerResponseData.c) && Arrays.equals(this.a, registerResponseData.a) && dfwq.a(this.b, registerResponseData.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Integer.valueOf(Arrays.hashCode(this.a)), this.b});
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("protocolVersion", this.c);
        b.b("registerData", eoeg.h.j(this.a));
        String str = this.b;
        if (str != null) {
            b.b("clientDataString", str);
        }
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = dfxk.a(parcel);
        dfxk.f(parcel, 2, bArr, false);
        dfxk.m(parcel, 3, this.c.d, false);
        dfxk.m(parcel, 4, this.b, false);
        dfxk.c(parcel, a);
    }
}
