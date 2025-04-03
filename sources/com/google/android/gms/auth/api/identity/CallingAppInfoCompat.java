package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfco;
import defpackage.dfxk;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CallingAppInfoCompat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CallingAppInfoCompat> CREATOR = new dfco();
    public final String a;
    public final SigningInfoCompat b;
    public final String c;

    public CallingAppInfoCompat(String str, SigningInfoCompat signingInfoCompat, String str2) {
        this.a = str;
        this.b = signingInfoCompat;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallingAppInfoCompat)) {
            return false;
        }
        CallingAppInfoCompat callingAppInfoCompat = (CallingAppInfoCompat) obj;
        return this.a.equals(callingAppInfoCompat.a) && this.b.equals(callingAppInfoCompat.b) && Objects.equals(this.c, callingAppInfoCompat.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public final String toString() {
        return "CallingAppInfoCompat{packageName='" + this.a + "', signingInfo=" + this.b + ", origin='" + this.c + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.k(parcel, 2, this.b, i, false);
        dfxk.m(parcel, 3, this.c, false);
        dfxk.c(parcel, a);
    }
}
