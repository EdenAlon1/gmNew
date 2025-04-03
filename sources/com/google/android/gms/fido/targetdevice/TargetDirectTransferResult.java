package com.google.android.gms.fido.targetdevice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dgkr;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class TargetDirectTransferResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TargetDirectTransferResult> CREATOR = new dgkr();
    public final Status a;
    public final List b;

    public TargetDirectTransferResult(Status status, List list) {
        this.a = status;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Status status = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, status, i, false);
        dfxk.n(parcel, 2, this.b, false);
        dfxk.c(parcel, a);
    }
}
