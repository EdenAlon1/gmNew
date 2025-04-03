package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhnq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetGlobalSearchSourcesCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetGlobalSearchSourcesCall$Request> CREATOR = new dhnq();
    public boolean a;

    public GetGlobalSearchSourcesCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.d(parcel, 1, this.a);
        dfxk.c(parcel, a);
    }

    public GetGlobalSearchSourcesCall$Request(boolean z) {
        this.a = z;
    }
}
