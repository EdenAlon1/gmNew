package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dgiu;
import defpackage.eyee;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AuthenticationExtensionsDevicePublicKeyOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensionsDevicePublicKeyOutputs> CREATOR = new dgiu();
    private final eyee a;
    private final eyee b;

    public AuthenticationExtensionsDevicePublicKeyOutputs(eyee eyeeVar, eyee eyeeVar2) {
        this.a = eyeeVar;
        this.b = eyeeVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsDevicePublicKeyOutputs)) {
            return false;
        }
        AuthenticationExtensionsDevicePublicKeyOutputs authenticationExtensionsDevicePublicKeyOutputs = (AuthenticationExtensionsDevicePublicKeyOutputs) obj;
        return dfwq.a(this.a, authenticationExtensionsDevicePublicKeyOutputs.a) && dfwq.a(this.b, authenticationExtensionsDevicePublicKeyOutputs.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        eyee eyeeVar = this.a;
        int a = dfxk.a(parcel);
        dfxk.f(parcel, 1, eyeeVar == null ? null : eyeeVar.I(), false);
        eyee eyeeVar2 = this.b;
        dfxk.f(parcel, 2, eyeeVar2 != null ? eyeeVar2.I() : null, false);
        dfxk.c(parcel, a);
    }
}
