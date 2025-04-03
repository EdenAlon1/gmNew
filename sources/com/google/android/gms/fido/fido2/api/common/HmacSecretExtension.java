package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dfyk;
import defpackage.dgjq;
import defpackage.eyee;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class HmacSecretExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<HmacSecretExtension> CREATOR = new dgjq();
    public final int a;
    private final eyee b;
    private final eyee c;
    private final eyee d;

    public HmacSecretExtension(eyee eyeeVar, eyee eyeeVar2, eyee eyeeVar3, int i) {
        this.b = eyeeVar;
        this.c = eyeeVar2;
        this.d = eyeeVar3;
        this.a = i;
    }

    public final byte[] a() {
        eyee eyeeVar = this.b;
        if (eyeeVar == null) {
            return null;
        }
        return eyeeVar.I();
    }

    public final byte[] b() {
        eyee eyeeVar = this.d;
        if (eyeeVar == null) {
            return null;
        }
        return eyeeVar.I();
    }

    public final byte[] c() {
        eyee eyeeVar = this.c;
        if (eyeeVar == null) {
            return null;
        }
        return eyeeVar.I();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof HmacSecretExtension)) {
            return false;
        }
        HmacSecretExtension hmacSecretExtension = (HmacSecretExtension) obj;
        return dfwq.a(this.b, hmacSecretExtension.b) && dfwq.a(this.c, hmacSecretExtension.c) && dfwq.a(this.d, hmacSecretExtension.d) && this.a == hmacSecretExtension.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, Integer.valueOf(this.a)});
    }

    public final String toString() {
        return "HmacSecretExtension{coseKeyAgreement=" + dfyk.c(a()) + ", saltEnc=" + dfyk.c(c()) + ", saltAuth=" + dfyk.c(b()) + ", getPinUvAuthProtocol=" + this.a + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.f(parcel, 1, a(), false);
        dfxk.f(parcel, 2, c(), false);
        dfxk.f(parcel, 3, b(), false);
        dfxk.i(parcel, 4, this.a);
        dfxk.c(parcel, a);
    }
}
