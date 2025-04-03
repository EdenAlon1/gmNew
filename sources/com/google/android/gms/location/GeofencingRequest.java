package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dgyn;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new dgyn();
    public final List a;
    public final int b;
    public final String c;

    public GeofencingRequest(List list, int i, String str) {
        this.a = list;
        this.b = i;
        this.c = str;
    }

    public final String toString() {
        return "GeofencingRequest[geofences=" + String.valueOf(this.a) + ", initialTrigger=" + this.b + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = dfxk.a(parcel);
        dfxk.n(parcel, 1, list, false);
        dfxk.i(parcel, 2, this.b);
        dfxk.m(parcel, 4, this.c, false);
        dfxk.c(parcel, a);
    }
}
