package com.google.android.gms.learning;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dguf;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class TrainingInterval extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TrainingInterval> CREATOR = new dguf();
    public final int a;
    public final long b;

    public TrainingInterval(int i, long j) {
        boolean z = true;
        if (i == 0) {
            if (j > 0) {
                i = 0;
            } else {
                i = 0;
                z = false;
            }
        }
        dfwv.b(z, "Recurrent jobs cannot have non-positive minimal interval.");
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrainingInterval)) {
            return false;
        }
        TrainingInterval trainingInterval = (TrainingInterval) obj;
        return this.a == trainingInterval.a && this.b == trainingInterval.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, i2);
        dfxk.j(parcel, 2, this.b);
        dfxk.c(parcel, a);
    }
}
