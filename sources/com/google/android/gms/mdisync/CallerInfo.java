package com.google.android.gms.mdisync;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dheh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CallerInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CallerInfo> CREATOR = new dheh();
    public final String a;
    public final long b;

    public CallerInfo(String str, long j) {
        this.a = str;
        this.b = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.j(parcel, 2, this.b);
        dfxk.c(parcel, a);
    }
}
