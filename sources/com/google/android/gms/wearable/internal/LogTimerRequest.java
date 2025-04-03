package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dieg;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class LogTimerRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LogTimerRequest> CREATOR = new dieg();
    public final String a;
    public final long b;
    public final byte[] c;

    public LogTimerRequest(String str, long j, byte[] bArr) {
        this.a = str;
        this.b = j;
        this.c = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.j(parcel, 2, this.b);
        dfxk.f(parcel, 3, this.c, false);
        dfxk.c(parcel, a);
    }
}
