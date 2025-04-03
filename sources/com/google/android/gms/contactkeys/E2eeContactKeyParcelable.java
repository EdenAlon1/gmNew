package com.google.android.gms.contactkeys;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dgah;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class E2eeContactKeyParcelable extends AbstractSafeParcelable implements Parcelable {
    public static final Parcelable.Creator<E2eeContactKeyParcelable> CREATOR = new dgah();
    public String a;
    public String b;
    public String c;
    public String d;
    public long e;
    public byte[] f;
    public int g;
    public int h;
    public String i;
    public String j;
    public String k;

    private E2eeContactKeyParcelable() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof E2eeContactKeyParcelable) {
            E2eeContactKeyParcelable e2eeContactKeyParcelable = (E2eeContactKeyParcelable) obj;
            if (dfwq.a(this.a, e2eeContactKeyParcelable.a) && dfwq.a(this.b, e2eeContactKeyParcelable.b) && dfwq.a(this.c, e2eeContactKeyParcelable.c) && dfwq.a(this.d, e2eeContactKeyParcelable.d) && dfwq.a(Long.valueOf(this.e), Long.valueOf(e2eeContactKeyParcelable.e)) && Arrays.equals(this.f, e2eeContactKeyParcelable.f) && dfwq.a(Integer.valueOf(this.g), Integer.valueOf(e2eeContactKeyParcelable.g)) && dfwq.a(Integer.valueOf(this.h), Integer.valueOf(e2eeContactKeyParcelable.h)) && dfwq.a(this.i, e2eeContactKeyParcelable.i) && dfwq.a(this.j, e2eeContactKeyParcelable.j) && dfwq.a(this.k, e2eeContactKeyParcelable.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Long.valueOf(this.e), Integer.valueOf(Arrays.hashCode(this.f)), Integer.valueOf(this.g), Integer.valueOf(this.h), this.i, this.j, this.k});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, this.a, false);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.m(parcel, 3, this.c, false);
        dfxk.m(parcel, 4, this.d, false);
        dfxk.j(parcel, 5, this.e);
        dfxk.f(parcel, 6, this.f, false);
        dfxk.i(parcel, 7, this.g);
        dfxk.i(parcel, 8, this.h);
        dfxk.m(parcel, 9, this.i, false);
        dfxk.m(parcel, 10, this.j, false);
        dfxk.m(parcel, 11, this.k, false);
        dfxk.c(parcel, a);
    }

    public E2eeContactKeyParcelable(String str, String str2, String str3, String str4, long j, byte[] bArr, int i, int i2, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
        this.f = bArr;
        this.g = i;
        this.h = i2;
        this.i = str5;
        this.j = str6;
        this.k = str7;
    }
}
