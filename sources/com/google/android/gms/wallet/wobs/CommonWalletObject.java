package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhyi;
import defpackage.dhyj;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CommonWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new dhyj();
    public String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;

    @Deprecated
    String h;
    int i;
    final ArrayList j;
    TimeInterval k;
    final ArrayList l;

    @Deprecated
    String m;

    @Deprecated
    String n;
    final ArrayList o;
    boolean p;
    final ArrayList q;
    final ArrayList r;
    final ArrayList s;

    public CommonWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, ArrayList arrayList, TimeInterval timeInterval, ArrayList arrayList2, String str9, String str10, ArrayList arrayList3, boolean z, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = i;
        this.j = arrayList;
        this.k = timeInterval;
        this.l = arrayList2;
        this.m = str9;
        this.n = str10;
        this.o = arrayList3;
        this.p = z;
        this.q = arrayList4;
        this.r = arrayList5;
        this.s = arrayList6;
    }

    public static dhyi a() {
        return new dhyi(new CommonWalletObject());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 2, this.a, false);
        dfxk.m(parcel, 3, this.b, false);
        dfxk.m(parcel, 4, this.c, false);
        dfxk.m(parcel, 5, this.d, false);
        dfxk.m(parcel, 6, this.e, false);
        dfxk.m(parcel, 7, this.f, false);
        dfxk.m(parcel, 8, this.g, false);
        dfxk.m(parcel, 9, this.h, false);
        dfxk.i(parcel, 10, this.i);
        dfxk.n(parcel, 11, this.j, false);
        dfxk.k(parcel, 12, this.k, i, false);
        dfxk.n(parcel, 13, this.l, false);
        dfxk.m(parcel, 14, this.m, false);
        dfxk.m(parcel, 15, this.n, false);
        dfxk.n(parcel, 16, this.o, false);
        dfxk.d(parcel, 17, this.p);
        dfxk.n(parcel, 18, this.q, false);
        dfxk.n(parcel, 19, this.r, false);
        dfxk.n(parcel, 20, this.s, false);
        dfxk.c(parcel, a);
    }

    public CommonWalletObject() {
        this.j = new ArrayList();
        this.l = new ArrayList();
        this.o = new ArrayList();
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.s = new ArrayList();
    }
}
