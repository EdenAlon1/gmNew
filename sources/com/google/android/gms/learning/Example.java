package com.google.android.gms.learning;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dgtr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class Example extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Example> CREATOR = new dgtr();
    final Features a;

    public Example(Features features) {
        this.a = features;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, this.a, i, false);
        dfxk.c(parcel, a);
    }
}
