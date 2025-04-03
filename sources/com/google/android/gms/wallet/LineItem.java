package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhws;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LineItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LineItem> CREATOR = new dhws();
    String a;
    String b;
    String c;
    String d;
    final int e;
    String f;

    LineItem() {
        this.e = 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 2, this.a, false);
        dfxk.m(parcel, 3, this.b, false);
        dfxk.m(parcel, 4, this.c, false);
        dfxk.m(parcel, 5, this.d, false);
        dfxk.i(parcel, 6, this.e);
        dfxk.m(parcel, 7, this.f, false);
        dfxk.c(parcel, a);
    }

    public LineItem(String str, String str2, String str3, String str4, int i, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = str5;
    }
}
