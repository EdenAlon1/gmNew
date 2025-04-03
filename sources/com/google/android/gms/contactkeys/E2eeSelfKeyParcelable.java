package com.google.android.gms.contactkeys;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dgaj;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class E2eeSelfKeyParcelable extends AbstractSafeParcelable implements Parcelable {
    public static final Parcelable.Creator<E2eeSelfKeyParcelable> CREATOR = new dgaj();
    public String a;
    public String b;
    public String c;
    public long d;
    public byte[] e;
    public int f;

    private E2eeSelfKeyParcelable() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof E2eeSelfKeyParcelable) {
            E2eeSelfKeyParcelable e2eeSelfKeyParcelable = (E2eeSelfKeyParcelable) obj;
            if (dfwq.a(this.a, e2eeSelfKeyParcelable.a) && dfwq.a(this.b, e2eeSelfKeyParcelable.b) && dfwq.a(this.c, e2eeSelfKeyParcelable.c) && dfwq.a(Long.valueOf(this.d), Long.valueOf(e2eeSelfKeyParcelable.d)) && Arrays.equals(this.e, e2eeSelfKeyParcelable.e) && dfwq.a(Integer.valueOf(this.f), Integer.valueOf(e2eeSelfKeyParcelable.f))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Long.valueOf(this.d), Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(this.f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, this.a, false);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.m(parcel, 3, this.c, false);
        dfxk.j(parcel, 4, this.d);
        dfxk.f(parcel, 5, this.e, false);
        dfxk.i(parcel, 6, this.f);
        dfxk.c(parcel, a);
    }

    public E2eeSelfKeyParcelable(String str, String str2, String str3, long j, byte[] bArr, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = bArr;
        this.f = i;
    }
}
