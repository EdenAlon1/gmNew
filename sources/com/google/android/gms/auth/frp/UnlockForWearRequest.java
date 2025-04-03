package com.google.android.gms.auth.frp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfhu;
import defpackage.dfxk;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class UnlockForWearRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UnlockForWearRequest> CREATOR = new dfhu();
    public final boolean a;

    public UnlockForWearRequest(boolean z) {
        this.a = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = dfxk.a(parcel);
        dfxk.d(parcel, 1, z);
        dfxk.c(parcel, a);
    }
}
