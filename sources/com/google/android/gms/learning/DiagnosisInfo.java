package com.google.android.gms.learning;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dgtp;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DiagnosisInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DiagnosisInfo> CREATOR = new dgtp();
    final int a;
    final int b;
    final int c;
    final int d;
    final long e;

    public DiagnosisInfo(int i, int i2, int i3, int i4, long j) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.i(parcel, 2, this.b);
        dfxk.i(parcel, 3, this.c);
        dfxk.i(parcel, 4, this.d);
        dfxk.j(parcel, 5, this.e);
        dfxk.c(parcel, a);
    }
}
