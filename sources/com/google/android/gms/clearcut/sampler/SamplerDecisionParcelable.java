package com.google.android.gms.clearcut.sampler;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfnk;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SamplerDecisionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SamplerDecisionParcelable> CREATOR = new dfnk();
    public final boolean a;
    public final long b;

    public SamplerDecisionParcelable(boolean z, long j) {
        this.a = z;
        this.b = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = dfxk.a(parcel);
        dfxk.d(parcel, 1, z);
        dfxk.j(parcel, 2, this.b);
        dfxk.c(parcel, a);
    }
}
