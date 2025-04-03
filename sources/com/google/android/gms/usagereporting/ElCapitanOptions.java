package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhux;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ElCapitanOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ElCapitanOptions> CREATOR = new dhux();
    public final boolean a;
    public final int b;

    public ElCapitanOptions(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.d(parcel, 2, this.a);
        dfxk.i(parcel, 3, this.b);
        dfxk.c(parcel, a);
    }
}
