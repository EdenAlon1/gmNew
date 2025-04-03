package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dgje;
import defpackage.eyee;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CableAuthenticationData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CableAuthenticationData> CREATOR = new dgje();
    public final long a;
    private final eyee b;
    private final eyee c;
    private final eyee d;

    public CableAuthenticationData(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        dfwv.n(bArr);
        eyee x = eyee.x(bArr);
        dfwv.n(bArr2);
        eyee x2 = eyee.x(bArr2);
        dfwv.n(bArr3);
        eyee x3 = eyee.x(bArr3);
        this.a = j;
        this.b = x;
        this.c = x2;
        this.d = x3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CableAuthenticationData)) {
            return false;
        }
        CableAuthenticationData cableAuthenticationData = (CableAuthenticationData) obj;
        return this.a == cableAuthenticationData.a && dfwq.a(this.b, cableAuthenticationData.b) && dfwq.a(this.c, cableAuthenticationData.c) && dfwq.a(this.d, cableAuthenticationData.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = dfxk.a(parcel);
        dfxk.j(parcel, 1, j);
        dfxk.f(parcel, 2, this.b.I(), false);
        dfxk.f(parcel, 3, this.c.I(), false);
        dfxk.f(parcel, 4, this.d.I(), false);
        dfxk.c(parcel, a);
    }
}
