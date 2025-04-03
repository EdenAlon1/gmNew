package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dgjd;
import defpackage.dgjx;
import defpackage.dgkb;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PublicKeyCredentialParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialParameters> CREATOR = new dgjx();
    private final PublicKeyCredentialType a;
    private final COSEAlgorithmIdentifier b;

    public PublicKeyCredentialParameters(String str, int i) {
        dfwv.n(str);
        try {
            this.a = PublicKeyCredentialType.a(str);
            try {
                this.b = COSEAlgorithmIdentifier.a(i);
            } catch (dgjd e) {
                throw new IllegalArgumentException(e);
            }
        } catch (dgkb e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialParameters)) {
            return false;
        }
        PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj;
        return this.a.equals(publicKeyCredentialParameters.a) && this.b.equals(publicKeyCredentialParameters.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        COSEAlgorithmIdentifier cOSEAlgorithmIdentifier = this.b;
        return "PublicKeyCredentialParameters{\n type=" + String.valueOf(this.a) + ", \n algorithm=" + cOSEAlgorithmIdentifier.toString() + "\n }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a.b;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 2, str, false);
        dfxk.x(parcel, 3, Integer.valueOf(this.b.a.a()));
        dfxk.c(parcel, a);
    }
}
