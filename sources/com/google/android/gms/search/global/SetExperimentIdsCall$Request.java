package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhnu;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SetExperimentIdsCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SetExperimentIdsCall$Request> CREATOR = new dhnu();
    public byte[] a;
    public boolean b;

    public SetExperimentIdsCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.f(parcel, 1, this.a, false);
        dfxk.d(parcel, 2, this.b);
        dfxk.c(parcel, a);
    }

    public SetExperimentIdsCall$Request(byte[] bArr, boolean z) {
        this.a = bArr;
        this.b = z;
    }
}
