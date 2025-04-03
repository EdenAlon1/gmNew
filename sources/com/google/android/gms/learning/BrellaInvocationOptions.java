package com.google.android.gms.learning;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfxk;
import defpackage.dgto;
import defpackage.emxb;
import defpackage.emxf;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class BrellaInvocationOptions extends BaseOptions {
    public static final Parcelable.Creator<BrellaInvocationOptions> CREATOR = new dgto();
    public final String a;
    public final String b;
    public final int c;
    public final InAppTrainingConstraints d;
    private final byte[] e;

    public BrellaInvocationOptions(String str, String str2, int i, InAppTrainingConstraints inAppTrainingConstraints, byte[] bArr) {
        emxf.a(!str.isEmpty());
        emxf.a(!str2.isEmpty());
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = inAppTrainingConstraints;
        this.e = bArr == null ? new byte[0] : bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrellaInvocationOptions)) {
            return false;
        }
        BrellaInvocationOptions brellaInvocationOptions = (BrellaInvocationOptions) obj;
        return emxb.a(this.a, brellaInvocationOptions.a) && emxb.a(this.b, brellaInvocationOptions.b) && this.c == brellaInvocationOptions.c && emxb.a(this.d, brellaInvocationOptions.d) && Arrays.equals(this.e, brellaInvocationOptions.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d, Integer.valueOf(Arrays.hashCode(this.e))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.i(parcel, 3, this.c);
        dfxk.k(parcel, 4, this.d, i, false);
        byte[] bArr = this.e;
        dfxk.f(parcel, 5, Arrays.copyOf(bArr, bArr.length), false);
        dfxk.c(parcel, a);
    }
}
