package com.google.android.gms.telephonyspam;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhsc;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SpamLookupResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SpamLookupResult> CREATOR = new dhsc();
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public SpamLookupResult(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.i(parcel, 2, this.b);
        dfxk.i(parcel, 3, this.c);
        dfxk.i(parcel, 4, this.d);
        dfxk.i(parcel, 5, this.e);
        dfxk.i(parcel, 6, this.f);
        dfxk.c(parcel, a);
    }
}
