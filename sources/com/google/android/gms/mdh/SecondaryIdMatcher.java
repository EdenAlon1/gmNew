package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dhdu;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SecondaryIdMatcher extends AbstractSafeParcelable {
    public final byte[] a;
    public final int b;
    private static final Charset c = Charset.forName("UTF-8");
    public static final Parcelable.Creator<SecondaryIdMatcher> CREATOR = new dhdu();

    public SecondaryIdMatcher(byte[] bArr, int i) {
        dfwv.n(bArr);
        this.a = bArr;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SecondaryIdMatcher secondaryIdMatcher = (SecondaryIdMatcher) obj;
            if (this.b == secondaryIdMatcher.b && Arrays.equals(this.a, secondaryIdMatcher.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + this.b;
    }

    public final String toString() {
        int i = this.b;
        return (i != 1 ? i != 2 ? "__unknown__" : "MATCHING_TYPE_PREFIX" : "MATCHING_TYPE_EXACT") + ": " + new String(this.a, c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = dfxk.a(parcel);
        dfxk.f(parcel, 1, bArr, false);
        dfxk.i(parcel, 2, this.b);
        dfxk.c(parcel, a);
    }
}
