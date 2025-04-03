package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dfyk;
import defpackage.dgkc;
import defpackage.eyee;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialUserEntity> CREATOR = new dgkc();
    public final String a;
    public final String b;
    public final String c;
    private final eyee d;

    public PublicKeyCredentialUserEntity(byte[] bArr, String str, String str2, String str3) {
        dfwv.n(bArr);
        this.d = eyee.x(bArr);
        dfwv.n(str);
        this.a = str;
        this.b = str2;
        dfwv.n(str3);
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        return dfwq.a(this.d, publicKeyCredentialUserEntity.d) && dfwq.a(this.a, publicKeyCredentialUserEntity.a) && dfwq.a(this.b, publicKeyCredentialUserEntity.b) && dfwq.a(this.c, publicKeyCredentialUserEntity.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.a, this.b, this.c});
    }

    public final String toString() {
        return "PublicKeyCredentialUserEntity{\n id=" + dfyk.c(this.d.I()) + ", \n name='" + this.a + "', \n icon='" + this.b + "', \n displayName='" + this.c + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        eyee eyeeVar = this.d;
        int a = dfxk.a(parcel);
        dfxk.f(parcel, 2, eyeeVar.I(), false);
        dfxk.m(parcel, 3, this.a, false);
        dfxk.m(parcel, 4, this.b, false);
        dfxk.m(parcel, 5, this.c, false);
        dfxk.c(parcel, a);
    }
}
