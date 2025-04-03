package com.google.android.gms.cobalt;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfov;
import defpackage.dfwq;
import defpackage.dfxk;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LogOccurrenceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LogOccurrenceRequest> CREATOR = new dfov();
    public int a;
    public int b;
    public int c;
    public long d;
    public int[] e;

    public LogOccurrenceRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LogOccurrenceRequest) {
            LogOccurrenceRequest logOccurrenceRequest = (LogOccurrenceRequest) obj;
            if (dfwq.a(Integer.valueOf(this.a), Integer.valueOf(logOccurrenceRequest.a)) && dfwq.a(Integer.valueOf(this.b), Integer.valueOf(logOccurrenceRequest.b)) && dfwq.a(Integer.valueOf(this.c), Integer.valueOf(logOccurrenceRequest.c)) && dfwq.a(Long.valueOf(this.d), Long.valueOf(logOccurrenceRequest.d)) && Arrays.equals(this.e, logOccurrenceRequest.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Long.valueOf(this.d), Integer.valueOf(Arrays.hashCode(this.e))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.i(parcel, 2, this.b);
        dfxk.i(parcel, 3, this.c);
        dfxk.j(parcel, 4, this.d);
        dfxk.v(parcel, 5, this.e);
        dfxk.c(parcel, a);
    }

    public LogOccurrenceRequest(int i, int i2, int i3, long j, int[] iArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = iArr;
    }
}
