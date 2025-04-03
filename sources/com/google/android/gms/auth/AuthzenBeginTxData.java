package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dezk;
import defpackage.dfxk;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated(forRemoval = true)
/* loaded from: classes3.dex */
public class AuthzenBeginTxData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AuthzenBeginTxData> CREATOR = new dezk();
    final int a;
    final int b;
    public final byte[] c;

    public AuthzenBeginTxData(int i, int i2, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthzenBeginTxData)) {
            return false;
        }
        AuthzenBeginTxData authzenBeginTxData = (AuthzenBeginTxData) obj;
        return this.b == authzenBeginTxData.b && Arrays.equals(this.c, authzenBeginTxData.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.i(parcel, 2, this.b);
        dfxk.f(parcel, 3, this.c, false);
        dfxk.c(parcel, a);
    }
}
