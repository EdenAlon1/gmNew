package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhwv;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MaskedWalletRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<MaskedWalletRequest> CREATOR = new dhwv();
    String a;
    boolean b;
    boolean c;
    boolean d;
    String e;
    String f;
    String g;
    Cart h;
    boolean i;
    boolean j;
    CountrySpecification[] k;
    final boolean l;
    final boolean m;
    ArrayList n;
    PaymentMethodTokenizationParameters o;
    ArrayList p;
    String q;

    MaskedWalletRequest() {
        this.l = true;
        this.m = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 2, this.a, false);
        dfxk.d(parcel, 3, this.b);
        dfxk.d(parcel, 4, this.c);
        dfxk.d(parcel, 5, this.d);
        dfxk.m(parcel, 6, this.e, false);
        dfxk.m(parcel, 7, this.f, false);
        dfxk.m(parcel, 8, this.g, false);
        dfxk.k(parcel, 9, this.h, i, false);
        dfxk.d(parcel, 10, this.i);
        dfxk.d(parcel, 11, this.j);
        dfxk.E(parcel, 12, this.k, i);
        dfxk.d(parcel, 13, this.l);
        dfxk.d(parcel, 14, this.m);
        dfxk.n(parcel, 15, this.n, false);
        dfxk.k(parcel, 16, this.o, i, false);
        dfxk.w(parcel, 17, this.p);
        dfxk.m(parcel, 18, this.q, false);
        dfxk.c(parcel, a);
    }

    public MaskedWalletRequest(String str, boolean z, boolean z2, boolean z3, String str2, String str3, String str4, Cart cart, boolean z4, boolean z5, CountrySpecification[] countrySpecificationArr, boolean z6, boolean z7, ArrayList arrayList, PaymentMethodTokenizationParameters paymentMethodTokenizationParameters, ArrayList arrayList2, String str5) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = cart;
        this.i = z4;
        this.j = z5;
        this.k = countrySpecificationArr;
        this.l = z6;
        this.m = z7;
        this.n = arrayList;
        this.o = paymentMethodTokenizationParameters;
        this.p = arrayList2;
        this.q = str5;
    }
}
