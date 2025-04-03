package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhwr;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class IsReadyToPayRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<IsReadyToPayRequest> CREATOR = new dhwr();
    ArrayList a;
    String b;
    String c;
    ArrayList d;
    boolean e;
    String f;

    IsReadyToPayRequest() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.w(parcel, 2, this.a);
        dfxk.m(parcel, 4, this.b, false);
        dfxk.m(parcel, 5, this.c, false);
        dfxk.w(parcel, 6, this.d);
        dfxk.d(parcel, 7, this.e);
        dfxk.m(parcel, 8, this.f, false);
        dfxk.c(parcel, a);
    }

    public IsReadyToPayRequest(ArrayList arrayList, String str, String str2, ArrayList arrayList2, boolean z, String str3) {
        this.a = arrayList;
        this.b = str;
        this.c = str2;
        this.d = arrayList2;
        this.e = z;
        this.f = str3;
    }
}
