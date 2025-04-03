package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfcx;
import defpackage.dfxk;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MatchPasswordResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MatchPasswordResult> CREATOR = new dfcx();
    public final List a;
    public final boolean b;

    public MatchPasswordResult(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = dfxk.a(parcel);
        dfxk.n(parcel, 1, list, false);
        dfxk.d(parcel, 2, this.b);
        dfxk.c(parcel, a);
    }
}
