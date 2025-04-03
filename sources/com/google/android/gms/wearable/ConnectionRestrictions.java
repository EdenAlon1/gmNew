package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhzf;
import defpackage.emwz;
import defpackage.emxa;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ConnectionRestrictions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionRestrictions> CREATOR = new dhzf();
    public final List a;
    public final List b;
    public final List c;

    public ConnectionRestrictions(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("allowedDataItemFilters", this.a);
        b.b("allowedCapabilities", this.b);
        b.b("allowedPackages", this.c);
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = dfxk.a(parcel);
        dfxk.n(parcel, 1, list, false);
        dfxk.D(parcel, 2, this.b);
        dfxk.D(parcel, 3, this.c);
        dfxk.c(parcel, a);
    }
}
