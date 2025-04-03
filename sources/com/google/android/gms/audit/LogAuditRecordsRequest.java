package com.google.android.gms.audit;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.deze;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class LogAuditRecordsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LogAuditRecordsRequest> CREATOR = new deze();
    public final int a;
    public final int b;
    public final String c;
    public final byte[][] d;
    public final byte[] e;
    public final byte[] f;

    public LogAuditRecordsRequest(int i, int i2, String str, byte[][] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = bArr;
        this.e = bArr2;
        this.f = bArr3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, i2);
        dfxk.i(parcel, 2, this.b);
        dfxk.m(parcel, 3, this.c, false);
        dfxk.q(parcel, 4, this.d);
        dfxk.f(parcel, 5, this.e, false);
        dfxk.f(parcel, 6, this.f, false);
        dfxk.c(parcel, a);
    }
}
