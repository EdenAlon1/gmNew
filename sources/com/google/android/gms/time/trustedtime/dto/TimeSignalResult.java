package com.google.android.gms.time.trustedtime.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.time.dto.ParcelableDuration;
import com.google.android.gms.time.dto.ParcelableInstant;
import defpackage.dfxk;
import defpackage.dhss;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class TimeSignalResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TimeSignalResult> CREATOR = new dhss();
    public final ParcelableDuration a;
    public final ParcelableInstant b;
    public final ParcelableTicks c;
    public final List d;
    public final List e;

    public TimeSignalResult(ParcelableDuration parcelableDuration, ParcelableInstant parcelableInstant, ParcelableTicks parcelableTicks, List list, List list2) {
        parcelableDuration.getClass();
        this.a = parcelableDuration;
        parcelableInstant.getClass();
        this.b = parcelableInstant;
        parcelableTicks.getClass();
        this.c = parcelableTicks;
        list.getClass();
        this.d = list;
        list2.getClass();
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeSignalResult)) {
            return false;
        }
        TimeSignalResult timeSignalResult = (TimeSignalResult) obj;
        return this.a.equals(timeSignalResult.a) && this.b.equals(timeSignalResult.b) && this.c.equals(timeSignalResult.c) && this.d.equals(timeSignalResult.d) && this.e.equals(timeSignalResult.e);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e);
    }

    public final String toString() {
        List list = this.e;
        List list2 = this.d;
        ParcelableTicks parcelableTicks = this.c;
        ParcelableInstant parcelableInstant = this.b;
        return "TimeSignalResult{estimatedError=" + this.a.toString() + ", currentTime=" + parcelableInstant.toString() + ", acquisitionTicks=" + parcelableTicks.toString() + ", pastUnixEpochClockAdjustments=" + list2.toString() + ", futureUnixEpochClockAdjustments=" + list.toString() + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelableDuration parcelableDuration = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, parcelableDuration, i, false);
        dfxk.k(parcel, 2, this.b, i, false);
        dfxk.k(parcel, 3, this.c, i, false);
        dfxk.n(parcel, 4, this.d, false);
        dfxk.n(parcel, 5, this.e, false);
        dfxk.c(parcel, a);
    }
}
