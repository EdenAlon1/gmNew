package com.google.android.gms.location.reporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhba;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UploadRequestResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UploadRequestResult> CREATOR = new dhba();
    public final int a;
    public final long b;

    public UploadRequestResult(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UploadRequestResult)) {
            return false;
        }
        UploadRequestResult uploadRequestResult = (UploadRequestResult) obj;
        return this.b == uploadRequestResult.b && this.a == uploadRequestResult.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b)});
    }

    public final String toString() {
        return "Result{, mResultCode=" + this.a + ", mRequestId=" + this.b + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 2, i2);
        dfxk.j(parcel, 3, this.b);
        dfxk.c(parcel, a);
    }
}
