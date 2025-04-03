package com.google.android.gms.asterism;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.deyw;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SetAsterismConsentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SetAsterismConsentRequest> CREATOR = new deyw();
    public final int a;
    public final int b;
    public final int c;
    public final int[] d;
    public final Long e;
    public final int f;
    public final Bundle g;
    public final int h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final int q;
    public final int r;
    public final int s;

    public SetAsterismConsentRequest(int i, int i2, int i3, int[] iArr, Long l, int i4, Bundle bundle, int i5, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i6, int i7, int i8) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = iArr;
        this.e = l;
        this.f = i4;
        this.g = bundle;
        this.h = i5;
        this.i = str;
        this.j = str2;
        this.k = str3;
        this.l = str4;
        this.m = str5;
        this.n = str6;
        this.o = str7;
        this.p = str8;
        this.q = i6;
        this.r = i7;
        this.s = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, i2);
        dfxk.i(parcel, 2, this.b);
        dfxk.i(parcel, 3, this.c);
        dfxk.v(parcel, 4, this.d);
        dfxk.A(parcel, 5, this.e);
        dfxk.i(parcel, 6, this.f);
        dfxk.p(parcel, 7, this.g);
        dfxk.i(parcel, 8, this.h);
        dfxk.m(parcel, 9, this.i, false);
        dfxk.m(parcel, 10, this.j, false);
        dfxk.m(parcel, 11, this.k, false);
        dfxk.m(parcel, 12, this.l, false);
        dfxk.m(parcel, 13, this.m, false);
        dfxk.m(parcel, 14, this.n, false);
        dfxk.m(parcel, 15, this.o, false);
        dfxk.m(parcel, 16, this.p, false);
        dfxk.i(parcel, 17, this.q);
        dfxk.i(parcel, 18, this.r);
        dfxk.i(parcel, 19, this.s);
        dfxk.c(parcel, a);
    }
}
