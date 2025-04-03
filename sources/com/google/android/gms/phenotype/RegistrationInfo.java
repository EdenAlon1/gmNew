package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhlm;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RegistrationInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegistrationInfo> CREATOR = new dhlm();
    public final String a;
    public final int b;
    public final String[] c;
    public final byte[] d;
    public final boolean e;
    public final int[] f;
    public final String g;
    public final byte[] h;
    public final int i;
    public final int j;

    public RegistrationInfo(String str, int i, String[] strArr, byte[] bArr, boolean z, int[] iArr, String str2, byte[] bArr2, int i2, int i3) {
        this.a = str;
        this.b = i;
        this.c = strArr;
        this.d = bArr;
        this.e = z;
        this.f = iArr;
        this.g = str2;
        this.h = bArr2;
        this.i = i2;
        this.j = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegistrationInfo) {
            RegistrationInfo registrationInfo = (RegistrationInfo) obj;
            if (this.a.equals(registrationInfo.a) && this.b == registrationInfo.b && Arrays.equals(this.c, registrationInfo.c) && Arrays.equals(this.d, registrationInfo.d) && this.e == registrationInfo.e && Arrays.equals(this.f, registrationInfo.f) && this.g.equals(registrationInfo.g) && Arrays.equals(this.h, registrationInfo.h) && this.i == registrationInfo.i && this.j == registrationInfo.j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d, Boolean.valueOf(this.e), this.f, this.g, this.h, Integer.valueOf(this.i), Integer.valueOf(this.j)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.i(parcel, 2, this.b);
        dfxk.C(parcel, 3, this.c);
        dfxk.f(parcel, 4, this.d, false);
        dfxk.d(parcel, 5, this.e);
        dfxk.v(parcel, 6, this.f);
        dfxk.m(parcel, 7, this.g, false);
        dfxk.f(parcel, 8, this.h, false);
        dfxk.i(parcel, 9, this.i);
        dfxk.i(parcel, 10, this.j);
        dfxk.c(parcel, a);
    }
}
