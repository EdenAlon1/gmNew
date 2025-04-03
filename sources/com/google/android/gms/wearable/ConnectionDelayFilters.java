package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhze;
import defpackage.emwz;
import defpackage.emxa;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConnectionDelayFilters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionDelayFilters> CREATOR = new dhze();
    public final List a;

    public ConnectionDelayFilters(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ConnectionDelayFilters) {
            return Objects.equals(this.a, ((ConnectionDelayFilters) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("dataItemFilters", this.a);
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = dfxk.a(parcel);
        dfxk.n(parcel, 1, list, false);
        dfxk.c(parcel, a);
    }
}
