package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dgze;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SleepSegmentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SleepSegmentRequest> CREATOR = new dgze();
    public final List a;
    public final int b;

    public SleepSegmentRequest(List list, int i) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepSegmentRequest)) {
            return false;
        }
        SleepSegmentRequest sleepSegmentRequest = (SleepSegmentRequest) obj;
        return dfwq.a(this.a, sleepSegmentRequest.a) && this.b == sleepSegmentRequest.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dfwv.n(parcel);
        List list = this.a;
        int a = dfxk.a(parcel);
        dfxk.n(parcel, 1, list, false);
        dfxk.i(parcel, 2, this.b);
        dfxk.c(parcel, a);
    }
}
