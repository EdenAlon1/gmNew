package com.google.android.gms.constellation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dfzz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PhoneNumberInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PhoneNumberInfo> CREATOR = new dfzz();
    public final int a;
    public final String b;
    public final Long c;
    public final Bundle d;

    public PhoneNumberInfo(int i, String str, Long l, Bundle bundle) {
        this.a = i;
        this.b = str;
        this.c = l;
        this.d = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.A(parcel, 3, this.c);
        dfxk.p(parcel, 4, this.d);
        dfxk.c(parcel, a);
    }
}
