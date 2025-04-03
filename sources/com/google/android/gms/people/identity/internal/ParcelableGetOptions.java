package com.google.android.gms.people.identity.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwp;
import defpackage.dfxk;
import defpackage.dhip;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ParcelableGetOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ParcelableGetOptions> CREATOR = new dhip();
    final boolean a;
    final boolean b;
    final String c;
    final boolean d;
    final Bundle e;

    public ParcelableGetOptions(boolean z, boolean z2, boolean z3, String str, Bundle bundle) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = bundle == null ? new Bundle() : bundle;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        dfwp.b("useOfflineDatabase", Boolean.valueOf(this.a), arrayList);
        dfwp.b("useWebData", Boolean.valueOf(this.b), arrayList);
        dfwp.b("endpoint", this.c, arrayList);
        return dfwp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.d(parcel, 1, this.a);
        dfxk.d(parcel, 2, this.b);
        dfxk.m(parcel, 3, this.c, false);
        dfxk.d(parcel, 4, this.d);
        dfxk.p(parcel, 5, this.e);
        dfxk.c(parcel, a);
    }
}
