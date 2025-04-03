package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dfxr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ModuleAvailabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleAvailabilityResponse> CREATOR = new dfxr();
    public final boolean a;
    public final int b;

    public ModuleAvailabilityResponse(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = dfxk.a(parcel);
        dfxk.d(parcel, 1, z);
        dfxk.i(parcel, 2, this.b);
        dfxk.c(parcel, a);
    }
}
