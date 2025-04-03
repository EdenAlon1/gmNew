package com.google.android.gms.time.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhse;
import defpackage.dhsk;
import defpackage.dhut;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ParcelableDuration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ParcelableDuration> CREATOR;
    public final long a;
    public final int b;

    static {
        new ParcelableDuration(0L, 0);
        CREATOR = new dhsk();
    }

    public ParcelableDuration(long j, int i) {
        if (i < 0 || i > 999999999) {
            throw new dhse("Nano adjustment should be in the range 0 to 999,999,999");
        }
        this.a = j;
        this.b = i;
    }

    public final long a() {
        return dhut.a(dhut.b(this.a, 1000L), this.b / 1000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParcelableDuration)) {
            return false;
        }
        ParcelableDuration parcelableDuration = (ParcelableDuration) obj;
        return this.a == parcelableDuration.a && this.b == parcelableDuration.b;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Integer.valueOf(this.b));
    }

    public final String toString() {
        return "ParcelableDuration{seconds=" + this.a + ", nano=" + this.b + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = dfxk.a(parcel);
        dfxk.j(parcel, 1, j);
        dfxk.i(parcel, 2, this.b);
        dfxk.c(parcel, a);
    }
}
