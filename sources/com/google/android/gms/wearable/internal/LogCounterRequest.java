package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.diee;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class LogCounterRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LogCounterRequest> CREATOR = new diee();
    public final String a;
    public final long b;
    public final byte[] c;
    public final long d;
    public final boolean e;

    public LogCounterRequest(String str, long j, byte[] bArr, long j2, boolean z) {
        this.a = str;
        this.b = j;
        this.c = bArr;
        this.d = j2;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.j(parcel, 2, this.b);
        dfxk.f(parcel, 3, this.c, false);
        dfxk.j(parcel, 4, this.d);
        dfxk.d(parcel, 5, this.e);
        dfxk.c(parcel, a);
    }
}
