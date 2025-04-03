package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfnh;
import defpackage.dfxk;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LogVerifierResultParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LogVerifierResultParcelable> CREATOR = new dfnh();
    public final boolean a;

    public LogVerifierResultParcelable(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LogVerifierResultParcelable) && this.a == ((LogVerifierResultParcelable) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    public final String toString() {
        return "LogVerifierResultParcelable[" + this.a + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.d(parcel, 1, this.a);
        dfxk.c(parcel, a);
    }
}
