package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhdx;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SyncSubPolicy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SyncSubPolicy> CREATOR = new dhdx();
    public final boolean a;
    public final int b;

    public SyncSubPolicy(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyncSubPolicy)) {
            return false;
        }
        SyncSubPolicy syncSubPolicy = (SyncSubPolicy) obj;
        return this.a == syncSubPolicy.a && this.b == syncSubPolicy.b;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) * 31) + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.d(parcel, 1, this.a);
        dfxk.i(parcel, 2, this.b);
        dfxk.c(parcel, a);
    }
}
