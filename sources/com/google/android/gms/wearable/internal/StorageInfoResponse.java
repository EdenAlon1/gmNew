package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dife;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class StorageInfoResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StorageInfoResponse> CREATOR = new dife();
    public final int a;
    public final long b;
    public final List c;

    public StorageInfoResponse(int i, long j, List list) {
        this.a = i;
        this.b = j;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 2, this.a);
        dfxk.j(parcel, 3, this.b);
        dfxk.n(parcel, 4, this.c, false);
        dfxk.c(parcel, a);
    }
}
