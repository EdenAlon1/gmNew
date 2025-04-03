package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dgzc;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class NlpLocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<NlpLocationRequest> CREATOR = new dgzc();
    public final WorkSource a;

    public NlpLocationRequest(WorkSource workSource) {
        workSource.getClass();
        this.a = workSource;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        WorkSource workSource = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, workSource, i, false);
        dfxk.c(parcel, a);
    }
}
