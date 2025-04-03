package com.google.android.gms.auth.proximity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfik;
import defpackage.dfil;
import defpackage.dfxk;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AttestationVerifier extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AttestationVerifier> CREATOR = new dfil();
    final byte[][] a;
    final int b;

    public AttestationVerifier(byte[][] bArr, int i) {
        this.a = bArr;
        this.b = i;
        if (dfik.a == null) {
            dfik.a = new dfik();
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AttestationVerifier) {
            return Arrays.equals(this.a, ((AttestationVerifier) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.q(parcel, 1, this.a);
        dfxk.i(parcel, 2, this.b);
        dfxk.c(parcel, a);
    }
}
