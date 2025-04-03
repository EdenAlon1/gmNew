package com.google.android.gms.people.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhiz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SyncStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SyncStatus> CREATOR = new dhiz();
    public final int a;
    public final String b;
    public final long c;

    public SyncStatus(int i, String str, long j) {
        this.a = i;
        this.b = str;
        this.c = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 2, i2);
        dfxk.m(parcel, 3, this.b, false);
        dfxk.j(parcel, 4, this.c);
        dfxk.c(parcel, a);
    }
}
