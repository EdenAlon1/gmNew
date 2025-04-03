package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dgiv;
import defpackage.eyee;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AuthenticationExtensionsPrfOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensionsPrfOutputs> CREATOR = new dgiv();
    public final boolean a;
    private final eyee b;

    public AuthenticationExtensionsPrfOutputs(boolean z, eyee eyeeVar) {
        this.a = z;
        this.b = eyeeVar;
    }

    public static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public final byte[] b() {
        eyee eyeeVar = this.b;
        if (eyeeVar == null) {
            return null;
        }
        return eyeeVar.I();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsPrfOutputs)) {
            return false;
        }
        AuthenticationExtensionsPrfOutputs authenticationExtensionsPrfOutputs = (AuthenticationExtensionsPrfOutputs) obj;
        return this.a == authenticationExtensionsPrfOutputs.a && dfwq.a(this.b, authenticationExtensionsPrfOutputs.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
    }

    public final String toString() {
        byte[] b = b();
        StringBuilder sb = new StringBuilder("AuthenticationExtensionsPrfOutputs{enabled:");
        sb.append(this.a);
        sb.append("outputs:");
        sb.append(b != null);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = dfxk.a(parcel);
        dfxk.d(parcel, 1, z);
        dfxk.f(parcel, 2, b(), false);
        dfxk.c(parcel, a);
    }
}
