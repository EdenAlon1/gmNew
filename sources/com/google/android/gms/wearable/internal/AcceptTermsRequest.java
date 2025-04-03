package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.diaz;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AcceptTermsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AcceptTermsRequest> CREATOR = new diaz();
    public final int a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final boolean h;

    public AcceptTermsRequest(int i, List list, String str, String str2, String str3, String str4, List list2, boolean z) {
        this.a = i;
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = list2;
        this.h = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.w(parcel, 2, this.b);
        dfxk.m(parcel, 3, this.c, false);
        dfxk.m(parcel, 4, this.d, false);
        dfxk.m(parcel, 5, this.e, false);
        dfxk.m(parcel, 6, this.f, false);
        dfxk.w(parcel, 7, this.g);
        dfxk.d(parcel, 8, this.h);
        dfxk.c(parcel, a);
    }
}
