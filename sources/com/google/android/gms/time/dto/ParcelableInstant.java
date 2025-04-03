package com.google.android.gms.time.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhse;
import defpackage.dhsl;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ParcelableInstant extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ParcelableInstant> CREATOR;
    public final long a;
    public final int b;

    static {
        new ParcelableInstant(0L, 0);
        new ParcelableInstant(31556889864403199L, 999999999);
        new ParcelableInstant(-31557014167219200L, 0);
        CREATOR = new dhsl();
    }

    public ParcelableInstant(long j, int i) {
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new dhse("Instant exceeds minimum or maximum instant");
        }
        this.a = j;
        if (i < 0 || i > 999999999) {
            throw new dhse("Nano adjustment should be in the range 0 to 999,999,999");
        }
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParcelableInstant)) {
            return false;
        }
        ParcelableInstant parcelableInstant = (ParcelableInstant) obj;
        return this.a == parcelableInstant.a && this.b == parcelableInstant.b;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Integer.valueOf(this.b));
    }

    public final String toString() {
        return "ParcelableInstant{epochSecond=" + this.a + ", nanosOfSecond=" + this.b + "}";
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
