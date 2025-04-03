package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dewt;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class Section extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Section> CREATOR = new dewt();
    public final String a;
    public final boolean b;
    public final int c;

    public Section(String str, boolean z, int i) {
        this.a = str;
        this.b = z;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.d(parcel, 2, this.b);
        dfxk.i(parcel, 3, this.c);
        dfxk.c(parcel, a);
    }
}
