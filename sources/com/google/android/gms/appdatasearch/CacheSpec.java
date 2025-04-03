package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.devi;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CacheSpec extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CacheSpec> CREATOR = new devi();
    public final String a;
    public final int b;

    public CacheSpec(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.i(parcel, 2, this.b);
        dfxk.c(parcel, a);
    }
}
